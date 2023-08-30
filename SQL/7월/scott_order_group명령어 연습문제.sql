-- scott

--19) emp 테이블에서 사원번호, 사원이름, 입사일을 출력하는데 입사일이 빠른 사람순으로 정렬하시오.
SELECT empno, ename , hiredate
FROM emp
ORDER BY hiredate ASC;



--20) emp 테이블에서 사원이름, 급여, 연봉을 구하고 연봉이 많은 순으로 정렬하시오.
SELECT ename , sal , sal * 12 AS Y_SAL
FROM emp
ORDER BY Y_SAL DESC;

--21)10번 부서와 20번부서에서 근무하고 있는 사원의 이름과 부서번호를 출력하는데 이름을 영문자순으로 표시하시오.
SELECT ename , deptno
FROM emp
WHERE deptno = 10 OR deptno = 20
ORDER BY ename ASC;

SELECT ename , deptno
FROM emp
WHERE deptno IN (10 , 20)
ORDER BY ename ASC;


--22) 커미션을 받는 모든 사원의 이름,급여 및 커미션을 커미션을 기준으로 내림차순으로 정렬하여 표시하십시오.
-- 성능의 따른 선택을 해야 할 경우가 있다
SELECT ename , sal , comm
FROM emp
WHERE comm IS NOT NULL and comm != 0
ORDER BY comm ASC;

SELECT ename , sal , comm
FROM emp
WHERE comm > 0
ORDER BY comm ASC;


--23) emp테이블의 업무(job)을 첫글자는 대문자 나머지는 소문자로 출력하시오. INITCAP() 
--업무(job)의 중복은 제거해주십시오.
SELECT DISTINCT job , INITCAP(job) 
FROM emp;




--24) emp테이블에서 사원이름 중 A가 포함된 사원이름을 구하고 그 이름 중 앞에서 3자만 추출하여 출력
SELECT SUBSTR(ename,1,3) || '...'
FROM emp
WHERE ename LIKE '%A%';



--25) 이름의 세번째 문자가 A인 모든 사원의 이름을 표시하시오.
SELECT ename
FROM emp
WHERE ename LIKE '__A%';


--26) 이름이 J,A 또는 M으로 시작하는 모든 사원의 이름(첫 글자는 대문자로, 나머지 글자는 소문자로 표시) 및 이름의 길이를 표시하시오.
--(열 레이블은 name과 length로 표시)
SELECT ename AS NAME , LENGTH(ename) AS LENGTH
FROM emp
WHERE ename LIKE 'A%' OR ename LIKE 'J%' OR ename LIKE 'M%';


--27) 이름의 글자수가 6자 이상인 사원의 이름을 소문자로 이름만 출력하시오
SELECT ename
FROM emp
WHERE ename LIKE '__A%';


--28) 이름의 글자수가 6자 이상인 사람의 이름을 앞에서 3자만 구하여 소문자로 출력하시오.
SELECT SUBSTR(LOWER(ename),1,3)
FROM EMP
WHERE LENGTH(ename) >= 6 ;




--29) 모든 사원의 이름과 급여를 표시하시오. 급여는 15자 길이로 왼쪽에 $기호가 채워진 형식으로 표기하고 열레이블을 SALARY로 지정하시오.
SELECT ename ,LPAD(sal,15,'$') AS SALARY
FROM emp;


--30) 오늘부터 이번달의 마지막날까지의 남은 날 수를 구하시오.
SELECT LAST_DAY(SYSDATE) - SYSDATE 
FROM DUAL;



--31) emp테이블에서 각 사원에 대해 사원번호, 이름, 급여 및 15% 인상된 급여를 정수(반올림)로 표시하시오.
--    인상된 급여열의 레이블을 New Salary로 지정하시오.

SELECT empno , ename , sal , sal * 1.15 AS "New Salary"
FROM EMP;



--32) emp테이블에서 월급의 4의 배수(mod(sal,4)=0)인 사원의 이름과 월급을 출력하시오.(세자리 단위 쉼표 표시)
SELECT ename , TO_CHAR (sal ,'999,999,999')
FROM EMP
WHERE MOD(sal,4) = 0;


