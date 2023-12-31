-- hr 계정 접속 사용




--오라클 11g hr계정 연습문제


--1. 직책(Job Title)이 Sales Manager인 사원들의 입사년도와 입사년도(hire_date)별 평균 급여를 출력하시오. 

-- 출력 시 년도를 기준으로 오름차순 정렬하시오.

SELECT TO_CHAR(E.HIRE_DATE, 'YYYY'), AVG(E.SALARY)
FROM EMPLOYEES E , JOBS J
WHERE E.JOB_ID = J.JOB_ID 
AND j.job_title = 'Sales Manager'
GROUP BY TO_CHAR(E.HIRE_DATE, 'YYYY')
ORDER BY TO_CHAR(E.HIRE_DATE, 'YYYY');




--2. 각 도시(city)에 있는 모든 부서 직원들의 평균급여를 조회하고자 한다. 

-- 평균급여가 가장 낮은 도시부터 도시명(city)과 평균연봉, 해당 도시의 직원수를 출력하시오. 

-- 단, 도시에 근 무하는 직원이 10명 이상인 곳은 제외하고 조회하시오.
SELECT L.CITY ,ROUND(AVG(E.SALARY)), COUNT(l.city)
FROM EMPLOYEES E , DEPARTMENTS D , LOCATIONS L
WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID
AND D.LOCATION_ID = L.LOCATION_ID
GROUP BY L.CITY
HAVING COUNT(l.city) < 10
ORDER BY L.CITY;


--3. ‘Public Accountant’의 직책(job_title)으로 과거에 근무한 적이 있는 모든 사원의 사번과 이름을 출력하시오. 

-- (현재 ‘Public Accountant’의 직책(job_title)으로 근무하는 사원은 고려 하지 않는다.) 

-- 이름은 first_name, last_name을 아래의 실행결과와 같이 출력한다.

SELECT E.employee_id , E.FIRST_NAME || E.LAST_NAME AS NAME , jh.job_id
FROM employees E ,jobs J ,job_history JH
WHERE e.employee_id = JH.employee_id
AND J.JOB_ID = jh.job_id
AND J.JOB_TITLE = 'Public Accountant';


--4. 자신의 매니저보다 연봉(salary)를 많이 받는 직원들의 성(last_name)과 연봉(salary)를 출 력하시오. 

SELECT E.LAST_NAME, E.SALARY
FROM EMPLOYEES E
WHERE E.SALARY > (SELECT SALARY FROM EMPLOYEES  WHERE E.MANAGER_ID = EMPLOYEE_ID);

SELECT E.LAST_NAME, E.SALARY
FROM EMPLOYEES E , EMPLOYEES M
WHERE e.manager_id = M.employee_id
AND E.SALARY > M.SALARY;

--5. 2007년에 입사(hire_date)한 직원들의 사번(employee_id), 이름(first_name), 성(last_name), 

-- 부서명(department_name)을 조회합니다. 

-- 이때, 부서에 배치되지 않은 직원의 경우, ‘<Not Assigned>’로 출력하시오. 
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


--6. 업무명(job_title)이 ‘Sales Representative’인 직원 중에서 연봉(salary)이 9,000이상, 10,000 이하인 

-- 직원들의 이름(first_name), 성(last_name)과 연봉(salary)를 출력하시오
SELECT E.first_name || ' ' || E.last_name AS NAME , e.salary
FROM employees E , jobs J
WHERE e.job_id = j.job_id
AND J.JOB_TITLE = 'Sales Representative'
AND e.salary >= 9000 AND E.SALARY <= 10000;


--7. 부서별로 가장 적은 급여를 받고 있는 직원의 이름, 부서이름, 급여를 출력하시오. 

-- 이름은 last_name만 출력하며, 부서이름으로 오름차순 정렬하고, 

-- 부서가 같은 경우 이름을 기준 으로 오름차순 정렬하여 출력합니다. 

-- 부서별 가장작은 급여 : 서브쿼리
SELECT D.department_name , MIN(E.SALARY)
FROM employees E , departments D
WHERE e.department_id = d.department_id
GROUP BY d.department_name;

-- 잘못된방법
SELECT e.last_name , A.*
FROM employees E,
    (SELECT D.department_name , MIN(E.SALARY) AS MIN_SALARY
        FROM employees E , departments D
        WHERE e.department_id = d.department_id
        GROUP BY d.department_name
    ) A
