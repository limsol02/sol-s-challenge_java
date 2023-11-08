--[1단계:개념] 6. group 함수의 종류, select 구문의 기본형식과 의미를 기술하세요.
-- min 최소값 max 최대값 sum 합계 avg 평균 등이 있고
-- SELECT sal FROM emp GROUP BY sal; 같은 형식으로 하며 
-- 같은 급여 끼리 묶어 출력해줍니다.

--[1단계:확인] 7. employees의 job_id별 최고급여를 구하되 8000이상인 경우만 출력되게 sql 구문작성하세요.
SELECT JOB_ID "잡아이디" ,max(salary) 최고급여 FROM EMPLOYEES e GROUP BY JOB_ID HAVING max(salary)>=8000;

--[1단계:확인] 8. EMPLOYEES의 salary와 commission_pct를 이용해서 급여와 보너스 합산을 구할 때, nvl2를 이용해서 처리해보세요.
SELECT salary 급여, commission_pct 보너스퍼센, nvl2(commission_pct , commission_pct*salary, nvl(commission_pct,0)+salary)"합계" FROM EMPLOYEES e ;
SELECT * FROM EMPLOYEES;

--[1단계:확인] 9. EMP에서 입사분기별 평균급여를 출력하세요
SELECT to_char(hiredate,'Q') 분기별, avg(sal) 평균급여 
FROM emp GROUP BY to_char(hiredate,'Q') ORDER BY 분기별;
