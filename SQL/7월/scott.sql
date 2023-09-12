-- 1. 최소급여를 받는 사원가 같은 부서에서 근무하는 모든 사원명 , 부서명을 출력
SELECT E.ENAME , D.DNAME
FROM EMP E , DEPT D
WHERE e.deptno = d.deptno
AND e.deptno = (SELECT DEPTNO FROM EMP WHERE SAL = (SELECT MIN(SAL) FROM EMP));

SELECT E.ENAME , D.DNAME
FROM EMP E 
JOIN DEPT D
ON e.deptno = d.deptno
WHERE e.deptno = (SELECT DEPTNO FROM EMP WHERE SAL = (SELECT MIN(SAL) FROM EMP));

-- 2. CLARK보다 입사일이 늦은 사원과 같은 부서에서 근무하는 사원들의 부서명 이름, 급여를 출력

-- CLARK의 입사일
SELECT hiredate FROM EMP WHERE ENAME = 'CLARK' ;

-- CLARK보다 입사일이 늦은사원과 같은 부서
SELECT DEPTNO 
FROM EMP
WHERE hiredate > (SELECT hiredate FROM EMP WHERE ENAME = 'CLARK') ;

--같은부서에서 근무하는 사원들의 이름 , 부서명 , 급여를 출력
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


-- 3. 이름에 'K'자가 들어가는 사원들 중 급여가 가장 적은 사원의 부서명, 사원명, 급여를 출력
-- 이름에 K가 들어가는사람 중 가장 작은 월급
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


-- 4. 커미션 계약이 없는 사원중 입사일이 가장 빠른 사원의 부서명, 사원명, 입사일을 출력
SELECT d.dname , E.ename, E.hiredate 
FROM emp E ,dept D
WHERE e.deptno = d.deptno
AND E.hiredate = (SELECT MIN(hiredate) FROM emp WHERE comm <= 0 OR comm IS NULL);

SELECT d.dname , E.ename, E.hiredate 
FROM emp E INNER JOIN dept D
ON e.deptno = d.deptno
WHERE E.hiredate = (SELECT MIN(hiredate) FROM emp WHERE comm <= 0 OR comm IS NULL);

-- 5. 위치가 시카고인 부서에 속한 사원들의 이름과 부서명을 출력.
SELECT DEPTNO FROM DEPT WHERE loc = 'CHICAGO';

SELECT e.ename , d.dname
FROM EMP E , DEPT D
WHERE e.deptno = d.deptno
AND e.deptno = (SELECT DEPTNO FROM DEPT WHERE loc = 'CHICAGO');

SELECT e.ename , d.dname
FROM EMP E INNER JOIN DEPT D
ON e.deptno = d.deptno
WHERE e.deptno = (SELECT DEPTNO FROM DEPT WHERE loc = 'CHICAGO');

-- 6. KING의 급여에서 CLARK의 급여를 뺀 결과보다 적은 급여를 받는 사원의 부서명, 이름, 급여를 출력 
-- KING과 CLARK의 급여
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

-- 7. DALLAS에 위치한 부서에 속한 사원의 총사원수, 평균급여,전체급여,최고급여,초저급여를 구하세요.
SELECT COUNT(*), ROUND(AVG(E.SAL)),SUM(E.SAL),MAX(E.SAL),MIN(E.SAL)
FROM EMP E , DEPT D
WHERE e.deptno = d.deptno
AND D.LOC = 'DALLAS';

SELECT COUNT(*), ROUND(AVG(E.SAL)),SUM(E.SAL),MAX(E.SAL),MIN(E.SAL)
FROM EMP E JOIN DEPT D
ON e.deptno = d.deptno
WHERE D.LOC = 'DALLAS';

-- 8. 커미션 계약조건이 있으며 이름에 'N'자가 들어가는 사원들 중 급여가 가장 적은 사원의 사원명, 급여,부서명을 출력
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

-- 9. ALLEN 보다 입사일이 빠른 사원의 부서명,사원명을 출력
SELECT hiredate FROM EMP WHERE ename = 'ALLEN';

SELECT d.dname , e.ename 
FROM EMP E , DEPT D
WHERE E.DEPTNO = D.DEPTNO
AND e.hiredate < (SELECT hiredate FROM EMP WHERE ename = 'ALLEN');

SELECT d.dname , e.ename 
FROM EMP E JOIN DEPT D
ON E.DEPTNO = D.DEPTNO
WHERE e.hiredate < (SELECT hiredate FROM EMP WHERE ename = 'ALLEN');

