/*
# ckeck 제약조건
1. 특정한 컬럼을 조건이나 범위를 지정해서, 해당 범위에 데이터만 
	입력되도록 처리하는 것을 말한다.
	
2. 형식
	컬럼 데이터유형 constraint 제약명 check (조건문-where문에 들어가는 sql문장)
	컬럼 데이터유형 check(조건문 -where절에 들어가는 sql 문장)
 * */

CREATE TABLE student05(
	name varchar2(50),
	gender varchar2(1) CHECK(gender IN('F','M'))
);
-- gender 컬럼에 F와 M만 들어갈 수 있음
INSERT INTO STUDENT05 values('홍길동','F');
INSERT INTO STUDENT05 values('김길동','M');
-- INSERT INTO STUDENT05 values('마길동','K'); ==> 제약조건에 걸림
INSERT INTO STUDENT05 values('오길동',null); -- null은 입력 가능

-- ex) student06 테이블 이름(nn), 학년(1~4학년만) , 국어(1~100 점수범위)
CREATE TABLE student06(
	studname varchar2(30) NOT null,
	grade varchar2(30) CHECK (grade IN('1학년','2학년','3학년','4학년')),
	kor NUMBER CHECK(kor>=0 AND kor<=100)
);

INSERT INTO student06 values('홍길동','2학년',66);
INSERT INTO student06 values('박길동','1학년',null);
SELECT * FROM student06;

/*
# 외래키 설정 관계(foreign key)
1. 연관관계에 있는 두 테이블에 대하여, 한쪽 테이블에 있는 데이터 기분으로
	다른쪽 테이블의 데이터를 입력할 수 있게 하는 것을 말한다.

	[ex] 사원테이블에서 deptno는 부서테이블에서 입력된 부서번호 이외의 데이터는 입력이 불가능하다.
2. 기본형식
	컬럼명 데이터유형 constraint 테이블명_컬럼명_fk references 테이블명(컬럼명)
 * */
CREATE TABLE emp12(
	empno number(4) PRIMARY KEY,
	ename varchar2(50),
	deptno number(2) CONSTRAINT emp12_deptno_fk REFERENCES dept(deptno)
);

INSERT INTO emp12 values(1000,'홍길동',10);
INSERT INTO emp12 values(1001,'김길동',20);
INSERT INTO emp12 values(1002,'신길동',30);
-- INSERT INTO emp12 values(1003,'마길동',50); ==> 50이라는 번호는 dept테이블의 deptno에는 존재하지않아, 입력하지못함(제약조건)
SELECT * FROM emp12;