WHERE e.SALARY = A.MIN_SALARY
ORDER BY A.department_name ASC, E.LAST_NAME ASC;

--옳은방법
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

--8. EMPLOYEES 테이블에서 급여를 많이 받는 순서대로 조회했을 때 결과처럼 6번째부터 10 번째까지 

-- 5명의 last_name, first_name, salary를 조회하는 sql문장을 작성하시오.
SELECT last_name, first_name, salary
FROM (SELECT ROWNUM RN, last_name, first_name, salary
        FROM employees
        
    ORDER BY SALARY DESC) 
WHERE RN >= 6 AND RN <= 10;




--9. 사원의 부서가 속한 도시(city)가 ‘Seattle’인 사원의 이름, 해당 사원의 매니저 이름, 사원 의 부서이름을 출력하시오. 

-- 이때 사원의 매니저가 없을 경우 ‘<없음>’이라고 출력하시오. 이름은 last_name만 출력하며, 

-- 사원의 이름을 오름차순으로 정렬하시오. 
SELECT employee_id , FIRST_NAME , last_name , MANAGER_ID FROM employees;

--SELF JOIN 기초데이터
SELECT B.EMPLOYEE_ID AS E_ID , a.manager_id AS M_ID , A.FIRST_NAME , A.LAST_NAME
FROM employees A LEFT OUTER JOIN employees B ON A.MANAGER_ID = B.EMPLOYEE_ID;

SELECT e.e_name , NVL(E.E_NAME , '<없음>') , d.department_name
FROM (
        SELECT A.FIRST_NAME AS E_NAME, B.last_name AS M_NAME , a.department_id 
        FROM employees A LEFT OUTER JOIN employees B ON A.MANAGER_ID = B.EMPLOYEE_ID
     ) E ,
     departments D , locations L
WHERE E.DEPARTMENT_ID = d.department_id
AND d.location_id = l.location_id
AND L.CITY = 'Seattle'
ORDER BY e.e_name ASC;


--10. 각 업무(job) 별로 연봉(salary)의 총합을 구하고자 한다. 연봉 총합이 가장 높은 업무부터 

-- 업무명(job_title)과 연봉 총합을 조회하시오. 단 연봉총합이 30,000보다 큰 업무만 출력하시오. 
--기초데이터
SELECT *
FROM employees E , jobs J
WHERE e.job_id = j.job_id;

-- 각 업무(job) 별로 연봉(salary)의 총합
SELECT j.job_title , SUM(E.SALARY)
FROM employees E , jobs J
WHERE e.job_id = j.job_id
GROUP BY j.job_title;

--조건 : 연봉총합이 30,000보다 큰 업무만 출력
SELECT j.job_title , SUM(E.SALARY)
FROM employees E , jobs J
WHERE e.job_id = j.job_id
GROUP BY j.job_title
HAVING SUM(E.SALARY) > 30000
ORDER BY SUM(E.SALARY) DESC;

--11. 각 사원(employee)에 대해서 사번(employee_id), 이름(first_name), 업무명(job_title), 

-- 부서 명(department_name)을 조회하시오. 

-- 단 도시명(city)이 ‘Seattle’인 지역(location)의 부서 (department)에 근무하는 직원을 사원번호 오름차순순으로 출력하시오.

-- 테이블 : EMPLOYEES, DEPARTMENTS , LOCATIONS , JOBS
SELECT E.EMPLOYEE_ID , E.FIRST_NAME , j.job_title , D.DEPARTMENT_NAME
FROM employees E , departments D , locations L ,jobs J
WHERE e.department_id = d.department_id
AND l.location_id = d.location_id
AND j.job_id = e.job_id
AND L.CITY = 'Seattle'
ORDER BY e.employee_id ASC;



--12. 2001~20003년사이에 입사한 직원의 이름(first_name), 입사일(hire_date), 관리자사번 (employee_id), 

-- 관리자 이름(fist_name)을 조회합니다. 단, 관리자가 없는 사원정보도 출력 결과에 포함시켜 출력한다.

-- 2001~2003년사이 입사한 사원의 관리자 번호
SELECT e.manager_id , e.first_name AS M_NAME
FROM employees E 
WHERE TO_CHAR(e.hire_date,'YYYY') <= 2003 
AND TO_CHAR(e.hire_date,'YYYY') >= 2001;

