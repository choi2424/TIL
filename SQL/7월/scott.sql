-- 1. �ּұ޿��� �޴� ����� ���� �μ����� �ٹ��ϴ� ��� ����� , �μ����� ���
SELECT E.ENAME , D.DNAME
FROM EMP E , DEPT D
WHERE e.deptno = d.deptno
AND e.deptno = (SELECT DEPTNO FROM EMP WHERE SAL = (SELECT MIN(SAL) FROM EMP));

SELECT E.ENAME , D.DNAME
FROM EMP E 
JOIN DEPT D
ON e.deptno = d.deptno
WHERE e.deptno = (SELECT DEPTNO FROM EMP WHERE SAL = (SELECT MIN(SAL) FROM EMP));

-- 2. CLARK���� �Ի����� ���� ����� ���� �μ����� �ٹ��ϴ� ������� �μ��� �̸�, �޿��� ���

-- CLARK�� �Ի���
SELECT hiredate FROM EMP WHERE ENAME = 'CLARK' ;

-- CLARK���� �Ի����� ��������� ���� �μ�
SELECT DEPTNO 
FROM EMP
WHERE hiredate > (SELECT hiredate FROM EMP WHERE ENAME = 'CLARK') ;

--�����μ����� �ٹ��ϴ� ������� �̸� , �μ��� , �޿��� ���
SELECT e.ename, d.dname  , E.SAL
FROM EMP E JOIN DEPT D
ON e.deptno = d.deptno
WHERE e.deptno IN ( SELECT DEPTNO 
FROM EMP
WHERE hiredate > (SELECT hiredate FROM EMP WHERE ENAME = 'CLARK')) ;

SELECT e.ename, d.dname  , E.SAL
FROM EMP E, DEPT D
WHERE e.deptno = d.deptno
AND e.deptno IN ( SELECT DEPTNO 
FROM EMP
WHERE hiredate > (SELECT hiredate FROM EMP WHERE ENAME = 'CLARK')) ;


-- 3. �̸��� 'K'�ڰ� ���� ����� �� �޿��� ���� ���� ����� �μ���, �����, �޿��� ���
-- �̸��� K�� ���»�� �� ���� ���� ����
SELECT MIN(SAL)
FROM EMP
WHERE ename LIKE '%K%';

--
SELECT d.dname , e.ename , e.sal
FROM EMP E, DEPT D
WHERE e.deptno = d.deptno
AND E.SAL = (SELECT MIN(SAL) FROM EMP WHERE ename LIKE '%K%');

SELECT d.dname , e.ename , e.sal
FROM EMP E INNER JOIN DEPT D
ON e.deptno = d.deptno
WHERE E.SAL = (SELECT MIN(SAL) FROM EMP WHERE ename LIKE '%K%');


-- 4. Ŀ�̼� ����� ���� ����� �Ի����� ���� ���� ����� �μ���, �����, �Ի����� ���
SELECT d.dname , E.ename, E.hiredate 
FROM emp E ,dept D
WHERE e.deptno = d.deptno
AND E.hiredate = (SELECT MIN(hiredate) FROM emp WHERE comm <= 0 OR comm IS NULL);

SELECT d.dname , E.ename, E.hiredate 
FROM emp E INNER JOIN dept D
ON e.deptno = d.deptno
WHERE E.hiredate = (SELECT MIN(hiredate) FROM emp WHERE comm <= 0 OR comm IS NULL);

-- 5. ��ġ�� ��ī���� �μ��� ���� ������� �̸��� �μ����� ���.
SELECT DEPTNO FROM DEPT WHERE loc = 'CHICAGO';

SELECT e.ename , d.dname
FROM EMP E , DEPT D
WHERE e.deptno = d.deptno
AND e.deptno = (SELECT DEPTNO FROM DEPT WHERE loc = 'CHICAGO');

SELECT e.ename , d.dname
FROM EMP E INNER JOIN DEPT D
ON e.deptno = d.deptno
WHERE e.deptno = (SELECT DEPTNO FROM DEPT WHERE loc = 'CHICAGO');

-- 6. KING�� �޿����� CLARK�� �޿��� �� ������� ���� �޿��� �޴� ����� �μ���, �̸�, �޿��� ��� 
-- KING�� CLARK�� �޿�
SELECT SAL
FROM EMP
WHERE ename = 'KING' OR ENAME = 'CLARK';

