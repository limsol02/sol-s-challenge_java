/*
# 데이터 타입의 형식과 변환
1. 숫자나 날짜, 문자열 타입은 데이터의 변환에서 중효한 부분을 이루고 있다.
	데이터베이스에서도 원하는 혀식으로 타입변환이 함수에 의해서 처리된다.
2. 형변환 유형
	1) 묵시적 데이터 타입 변환
		오라클에서 원활한 데이터 처리를 위해 부분적으로 자동형변환을 허용하고 있다.
		select 
		from
		where 숫자형컬럼 = '2000' : 묵시적 형변환
	2) 명시적 데이터 타입 변환(함수를 통해)
		오라클에서 각 유형마다 변환함수를 선언하여, 명시적 형변환을 처리하고 있다.
		to_char() : 문자형으로 변환
		to_date() : 날짜형으로 변환
		to_number() : 숫자형으로 변환
 * */
-- 묵시적 형변환
SELECT  * FROM emp WHERE sal='800';

-- 명시적 형변환
SELECT * FROM emp WHERE sal=to_number('1600');

/*
# date 타입을 문자열로 특정 형식으로 변환해주는 to_char
1. to_char()를 사용하면 date타입의 컬럼에서 특정 속성/ 매개변수를 이용해서
	원하는 형식의 문자열을 출력할 수 있다.
	1) 기본형식
	- to_char(날짜유형데이터, 형식)
	2) 날짜 ==> 문자열로 바꾸어서 출력하는 형식의 매개변수 값
		'Q' : 해당 날짜의 분기(1사분기, 2사분기 .. 4사분기 표현)
		'MM' : 월을 두자리로 표현
		'MONTH' : 영문표기
		'WW' : 연단위 주차표기 @@년도의 @@쨰주 
		'W' : 월단위 주차표기 @@월의 @@쨰주차
		'DD : 일표기
		'DY'|'DAY' : 요일표기 
 * */
SELECT ename, hiredate,
	to_char(hiredate,'YYYY') "년도",
	to_char(hiredate,'Q') "분기",
	to_char(hiredate,'MM') "월1",
	to_char(hiredate,'MONTH') "월2",
	to_char(hiredate,'WW') "연단위주",
	to_char(hiredate,'W') "월단위주",
	to_char(hiredate,'DD') "일",
	to_char(hiredate,'DAY') "요일"
FROM emp;

-- ex) 1981년도 1/4분기에 입사한 사원 이름의 입사년, 월, 일, 분기를 출력..

SELECT ename 사원이름, 
	to_char(hiredate, 'YYYY MM DD Q') "입사년,월,일,분기",
	to_char(hiredate, 'YYYY"년" MM"월" DD"일" Q"/4분기"') "입사년/월/일/분기"
	--to_char(hiredate,'YYYY') 입사연도,
	--to_char(hiredate,'MONTH') 입사월,
	--to_char(hiredate,'DD') 입사일,
	--to_char(hiredate,'Q') 입사분기
FROM EMP e
WHERE to_char(HIREDATE,'YYYY Q') = '1981 1';
--WHERE to_char(hiredate,'YYYY')='1981' AND to_char(hiredate,'Q')='1';

/*
# number의 데이터를 원하는 형식을 숫자형으로 바꾸는 to_char
1. 숫자형데이터 ==> 특정 형식의 문자열로 처리
2. 형식 
	1) 단위로 표시 to_char(데이터, '$999999')
	2) 소숫점 표시 to)char(데이터, '99999.99')
	3) 천단위, (콤마)표시 : to_char(데이터, '9,999,999')
 * */	
SELECT ename, sal, 
	to_char(sal, '$99999') "달려표시",
	TO_char(sal,'999999.99') "소숫점표시",
	TO_char(sal,'9,999,999') "천단위, 표시"
FROM emp;

-- ex) 사원명, 급여, 급여+보너스(천단위콤마, 소숫점2자리 표시) 출력
SELECT ename, sal, comm,
	to_char(sal+NVL(comm,0),'9,999,999.99') FROM emp;

/*
# 숫자형문자열을 명시적으로 숫자형으로 바꾸어주는 to_number('숫자형문자열')
1. 숫자형태의 문자열로 구성된 데이터를 숫자로 변환 처리
2. 형식
	to_number(숫자형문자열 데이터)
	ps) 프로그램에서 입력되는 데이터는 문자열이기때문에, 숫자형 데이터는 
		형변환 함수를 통해서 처리하는 경우가 많다. 하지만, 자동형변환 해주는 
		경우도 있기 때문에 상황/조건에 따라 처리한다. 
*/
SELECT *
FROM emp
WHERE sal>=TO_NUMBER('2000'); -- 자동 형변환도 가능하다. 

/*
# 문자열을 숫자형으로 바꾸어주는 to_date('날짜형 문자열','YYYY MM DD - 형식표현')
1. 대부분의 데이터는 날짜형으로 입력불가능하다. 문자열로 입력하여, 
	위와같은 형변환 함수를 통하여 날짜형으로 변환하여 검색하거나, 데이터를
	입력 처리한다.
2. 기본형식
	to_date('입력/검색문자열데이터', 'YYYY-MM-DD' : 옆에있는 문자열을
								날짜형으로 어떻게 처리되는지 선언한다.) 
 * */

SELECT ename, hiredate
FROM emp01 ;


SELECT *FROM emp01;
INSERT INTO emp01(ename, hiredate) values('마길동',to_date('2020/01/01','YYYY/MM/DD'));

-- 문자열로 2020/01/01의 데이터를 YYYY/MM/DD 형식으로
-- 날짜타입 hiredate 에 입력한 경우
INSERT INTO emp01(ename, hiredate) values('마길동',to_date('2022-11-01','YYYY-MM-DD'));

-- ex) 사원번호 9999로 사원정보를 입사날짜(2023/01/01)와 함께 전체 입력해보세요
INSERT INTO emp01 values(9999,'홍길동','사원',9999,to_date('2023/01/01','YYYY/MM/DD'),
2000,100,20);