-- 33) 각 사원의 이름을 표시하고 근무 달 수(입사일로부터 현재까지의 달수)를 계산하여 열 레이블을 MONTHS_WORKED로 지정하시오. 
-- 결과는 정수로 반올림하여 표시하고 근무달 수를 기준으로 오름차순으로 정렬하시오.
-- 적고싶은 날짜가 있을 시 TO_DATE('00000000','YYYYMMDD') 사용
SELECT ename,hiredate,ROUND(MONTHS_BETWEEN(SYSDATE,hiredate)) AS MONTHS_WORKED
FROM emp
ORDER BY MONTHS_WORKED ASC;



-- 34)emp테이블에서 이름, 업무, 근무연차를 출력하시오.
SELECT ename , job , TRUNC(MONTHS_BETWEEN(SYSDATE,hiredate)/12) AS YEARS
FROM emp;



-- 35)emp테이블에서 사원이름, 월급, 월급과 커미션을 더한 값을 컬럼명 실급여라고 해서 출력.
-- 단, NULL값은 나타나지 않게 작성하시오. NVL
SELECT ename , sal , NVL(sal + comm,sal) AS 실급여
FROM emp;



-- 36)월급과 커미션을 합친 금액이 2,000이상인 급여를 받는 사원의 이름,업무,월급,커미션,고용날짜를 출력하시오. 단, 고용날짜는 1980-12-17 형태로 출력하시오
SELECT ename , job , sal , comm ,TO_CHAR(TO_DATE(hiredate,'RR-MM-DD'),'YYYY-MM-DD') AS 고용날짜, NVL(sal + comm,sal) 
FROM emp
WHERE NVL(sal + comm,sal) >= 2000;

-- 38)모든 사원의 급여의 최고액, 최저액, 총액 및 평균액을 표시하시오. 
-- 열 레이블을 각각 maximum,minimum,sum 및 average로 지정하고 
-- 결과를 정수로 반올림하고 세자리 단위로 ,를 명시하시오.
SELECT to_char( MAX(sal),'999,999') AS maximum , 
to_char(MIN(sal),'999,999') AS minimum , 
to_char(SUM(sal),'999,999') AS sum ,
to_char(round(AVG(sal)),'999,999') AS average
FROM emp;




-- 39) 업무가 동일한 사원 수를 표시하는 질의를 작성하시오.
SELECT job,count(*)
FROM emp
GROUP BY job;



-- 40) emp테이블에서 30번부서의 사원수를 구하시오.
SELECT  COUNT(*) 
FROM emp
WHERE deptno = 30;



-- 41) emp테이블에서 업무별 최고 월급을 구하고 업무,최고 월급을 출력하시오.
SELECT job , MAX(sal)
FROM emp
GROUP BY job;


-- 42) emp테이블에서 20번부서의 급여 합계를 구하고 급여 합계 금액을 출력하시오.
SELECT SUM(sal)
FROM emp
WHERE deptno = 20;


-- 43) emp테이블에서 부서별로 지급되는 총월급에서 금액이 7,000이상인 부서번호, 총월급을 출력하시오.
SELECT deptno ,SUM(sal)
FROM emp
GROUP BY deptno
HAVING SUM(SAL) >= 7000 ;

 
-- 44) emp테이블에서 업무별로 사번이 제일 늦은 사람을 구하고 그 결과 내에서 사번이 79로 시작하는 결과만 보여주시오.
SELECT max(empno)
FROM emp
WHERE empno LIKE '79%'
GROUP BY job;

-- 45) emp테이블에서 업무별 총월급을 출력하는데 업무가 'MANAGER'인 사원들은 제외하고 
-- 총월급이 5,000보다 큰 업무와 총월급만 출력하시오.
SELECT job,SUM(sal)
FROM emp
WHERE job NOT LIKE 'MANAGER' 
GROUP BY job
HAVING SUM(sal) > 5000 ;

-- 46)emp테이블에서 업무별로 사원수가 4명 이상인 업무와 인원수를 출력하시오.
SELECT job , count(ename)
FROM emp
GROUP BY job
HAVING COUNT(ename) >= 4;

-- 47)emp테이블에서 사원수가 5명이 넘는 부서의 부서번호와 사원수를 구하시오.
SELECT deptno,COUNT(ename)
FROM emp
GROUP BY deptno
HAVING COUNT(ename) > 5;
-- 48)emp테이블에서 부서별 급여평균을 구할 때 소수점 3자리에서 반올림해서 2자리까지 구하고 
-- 부서번호, 급여평균을 출력하시오.
SELECT deptno , ROUND(AVG(sal),2)
FROM emp
GROUP BY deptno;
