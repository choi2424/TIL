-- 연산자. || 문자열 또는 컬럼 연결연산자기능
-- 수식연산자 : +, - , * , /
-- 피연산자가 숫자데이터형 이어야 한다.

desc employees;

select emp_name,salary from employees;

--사원 급여를 10% 인상하는 내역을 출력하라.

select emp_name,salary,salary * 1.1 as CHANGE_SALARY from employees;



SELECT employee_id || '-' || emp_name AS employee_info
  FROM employees
 WHERE ROWNUM < 5;

-- 사원 테이블(EMPLOYEES)에서 급여(SALARY)가 5000이상이고 8000미만인 데이터를 조회하라
select emp_name , salary 
from employees
where salary >= 5000 and salary < 8000
order by salary asc;

-- job_id 컬럼의 데이터가 'SA_REP' 이거나 'SH_CLERK'이고 사원의 EMP_NAME , JOB_ID 컬럼을 조회하라
SELECT emp_name , job_id
from employees
where job_id = 'SA_REP' OR JOB_ID = 'SH_CLERK'
ORDER BY JOB_ID ASC;

-- job_id 컬럼의 데이터가 'SA_REP' 이거나 'SH_CLERK' 급여가 5000보다 큰 사원의 EMP_NAME , JOB_ID 컬럼을 조회하라
--AND ,OR 논리연산자의 우선순위는 AND가 높다
SELECT emp_name , job_id,SALARY
from employees
where (job_id = 'SA_REP' OR JOB_ID = 'SH_CLERK') AND SALARY > 5000;

--COMMISSION_PCT 컬럼의 커미션이 없는 사원을 조회하라 (EMP_NAME,SALARY,COMMISSION_PCT 컬럼)
SELECT EMP_NAME,SALARY,COMMISSION_PCT
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NULL;

--COMMISSION_PCT 컬럼의 커미션이 있는 사원을 조회하라 (EMP_NAME,SALARY,COMMISSION_PCT 컬럼)  
SELECT EMP_NAME,SALARY,COMMISSION_PCT
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NOT NULL;

COMMIT;

SELECT * FROM EMPLOYEES;
-- 표현식
-- CASE 문 - 2종류(ANSI-SQL표준구문)
/*
1)IF문 유형
CASE 
    WHEN 조건1 THEN 값1
    WHEN 조건2 THEN 값2
    ...
    ELSE 기타 값
END
*/

-- 질의> 사원 테이블에서 각 사원의 급여에 따라 5000 이하로 급여를 받는 사원은 C, 5000~15000은 B, 15000 이상은 A등급을 반환하는 쿼리를 작성해 보자.

SELECT employee_id , emp_name , salary,
    case when salary >= 15000 then 'A등급'
         when salary >= 5000 and salary < 15000 then 'B등급'
         else 'C등급'
    end as GRADE
from EMPLOYEES
ORDER BY SALARY DESC;


-- 질의> 코드가 1이면 자바, 2이면 오라클 3이면 스프링 으로 출력하자.
SELECT CODE , ENAME,
    CASE CODE
        WHEN 1 THEN '자바'
        WHEN 2 THEN '오라클'
        WHEN 3 THEN '스프링'
    END AS KNAME
FROM TEST_05;

/*
2)SWITCH문 유형
CASE 컬럼명
    WHEN 조건값 THEN 값1
    WHEN 조건값 THEN 값2
    ...
    ELSE 기타 값
END
*/

-- ENAME으로 KNAME 출력하기
SELECT ENAME,
    CASE ENAME
        WHEN 'JAVA'   THEN '자바'
        WHEN 'ORACLE' THEN '오라클'
        WHEN 'SPRING' THEN '스프링'
    END AS KNAME
FROM TEST_05;

-- IF문유형으로 CASE 문법작업
SELECT ENAME,
    CASE 
        WHEN ENAME = 'JAVA'   THEN '자바'
        WHEN ENAME = 'ORACLE' THEN '오라클'
        WHEN ENAME = 'SPRING' THEN '스프링'
    END AS KNAME
FROM TEST_05;

-- 사원테이블에서 부서코드가 10이면 New York, 20이면 Dallas, 아니면 Unknown 결과값을 처리하고, 조회 컬럼별칭 loc_name
-- 사원이름, 부서코드, loc_name
SELECT * from EMPLOYEES;    
SELECT emp_name, DEPARTMENT_ID,
    CASE DEPARTMENT_ID
        WHEN 10 THEN 'New York'
        WHEN 20 THEN 'Dallas'
        else 'Unknown'
    end as loc_name