SELECT e.first_name , e.hire_date ,A.FIRST_NAME AS M_NAME, e.manager_id
FROM EMPLOYEES E , employees A
WHERE e.manager_id = a.employee_id(+)
AND TO_CHAR(e.hire_date,'YYYY') BETWEEN 2001 AND 2003 ;


--13. ‘Sales’ 부서에 속한 직원의 이름(first_name), 급여(salary), 부서이름(department_name)을 조회하시오. 

-- 단, 급여는 100번 부서의 평균보다 적게 받는 직원 정보만 출력되어야 한다. 
-- 100번 부서의 평균
SELECT ROUND(AVG(SALARY))
FROM employees
WHERE department_id = 100;

SELECT e.first_name , e.salary , d.department_name
FROM employees E , departments D
WHERE e.department_id = D.department_id
AND d.department_name = 'Sales' 
AND e.salary < (SELECT ROUND(AVG(SALARY)) FROM employees WHERE department_id = 100);



--14. Employees 테이블에서 입사한달(hire_date)별로 인원수를 조회하시오.
SELECT TO_CHAR(hire_date,'YYYY-MM'), COUNT(*)
FROM employees
GROUP BY TO_CHAR(hire_date,'YYYY-MM') 
ORDER BY TO_CHAR(hire_date,'YYYY-MM') ASC;




--15. 부서별 직원들의 최대, 최소, 평균급여를 조회하되, 

-- 평균급여가 ‘IT’ 부서의 평균급여보다 많고, ‘Sales’ 부서의 평균보다 적은 부서 정보만 출력하시오. 
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

--16. 각 부서별로 직원이 한명만 있는 부서만 조회하시오. 

-- 단, 직원이 없는 부서에 대해서는 ‘<신생부서>’라는 문자열이 출력되도록 하고,

-- 출력결과는 다음과 같이 부서명이 내림차순 으로 정렬되어야한다. 

--기초 데이터
SELECT * 
FROM employees E , departments D
WHERE e.department_id = d.department_id;

-- 부서안에 부서원이 없는 데이터

-- 사원 테이블에 존재하는 부서
SELECT DISTINCT department_id FROM employees;
--부서 테이블 : 27건
SELECT COUNT(*) FROM departments;

-- 사원이 없는부서 : 27건 - 11건 = 16건  

-- 각 부서별로 직원
SELECT E.department_id , D.DEPARTMENT_NAME , COUNT(*)
FROM employees E , departments D
WHERE e.department_id = d.department_id
GROUP BY e.department_id , D.DEPARTMENT_NAME
HAVING COUNT(*) = 1
ORDER BY d.department_name ASC;

SELECT d.department_name, NVL(TO_CHAR(MIN(e.employee_id)), '<신생부서>') AS employee_id
FROM departments d LEFT JOIN employees e 
ON d.department_id = e.department_id
GROUP BY d.department_name
HAVING COUNT(e.employee_id) <= 1 
ORDER BY d.department_name DESC;




--17. 부서별 입사월별 직원수를 출력하시오. 

-- 단, 직원수가 5명 이상인 부서만 출력되어야 하며 출력결과는 부서이름 순으로 한다.




--18. 국가(country_name) 별 도시(city)별 직원수를 조회하시오. 

-- 단, 부서에 속해있지 않은 직원 이 있기 때문에 106명의 직원만 출력이 된다. 

-- 부서정보가 없는 직원은 국가명과 도시명 대신에 ‘<부서없음>’이 출력되도록 하여 107명 모두 출력되게 한다.




--19. 각 부서별 최대 급여자의 아이디(employee_id), 이름(first_name), 급여(salary)를 출력하시오. 

-- 단, 최대 급여자가 속한 부서의 평균급여를 마지막으로 출력하여 평균급여와 비교할 수 있게 할 것.




--20. 커미션(commission_pct)별 직원수를 조회하시오. 

-- 커미션은 아래실행결과처럼 0.2, 0.25는 모두 .2로, 0.3, 0.35는 .3 형태로 출력되어야 한다. 

-- 단, 커미션 정보가 없는 직원들도 있는 데 커미션이 없는 직원 그룹은 ‘<커미션 없음>’이 출력되게 한다.




--21. 커미션(commission_pct)을 가장 많이 받은 상위 4명의 부서명(department_name), 

-- 직원명 (first_name), 급여(salary), 커미션(commission_pct) 정보를 조회하시오. 

-- 출력결과는 커미션 을 많이 받는 순서로 출력하되 동일한 커미션에 대해서는 급여가 높은 직원이 먼저 출력 되게 한다