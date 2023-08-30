-- scott

--19) emp ���̺��� �����ȣ, ����̸�, �Ի����� ����ϴµ� �Ի����� ���� ��������� �����Ͻÿ�.
SELECT empno, ename , hiredate
FROM emp
ORDER BY hiredate ASC;



--20) emp ���̺��� ����̸�, �޿�, ������ ���ϰ� ������ ���� ������ �����Ͻÿ�.
SELECT ename , sal , sal * 12 AS Y_SAL
FROM emp
ORDER BY Y_SAL DESC;

--21)10�� �μ��� 20���μ����� �ٹ��ϰ� �ִ� ����� �̸��� �μ���ȣ�� ����ϴµ� �̸��� �����ڼ����� ǥ���Ͻÿ�.
SELECT ename , deptno
FROM emp
WHERE deptno = 10 OR deptno = 20
ORDER BY ename ASC;

SELECT ename , deptno
FROM emp
WHERE deptno IN (10 , 20)
ORDER BY ename ASC;


--22) Ŀ�̼��� �޴� ��� ����� �̸�,�޿� �� Ŀ�̼��� Ŀ�̼��� �������� ������������ �����Ͽ� ǥ���Ͻʽÿ�.
-- ������ ���� ������ �ؾ� �� ��찡 �ִ�
SELECT ename , sal , comm
FROM emp
WHERE comm IS NOT NULL and comm != 0
ORDER BY comm ASC;

SELECT ename , sal , comm
FROM emp
WHERE comm > 0
ORDER BY comm ASC;


--23) emp���̺��� ����(job)�� ù���ڴ� �빮�� �������� �ҹ��ڷ� ����Ͻÿ�. INITCAP() 
--����(job)�� �ߺ��� �������ֽʽÿ�.
SELECT DISTINCT job , INITCAP(job) 
FROM emp;




--24) emp���̺��� ����̸� �� A�� ���Ե� ����̸��� ���ϰ� �� �̸� �� �տ��� 3�ڸ� �����Ͽ� ���
SELECT SUBSTR(ename,1,3) || '...'
FROM emp
WHERE ename LIKE '%A%';



--25) �̸��� ����° ���ڰ� A�� ��� ����� �̸��� ǥ���Ͻÿ�.
SELECT ename
FROM emp
WHERE ename LIKE '__A%';


--26) �̸��� J,A �Ǵ� M���� �����ϴ� ��� ����� �̸�(ù ���ڴ� �빮�ڷ�, ������ ���ڴ� �ҹ��ڷ� ǥ��) �� �̸��� ���̸� ǥ���Ͻÿ�.
--(�� ���̺��� name�� length�� ǥ��)
SELECT ename AS NAME , LENGTH(ename) AS LENGTH
FROM emp
WHERE ename LIKE 'A%' OR ename LIKE 'J%' OR ename LIKE 'M%';


--27) �̸��� ���ڼ��� 6�� �̻��� ����� �̸��� �ҹ��ڷ� �̸��� ����Ͻÿ�
SELECT ename
FROM emp
WHERE ename LIKE '__A%';


--28) �̸��� ���ڼ��� 6�� �̻��� ����� �̸��� �տ��� 3�ڸ� ���Ͽ� �ҹ��ڷ� ����Ͻÿ�.
SELECT SUBSTR(LOWER(ename),1,3)
FROM EMP
WHERE LENGTH(ename) >= 6 ;




--29) ��� ����� �̸��� �޿��� ǥ���Ͻÿ�. �޿��� 15�� ���̷� ���ʿ� $��ȣ�� ä���� �������� ǥ���ϰ� �����̺��� SALARY�� �����Ͻÿ�.
SELECT ename ,LPAD(sal,15,'$') AS SALARY
FROM emp;


--30) ���ú��� �̹����� �������������� ���� �� ���� ���Ͻÿ�.
SELECT LAST_DAY(SYSDATE) - SYSDATE 
FROM DUAL;



--31) emp���̺��� �� ����� ���� �����ȣ, �̸�, �޿� �� 15% �λ�� �޿��� ����(�ݿø�)�� ǥ���Ͻÿ�.
--    �λ�� �޿����� ���̺��� New Salary�� �����Ͻÿ�.

SELECT empno , ename , sal , sal * 1.15 AS "New Salary"
FROM EMP;



--32) emp���̺��� ������ 4�� ���(mod(sal,4)=0)�� ����� �̸��� ������ ����Ͻÿ�.(���ڸ� ���� ��ǥ ǥ��)
SELECT ename , TO_CHAR (sal ,'999,999,999')
FROM EMP
WHERE MOD(sal,4) = 0;


