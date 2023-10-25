SELECT * FROM emp;
/*
# where 조건문 처리
1. 행단위 데이터로 필터링하여 검색할 때 주로 사용된다.
2. where 조건절에는 컬럼명을 기준으로 여러가지 비교연산식과 논리연산식을 처리한다.
3. 기본 형식
	select 컬럼,...
	from 테이블
	where 비교연산식 또는 논리연산식
	
	1) 비교연산식 : 
		컬럼명 = 데이터 (동등비교) 주의 == (X) 아님..
		비교연산자 =,>,<,<=,>=,!=,<>
	
	2) 논리연산식 :
		위 비교연산자와 함께 and, or, not
		지원하는 연산 키워드 in, between, exists..
		등 사용된다.
 * */

-- 숫자형 데이터 비교
-- 연봉이 2000이상인 사원정보 출력
SELECT *
FROM emp
WHERE sal >= 2000;
SELECT ename, sal
FROM EMP 
WHERE sal>=2000;

-- 문자열 데이터 비교
-- 사원명이 SALESMAN 인 경우를 출력하세요
SELECT *
FROM emp
WHERE job = 'SALESMAN';

-- ex1) 관리자번호(mgr)이 7839인 사원명, 사원번호, 관리자 번호 출력
SELECT ename 사원명, empno 사원번호, mgr 관리자번호
FROM EMP
WHERE mgr = 7839;

-- ex2) 직책(job)이 'CLERK'인 사원번호, 직책명, 사원명을 출력
SELECT empno 사원번호, ename 사원명, job 직책명
FROM EMP 
WHERE job = 'CLERK';

-- ec3) 부서번호(deptno)가 10인 사원전체정보 출력
SELECT *
FROM EMP
WHERE DEPTNO =10;

-- 비교연산자 and 비교연산자
-- 비교연산자 or 비교연산자
-- not (비교연산자)

-- 부서번호가 10이고 급여가 3000미만인 사원을 출력
SELECT *
FROM emp
WHERE deptno = 10 
AND sal < 3000;

-- 급여가 5000 이상이거나 관리자번호가 7782인 경우 사원정보
SELECT *
FROM emp
WHERE sal>=5000
OR mgr = 7782;

-- ex1) 급여가 2000이상이고 직책이 MANAGER 인 데이터를 출력
SELECT *
FROM emp
WHERE sal>=2000
AND job = 'MANAGER';

-- ex2) 부서번호가 30이거나 급여가 2000미만인 데이터 출력
SELECT *
FROM emp
WHERE deptno=30
OR sal<2000;

-- ex3) 직책이 'PRESIDENT'가 아닌 경우 출력.
SELECT *
FROM emp
WHERE JOB != 'PRESIDENT';
-- where nit(job='PRESIDENT')





















