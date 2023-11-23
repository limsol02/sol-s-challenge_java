-- # 많이 활용되는 일반 기능 함수

/*### 1. nvl(param1,param2) 
	- param1 : 컬럼이나 데이터
	- param2 : param1의 컬럼이나 데이터가 null일때, 대신해서 처리해야할 데이터 내용
	**/
SELECT ename, sal, nvl(comm,0), sal+nvl(comm,0) 합산 FROM emp;
-- 위 내용에서 comm이 null일 경우 sal값과 정상적인 합산을 처리할 수 없다.
-- 이때, nvl을 처리해서 comm이 null일경우 0으로 처리하여 합산을 정상적으로 처리할 수 있다.
SELECT * FROM EMPLOYEES e ;
SELECT EMPLOYEE_ID , SALARY , COMMISSION_PCT "보너스%", SALARY*nvl(COMMISSION_PCT,0) "보너스금액"FROM EMPLOYEES e ;



/*### 2. nvl2(컬럼 또는 데이터 , param1, param2) 
	- 컬럼이 null이 아닐때, param1처리
	- 컬럼이 null일때, param2로 처리
 * */
-- comm이 null이 아닐때는 0.2, null일때는 0.1로 보너스 % 로 지정한다고 할 때, 처리
SELECT ename, sal, comm, nvl2(comm,0.2,0.1)*100 "보너스%" FROM emp;

-- ex) 사원가 급여 보너스를 처리하되 comm이 null일 경우 sal 만
--	comm이 null이 아닌경우 sal+comm을 처리하여 총계로 출력
SELECT ename, sal, comm, nvl2(comm , comm+sal, nvl(comm,0)+SAL) "총계" FROM emp; 

/*### 3. nullif(컬럼1, 컬럼2) 
	- 두개의 컬럼 또는 데이터가 동일하면 null, 그렇지않으면 컬럼1 출력
 * */
SELECT nullif('a','a') 결과1, nullif('a','b'), 
nvl(NULLIF('a','a'),'동일') 결과3
FROM dual;

/*### 4. mod(컬럼1, 데이터)
	- 특정 커럼의 데이터를 나눈 나머지값
 * */
SELECT empno, mod(empno,2) "구분" FROM emp;
SELECT empno, mod(empno,2) "구분" FROM emp WHERE MOD(empno,2)=0 ; -- 짝수사번만 출력

-- ex) employees에서 employee_id를 기준으로 3으로 나누어 지면 청팀, 1이 남으면 홍팀, 2가 남으면 심판으로 구분하자 한다
--	각팀의 인원을 구해보시오
SELECT * FROM EMPLOYEES e ;

--SELECT nvl(nullif(mod(TO_NUMBER(employee_id),3),0),'청팀') "결과" FROM EMPLOYEES e ;
--SELECT NVL(NULLIF(MOD(employee_id,3),0), '청팀') "결과", count(*) "청팀인원수",
	--NVL(NULLIF(MOD(employee_id,3),1), '홍팀') "결과", count(*) "홍팀인원수",
	--NVL(NULLIF(MOD(employee_id,3),2), '심판') "결과", count(*) "심판인원수"
--FROM EMPLOYEES e ;

SELECT hiredate, TO_CHAR(hiredate,'MM') 입사월,
to_char(hiredate,'Q')||'/4' 분기
FROM emp ORDER BY to_char(HIREDATE,'MM');

SELECT TO_CHAR(hiredate,'MM') 입사월, count(*) "인원수" 
FROM emp GROUP BY to_char(HIREDATE,'MM') ORDER BY 입사월;

-- 분기별 입사 인원수 출력하세요
SELECT to_char(hiredate,'Q') 분기별, count(*) 인원수
FROM emp GROUP BY to_char(hiredate,'Q') ORDER BY 분기별;


/*### 5. decode() 
	1) 특정 데이터의 비교를 통한 데이터값을 처리할 때, 활용된다.
	2) 형식
		decode(컬럼|데이터, 1번값, 1번값일때 처리할 데이터,
						 2번값, 2번값일때 처리할 데이터
						 ..
						 그외 데이터)
	ps) decode함수는 프로그래밍에 있어서 case when 구문과 유사한 특징을 가지고있다.
		즉, 해당 기분 컬럼의 데이터가 어떤 case인 경우냐를 기준으로 처리할 데이터와 컬럼을
		지정하는 것이라고 할 수 있다.
 * */
-- 부서번호 기준으로 부서명 지정
SELECT ename, deptno, decode(deptno, 10, '인사',
									 20, '재무',
									 30, '총무',
									 40, '기획',
									 '미정') dname
FROM emp;

-- 사원번호를 기준으로 짝수이면 청팀 홀수이면 홍팀으로 출력되게하세요

SELECT empno, mod(empno,2) 구분,
DECODE(mod(empno,2) , 0 ,'청팀'
					, 1 ,'홍팀') 팀구분
FROM emp ;

/*### 6. case 키워드 처리(조건문처리)

1) decode의 확장된 함수형식을 표현식 또는 컬럼 값 '=' 비교를 통해
조건에 일치하는 경우에만 다른 값으로 대치하게하고, case함수에서는 
산술연산 / 관계연산 / 논리연산 과 같이 다양한 비교가 가능하다.

2) 기본형식
	- case [컬럼명]
		when 비교/논리 연산식 then 처리할데이터,
		when 비교/논리 연산식 then 처리할데이터,
		when 비교/논리 연산식 then 처리할데이터,
		else 기타 처리할 데이터
	end
	
# 이와같이 특정한 컬럼이나 비교 논리식으로 데이터를 처리해서 프로그램에
if 구문의 처리와 유사하다고 할 수 있다.
 *  */
SELECT ename, sal,
	CASE WHEN sal>=5000 THEN 'A등급'
	WHEN sal>=4000 THEN 'B등급'
	WHEN sal>=3000 THEN 'C등급'
	WHEN sal>=2000 THEN 'D등급'
	ELSE 'F등급'
	END "등급분류" ,
	CASE deptno WHEN 10 THEN '인사'
	WHEN 10 THEN '인사'
	WHEN 20 THEN '재무'
	WHEN 30 THEN '무역'
	WHEN 40 THEN '기획'
	ELSE '미정'
	END "부서명"
FROM emp;

-- 분기에 따른 보너스 % 설정
-- 1 ==>15% 2 ==>20% 3 ==>8% 4==>5% 설정을
-- case when 구문을 이용해서 처리하고 출력하세요.
SELECT ename, to_char(hiredate, 'Q') 분기,
CASE to_char(hiredate, 'Q') WHEN '1' THEN '15%'
	 WHEN '2' THEN '20%'
	 WHEN '3' THEN '8%'
	 WHEN '4' THEN '5%'
	 ELSE '보너스없음'
	 END "보너스%"
FROM emp order BY 분기 ;









