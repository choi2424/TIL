-- hr ����

-- ����1) EMPLOYEES ���̺��� �Ի����� ������ �����Ͽ� �����ȣ, �̸�, ����, �޿�, �Ի�����,�μ���ȣ�� ����϶�.
-- ASC�� ����� ������ �������� ���� �����ش�.
SELECT employee_id,first_name,last_name,job_id,salary,hire_date,department_id
FROM employees 
ORDER BY hire_date ASC;

-- ����2) EMPLOYEES ���̺��� ���� �ֱٿ� �Ի��� ������ �����ȣ, �̸�, ����, �޿�, �Ի�����,�μ���ȣ�� ����϶�.
SELECT employee_id,first_name,last_name,job_id,salary,hire_date,department_id
FROM employees 
ORDER BY hire_date DESC;

-- ����3) EMPLOYEES ���̺��� �μ���ȣ�� ������ �� �μ���ȣ�� ���� ��� �޿��� ���� ������ �����Ͽ� 
-- �����ȣ, ����, ����, �μ���ȣ, �޿��� ����Ͽ���.
SELECT employee_id, first_name , last_name , job_id , department_id , salary
FROM employees
ORDER BY department_id ASC , salary desc;


-- ����4) EMPLOYEES ���̺��� ù��° ������ �μ���ȣ�� �ι�° ������ ������ ����° ������ �޿��� ���� ������ �����Ͽ� 
-- �����ȣ, ����, �Ի�����, �μ���ȣ, ����, �޿��� ����Ͽ���.
SELECT employee_id , first_name , last_name , hire_date , department_id , job_id , salary
FROM employees
ORDER BY department_id ASC, job_id ASC, salary DESC;
-- hr �׷���

-- ����1) EMPLOYEES ���̺��� ��� SALESMAN(SA_)�� ���Ͽ� �޿��� ���, �ְ��, ������, �հ踦 ���Ͽ� ����Ͽ���.
SELECT AVG(salary), MAX(salary),MIN(salary),SUM(salary)
FROM EMPLOYEES
WHERE job_id LIKE 'SA_%';

-- ����2) EMPLOYEES ���̺� ��ϵǾ� �ִ� �ο���, 
-- ���ʽ��� NULL�� �ƴ� �ο���, ���ʽ��� ���, ��ϵǾ� �ִ� �μ��� ���� ���Ͽ� ����϶�.

SELECT COUNT(*),COUNT(commission_pct),ROUND(AVG(commission_pct*salary)),COUNT (DISTINCT department_id)
FROM EMPLOYEES;


-- ����3) EMPLOYEES ���̺��� �μ����� �ο���, ��� �޿�, �����޿�, �ְ� �޿�, �޿��� ���� ���Ͽ� ����϶�.
SELECT COUNT(*) , ROUND(AVG(salary)),MIN(salary),MAX(salary),SUM(salary)
FROM employees
GROUP BY department_id;



-- ����4) EMPLOYEES ���̺��� �� �μ����� �ο���,�޿��� ���, ���� �޿�, �ְ� �޿�, �޿��� ���� ���Ͽ� �޿��� ���� ���� ������ ����Ͽ���.
SELECT COUNT(*) , ROUND(AVG(salary)),MIN(salary),MAX(salary),SUM(salary) AS TOTAL_SALARY
FROM employees
GROUP BY department_id 
ORDER BY TOTAL_SALARY DESC;


-- ����5) EMPLOYEES ���̺��� �μ���, ������ �׷��Ͽ� ����� �μ���ȣ, ����, �ο���, �޿��� ���, �޿��� ���� ���Ͽ� ����Ͽ���.
SELECT department_id , job_id , COUNT(*) , ROUND(AVG(salary)) , SUM(salary)
FROM employees
GROUP BY department_id , job_id;


-- ����6) EMPLOYEES ���̺��� �μ� �ο��� 4���� ���� �μ��� �μ���ȣ, �ο���, �޿��� ���� ���Ͽ� ����Ͽ���
SELECT department_id , COUNT(*) , SUM(salary)
FROM employees
GROUP BY department_id
HAVING COUNT(*) > 4;

-- ����7) EMPLOYEES ���̺��� �޿��� �ִ� 10000�̻��� �μ��� ���ؼ� �μ���ȣ, ��� �޿�, �޿��� ���� ���Ͽ� ����Ͽ���.
SELECT department_id,MAX(salary), ROUND(AVG(salary)),SUM(salary) 
FROM employees
GROUP BY department_id
HAVING MAX(salary) >= 10000;

-- ����8) EMPLOYEES ���̺��� ������ �޿��� ����� 10000 �̻��� ������ ���ؼ� ������,��� �޿�, �޿��� ���� ���Ͽ� ����϶�.
SELECT job_id, ROUND(AVG(salary)), SUM(salary)
FROM employees
GROUP BY job_id
HAVING ROUND(AVG(salary)) >= 10000; 

-- ����9) EMPLOYEES ���̺��� ��ü ������ 10000�� �ʰ��ϴ� �� ������ ���ؼ� ������ ���޿� �հ踦 ����϶�. 
-- �� �Ǹſ�(SA_)�� �����ϰ� �� �޿� �հ�� ����(��������)�϶�.
SELECT SUM(salary), job_id  
FROM employees
WHERE JOB_ID NOT LIKE 'SA_%' 
GROUP BY job_id
HAVING SUM(salary) > 10000 
ORDER BY SUM(salary) ASC;