SELECT d.dname , e.ename , E.SAL
FROM EMP E , DEPT D
WHERE e.deptno = d.deptno
AND e.sal < (SELECT SAL FROM EMP WHERE ename = 'KING') - (SELECT SAL FROM EMP WHERE ename = 'CLARK');

SELECT d.dname , e.ename , E.SAL
FROM EMP E INNER JOIN DEPT D
ON e.deptno = d.deptno
WHERE e.sal < (SELECT SAL FROM EMP WHERE ename = 'KING') - (SELECT SAL FROM EMP WHERE ename = 'CLARK');

-- 7. DALLAS�� ��ġ�� �μ��� ���� ����� �ѻ����, ��ձ޿�,��ü�޿�,�ְ�޿�,�����޿��� ���ϼ���.
SELECT COUNT(*), ROUND(AVG(E.SAL)),SUM(E.SAL),MAX(E.SAL),MIN(E.SAL)
FROM EMP E , DEPT D
WHERE e.deptno = d.deptno
AND D.LOC = 'DALLAS';

SELECT COUNT(*), ROUND(AVG(E.SAL)),SUM(E.SAL),MAX(E.SAL),MIN(E.SAL)
FROM EMP E JOIN DEPT D
ON e.deptno = d.deptno
WHERE D.LOC = 'DALLAS';

-- 8. Ŀ�̼� ��������� ������ �̸��� 'N'�ڰ� ���� ����� �� �޿��� ���� ���� ����� �����, �޿�,�μ����� ���
SELECT MIN(SAL) FROM emp ;

SELECT E.ename , E.sal , D.DNAME
FROM EMP E , DEPT D
WHERE e.deptno = d.deptno
AND ENAME LIKE '%N%'
AND E.SAL = (SELECT MIN(SAL) FROM emp WHERE comm IS NOT NULL);

SELECT E.ename , E.sal , D.DNAME
FROM EMP E JOIN DEPT D
ON e.deptno = d.deptno
WHERE ENAME LIKE '%N%'
AND E.SAL = (SELECT MIN(SAL) FROM emp WHERE comm IS NOT NULL);

-- 9. ALLEN ���� �Ի����� ���� ����� �μ���,������� ���
SELECT hiredate FROM EMP WHERE ename = 'ALLEN';

SELECT d.dname , e.ename 
FROM EMP E , DEPT D
WHERE E.DEPTNO = D.DEPTNO
AND e.hiredate < (SELECT hiredate FROM EMP WHERE ename = 'ALLEN');

SELECT d.dname , e.ename 
FROM EMP E JOIN DEPT D
ON E.DEPTNO = D.DEPTNO
WHERE e.hiredate < (SELECT hiredate FROM EMP WHERE ename = 'ALLEN');

-- 10. EMP ���̺��� �̸��� 5������ ����� �޿��� ���� ���� ����� �̸�, �޿� , �μ����� ���
SELECT ename,SAL FROM EMP WHERE ename LIKE '_____';

SELECT e.ename , e.sal , d.dname
FROM emp E , dept D
WHERE E.DEPTNO = D.DEPTNO
AND E.SAL = (SELECT MAX(sal) FROM EMP WHERE ename LIKE '_____' );

SELECT e.ename , e.sal , d.dname
FROM emp E JOIN dept D
ON E.DEPTNO = D.DEPTNO
WHERE E.SAL = (SELECT MAX(sal) FROM EMP WHERE ename LIKE '_____' );

-- 11. CLARK �� ���� �μ��� ��� �������� �޿��� ���� ����� �Ի����� ���� ���� ����� �μ���, �����, �޿��� ���
-- CLARK�� ���� �μ�
SELECT DEPTNO FROM EMP WHERE ename = 'CLARK' ;
-- CLARK�� ���Ѻμ��� ��տ���
SELECT AVG(SAL) FROM EMP WHERE DEPTNO = (SELECT DEPTNO FROM EMP WHERE ename = 'CLARK') ;
-- ���� �Ի����� �������
SELECT MIN(HIREDATE) FROM EMP ;

