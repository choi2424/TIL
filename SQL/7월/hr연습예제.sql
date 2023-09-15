-- hr ���� ���� ���




--����Ŭ 11g hr���� ��������


--1. ��å(Job Title)�� Sales Manager�� ������� �Ի�⵵�� �Ի�⵵(hire_date)�� ��� �޿��� ����Ͻÿ�. 

-- ��� �� �⵵�� �������� �������� �����Ͻÿ�.

SELECT TO_CHAR(E.HIRE_DATE, 'YYYY'), AVG(E.SALARY)
FROM EMPLOYEES E , JOBS J
WHERE E.JOB_ID = J.JOB_ID 
AND j.job_title = 'Sales Manager'
GROUP BY TO_CHAR(E.HIRE_DATE, 'YYYY')
ORDER BY TO_CHAR(E.HIRE_DATE, 'YYYY');




--2. �� ����(city)�� �ִ� ��� �μ� �������� ��ձ޿��� ��ȸ�ϰ��� �Ѵ�. 

-- ��ձ޿��� ���� ���� ���ú��� ���ø�(city)�� ��տ���, �ش� ������ �������� ����Ͻÿ�. 

-- ��, ���ÿ� �� ���ϴ� ������ 10�� �̻��� ���� �����ϰ� ��ȸ�Ͻÿ�.
SELECT L.CITY ,ROUND(AVG(E.SALARY)), COUNT(l.city)
FROM EMPLOYEES E , DEPARTMENTS D , LOCATIONS L
WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID
AND D.LOCATION_ID = L.LOCATION_ID
GROUP BY L.CITY
HAVING COUNT(l.city) < 10
ORDER BY L.CITY;


--3. ��Public Accountant���� ��å(job_title)���� ���ſ� �ٹ��� ���� �ִ� ��� ����� ����� �̸��� ����Ͻÿ�. 

-- (���� ��Public Accountant���� ��å(job_title)���� �ٹ��ϴ� ����� ��� ���� �ʴ´�.) 

-- �̸��� first_name, last_name�� �Ʒ��� �������� ���� ����Ѵ�.

SELECT E.employee_id , E.FIRST_NAME || E.LAST_NAME AS NAME , jh.job_id
FROM employees E ,jobs J ,job_history JH
WHERE e.employee_id = JH.employee_id
AND J.JOB_ID = jh.job_id
AND J.JOB_TITLE = 'Public Accountant';


--4. �ڽ��� �Ŵ������� ����(salary)�� ���� �޴� �������� ��(last_name)�� ����(salary)�� �� ���Ͻÿ�. 

SELECT E.LAST_NAME, E.SALARY
FROM EMPLOYEES E
WHERE E.SALARY > (SELECT SALARY FROM EMPLOYEES  WHERE E.MANAGER_ID = EMPLOYEE_ID);

SELECT E.LAST_NAME, E.SALARY
FROM EMPLOYEES E , EMPLOYEES M
WHERE e.manager_id = M.employee_id
AND E.SALARY > M.SALARY;

--5. 2007�⿡ �Ի�(hire_date)�� �������� ���(employee_id), �̸�(first_name), ��(last_name), 

-- �μ���(department_name)�� ��ȸ�մϴ�. 

-- �̶�, �μ��� ��ġ���� ���� ������ ���, ��<Not Assigned>���� ����Ͻÿ�. 
SELECT E.EMPLOYEE_ID , E.FIRST_NAME || E.LAST_NAME AS NAME , NVL(D.department_NAME, '<Not Assigned>')
FROM employees E , departments D 
WHERE e.department_id = d.department_id(+)
AND TO_CHAR(e.hire_date,'YYYY') = 2007;

SELECT DISTINCT E.EMPLOYEE_ID , E.first_name || E.last_name AS NAME , 
CASE
        WHEN E.DEPARTMENT_ID IS NULL THEN 'Not Assigned'
        ELSE D.DEPARTMENT_NAME
END AS DEPARTMENT_NAME
FROM EMPLOYEES E , DEPARTMENTS D 
WHERE e.department_id = d.department_id
AND TO_CHAR(e.hire_date,'YYYY') = 2007
OR E.department_id IS NULL;


