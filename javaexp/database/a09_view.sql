/*
# view 란?
1. 하나 이상의 기본 테이블이나 다른 뷰를 이용하여 생성되는 가상 테이블을 말한다.

2. 장점
	1) 테이블을 보호 하기 위하여 활용된다(보안적인 필요성)
		- 지정된 권한이 잇는 사람만이 전체 테이블의 컬럼을 확인하고 활용할 수 있고,
		그 외 사람은 뷰를 통해서 허용된 컬럼만을 조회하게 할 수 있다.
	
	2) 사용자 편의성을 지원한다
		- query의 결과를 뷰로 만들었기 때문에, 다른 테이블과 조인하거나
		group 함수등을 통해서 출력한 query를 view 라는 가상테이블로 간단하게
		sql 조회할 수 있다.
		- 복잡한 sql을 하나의 가상테이블로 간단하게 만들어 사용가능하다.
		
3. 뷰의 종류
	1) 단순 뷰 : 하나의 기본 테이블에 의해 정의된 뷰
	
	2) 복합 뷰 : 두개 이상의 기본 테이블로 구성된 뷰
	
4. 뷰의 한계
	1) 제한적 사용 : 무결성 제약조건, 표현식, group by 유무에 따라 dml명령 등은 
		제한적으로 사용된다.
		
	2) 수행불가능 : DISTINCT, 그룹함수, GROUP BY, START WITH, 
		CONNECT BY, ROWNUM은 포함할 수 없다.
		
5. 뷰 생성 기본
	1) create[or replace] view 뷰이름
		as(subquery - select * from ***)
		
	2) 옵션
		- or replace : 뷰를 생성할 때, 생성된 뷰가 있으면 동일한 이름의 뷰를 재생성 할 수 없다
		
		- force : 기본 테이블의 존재 여부에 상관없이 뷰 생성
			[ex] 뷰를 먼저 만들고 테이블을 생성할 때 사용
		
		- noforce : 기본 테이블이 존재 할 경우에만 뷰 생성
			[기본 값 default]
			
		## GRANT CREATE VIEW TO scott;
		ㄴ=> system(관리자 계정에서) grant (권한내용) to (계정);
		create view라는 권한(뷰 생성권한)을 scott 계정에 부여
	
 * */

-- 1981년에 입사한 사원의 부서번호, 사원번호, 사원명, 급여가 있는 view 생성

CREATE VIEW v_emp
AS SELECT deptno, empno, ename, sal
FROM emp
WHERE to_char(hiredate,'YYYY') = '1981';

SELECT * FROM v_emp;

-- ex) 부서별 사원수, 최대급여, 최소급여, 평균급여를 v_emp_statics로 뷰로 만들고, 출력
CREATE VIEW v_emp_statics
AS SELECT count(*) jobcount , max(sal) maxsal, min(sal) minsal, avg(sal) avgsal
FROM emp group BY job;
-- 가상테이블이기에 앞에 원본 데이터의 데이터가 변경될 때, 바로 자동으로 영향을 받아 처리해준다.
-- ex) 위 emp테이블에 사원이 추가되고 데이터가 추가 되면 통계치가 바로 수정된다. 
SELECT * FROM v_emp_statics;

/*
# 인라인 뷰(inline view)
1. from 라인에 참ㅈ하는 테이블의 크기가 클 경우, 또는 특정 목적에 의해서
	필요한 행과 컬럼만으로 구성된 집합 테이블을 재정의하여 질의문을 효율적으로 구성하는 것을 말한다.
	
2. from 절에서 서브 쿼리를 사용하여 생성한 임시 뷰를 말한다.

3. sql명령문이 실행되는 동안만 임시적으로 정의한다.

select 컬럼 from (inline view)
 * */
-- 부서별 평균급여보다 많은 사원정보를 출력하세요
SELECT deptno, AVG(sal) sal FROM emp GROUP BY deptno;

SELECT b.*,a.sal 평균급여 
FROM (SELECT deptno, AVG(sal) sal FROM emp GROUP BY deptno)a, emp b
WHERE a.deptno = b.deptno AND a.sal<b.sal ORDER BY b.deptno;
-- a.sal<b.sal : 해당부서의 평균 급여 보다 많은 사원의 급여를 검색

/*
# 뷰의 한계
1. 단순 뷰
	하나의 테이블로 생성
	그룹함수의 사용이 불가능
	실제테이블의 데이터가 아니기에 distinct 사용할 때 불가능
	dml(insert, update, delete)
	
2. 복합 뷰
	여러개의 테이블로 생성
	그룹함수 사용이 가능
	distinct 사용 가능
	dml(insert, update, delete) 사용 불가능
 * */

-- 단순 view 를 통한 dml 처리
CREATE TABLE emp13 
AS SELECT * FROM emp;

CREATE VIEW view_emp13
AS SELECT empno, ename, sal, deptno
FROM emp13;

SELECT * FROM view_emp13;

-- view에 insert 처리(단순 view는 처리가능)
INSERT INTO view_emp13 values(7999,'ANGLE',7000,10);

SELECT * FROM emp13; -- 뷰에 입력해도 실제 테이블에 반영..

-- 복합뷰 만들기
SELECT * FROM emp;

CREATE TABLE dept13
AS SELECT * FROM dept;

DROP VIEW view_emp_dept;

CREATE VIEW view_emp_dept
AS SELECT e.*, dname, loc FROM emp13 e, dept13 d WHERE e.deptno = d.deptno
ORDER BY empno DESC;

SELECT * FROM view_emp_dept; -- 복합뷰 조회

-- 복합뷰는 여러컬럼에 데이터를 복합적으러 만들었기에 수정,입력,삭제 되지 않는다.
UPDATE view_emp_dept SET ename= '홍길동' WHERE empno = 7934; -- 수정 불가
INSERT INTO view_emp_dept(empno,dname) values(9999,'인사'); -- 입력 불가
DELETE FROM view_emp_dept WHERE empno=7902; -- 삭제 불가