SELECT d.dname , e.ename , E.SAL
FROM emp E , dept D
WHERE E.DEPTNO = D.DEPTNO
AND e.sal > (SELECT AVG(SAL) FROM EMP WHERE DEPTNO = (SELECT DEPTNO FROM EMP WHERE ename = 'CLARK'))
AND e.hiredate = 
(SELECT MIN(HIREDATE) FROM EMP WHERE sal > (SELECT AVG(SAL) FROM EMP WHERE DEPTNO = 
(SELECT DEPTNO FROM EMP WHERE ename = 'CLARK'))) ;

SELECT d.dname , e.ename , E.SAL
FROM emp E JOIN dept D
ON E.DEPTNO = D.DEPTNO
WHERE e.sal > (SELECT AVG(SAL) FROM EMP WHERE DEPTNO = (SELECT DEPTNO FROM EMP WHERE ename = 'CLARK'))
AND e.hiredate = 
(SELECT MIN(HIREDATE) FROM EMP WHERE sal > (SELECT AVG(SAL) FROM EMP WHERE DEPTNO = 
(SELECT DEPTNO FROM EMP WHERE ename = 'CLARK'))) ;


-- 12. ALLEN�� �μ����� ���
SELECT d.dname
FROM emp E , dept D
WHERE E.DEPTNO = D.DEPTNO
AND E.ENAME = 'ALLEN';

SELECT d.dname
FROM emp E JOIN dept D
ON E.DEPTNO = D.DEPTNO
WHERE E.ENAME = 'ALLEN';

-- 13. �̸��� J�� ���� ����� ��, �޿��� ���� ���� ����� �����ȣ, �̸�, �μ���, �޿�, �μ���ġ�� ���


SELECT e.empno , e.ename , D.DNAME , E.SAL , d.loc
FROM emp E , dept D
WHERE E.DEPTNO = D.DEPTNO
AND SAL = (SELECT MAX(SAL) FROM EMP WHERE ENAME LIKE '%J%');

SELECT e.empno , e.ename , D.DNAME , E.SAL , d.loc
FROM emp E JOIN dept D
ON E.DEPTNO = D.DEPTNO
WHERE SAL = (SELECT MAX(SAL) FROM EMP WHERE ENAME LIKE '%J%');

-- 14. �ι�°�� ���� �޿��� �޴� ����� �̸��� �μ���,�޿��� ���
SELECT MAX(SAL) FROM EMP;

SELECT E.ENAME , D.DNAME , E.SAL
FROM emp E , dept D
WHERE E.DEPTNO = D.DEPTNO
AND E.SAL = (SELECT MAX(SAL) FROM EMP WHERE SAL < (SELECT MAX(SAL) FROM EMP));

SELECT E.ENAME , D.DNAME , E.SAL
FROM emp E JOIN dept D
ON E.DEPTNO = D.DEPTNO
WHERE E.SAL = (SELECT MAX(SAL) FROM EMP WHERE SAL < (SELECT MAX(SAL) FROM EMP));

-- 15. �Ի����� 2��°�� ���� ����� �μ���� �̸�, �Ի����� ���
SELECT MIN(hiredate) FROM EMP WHERE hiredate > (SELECT MIN(hiredate) FROM EMP);

SELECT d.dname, e.ename , E.HIREDATE
FROM emp E , dept D
WHERE E.DEPTNO = D.DEPTNO
AND e.hiredate = (SELECT MIN(hiredate) FROM EMP WHERE hiredate > (SELECT MIN(hiredate) FROM EMP));

SELECT d.dname, e.ename , E.HIREDATE
FROM emp E JOIN dept D
ON E.DEPTNO = D.DEPTNO
WHERE e.hiredate = (SELECT MIN(hiredate) FROM EMP WHERE hiredate > (SELECT MIN(hiredate) FROM EMP));

-- 16. DALLAS�� ��ġ�� �μ��� ��� �� �ִ� �޿��� �޴� ����� �޿����� �ּ� �޿��� �޴� ����� �޿��� �� ����� ���
SELECT DEPTNO FROM DEPT WHERE LOC ='DALLAS';

SELECT MAX(SAL) - MIN(SAL) 
FROM EMP 
WHERE DEPTNO = (SELECT DEPTNO FROM DEPT WHERE LOC ='DALLAS');