--6. ������(job_title)�� ��Sales Representative���� ���� �߿��� ����(salary)�� 9,000�̻�, 10,000 ������ 

-- �������� �̸�(first_name), ��(last_name)�� ����(salary)�� ����Ͻÿ�
SELECT E.first_name || ' ' || E.last_name AS NAME , e.salary
FROM employees E , jobs J
WHERE e.job_id = j.job_id
AND J.JOB_TITLE = 'Sales Representative'
AND e.salary >= 9000 AND E.SALARY <= 10000;


--7. �μ����� ���� ���� �޿��� �ް� �ִ� ������ �̸�, �μ��̸�, �޿��� ����Ͻÿ�. 

-- �̸��� last_name�� ����ϸ�, �μ��̸����� �������� �����ϰ�, 

-- �μ��� ���� ��� �̸��� ���� ���� �������� �����Ͽ� ����մϴ�. 

-- �μ��� �������� �޿� : ��������
SELECT D.department_name , MIN(E.SALARY)
FROM employees E , departments D
WHERE e.department_id = d.department_id
GROUP BY d.department_name;

-- �߸��ȹ��
SELECT e.last_name , A.*
FROM employees E,
    (SELECT D.department_name , MIN(E.SALARY) AS MIN_SALARY
        FROM employees E , departments D
        WHERE e.department_id = d.department_id
        GROUP BY d.department_name
    ) A
WHERE e.SALARY = A.MIN_SALARY
ORDER BY A.department_name ASC, E.LAST_NAME ASC;

--�������
SELECT e.last_name , A.*
FROM employees E,
    (SELECT D.department_id , MIN(E.SALARY) AS MIN_SALARY
        FROM employees E , departments D
        WHERE e.department_id = d.department_id
        GROUP BY d.department_id
    ) A
WHERE e.SALARY = A.MIN_SALARY
and e.department_id = a.department_id;

SELECT e.last_name, d.department_name, e.salary
FROM employees e , departments d 
where e.department_id = d.department_id
and (e.department_id, e.salary) IN 
(SELECT department_id, MIN(salary) FROM employees GROUP BY department_id)
ORDER BY d.department_name ASC, e.last_name ASC;

--8. EMPLOYEES ���̺��� �޿��� ���� �޴� ������� ��ȸ���� �� ���ó�� 6��°���� 10 ��°���� 

-- 5���� last_name, first_name, salary�� ��ȸ�ϴ� sql������ �ۼ��Ͻÿ�.
SELECT last_name, first_name, salary
FROM (SELECT ROWNUM RN, last_name, first_name, salary
        FROM employees
        
    ORDER BY SALARY DESC) 
WHERE RN >= 6 AND RN <= 10;




--9. ����� �μ��� ���� ����(city)�� ��Seattle���� ����� �̸�, �ش� ����� �Ŵ��� �̸�, ��� �� �μ��̸��� ����Ͻÿ�. 

-- �̶� ����� �Ŵ����� ���� ��� ��<����>���̶�� ����Ͻÿ�. �̸��� last_name�� ����ϸ�, 

-- ����� �̸��� ������������ �����Ͻÿ�. 
SELECT employee_id , FIRST_NAME , last_name , MANAGER_ID FROM employees;

--SELF JOIN ���ʵ�����
SELECT B.EMPLOYEE_ID AS E_ID , a.manager_id AS M_ID , A.FIRST_NAME , A.LAST_NAME
FROM employees A LEFT OUTER JOIN employees B ON A.MANAGER_ID = B.EMPLOYEE_ID;

SELECT e.e_name , NVL(E.E_NAME , '<����>') , d.department_name
FROM (
        SELECT A.FIRST_NAME AS E_NAME, B.last_name AS M_NAME , a.department_id 
        FROM employees A LEFT OUTER JOIN employees B ON A.MANAGER_ID = B.EMPLOYEE_ID
     ) E ,
     departments D , locations L
WHERE E.DEPARTMENT_ID = d.department_id
AND d.location_id = l.location_id
AND L.CITY = 'Seattle'
ORDER BY e.e_name ASC;


--10. �� ����(job) ���� ����(salary)�� ������ ���ϰ��� �Ѵ�. ���� ������ ���� ���� �������� 

