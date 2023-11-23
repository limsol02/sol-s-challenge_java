/*
# sequence
1. 오라클에서 유일한 식별자의 데이터를 입력하기 위해서 자동으로 
	numbering 하는 객체가 있는데 이를 sequence라고 한다.

2. 활용 예
	1) 주로 고유의 numbering 을 이용해서, 데이터를 가져오거나,
		특정한 경우에 데이터를 입력시(primary key) 유일 식별자를 처리할 때 사용한다.
		주로 등록시 사용하는 경우가 많다.
		
	2) 기본형식
		- create sequence 시퀀스명;
		=> 기본적으로 1부터 1씩 무한대로 증가 시키는 시퀀스가 만들어진다.
		
		- create sequence 시퀀스명
			increment by 증가단위
			start with 시작번호
			minvalue 최소값
			maxvalue 최대값
			cycle|nocycle 최소/최대값에 이르러 반복수행
			cache n|nocache 속도 개선을 위한 메모리 캐시
			
		!주의 ) 시퀀스의 start with 속성값을 변경할 수 없기에 drop sequence 시퀀스명; 으로
			삭제해서 특정한 시작위치로 다시 시퀀시를 만들어 수행하여야한다. 
			
	3) 활용
		select 시퀀스명.nextval : 하나씩 증가하면서 데이터가져오기(계속증가)
		select 시퀀스명.curral : 현재 증가된 번호를 가져온다.(특정번호만 가져온다)

 * */
CREATE SEQUENCE seq01;

CREATE SEQUENCE seq02 
	START WITH 100;

SELECT seq01.nextval FROM dual;
SELECT seq02.nextval FROM dual;

SELECT seq02.nextval 증가번호, 'QA-'||seq02.currval 혼합된키 FROM dual;

CREATE TABLE STUDENT07 (
	sno char(6) PRIMARY KEY,
	name varchar2(50) NOT null
);

INSERT INTO student07 values('QA-'||seq02.nextval, '하길동');
-- 위와같이 고정된 문자를 조합해서 학번을 설정할 수 있다.

SELECT * FROM student07;

-- ex) 제품정보테이블(제품번호-고정 7자리, 제품명, 가격, 재고량) 있을때, 제약조건을
-- 설정해서 테이블을 만들고, 시퀀스와 조합해서 고유 제품번호 입력을 처리
CREATE TABLE prod(
	pno char(7) PRIMARY KEY,
	pname varchar2(50),
	price NUMBER,
	stock number
);

INSERT INTO prod values('P-'||seq01.nextval, '이어폰', 50000, 50 );
SELECT * FROM prod;