from employees;

-- 중첩을 이용한 CASE문
/*
부서마다 등급기준이 다른 경우
부서코드 10 이면 급여가 2000 이상 1등급, 급여가 1500 이상 2등급, 급여가 1000 이상 3등급
부서코드 20 이면 급여가 3000 이상 1등급, 급여가 2500 이상 2등급, 급여가 2000 이상 3등급
부서코드 50 이면 급여가 2500 이상 1등급, 급여가 2000 이상 2등급, 급여가 1500 이상 3등급
나머지 부서코드는  급여가 4000 이상 1등급, 급여가 3500 이상 2등급, 급여가 2500 이상 3등급
*/

SELECT DEPARTMENT_ID, EMP_NAME, SALARY,
    CASE 
        WHEN DEPARTMENT_ID = 10 THEN
            CASE
                WHEN salary >= 2000 THEN '1등급'
                WHEN salary >= 1500 AND salary < 2000 THEN '2등급'
                WHEN salary >= 1000 AND salary < 1500 THEN '3등급'
            END 
        WHEN DEPARTMENT_ID = 20 THEN
            CASE
                WHEN salary >= 3000 THEN '1등급'
                WHEN salary >= 2500 AND salary < 3000 THEN '2등급'
                WHEN salary >= 2000 AND salary < 2500 THEN '3등급'
            END 
        WHEN DEPARTMENT_ID = 50 THEN
            CASE
                WHEN salary >= 2500 THEN '1등급'
                WHEN salary >= 2000 AND salary < 2500 THEN '2등급'
                WHEN salary >= 1500 AND salary < 2000 THEN '3등급'
            END
        ELSE 
            CASE
                WHEN salary >= 4000 THEN '1등급'
                WHEN salary >= 3500 AND salary < 4000 THEN '2등급'
                WHEN salary >= 2500 AND salary < 3500 THEN '3등급'
            END
        END AS SAL_GRADE
FROM EMPLOYEES;    

-- hr 표준함수


-- 문제1) EMPLOYEES 테이블에서 King의 정보를 소문자로 검색하고 사원번호, 성명, 담당업무(소문자로),부서번호를 출력하라.
SELECT * FROM employees

select lower(job_id),DEPARTMENT_ID,last_name,employee_id,FIRST_NAME
from employees
where last_name = 'King';




-- 문제2) EMPLOYEES 테이블에서 King의 정보를 대문자로 검색하고 사원번호, 성명, 담당업무(대문자로),부서번호를 출력하라.
select upper(job_id),DEPARTMENT_ID,FIRST_NAME,last_name,employee_id
from employees
where last_name = 'King';



-- 문제3) DEPARTMENTS 테이블에서 (부서번호와 부서이름), 부서이름과 위치번호를 합하여 출력하도록 하라.
select DEPARTMENT_NAME || ' ' || DEPARTMENT_ID as department_name_id
from DEPARTMENTS;



-- 문제4) EMPLOYEES 테이블에서 이름의 첫 글자가 ‘K’ 보다 크고 ‘Y’보다 적은 사원의 정보를 
-- 사원번호, 이름, 업무, 급여, 부서번호를 출력하라. 
-- 단 이름순으로 정렬하여라.
select EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY, DEPARTMENT_ID
from EMPLOYEES
where LAST_NAME > 'K' and LAST_NAME < 'Y';


-- 문제5) EMPLOYEES 테이블에서 20번 부서 중 이름의 길이 및 급여의 자릿수를 
-- 사원번호, 이름, 이름의 자릿수(LENGTH), 급여, 급여의 자릿수를 출력하라.
-- LENGTHB는 BYTE 혼동하지 말자!
select EMPLOYEE_ID, LAST_NAME,length(LAST_NAME), SALARY , length(SALARY)
from EMPLOYEES 
where DEPARTMENT_ID = 20;

-- 문제6) EMPLOYEES 테이블에서 이름 중 ‘e’자의 위치를 출력하라.
select LAST_NAME,instr(LAST_NAME,'e')
from employees;





-- 문제7) 다음의 쿼리를 실행하고 결과를 출력하고 확인하라.
SELECT  ROUND(4567.678),      
        ROUND(4567.678, 0),  
        ROUND(4567.678, 2),   
        ROUND(4567.678, -2)  
FROM dual;