-- ������(job_title)�� ���� ������ ��ȸ�Ͻÿ�. �� ���������� 30,000���� ū ������ ����Ͻÿ�. 
--���ʵ�����
SELECT *
FROM employees E , jobs J
WHERE e.job_id = j.job_id;

-- �� ����(job) ���� ����(salary)�� ����
SELECT j.job_title , SUM(E.SALARY)
FROM employees E , jobs J
WHERE e.job_id = j.job_id
GROUP BY j.job_title;

--���� : ���������� 30,000���� ū ������ ���
SELECT j.job_title , SUM(E.SALARY)
FROM employees E , jobs J
WHERE e.job_id = j.job_id
GROUP BY j.job_title
HAVING SUM(E.SALARY) > 30000
ORDER BY SUM(E.SALARY) DESC;

--11. �� ���(employee)�� ���ؼ� ���(employee_id), �̸�(first_name), ������(job_title), 

-- �μ� ��(department_name)�� ��ȸ�Ͻÿ�. 

-- �� ���ø�(city)�� ��Seattle���� ����(location)�� �μ� (department)�� �ٹ��ϴ� ������ �����ȣ �������������� ����Ͻÿ�.

-- ���̺� : EMPLOYEES, DEPARTMENTS , LOCATIONS , JOBS
SELECT E.EMPLOYEE_ID , E.FIRST_NAME , j.job_title , D.DEPARTMENT_NAME
FROM employees E , departments D , locations L ,jobs J
WHERE e.department_id = d.department_id
AND l.location_id = d.location_id
AND j.job_id = e.job_id
AND L.CITY = 'Seattle'
ORDER BY e.employee_id ASC;



--12. 2001~20003����̿� �Ի��� ������ �̸�(first_name), �Ի���(hire_date), �����ڻ�� (employee_id), 

-- ������ �̸�(fist_name)�� ��ȸ�մϴ�. ��, �����ڰ� ���� ��������� ��� ����� ���Խ��� ����Ѵ�.

-- 2001~2003����� �Ի��� ����� ������ ��ȣ
SELECT e.manager_id , e.first_name AS M_NAME
FROM employees E 
WHERE TO_CHAR(e.hire_date,'YYYY') <= 2003 
AND TO_CHAR(e.hire_date,'YYYY') >= 2001;

SELECT e.first_name , e.hire_date ,A.FIRST_NAME AS M_NAME, e.manager_id
FROM EMPLOYEES E , employees A
WHERE e.manager_id = a.employee_id(+)
AND TO_CHAR(e.hire_date,'YYYY') BETWEEN 2001 AND 2003 ;


--13. ��Sales�� �μ��� ���� ������ �̸�(first_name), �޿�(salary), �μ��̸�(department_name)�� ��ȸ�Ͻÿ�. 

-- ��, �޿��� 100�� �μ��� ��պ��� ���� �޴� ���� ������ ��µǾ�� �Ѵ�. 
-- 100�� �μ��� ���
SELECT ROUND(AVG(SALARY))
FROM employees
WHERE department_id = 100;

SELECT e.first_name , e.salary , d.department_name
FROM employees E , departments D
WHERE e.department_id = D.department_id
AND d.department_name = 'Sales' 
AND e.salary < (SELECT ROUND(AVG(SALARY)) FROM employees WHERE department_id = 100);



--14. Employees ���̺��� �Ի��Ѵ�(hire_date)���� �ο����� ��ȸ�Ͻÿ�.
SELECT TO_CHAR(hire_date,'YYYY-MM'), COUNT(*)
FROM employees
GROUP BY TO_CHAR(hire_date,'YYYY-MM') 
ORDER BY TO_CHAR(hire_date,'YYYY-MM') ASC;




--15. �μ��� �������� �ִ�, �ּ�, ��ձ޿��� ��ȸ�ϵ�, 

-- ��ձ޿��� ��IT�� �μ��� ��ձ޿����� ����, ��Sales�� �μ��� ��պ��� ���� �μ� ������ ����Ͻÿ�. 
SELECT AVG(SALARY)
FROM employees E , departments D
WHERE e.department_id = D.department_id
AND D.DEPARTMENT_NAME = 'IT';