-- 33) �� ����� �̸��� ǥ���ϰ� �ٹ� �� ��(�Ի��Ϸκ��� ��������� �޼�)�� ����Ͽ� �� ���̺��� MONTHS_WORKED�� �����Ͻÿ�. 
-- ����� ������ �ݿø��Ͽ� ǥ���ϰ� �ٹ��� ���� �������� ������������ �����Ͻÿ�.
-- ������� ��¥�� ���� �� TO_DATE('00000000','YYYYMMDD') ���
SELECT ename,hiredate,ROUND(MONTHS_BETWEEN(SYSDATE,hiredate)) AS MONTHS_WORKED
FROM emp
ORDER BY MONTHS_WORKED ASC;



-- 34)emp���̺��� �̸�, ����, �ٹ������� ����Ͻÿ�.
SELECT ename , job , TRUNC(MONTHS_BETWEEN(SYSDATE,hiredate)/12) AS YEARS
FROM emp;



-- 35)emp���̺��� ����̸�, ����, ���ް� Ŀ�̼��� ���� ���� �÷��� �Ǳ޿���� �ؼ� ���.
-- ��, NULL���� ��Ÿ���� �ʰ� �ۼ��Ͻÿ�. NVL
SELECT ename , sal , NVL(sal + comm,sal) AS �Ǳ޿�
FROM emp;



-- 36)���ް� Ŀ�̼��� ��ģ �ݾ��� 2,000�̻��� �޿��� �޴� ����� �̸�,����,����,Ŀ�̼�,��볯¥�� ����Ͻÿ�. ��, ��볯¥�� 1980-12-17 ���·� ����Ͻÿ�
SELECT ename , job , sal , comm ,TO_CHAR(TO_DATE(hiredate,'RR-MM-DD'),'YYYY-MM-DD') AS ��볯¥, NVL(sal + comm,sal) 
FROM emp
WHERE NVL(sal + comm,sal) >= 2000;

-- 38)��� ����� �޿��� �ְ��, ������, �Ѿ� �� ��վ��� ǥ���Ͻÿ�. 
-- �� ���̺��� ���� maximum,minimum,sum �� average�� �����ϰ� 
-- ����� ������ �ݿø��ϰ� ���ڸ� ������ ,�� ����Ͻÿ�.
SELECT to_char( MAX(sal),'999,999') AS maximum , 
to_char(MIN(sal),'999,999') AS minimum , 
to_char(SUM(sal),'999,999') AS sum ,
to_char(round(AVG(sal)),'999,999') AS average
FROM emp;




-- 39) ������ ������ ��� ���� ǥ���ϴ� ���Ǹ� �ۼ��Ͻÿ�.
SELECT job,count(*)
FROM emp
GROUP BY job;



-- 40) emp���̺��� 30���μ��� ������� ���Ͻÿ�.
SELECT  COUNT(*) 
FROM emp
WHERE deptno = 30;



-- 41) emp���̺��� ������ �ְ� ������ ���ϰ� ����,�ְ� ������ ����Ͻÿ�.
SELECT job , MAX(sal)
FROM emp
GROUP BY job;


-- 42) emp���̺��� 20���μ��� �޿� �հ踦 ���ϰ� �޿� �հ� �ݾ��� ����Ͻÿ�.
SELECT SUM(sal)
FROM emp
WHERE deptno = 20;


-- 43) emp���̺��� �μ����� ���޵Ǵ� �ѿ��޿��� �ݾ��� 7,000�̻��� �μ���ȣ, �ѿ����� ����Ͻÿ�.
SELECT deptno ,SUM(sal)
FROM emp
GROUP BY deptno
HAVING SUM(SAL) >= 7000 ;

 
-- 44) emp���̺��� �������� ����� ���� ���� ����� ���ϰ� �� ��� ������ ����� 79�� �����ϴ� ����� �����ֽÿ�.
SELECT max(empno)
FROM emp
WHERE empno LIKE '79%'
GROUP BY job;

-- 45) emp���̺��� ������ �ѿ����� ����ϴµ� ������ 'MANAGER'�� ������� �����ϰ� 
-- �ѿ����� 5,000���� ū ������ �ѿ��޸� ����Ͻÿ�.
SELECT job,SUM(sal)
FROM emp
WHERE job NOT LIKE 'MANAGER' 
GROUP BY job
HAVING SUM(sal) > 5000 ;

-- 46)emp���̺��� �������� ������� 4�� �̻��� ������ �ο����� ����Ͻÿ�.
SELECT job , count(ename)
FROM emp
GROUP BY job
HAVING COUNT(ename) >= 4;

-- 47)emp���̺��� ������� 5���� �Ѵ� �μ��� �μ���ȣ�� ������� ���Ͻÿ�.
SELECT deptno,COUNT(ename)
FROM emp
GROUP BY deptno
HAVING COUNT(ename) > 5;
-- 48)emp���̺��� �μ��� �޿������ ���� �� �Ҽ��� 3�ڸ����� �ݿø��ؼ� 2�ڸ����� ���ϰ� 
-- �μ���ȣ, �޿������ ����Ͻÿ�.
SELECT deptno , ROUND(AVG(sal),2)
FROM emp
GROUP BY deptno;