-- 문제8) EMPLOYEES 테이블에서 부서번호가 80인 사람의 급여를 30으로 나눈 나머지를 구하여 출력하라.
select LAST_NAME, DEPARTMENT_ID, SALARY, mod(salary, 30)
from employees
where DEPARTMENT_ID = 80 ;
    


-- 문제9) EMPLOYEES 테이블에서 30번 부서 중 이름과 담당 업무를 연결하여 출력하여라. 
SELECT LAST_NAME ||' '|| JOB_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 30 ;


-- 문제10) EMPLOYEES 테이블에서 현재까지 근무일 수가 몇주 몇일 인가를 출력하여라. 
-- 단 근무 일수가 많은 사람 순으로 출력하여라.
SELECT LAST_NAME, HIRE_DATE,
TRUNC(SYSDATE - hire_date) AS "총근무 일수",
TRUNC((SYSDATE - hire_date) / 7) AS "총근무주"
FROM EMPLOYEES
order by "총근무 일수" desc;




-- 문제11) EMPLOYEES 테이블에서 부서 50에서 급여 앞에 $를 삽입하고 3자리마다 ,를 출력하라
SELECT last_name, department_id, salary, TO_CHAR(salary, '$999,999')
from employees
where department_id = 50 ;

-- 커미션이 not null이면, 급여에 커미션 적용되고, null이면 급여만 지급되게 조회.
SELECT employee_id, salary, NVL2(commission_pct,salary + ( salary * commission_pct),salary) AS REAL_SALARY
FROM employees;      
        
SELECT CONCAT('가', ' ', 's job category is ')
FROM dual;

--  scott계정 접속 후 사용

?

-- 1. 업무(JOB)가 MANAGER 인 사원의 이름, 입사일 출력
select ENAME,HIREDATE
from emp
where JOB = 'MANAGER';

-- 2. 사원명이 WARD 인 사원의 급여, 커미션을 출력
SELECT ENAME , SAL , COMM
FROM EMP
WHERE ENAME = 'WARD';

-- 3. 30번 부서에 속하는 사원의 이름, 부서번호를 출력
SELECT ENAME, DEPTNO
FROM EMP
WHERE DEPTNO = 30;

-- 4-1. 급여가 1250을 초과, 3000이하인 사원의 이름, 급여를 출력
SELECT ENAME , SAL
FROM EMP
WHERE SAL > 1250 AND SAL <= 3000;


-- 4-2. 급여가 1250이상이고, 3000이하인 사원의 이름, 급여를 출력(범위가 포함됨)
SELECT ENAME , SAL
FROM EMP
WHERE SAL BETWEEN 1250  AND 3000;


-- 5. 커미션이 0 인 사원이 이름, 커미션을 출력
SELECT ENAME,COMM 
FROM EMP
WHERE COMM = 0;


-- 6-1. 커미션 계약을 하지 않은 사원의 이름츨 출력
SELECT ENAME, COMM
FROM EMP
WHERE COMM IS NULL;

-- 6-2. 커미션 계약을 한 사원의 이름을 출력
SELECT ENAME, COMM
FROM EMP
WHERE COMM IS NOT NULL;

-- 7. 입사일이 81/06/09 보다 늦은 사원이 이름, 입사일 출력(입사일을 기준으로 오름차순.)
SELECT ENAME , HIREDATE
FROM EMP
WHERE HIREDATE > '1981-06-09'
order by HIREDATE asc;



-- 8. 모든 사원의 급여마다 1000을 더한 급여를 출력
select ename , (sal + 1000) as sal2
from emp;


-- 9. FORD 의 입사일, 부서번호를 출력
select ename,hiredate,deptno
from emp
where ename = 'FORD' 



-- 10. 사원명이 ALLEN인 사원의 급여를 출력하세요.
SELECT ENAME , SAL 
FROM EMP
WHERE ENAME = 'ALLEN';



-- 11. ALLEN의 급여보다 높은 급여를 받는 사원의 사원명, 급여를 출력

select ename , sal
from emp
where sal > ( select sal from emp where ename = 'ALLEN');



-- 12. 가장 높은/낮은 커미션을 구하세요.(최대값/최소값)

select min(comm),max(comm)
from emp;




-- 13. 가장 높은 커미션을 받는 사원의 이름을 구하세요.

SELECT ename 
FROM emp
where comm = (SELECT max(comm) FROM emp);


-- 14. 가장 높은 커미션을 받는 사원의 입사일보다 늦은 사원의 이름 입사일을 출력 

