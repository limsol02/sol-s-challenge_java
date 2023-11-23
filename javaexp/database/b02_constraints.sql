/*
# 무결성 제약조건
1. 무결성이란 데이터의 흠결이 없는 것으로 데이터의 정확성과 일관성을 의미한다.
	주민번호가 중복되지 않게 처리한다던가, 부서정보가 있는 테이블에 있는 부서번호만
	등록되게 한다든가, 학년 컬럼을 1~4학년만 입력되게 범위를 정함으로 해당
	데이터가 흠결이 없게 컬럼 속성을 지정하는 것을 말한다.
2. 데이터의 정확성을 유지하기 위해서는 다양한 종류의 업무규칙을 고려한다.
	1) hishoolstudent 테이블에서 학년 데이터 1,2,3 중의 하나만 입력
	2) 모든 학번은 유일하게 처리
3. 데이터 무결성 제약조건의 장점
	1) 데이터 생성시 무결성 제약조건을 정의 가능
		- 생성 후 제약조건 설정도 가능
	2) 테이블에 대해 정의, 데이터 딕션너리에 저장되므로
		응용프로그램에서 입력된 모든 데이터에 대해 동일하게 적용
	3) 제약조건을 활성화/비활성화 할 수 있는 융통성이 있다.
	
	# 제약조건이 걸려 있는 컬럼에 위반되면 해당 행 전체가 입력이 되지 않는다!
	
4. 무결성 제약조건의 종류
	1) not null : 열이 null을 포함 할 수 없음
	2) unique key : 테이블의 모든 행에서 고유한 값을 갖는  열 또는 열조합을
		지정해야 한다. ex) 학번, 주민번호, 사원번호를 중복되지 않아야 한다.
		ps) null을 입력가능하고, null을 중복도 가능
	3) primary key : 해당 컬럼 값은 반드시 존재해야 하면 유일해야 한다.
		no null과 unique가 결합된 형태
		주로 테이블에서 식별해야할 컬럼 즉, key를 설정할 때,  사용된다.
		ex) emp테이블의 empno, dept 테이블의 deptno
	4) foreign key : 한 열과 참조되 테이블의 열간에 외래 키 관게를 설정하고
		시행 
		EX) 사원의 테이블의 부서번호는 반드시 부서테이블에 있는 부서번호이어야 한다.
	5) check : 해당 컬럼에 저장 가능한 데이터 값의 범위나 조건을 지정처리
		ex) universtudent 테이블의 학년을 1,2,3,4만 데이터로 넣을 수 있다.
5. 설정 형식
	1) 컬럼명 데이터타입 constraint 제약조건명 제약조건
	2) primary key 지정
	3) 기본형식
	create table student(
		studno number constraint student_studno_pk primary key
	);
	create table student2(
		studno number primary key
	);
		
	
	4) 제약조건명 : 테이블명_컬럼명_제약조건종류
		제약조건 종류 : pk, uq, nn, fk,  ...위 제약조건 약자..
		ps) sys.all_constraints : db시스템에 있는 제약정보의 메타테이블
	
 * */
SELECT * FROM emp;
SELECT * FROM dept;
SELECT * 
FROM sys.all_constraints
WHERE TABLE_NAME LIKE 'EMP%';
CREATE TABLE student01(
	name varchar2(30) CONSTRAINT student01_name_nn NOT NULL
);
SELECT * FROM STUDENT01;
INSERT INTO STUDENT01 values(null);
INSERT INTO STUDENT01 values('홍길동');
CREATE TABLE student02(
	name varchar2(30) CONSTRAINT student02_name_nn NOT NULL,
	age number
);
INSERT INTO student02(age) values(25);
-- 해당 행단위로 age만 입력이 불가능하다. 같은 행에 name not null 제약조건이
-- 걸려 있기때문이다.
INSERT INTO student02 values('마길동',25);
SELECT * FROM student02;
-- ex1) product01(name) 테이블 생성 name에 not null설정
CREATE TABLE PRODUCT01(
	name varchar2(50) CONSTRAINT PRODUCT01_name_nn NOT null
);
insert INTO PRODUCT01 values('홍길동');
insert INTO PRODUCT01 values(null);
SELECT * FROM product01;

-- ex2) product02(name, price) 테이블 생성 price에 not null 설정
--      이름 지정하여 데이터 입력 처리로 확인하세요..
CREATE TABLE product02(
	name varchar2(50),
	price NUMBER CONSTRAINT product02_price_nn NOT null
);
SELECT * FROM product02;
INSERT INTO product02 values('사과',3000);
INSERT INTO product02(price) values(6000);
--INSERT INTO product02(name) values('오렌지'); 제약조건에 
INSERT INTO product02 values(NULL, 5000);
--INSERT INTO product02 values('오렌지', null);  제약조건에 걸림
CREATE TABLE student03(
	sno number(5) CONSTRAINT student03_sno_uq unique
);
-- unique에서는 중복이 되지 않게 처리하나, null을 입력이 가능하다.
SELECT * FROM student03;
INSERT INTO student03 values(1000);
INSERT INTO student03 values(1001);
INSERT INTO student03 values(1002);
INSERT INTO student03 values(1003);
INSERT INTO student03 values(null);
-- ex) emp10테이블에 사원번호, 사원명, 급여을 설정하되,
--     사원번호는 unique, 사원명은 not null 제약조건으로 설정하여
--     데이터 입력 확인하세요.
CREATE TABLE emp10(
	empno NUMBER UNIQUE,
	ename varchar2(50) NOT NULL,
	sal number
);
INSERT INTO emp10 values(1000, '홍길동',3000);
SELECT * FROM emp10;
--INSERT INTO emp10 values(1000, '마길동',2000);
INSERT INTO emp10 values(null, '마길동',2000);
INSERT INTO emp10(ename) values('오길동');
--INSERT INTO emp10(empno, sal) values(1001,5000);
--  ename은 not null 제약조건에 걸려있다..
-- 이때, 반드시 입력을 해야되고, 중복되지 않아야 하는 경우 ==> primary key
CREATE TABLE emp11(
	empno number(4) CONSTRAINT emp11_empno_pk PRIMARY key
);
INSERT INTO emp11 values(1003);
INSERT INTO emp11 values(null);
SELECT * FROM emp11;
-- ex) student04 학번(중복/반드시입력), 이름(not null), 국어,영어, 수학
--     테이블을 구성하고 데이터 입력 확인하세요..
CREATE TABLE student04(
	sno char(7) CONSTRAINT student04_sno_pk PRIMARY KEY,
	name varchar2(50) NOT NULL,
	kor number(3),
	eng number(3),
	math number(3)
);
INSERT INTO student04 values('KOR2311', '홍길동', 70,80,90);
INSERT INTO student04 values('KOR2311', '마길동', 70,80,90);
-- 중복
INSERT INTO student04 values(NULL, '오길동', 70,80,90);
-- NOT null
INSERT INTO student04 values('KOR2312', null, 70,80,90);
-- NOT null





SELECT * FROM emp10;








