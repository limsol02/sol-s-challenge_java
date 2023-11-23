SELECT * FROM emp;

/*
# subquery(inline view)
1. sql을 처리한 결과가 이를 포함하는 다른 sql의 조건의 값이나 
	또는 조회값을 사용할 때, 사용되는 sql을 말한다.
	
2. 기본형식
	1) 조건문의 데이터의 결과값으로 사용되는 경우 사원정보중에서 최고급여자의 사원정보를 출력하세요
	=> 최고급여를 먼저 조회하고, 그 다음 급여 정보의 조회 조건으로 처리한다.
	
	2) 테이블의 해당 query를 작성하고, 이를 활용하여 
	from (sql) 별칭1, 테이블명 별칭2
	where 별칭1.컬럼 = 별칭2.컬럼명
	
	3) select 구문에서 선택 결과를 sql로 처리하는 경우
		select (sql)
		from 테이블;
 * */
SELECT max(sal) FROM emp;
-- sql은 행단위로 먼저 searching 을 해야지 최고급여만 가져올 수 있다.
SELECT * FROM emp WHERE sal = (SELECT max(sal) FROM emp);

SELECT DEPTNO, empno, ename, sal FROM emp where(DEPTNO,sal) 
IN (SELECT DEPTNO ,max(sal) FROM emp GROUP BY DEPTNO);

-- subquery의 결과가, 다중 행인 경우 in을 사용하고, 
-- 열도 다중인 경우 해당 컬럼명을 선언하여 처리한다.

-- ex) 사원번호가 가장 마지막에 등록된 사람의 사원번호를 출력
SELECT empno , HIREDATE FROM emp WHERE HIREDATE = (SELECT MAX(HIREDATE) FROM emp);
SELECT * FROM emp WHERE empno = (SELECT max(empno) FROM emp);

-- 사원정보중에 마지막에 입사한 사원의 정보를 출력..
SELECT * FROM emp WHERE hiredate = (SELECT max(HIREDATE) FROM emp);

-- ex) 직급별로 최저연봉사원의 사원정보를 출력하세요
SELECT job,min(sal) FROM emp GROUP BY job;

-- 행이 여러개in, 열이 여러개
SELECT job, sal, ename FROM emp WHERE (job,sal) 
IN (SELECT job, min(sal) FROM emp GROUP BY job) ORDER BY SAL;

SELECT * FROM (SELECT job, min(sal) sal FROM emp GROUP BY job) e1, emp e 
WHERE e1.job = e.job AND e1.sal= e.sal ;
-- 위에서 e1은 sql 에서 만들어진 가상의 테이블 즉, inline view이고,
-- 이것을 실제 테이블 emp과 조인을 해서, 원하는 결과값을 가져오게 처리할 수 있다.
-- 위와같은 inline view을 이용하면 데이터를 보다 효과적으로 필요한 컬럼만 로딩하여 출력할 수 있다.

/*
# inline view 처리순서
1. inline view(테이블 subquery)를 작성할 내용부터 만들고, 이 데이터를 확인한다.
2. 조인 할 테이블 내용을 선언하고, 조건들을 할당한다.
3. 원하는 컬럼 리스트를 select에 선택하여 출력한다.
 * */
-- ex) 직책별 가장 먼저 입사한 사원 정보를 출력하세요(inline view 활용)

-- subquery , inline view 를 쓰면 하위에 복잡한 함수 적용이나
-- 연산식을 하나의 이름으로 간단히 불러와서 또 다른 수치/함수 적용을 간편하게 할 수 있다. 

SELECT job, HIREDATE, ename FROM emp 
WHERE HIREDATE = (SELECT min(HIREDATE) FROM emp);

SELECT * FROM (SELECT min(HIREDATE) hiredate, job FROM emp GROUP BY job) e01, emp e 
WHERE e01.job = e.job AND e01.hiredate = e.hiredate;

-- 평균 급여보다 많은 사원 정보를 출력
SELECT * FROM emp WHERE sal >(SELECT avg(sal) FROM emp);

-- select 구문에서 바로 subquery로 데이터 출력해서 처리하는 경우..
SELECT (SELECT avg(sal) FROM emp) avgsal, e.* FROM emp e;

-- inline view를 통해서 나온 결과값을 다시 위로 넘겨서 데이터를 처리하는 경우로,
-- 복잡한 함수 처리해서 그 결과값을 처리할 때, 주로 이용된다. 
SELECT empno, sal*deptno plus FROM (SELECT empno,sal,deptno FROM emp) e;

-- 분기별 최고 급여자
SELECT part, ename, e.sal FROM 
(SELECT to_char(hiredate,'Q') part, max(sal) sal FROM emp GROUP BY to_char(hiredate,'Q')) e1, 
emp e WHERE e1.part=to_char(e.hiredate,'Q') AND e1.sal=e.sal ORDER BY part;

-- inline view 

/*
# subquery 를 이용한 등록/수정/삭제 처리
1. update 명령문에 set부분이나 where 조건절에 subquery를 이용하여 수정 처리하는 것을 말한다.
2. 다른 테이블이나 현재 테이블에 정보를 변경할 때, 일단 query를 수행한 결과로 해당 데이터 수정을 처리하는것을 말한다.
3. 변경할 컬럼의 타입과 갯수는 반드시 일치 하여야한다.
4. 유형
	set 부분 subquery 활용
		- 한개의 컬럼 set 컬럼명 =(결과가 1개인 컬럼테이블)
		- 두개의 컬럼 set (컬럼1,컬럼2) = (결과가 2개인 컬럼 데이터)
 * */

-- 부서번호가 10인 사원정보의 급여를 부서정보 20인 사원의 최고 급여로 변경 처리
CREATE TABLE emp07
AS SELECT * FROM emp;

UPDATE emp07
SET sal = (
	SELECT max(sal)
	FROM emp07
	WHERE deptno=10
)
WHERE deptno = 10;

SELECT * FROM emp07;

-- ex) emp07 job 'SALESMAN'의 평균급여를 사원번호 7599의 급여로 수정 처리하세여
UPDATE emp07 
SET sal = (
	SELECT avg(sal)
	FROM emp07 
	WHERE job = 'SALESMAN'
)
WHERE empno = 7599;

SELECT * FROM emp07;

-- 부서별 최고급여인 사원을 삭제 처리..
SELECT deptno, max(sal) FROM emp GROUP BY DEPTNO ;

DELETE FROM emp07 WHERE (deptno, sal) 
IN (SELECT deptno,max(sal) FROM emp07 GROUP BY deptno); 










