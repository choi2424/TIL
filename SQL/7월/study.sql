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
        