-- 10. EMP 테이블에서 이름이 5글자인 사원중 급여가 가장 높은 사원의 이름, 급여 , 부서명을 출력
SELECT ename,SAL FROM EMP WHERE ename LIKE '_____';

SELECT e.ename , e.sal , d.dname
FROM emp E , dept D
WHERE E.DEPTNO = D.DEPTNO
AND E.SAL = (SELECT MAX(sal) FROM EMP WHERE ename LIKE '_____' );

SELECT e.ename , e.sal , d.dname
FROM emp E JOIN dept D
ON E.DEPTNO = D.DEPTNO
WHERE E.SAL = (SELECT MAX(sal) FROM EMP WHERE ename LIKE '_____' );

-- 11. CLARK 이 속한 부서의 평균 연봉보다 급여가 높은 사원중 입사일이 가장 빠른 사원의 부서명, 사원명, 급여를 출력
-- CLARK이 속한 부서
SELECT DEPTNO FROM EMP WHERE ename = 'CLARK' ;
-- CLARK이 속한부서의 평균연봉
SELECT AVG(SAL) FROM EMP WHERE DEPTNO = (SELECT DEPTNO FROM EMP WHERE ename = 'CLARK') ;
-- 가장 입사일이 빠른사람
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


-- 12. ALLEN의 부서명을 출력
SELECT d.dname
FROM emp E , dept D
WHERE E.DEPTNO = D.DEPTNO
AND E.ENAME = 'ALLEN';

SELECT d.dname
FROM emp E JOIN dept D
ON E.DEPTNO = D.DEPTNO
WHERE E.ENAME = 'ALLEN';

-- 13. 이름에 J가 들어가는 사원들 중, 급여가 가장 높은 사원의 사원번호, 이름, 부서명, 급여, 부서위치를 출력


SELECT e.empno , e.ename , D.DNAME , E.SAL , d.loc
FROM emp E , dept D
WHERE E.DEPTNO = D.DEPTNO
AND SAL = (SELECT MAX(SAL) FROM EMP WHERE ENAME LIKE '%J%');

SELECT e.empno , e.ename , D.DNAME , E.SAL , d.loc
FROM emp E JOIN dept D
ON E.DEPTNO = D.DEPTNO
WHERE SAL = (SELECT MAX(SAL) FROM EMP WHERE ENAME LIKE '%J%');

-- 14. 두번째로 많은 급여를 받는 사원의 이름과 부서명,급여를 출력
SELECT MAX(SAL) FROM EMP;

SELECT E.ENAME , D.DNAME , E.SAL
FROM emp E , dept D
WHERE E.DEPTNO = D.DEPTNO
AND E.SAL = (SELECT MAX(SAL) FROM EMP WHERE SAL < (SELECT MAX(SAL) FROM EMP));

SELECT E.ENAME , D.DNAME , E.SAL
FROM emp E JOIN dept D
ON E.DEPTNO = D.DEPTNO
WHERE E.SAL = (SELECT MAX(SAL) FROM EMP WHERE SAL < (SELECT MAX(SAL) FROM EMP));

-- 15. 입사일이 2번째로 빠른 사원의 부서명과 이름, 입사일을 출력
SELECT MIN(hiredate) FROM EMP WHERE hiredate > (SELECT MIN(hiredate) FROM EMP);

SELECT d.dname, e.ename , E.HIREDATE
FROM emp E , dept D
WHERE E.DEPTNO = D.DEPTNO
AND e.hiredate = (SELECT MIN(hiredate) FROM EMP WHERE hiredate > (SELECT MIN(hiredate) FROM EMP));

SELECT d.dname, e.ename , E.HIREDATE
FROM emp E JOIN dept D
ON E.DEPTNO = D.DEPTNO
WHERE e.hiredate = (SELECT MIN(hiredate) FROM EMP WHERE hiredate > (SELECT MIN(hiredate) FROM EMP));

-- 16. DALLAS에 위치한 부서의 사원 중 최대 급여를 받는 사원의 급여에서 최소 급여를 받는 사원의 급여를 뺀 결과를 출력
SELECT DEPTNO FROM DEPT WHERE LOC ='DALLAS';

SELECT MAX(SAL) - MIN(SAL) 
FROM EMP 
WHERE DEPTNO = (SELECT DEPTNO FROM DEPT WHERE LOC ='DALLAS');

