-- ������. || ���ڿ� �Ǵ� �÷� ���Ῥ���ڱ��
-- ���Ŀ����� : +, - , * , /
-- �ǿ����ڰ� ���ڵ������� �̾�� �Ѵ�.

desc employees;

select emp_name,salary from employees;

--��� �޿��� 10% �λ��ϴ� ������ ����϶�.

select emp_name,salary,salary * 1.1 as CHANGE_SALARY from employees;



SELECT employee_id || '-' || emp_name AS employee_info
  FROM employees
 WHERE ROWNUM < 5;

-- ��� ���̺�(EMPLOYEES)���� �޿�(SALARY)�� 5000�̻��̰� 8000�̸��� �����͸� ��ȸ�϶�
select emp_name , salary 
from employees
where salary >= 5000 and salary < 8000
order by salary asc;

-- job_id �÷��� �����Ͱ� 'SA_REP' �̰ų� 'SH_CLERK'�̰� ����� EMP_NAME , JOB_ID �÷��� ��ȸ�϶�
SELECT emp_name , job_id
from employees
where job_id = 'SA_REP' OR JOB_ID = 'SH_CLERK'
ORDER BY JOB_ID ASC;

-- job_id �÷��� �����Ͱ� 'SA_REP' �̰ų� 'SH_CLERK' �޿��� 5000���� ū ����� EMP_NAME , JOB_ID �÷��� ��ȸ�϶�
--AND ,OR ���������� �켱������ AND�� ����
SELECT emp_name , job_id,SALARY
from employees
where (job_id = 'SA_REP' OR JOB_ID = 'SH_CLERK') AND SALARY > 5000;

--COMMISSION_PCT �÷��� Ŀ�̼��� ���� ����� ��ȸ�϶� (EMP_NAME,SALARY,COMMISSION_PCT �÷�)
SELECT EMP_NAME,SALARY,COMMISSION_PCT
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NULL;

--COMMISSION_PCT �÷��� Ŀ�̼��� �ִ� ����� ��ȸ�϶� (EMP_NAME,SALARY,COMMISSION_PCT �÷�)  
SELECT EMP_NAME,SALARY,COMMISSION_PCT
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NOT NULL;

COMMIT;

SELECT * FROM EMPLOYEES;
-- ǥ����
-- CASE �� - 2����(ANSI-SQLǥ�ر���)
/*
1)IF�� ����
CASE 
    WHEN ����1 THEN ��1
    WHEN ����2 THEN ��2
    ...
    ELSE ��Ÿ ��
END
*/

-- ����> ��� ���̺��� �� ����� �޿��� ���� 5000 ���Ϸ� �޿��� �޴� ����� C, 5000~15000�� B, 15000 �̻��� A����� ��ȯ�ϴ� ������ �ۼ��� ����.

SELECT employee_id , emp_name , salary,
    case when salary >= 15000 then 'A���'
         when salary >= 5000 and salary < 15000 then 'B���'
         else 'C���'
    end as GRADE
from EMPLOYEES
ORDER BY SALARY DESC;


-- ����> �ڵ尡 1�̸� �ڹ�, 2�̸� ����Ŭ 3�̸� ������ ���� �������.
SELECT CODE , ENAME,
    CASE CODE
        WHEN 1 THEN '�ڹ�'
        WHEN 2 THEN '����Ŭ'
        WHEN 3 THEN '������'
    END AS KNAME
FROM TEST_05;

/*
2)SWITCH�� ����
CASE �÷���
    WHEN ���ǰ� THEN ��1
    WHEN ���ǰ� THEN ��2
    ...
    ELSE ��Ÿ ��
END
*/

-- ENAME���� KNAME ����ϱ�
SELECT ENAME,
    CASE ENAME
        WHEN 'JAVA'   THEN '�ڹ�'
        WHEN 'ORACLE' THEN '����Ŭ'
        WHEN 'SPRING' THEN '������'
    END AS KNAME
FROM TEST_05;

-- IF���������� CASE �����۾�
SELECT ENAME,
    CASE 
        WHEN ENAME = 'JAVA'   THEN '�ڹ�'
        WHEN ENAME = 'ORACLE' THEN '����Ŭ'
        WHEN ENAME = 'SPRING' THEN '������'
    END AS KNAME
FROM TEST_05;

-- ������̺��� �μ��ڵ尡 10�̸� New York, 20�̸� Dallas, �ƴϸ� Unknown ������� ó���ϰ�, ��ȸ �÷���Ī loc_name
-- ����̸�, �μ��ڵ�, loc_name
SELECT * from EMPLOYEES;    
SELECT emp_name, DEPARTMENT_ID,
    CASE DEPARTMENT_ID
        WHEN 10 THEN 'New York'
        WHEN 20 THEN 'Dallas'
        else 'Unknown'
    end as loc_name
from employees;

-- ��ø�� �̿��� CASE��
/*
�μ����� ��ޱ����� �ٸ� ���
�μ��ڵ� 10 �̸� �޿��� 2000 �̻� 1���, �޿��� 1500 �̻� 2���, �޿��� 1000 �̻� 3���
�μ��ڵ� 20 �̸� �޿��� 3000 �̻� 1���, �޿��� 2500 �̻� 2���, �޿��� 2000 �̻� 3���
�μ��ڵ� 50 �̸� �޿��� 2500 �̻� 1���, �޿��� 2000 �̻� 2���, �޿��� 1500 �̻� 3���
������ �μ��ڵ��  �޿��� 4000 �̻� 1���, �޿��� 3500 �̻� 2���, �޿��� 2500 �̻� 3���
*/

SELECT DEPARTMENT_ID, EMP_NAME, SALARY,
    CASE 
        WHEN DEPARTMENT_ID = 10 THEN
            CASE
                WHEN salary >= 2000 THEN '1���'
                WHEN salary >= 1500 AND salary < 2000 THEN '2���'
                WHEN salary >= 1000 AND salary < 1500 THEN '3���'
            END 
        WHEN DEPARTMENT_ID = 20 THEN
            CASE
                WHEN salary >= 3000 THEN '1���'
                WHEN salary >= 2500 AND salary < 3000 THEN '2���'
                WHEN salary >= 2000 AND salary < 2500 THEN '3���'
            END 
        WHEN DEPARTMENT_ID = 50 THEN
            CASE
                WHEN salary >= 2500 THEN '1���'
                WHEN salary >= 2000 AND salary < 2500 THEN '2���'
                WHEN salary >= 1500 AND salary < 2000 THEN '3���'
            END
        ELSE 
            CASE
                WHEN salary >= 4000 THEN '1���'
                WHEN salary >= 3500 AND salary < 4000 THEN '2���'
                WHEN salary >= 2500 AND salary < 3500 THEN '3���'
            END
        END AS SAL_GRADE
FROM EMPLOYEES;    
        