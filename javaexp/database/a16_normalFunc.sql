
-- # 많이 활용되는 일반 기능 함수

/* 1. nvl(param1,param2) 
	- param1 : 컬럼이나 데이터
	- param2 : param1의 컬럼이나 데이터가 null일때, 대신해서 처리해야할 데이터 내용
	**/
SELECT ename, sal, nvl(comm,0), sal+nvl(comm,0) 합산 FROM emp;
-- 위 내용에서 comm이 null일 경우 sal값과 정상적인 합산을 처리할 수 없다.
-- 이때, nvl을 처리해서 comm이 null일경우 0으로 처리하여 합산을 정상적으로 처리할 수 있다.
SELECT * FROM EMPLOYEES e ;
SELECT EMPLOYEE_ID , SALARY , COMMISSION_PCT "보너스%", SALARY*nvl(COMMISSION_PCT,0) "보너스금액"FROM EMPLOYEES e ;



/* 2. nvl2(컬럼 또는 데이터 , param1, param2) 
	- 컬럼이 null이 아닐때, param1처리
	- 컬럼이 null일때, param2로 처리
 * */
-- comm이 null이 아닐때는 0.2, null일때는 0.1로 보너스 % 로 지정한다고 할 때, 처리
SELECT ename, sal, comm, nvl2(comm,0.2,0.1)*100 "보너스%" FROM emp;

-- ex) 사원가 급여 보너스를 처리하되 comm이 null일 경우 sal 만
--	comm이 null이 아닌경우 sal+comm을 처리하여 총계로 출력
SELECT ename, sal, comm, nvl2(comm , comm+sal, nvl(comm,0)+SAL) "총계" FROM emp; 

/* 3. nullif(컬럼1, 컬럼2) 
	- 두개의 컬럼 또는 데이터가 동일하면 null, 그렇지않으면 컬럼1 출력
 * */
SELECT nullif('a','a') 결과1, nullif('a','b'), 
nvl(NULLIF('a','a'),'동일') 결과3
FROM dual;

/* 4. mod(컬럼1, 데이터)
	- 특정 커럼의 데이터를 나눈 나머지값
 * */
SELECT empno, mod(empno,2) "구분" FROM emp;
SELECT empno, mod(empno,2) "구분" FROM emp WHERE MOD(empno,2)=0 ; -- 짝수사번만 출력

-- ex) employees에서 employee_id를 기준으로 3으로 나누어 지면 청팀, 1이 남으면 홍팀, 2가 남으면 심판으로 구분하자 한다
--	각팀의 인원을 구해보시오
SELECT * FROM EMPLOYEES e ;

--SELECT nvl(nullif(mod(TO_NUMBER(employee_id),3),0),'청팀') "결과" FROM EMPLOYEES e ;
SELECT NVL(NULLIF(MOD(employee_id,3),0), '청팀') "결과", count(*) "청팀인원수",
	NVL(NULLIF(MOD(employee_id,3),1), '홍팀') "결과", count(*) "청팀인원수",
	NVL(NULLIF(MOD(employee_id,3),2), '심판') "결과", count(*) "청팀인원수"
FROM EMPLOYEES e GROUP BY 청팀인원수;

SELECT hiredate, TO_CHAR(hiredate,'MM') 입사월,
to_char(hiredate,'Q')||'/4' 분기
FROM emp ORDER BY to_char(HIREDATE,'MM');

SELECT TO_CHAR(hiredate,'MM') 입사월, count(*) "인원수" 
FROM emp GROUP BY to_char(HIREDATE,'MM') ORDER BY 입사월;

-- 분기별 입사 인원수 출력하세요
SELECT to_char(hiredate,'Q') 분기별, count(*) 인원수
FROM emp GROUP BY to_char(hiredate,'Q') ORDER BY 분기별;


/* 5. decode() */

/* 6. case 키워드 처리(조건문처리) */











