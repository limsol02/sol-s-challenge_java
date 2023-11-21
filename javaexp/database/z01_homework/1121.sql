/*

	3)거래 테이블은 거래번호, 거래일자, 거래금액, 거래처, 거래품목 속성으로 구성되고, 거래번호 속성이 기본키다. 거래일자는 오늘 날짜보다 이전이어야 한다. 거래금액은 10000원 이상이어야 한다. 거래처는 "회사", "개인" 중 하나여야 한다. 거래품목은 "컴퓨터", "노트북", "모니터" 중 하나여야 한다
 
 * */

-- 1) 학생 정보를 저장하는 테이블을 생성하십시오. 학생 번호, 이름, 성별, 생년월일, 전화번호를 저장해야 합니다.
CREATE TABLE sinfo02 (
	sno number,
	sname varchar2(30),
	gender varchar2(30),
	birth number,
	phone varchar(13)
);

--2) 주문 정보를 저장하는 테이블을 생성하십시오. 주문 번호, 고객 번호, 주문 날짜, 제품 번호, 수량, 주문 금액을 저장해야 합니다.
CREATE TABLE ORDER02 (
	orderno number,
	cusno number,
	orderdate number,
	prono number,
	cnt NUMBER,
	price number
);

--	3) 도서 정보를 저장하는 테이블을 생성하십시오. 도서 번호, 제목, 저자, 출판사, 출판 년도, 재고량을 저장해야 합니다.
CREATE TABLE book02 (
	bookno number,
	bookname varchar2(50),
	writer varchar2(30),
	company varchar2(30),
	bookdate date,
	cnt number
);

--  4) 직원 정보를 저장하는 테이블을 생성하십시오. 직원 번호, 이름, 부서, 입사일, 급여를 저장해야 합니다.
CREATE TABLE empinfo02 (
	empno number,
	ename varchar2(50),
	dept varchar2(30),
	hiredate date,
	sal number
);

-- 5) 고객 정보를 저장하는 테이블을 생성하십시오. 고객 번호, 이름, 주소, 이메일 주소, 가입일을 저장해야 합니다.
CREATE TABLE customer03 (
	cusno number,
	cusname varchar2(30),
	address varchar2(50),
	email varchar2(50),
	joindate date
);

--2. 제약조건 5가지의 각각의 기본 예제를 만들고, 해당 제약조건의 의미를 기술하세요.
/*
1. not null :데이터에 null을 등록할 수 없습니다.
2. unique : 중복 데이터를 입력할수는없지만, null은 중복이 됩니다.
3. primary key : null 데이터도 쓸 수 없고, 중복데이터 허용도 안됩니다.
4. check : check 뒤에 오는 조건문으로 정보 입력에 조건을 줄 수 있습니다.
5. REFERENCES : 외래키를 가져와서 해당 키에 맞는 데이터만 입력 할 수 있습니다.
 * */
--1. not null
CREATE TABLE e01 (
	ename varchar2(30) NOT NULL -- 이름에 null x
);
--2. unique 
CREATE TABLE e02 (
	ename varchar2(30) unique -- 이름 중복 입력 x
);
--3. primary key
CREATE TABLE e03 (
	ename varchar2(30) primary key -- 이름 중복 입력 x , NULL x
);
--4. check
CREATE TABLE e04 (
	ename varchar2(30) CHECK (ename LIKE '%A%') -- 이름에 A 키워드 입력해야함
);
--5. 외래키
CREATE TABLE e05 (
	empno number CONSTRAINT e05_empno_fk REFERENCES emp(empno) -- e05테이블의 empno는 emp테이블의 empno에 있는 데이터만 사용가능
);

-- 1)고객 테이블은 고객번호, 고객 이름, 나이, 등급, 직업, 적립금 속성으로 구성되고, 고객번호 속성이 기본키다. 
-- 고객이름과 등급 속성은 값을 반드시 입력해야 하고, 적립금 속성은 값을 입력하지 않으면 0이 기본으로 되도록 생성하라.
CREATE TABLE customer02(
	cno NUMBER NOT null,
	dname varchar2(30),
	age NUMBER,
	grade varchar2(30) NOT null,
	job varchar2(50),
	point NUMBER CHECK (point = NVL(point, 0))
);

-- 	2)제품 테이블은 제품번호, 제품명, 재고량, 단가, 제조업체 속성으로 구성되고, 제품번호 속성이 기본키다. 
-- 제품번호는 10자리 숫자여야 하고, 제품명은 100자 이내여야 한다. 재고량은 0 이상이어야 하고, 단가는 0 이상 1000 이하여야 한다. 제조업체는 "삼성전자", "LG전자", "애플" 중 하나여야 한다.

CREATE TABLE PRODUCT10 (
	pno NUMBER,
	pname varchar2(50),
	stock NUMBER CHECK (stock>0),
	price NUMBER CHECK (price<=1000 AND price>0),
	makecom varchar2(50) CHECK(makecom IN ('삼성전자','LG전자','애플'))
);


-- 	3)거래 테이블은 거래번호, 거래일자, 거래금액, 거래처, 거래품목 속성으로 구성되고, 거래번호 속성이 기본키다. 
-- 거래일자는 오늘 날짜보다 이전이어야 한다. 거래금액은 10000원 이상이어야 한다. 거래처는 "회사", "개인" 중 하나여야 한다. 거래품목은 "컴퓨터", "노트북", "모니터" 중 하나여야 한다

CREATE TABLE trade (
	tno NUMBER,
	tdate DATE CHECK (tdate < TO_DATE('2023-11-21', 'YYYY-MM-DD')),
	price NUMBER CHECK (price>=10000),
	company varchar2(40) CHECK(company IN ('회사','개인')),
	product varchar2(40) CHECK(product IN ('컴퓨터','노트북','모니터'))
);