select ename,HIREDATE
from emp
where HIREDATE > (select HIREDATE from emp where comm = (select max(comm) from emp));



-- 15. JOB이 CLERK 인 사원들의 급여의 합을 구하세요.
select job , sum(sal)
from emp
group by job
having job = 'CLERK';



-- 16. JOB 이 CLERK 인 사원들의 급여의 합보다 급여가 많은 사원이름을 출력.
SELECT ename
from emp
where (select sum(sal)from emp where job = 'CLERK') < SAL;

-- 17. JOB이 CLERK 인 사원들의 급여와 같은 급여를 받는 사원의 이름, 급여를 출력(급여 내림차순으로)
select ename , sal
from emp
where sal in (SELECT sal from emp job = 'CLERK') 
order by sal desc;

-- 18. EMP테이블의 구조출력

-- jobs테이블과 jobs_history테이블을 조인하여 , 사원번호 . job_id , 시작날짜 , 종료날짜 , 당담부서를 조회하라

SELECT jh.employee_id , j.job_id , jh.start_date ,jh.end_date , jh.department_id
FROM jobs j, job_history jh
where jh.job_id = j.job_id;

-- 부서가 담당한 프로젝트 정보를 조회하라 . 단 부서코드 , 부서이름 , 사원번호 ,시작날짜 ,종료날짜 컬럼사용
SELECT j.department_id , d.department_name , j.employee_id , j.start_date , j.end_date
FROM job_history j , departments d
where j.department_id = d.department_id ;
/*
문제
사원테이블 : EMPLOTEES 프로젝트 내역 테이블 : JOB_HISTORY
질문1> 2테이블을 참조하여 사원의 프로젝트 정보(JOB_ID) 의  데이터를 조회하라
(컬럼은 사원번호 , 사원이름 , 부서코드 , 시작날짜 , 종료날짜 , 프로젝트ID(JOB_ID))

INNER JOIN 
    -오라클 구문
    -ANSI-SQL 구문 
*/
-- 오라클 구문
SELECT E.EMPLOYEE_ID , E.EMP_NAME , E.DEPARTMENT_ID , j.start_date , j.end_date , j.job_id
FROM employees E , JOB_HISTORY J
WHERE j.job_id = E.JOB_ID;

-- ANSI-SQL 구문
SELECT E.EMPLOYEE_ID , E.EMP_NAME , E.DEPARTMENT_ID , j.start_date , j.end_date , j.job_id
FROM employees E INNER JOIN JOB_HISTORY J
ON j.job_id = E.JOB_ID;

/*
질문2> 2테이블을 참조하여 사원의 프로젝트 정보(JOB_ID) 의  데이터를 조회하라
사원중 프로젝트 정보 데이터가 존재하지 않는 사원도 포함해라.
(컬럼은 사원번호 , 사원이름 , 부서코드 , 시작날짜 , 종료날짜 , 프로젝트ID(JOB_ID))
    -오라클 구문
    -ANSI-SQL 구문 
*/
-- 오라클 구문
SELECT E.EMPLOYEE_ID , E.EMP_NAME , E.DEPARTMENT_ID , j.start_date , j.end_date , j.job_id
FROM employees E , JOB_HISTORY J
WHERE j.job_id(+) = E.JOB_ID;
-- ANSI 구문
SELECT E.EMPLOYEE_ID , E.EMP_NAME , E.DEPARTMENT_ID , j.start_date , j.end_date , j.job_id
FROM employees E LEFT JOIN JOB_HISTORY J
ON j.job_id = E.JOB_ID;

/*
질문3> 2테이블을 참조하여 사원의 프로젝트 정보데이타가 존재하지않는 사원을 조회하라
(컬럼은 사원번호 , 사원이름 , 부서코드 , 시작날짜 , 종료날짜 , 프로젝트ID(JOB_ID))
    
*/
-- 오라클 구문
SELECT E.EMPLOYEE_ID , E.EMP_NAME , E.DEPARTMENT_ID , j.start_date , j.end_date , j.job_id
FROM employees E , JOB_HISTORY J
WHERE j.job_id(+) = E.JOB_ID
AND j.job_id IS NULL;

-- ANSI 구문
SELECT E.EMPLOYEE_ID , E.EMP_NAME , E.DEPARTMENT_ID , j.start_date , j.end_date , j.job_id
FROM employees E LEFT JOIN JOB_HISTORY J
ON j.job_id = E.JOB_ID
WHERE j.job_id is null;