SELECT AVG(SALARY)
FROM employees E , departments D
WHERE e.department_id = D.department_id
AND D.DEPARTMENT_NAME = 'Sales';


SELECT MAX(SALARY), MIN(SALARY),AVG(SALARY)
FROM employees E , departments D
WHERE e.department_id = D.department_id
GROUP BY E.department_id
HAVING AVG(SALARY) > (SELECT AVG(SALARY)
                        FROM employees E , departments D
                        WHERE e.department_id = D.department_id
                        AND D.DEPARTMENT_NAME = 'IT')                        
AND AVG(SALARY) <   (SELECT AVG(SALARY)
                        FROM employees E , departments D
                        WHERE e.department_id = D.department_id
                        AND D.DEPARTMENT_NAME = 'Sales');

--16. �� �μ����� ������ �Ѹ� �ִ� �μ��� ��ȸ�Ͻÿ�. 

-- ��, ������ ���� �μ��� ���ؼ��� ��<�Ż��μ�>����� ���ڿ��� ��µǵ��� �ϰ�,

-- ��°���� ������ ���� �μ����� �������� ���� ���ĵǾ���Ѵ�. 

--���� ������
SELECT * 
FROM employees E , departments D
WHERE e.department_id = d.department_id;

-- �μ��ȿ� �μ����� ���� ������

-- ��� ���̺� �����ϴ� �μ�
SELECT DISTINCT department_id FROM employees;
--�μ� ���̺� : 27��
SELECT COUNT(*) FROM departments;

-- ����� ���ºμ� : 27�� - 11�� = 16��  

-- �� �μ����� ����
SELECT E.department_id , D.DEPARTMENT_NAME , COUNT(*)
FROM employees E , departments D
WHERE e.department_id = d.department_id
GROUP BY e.department_id , D.DEPARTMENT_NAME
HAVING COUNT(*) = 1
ORDER BY d.department_name ASC;

SELECT d.department_name, NVL(TO_CHAR(MIN(e.employee_id)), '<�Ż��μ�>') AS employee_id
FROM departments d LEFT JOIN employees e 
ON d.department_id = e.department_id
GROUP BY d.department_name
HAVING COUNT(e.employee_id) <= 1 
ORDER BY d.department_name DESC;




--17. �μ��� �Ի���� �������� ����Ͻÿ�. 

-- ��, �������� 5�� �̻��� �μ��� ��µǾ�� �ϸ� ��°���� �μ��̸� ������ �Ѵ�.




--18. ����(country_name) �� ����(city)�� �������� ��ȸ�Ͻÿ�. 

-- ��, �μ��� �������� ���� ���� �� �ֱ� ������ 106���� ������ ����� �ȴ�. 

-- �μ������� ���� ������ ������� ���ø� ��ſ� ��<�μ�����>���� ��µǵ��� �Ͽ� 107�� ��� ��µǰ� �Ѵ�.




--19. �� �μ��� �ִ� �޿����� ���̵�(employee_id), �̸�(first_name), �޿�(salary)�� ����Ͻÿ�. 

-- ��, �ִ� �޿��ڰ� ���� �μ��� ��ձ޿��� ���������� ����Ͽ� ��ձ޿��� ���� �� �ְ� �� ��.




--20. Ŀ�̼�(commission_pct)�� �������� ��ȸ�Ͻÿ�. 

-- Ŀ�̼��� �Ʒ�������ó�� 0.2, 0.25�� ��� .2��, 0.3, 0.35�� .3 ���·� ��µǾ�� �Ѵ�. 

-- ��, Ŀ�̼� ������ ���� �����鵵 �ִ� �� Ŀ�̼��� ���� ���� �׷��� ��<Ŀ�̼� ����>���� ��µǰ� �Ѵ�.




--21. Ŀ�̼�(commission_pct)�� ���� ���� ���� ���� 4���� �μ���(department_name), 

-- ������ (first_name), �޿�(salary), Ŀ�̼�(commission_pct) ������ ��ȸ�Ͻÿ�. 

-- ��°���� Ŀ�̼� �� ���� �޴� ������ ����ϵ� ������ Ŀ�̼ǿ� ���ؼ��� �޿��� ���� ������ ���� ��� �ǰ� �Ѵ