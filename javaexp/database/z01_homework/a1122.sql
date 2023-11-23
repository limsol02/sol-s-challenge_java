/*
[1단계:개념] 1. 시퀀스란 무엇인가? 기본형식과 속성값을 지정하고, 사용 형태를 예시로 나열해 보세요.
- 자동으로 numbering 을 하기위해 생성하는 객체이다. 
기본형식은 create sequence seq01; 으로 만들고
emp10에 empno만 컬럼을 넣어 생성한 경우
insert into emp10 values(seq01.nextval)로 순번을 매길수 있다.


[1단계:개념] 3. 조인이란 무엇인가 개념을 정리하고, 기본 inner조인을 예제로 만들어 해당 코드를 설명하세요.
- 다른 테이블에 있는 데이터를 쓰기위해 엮는거라고 스스로 개념정리했습니다..
select e.*,d.* from emp e, dept d where e.deptno = d.deptno ; 
로 만들면 emp의 컬럼과 dept의 컬럼 데이터가 모두 다 출력됩니다.  

[1단계:개념] 6. 조인의 여러가지 종류를 기본에제를 통해서 그 특정을 설명하세요
- non equi join : 컬럼값이 동일하지 않지만 범위로 묶어서 조인하는 경우
==> select e.*, s.* from emp e, salgrade s where sal between losal and hisal; 
인경우 emp 의 sal 항목이 salgrade에 맞춰 등급이 나뉘어 출력됩니다.

 - outer join : 기본적인 equi join같은 경우는 null값을 가진 행이면 출력되지 않는데,
 	outer 조인을 이용하면 그 정보도 출력할 수 있습니다.
 ==> select e.*,d.* from emp e, dept d where e.deptno(+) = d.deptno; 
 로 입력시 emp에 없는 40번 부서번호까지 출력이 됩니다.
 
 - self join : 컬럼안에 내부적으로 인과관계가 있는 컬럼간의 조인을 말합니다.
 ==> select e.*,m.* from emp e, emp m where e.mgr = m.empno;
 로 입력시 emp의 mgr값과 emp의 empno 값이 매칭되어 출력됩니다.  


[1단계:개념] 9. 테이블 구조변경 유형을 기본예제를 통해 설명하세요.
 * */

-- [1단계:확인] 2. 4자리의 고정된 고객번호와 고객명, 나이, 주소 테이블을 만들고, 
--제약조건과  seqence를 이용하여 고객번호를 입력 처리하세요.
CREATE TABLE c02 (
	cno char(4) PRIMARY KEY,
	cname varchar(30),
	age NUMBER,
	address varchar2(50)
);
CREATE SEQUENCE seq04 START WITH 100;

INSERT INTO c02 VALUES ('C'||seq04.nextval, '홍길동', 20, '서울 성북구');

-- [1단계:확인] 4. 회원(회원번호, 회원명, 등급번호)과 등급테이블(등급번호, 등급명, 할인율)을
-- 테이블을 구성하여 데이터를 입력하고, 조인관계를 처리하세요.
CREATE TABLE c03 (
	cno NUMBER,
	cname varchar2(30),
	gradenum number
);
INSERT INTO c03 values(1,'홍길동',1);

CREATE TABLE g01 (
	gradenum NUMBER,
	dname varchar2(30),
	discount number(2,2)
);
INSERT INTO g01 values(1,'일반',0.5);

SELECT c.*, g.* FROM c03 c, g01 g WHERE g.gradenum = c.gradenum;

-- 5. employees, jobs, departments, locations, job_history를 이용 조인연습 문제
-- 1) 부서 번호가 10인 부서에 근무하는 사원의 이름, 직급, 부서, 근무지를 출력
SELECT e.ename, e.job, d2.DNAME, d2.loc FROM emp e, DEPT d2 WHERE e.DEPTNO = d2.DEPTNO ;

-- 2) 모든 사원의 이름, 직급, 부서, 근무지를 출력하시오.
SELECT e.*, d.* FROM emp e, dept d WHERE e.DEPTNO = d.DEPTNO ;

--  7. subquery를 사용해야 하는 경우를 기술하고 이 때, 활용하는 subquery 형식을 예시를 들어 설명하세요.
/*
max(sal)의 데이터를 가진 직원의 전체 정보를 알기위해서는 전체적으로 출력 할 수 있게 서브쿼리를 이용해야합니다.
SELECT * FROM emp WHERE SAL = (SELECT  max(sal) FROM emp); 처럼 뒤쪽에 서브커리를 붙여주고
실행해야만 최고급여를 가진 직원의 전체정보가 출력됩니다. 
 * */

-- 8. subquery, inline view 를 이용해서 아래 query 처리하세요.
--EMP 테이블에서 가장 높은 급여를 받는 직원의 이름과 급여 조회하기.
SELECT ename, sal FROM emp WHERE sal=(SELECT max(sal)FROM emp);



--DEPT 테이블에서 부서별 평균 급여 계산하기.
SELECT deptno, (SELECT avg(sal) FROM emp WHERE emp.deptno = dept.deptno) avgsal FROM dept;

SELECT * FROM dept;

--EMP 테이블에서 각 직무별로 가장 높은 급여를 받는 직원 찾기.
SELECT e.* FROM emp e WHERE e.sal IN (SELECT max(sal) FROM emp GROUP BY job);

--각 부서에서 근무하는 직원 수 계산하기.
SELECT e.deptno, count(*) FROM (SELECT DISTINCT deptno FROM emp) e01, emp e
WHERE e01.DEPTNO = e.DEPTNO GROUP BY e.DEPTNO ;

--EMP 테이블에서 매니저가 아닌 직원만 조회하기.
SELECT * FROM (SELECT job FROM emp WHERE job NOT IN 'MANAGER') e01, emp e 
WHERE e01.job = e.job;

--EMP 테이블에서 각 부서별로 가장 오래 근무한 직원 찾기.
SELECT * FROM (SELECT max(hiredate) hiredate, job FROM emp GROUP BY job) e01, emp e
WHERE e01.job = e.job AND e01.hiredate = e.hiredate;