/*
# 데이터베이스에서 CRDU란?
1. C : create 즉, 생성을 말하는 것으로 데이터를 입력할 때, 사용되는 것을 말한다.
	   기본 구문으로 전체 컬럼에 입력할 때, 
	   insert into 테이블명 values(데이터1, 데이터2 ..);
	   해당 테이블에 포함된 컬럼의 순서에 맞게 데이터를 입력하는 것을 말한다.
	   => insert into 테이블명(입력할 컬럼1, 컬럼2, 컬럼3) 
	   		values (데이터1, 데이터2, 데이터3);
	   		
2. R : read 즉, 데이터를 읽어오는 처리를 하는 것을 말한다.
	select * from emp;

3. U : update = 데이터를 수정하는 것을 말한다
	update emp
		set ename = '홍길동',
		job = '사원',
	where empno = 7780;

4. D : delete = 데이터를 삭제하는 것을 말한다.
	delete 
	from emp
	where empno = 7780;
	
- 일반적으로 데이터에 대한 처리를 CRUD라는 용어를 이용해서 처리하는 것을 의미할 때 사용한다.
	   		
 * */

SELECT * FROM emp01;
SELECT SYSDATE 오늘날짜, 1+2 합산 FROM dual;
-- sysdate : 현재 날짜와 시간으로 가져오는 키워드
-- 		오라클 내장 객체
-- dual : 하나의 데이터를 확인할 때 사용하는 오라클의 내장된 테이블

INSERT INTO emp01 VALUES (1000, '홍길동', '사원', 7780, sysdate, 4000, 100, 10);
SELECT * FROM emp01;

-- ex) emp01에 위와같이 1001사원번호로 사원정보를 입력하세요.
-- 사원명(10bytes), 직책(9bytes) 내 입력
INSERT INTO EMP01 e VALUES (1001, '김길동', '대표', 7777, sysdate, 8000, 100, 10);
INSERT INTO EMP01 e (EMPNO, ENAME, sal ) VALUES (1002,'오길동',5000);
-- 지정되지 않은 컬럼의 데이터는 null(데이터없음)으로 처리된다. 

SELECT * FROM emp01;
SELECT * FROM emp01;

-- ex2 ) emp02  사원번호 직책 입사일 급여 부서번호 를 입력하세요
INSERT INTO emp02(EMPNO, job, hiredate, sal, deptno ) VALUES (1003, '사원', sysdate, 5000, 10);
SELECT * FROM emp02;

/*
# 수정기본형식
1. update 테이블
	set 컬럼1명 = 수정할데이터,
		컬럼2명 = 수정할데이터
	where 조건(비교/논리)

2. 위 형식으로 특정테이블에 조건으로 특정 컬럼의 데이터를 수정한다. 
 * */
SELECT * FROM emp01;
UPDATE emp01 
	SET ename ='마길동'
	WHERE empno = 7369;
UPDATE EMP01 
	SET  JOB = '사원',
		mgr = 7777
	WHERE empno = 7369;
SELECT * FROM emp01;

-- ex) emp01테이블의 empno가 7499인 사원의 ename, job deptno를 변경하세요 emp01 

UPDATE EMP01 
	SET ename = '임솔',
		job = '대표',
		deptno = 10
WHERE empno = 7499;
SELECT * FROM EMP01;


/*
# 삭제 기본형식
1. delete 
	from 데이블명
	where 비교/논리연산자
	
2. 테이블에 비교/ 논리식을 통하여 특정 데이터를 행단위로 삭제한다.(가로로 한 줄싹)
	행단위 삭제되기에 delete 컬렴명 지정이 필요없다. 
 * */
DELETE 
FROM emp01 
WHERE empno = 1000;

SELECT * FROM emp01;

DELETE 
FROM emp01 
WHERE sal BETWEEN 1000 AND 2000;

-- ex) emp01 기준으로 직책이 MANAGER 인 데이터를 삭제해보세요.
DELETE FROM emp01 WHERE job = 'MANAGER';
-- ex ) emp01 기준으로 부서번호가 20 이고 직책이 대리인 데이터를 삭제하세요
DELETE FROM emp01 WHERE job = '대리' AND DEPTNO = 20;
SELECT * FROM emp01;


















