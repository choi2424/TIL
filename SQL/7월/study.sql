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

-- hr ǥ���Լ�


-- ����1) EMPLOYEES ���̺��� King�� ������ �ҹ��ڷ� �˻��ϰ� �����ȣ, ����, ������(�ҹ��ڷ�),�μ���ȣ�� ����϶�.
SELECT * FROM employees

select lower(job_id),DEPARTMENT_ID,last_name,employee_id,FIRST_NAME
from employees
where last_name = 'King';




-- ����2) EMPLOYEES ���̺��� King�� ������ �빮�ڷ� �˻��ϰ� �����ȣ, ����, ������(�빮�ڷ�),�μ���ȣ�� ����϶�.
select upper(job_id),DEPARTMENT_ID,FIRST_NAME,last_name,employee_id
from employees
where last_name = 'King';



-- ����3) DEPARTMENTS ���̺��� (�μ���ȣ�� �μ��̸�), �μ��̸��� ��ġ��ȣ�� ���Ͽ� ����ϵ��� �϶�.
select DEPARTMENT_NAME || ' ' || DEPARTMENT_ID as department_name_id
from DEPARTMENTS;



-- ����4) EMPLOYEES ���̺��� �̸��� ù ���ڰ� ��K�� ���� ũ�� ��Y������ ���� ����� ������ 
-- �����ȣ, �̸�, ����, �޿�, �μ���ȣ�� ����϶�. 
-- �� �̸������� �����Ͽ���.
select EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY, DEPARTMENT_ID
from EMPLOYEES
where LAST_NAME > 'K' and LAST_NAME < 'Y';


-- ����5) EMPLOYEES ���̺��� 20�� �μ� �� �̸��� ���� �� �޿��� �ڸ����� 
-- �����ȣ, �̸�, �̸��� �ڸ���(LENGTH), �޿�, �޿��� �ڸ����� ����϶�.
-- LENGTHB�� BYTE ȥ������ ����!
select EMPLOYEE_ID, LAST_NAME,length(LAST_NAME), SALARY , length(SALARY)
from EMPLOYEES 
where DEPARTMENT_ID = 20;

-- ����6) EMPLOYEES ���̺��� �̸� �� ��e������ ��ġ�� ����϶�.
select LAST_NAME,instr(LAST_NAME,'e')
from employees;





-- ����7) ������ ������ �����ϰ� ����� ����ϰ� Ȯ���϶�.
SELECT  ROUND(4567.678),      
        ROUND(4567.678, 0),  
        ROUND(4567.678, 2),   
        ROUND(4567.678, -2)  
FROM dual;




-- ����8) EMPLOYEES ���̺��� �μ���ȣ�� 80�� ����� �޿��� 30���� ���� �������� ���Ͽ� ����϶�.
select LAST_NAME, DEPARTMENT_ID, SALARY, mod(salary, 30)
from employees
where DEPARTMENT_ID = 80 ;
    


-- ����9) EMPLOYEES ���̺��� 30�� �μ� �� �̸��� ��� ������ �����Ͽ� ����Ͽ���. 
SELECT LAST_NAME ||' '|| JOB_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 30 ;


-- ����10) EMPLOYEES ���̺��� ������� �ٹ��� ���� ���� ���� �ΰ��� ����Ͽ���. 
-- �� �ٹ� �ϼ��� ���� ��� ������ ����Ͽ���.
SELECT LAST_NAME, HIRE_DATE,
TRUNC(SYSDATE - hire_date) AS "�ѱٹ� �ϼ�",
TRUNC((SYSDATE - hire_date) / 7) AS "�ѱٹ���"
FROM EMPLOYEES
order by "�ѱٹ� �ϼ�" desc;




-- ����11) EMPLOYEES ���̺��� �μ� 50���� �޿� �տ� $�� �����ϰ� 3�ڸ����� ,�� ����϶�
SELECT last_name, department_id, salary, TO_CHAR(salary, '$999,999')
from employees
where department_id = 50 ;

-- Ŀ�̼��� not null�̸�, �޿��� Ŀ�̼� ����ǰ�, null�̸� �޿��� ���޵ǰ� ��ȸ.
SELECT employee_id, salary, NVL2(commission_pct,salary + ( salary * commission_pct),salary) AS REAL_SALARY
FROM employees;      
        
SELECT CONCAT('��', ' ', 's job category is ')
FROM dual;

--  scott���� ���� �� ���

?

-- 1. ����(JOB)�� MANAGER �� ����� �̸�, �Ի��� ���
select ENAME,HIREDATE
from emp
where JOB = 'MANAGER';

-- 2. ������� WARD �� ����� �޿�, Ŀ�̼��� ���
SELECT ENAME , SAL , COMM
FROM EMP
WHERE ENAME = 'WARD';

-- 3. 30�� �μ��� ���ϴ� ����� �̸�, �μ���ȣ�� ���
SELECT ENAME, DEPTNO
FROM EMP
WHERE DEPTNO = 30;

-- 4-1. �޿��� 1250�� �ʰ�, 3000������ ����� �̸�, �޿��� ���
SELECT ENAME , SAL
FROM EMP
WHERE SAL > 1250 AND SAL <= 3000;


-- 4-2. �޿��� 1250�̻��̰�, 3000������ ����� �̸�, �޿��� ���(������ ���Ե�)
SELECT ENAME , SAL
FROM EMP
WHERE SAL BETWEEN 1250  AND 3000;


-- 5. Ŀ�̼��� 0 �� ����� �̸�, Ŀ�̼��� ���
SELECT ENAME,COMM 
FROM EMP
WHERE COMM = 0;


-- 6-1. Ŀ�̼� ����� ���� ���� ����� �̸��� ���
SELECT ENAME, COMM
FROM EMP
WHERE COMM IS NULL;

-- 6-2. Ŀ�̼� ����� �� ����� �̸��� ���
SELECT ENAME, COMM
FROM EMP
WHERE COMM IS NOT NULL;

-- 7. �Ի����� 81/06/09 ���� ���� ����� �̸�, �Ի��� ���(�Ի����� �������� ��������.)
SELECT ENAME , HIREDATE
FROM EMP
WHERE HIREDATE > '1981-06-09'
order by HIREDATE asc;



-- 8. ��� ����� �޿����� 1000�� ���� �޿��� ���
select ename , (sal + 1000) as sal2
from emp;


-- 9. FORD �� �Ի���, �μ���ȣ�� ���
select ename,hiredate,deptno
from emp
where ename = 'FORD' 



-- 10. ������� ALLEN�� ����� �޿��� ����ϼ���.
SELECT ENAME , SAL 
FROM EMP
WHERE ENAME = 'ALLEN';



-- 11. ALLEN�� �޿����� ���� �޿��� �޴� ����� �����, �޿��� ���

?

?

-- 12. ���� ����/���� Ŀ�̼��� ���ϼ���.(�ִ밪/�ּҰ�)

?

?

-- 13. ���� ���� Ŀ�̼��� �޴� ����� �̸��� ���ϼ���.

?

?

-- 14. ���� ���� Ŀ�̼��� �޴� ����� �Ի��Ϻ��� ���� ����� �̸� �Ի����� ��� 

?

?

-- 15. JOB�� CLERK �� ������� �޿��� ���� ���ϼ���.

?

?

-- 16. JOB �� CLERK �� ������� �޿��� �պ��� �޿��� ���� ����̸��� ���.

?

-- 17. JOB�� CLERK �� ������� �޿��� ���� �޿��� �޴� ����� �̸�, �޿��� ���(�޿� ������������)

?

?

-- 18. EMP���̺��� �������