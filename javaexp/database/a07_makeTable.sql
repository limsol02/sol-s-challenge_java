/*
# 테이블 생성
1. 데이터베이스에서 핵심 객체인 테이블을 생성하여 데이터를
	저장, 수정, 삭제, 조회를 할 수 있게 해보자.
2. 테이블 생성 단계별 락습
	1) 테이블의 구성요소 확인
		컬럼 : 테이블은 컬럼이라는 구성요소로 되어있는데,
			각 컬럼은 데이터 유형과 이름 그리고 제약조건이라는 
			설정을 할 수 있다.
			이번장에서는 데이터 유형과 이름 설정까지 하도록 한다.
	
	2) 데이터 유형
		
		1] number : 숫자형 유형
			- number : 정수와 실수가 모두 입력되는 기본 유형의 숫자형 타입
			number(전체자리수, 소수점이하자리수)
		
		2] varchar2(byte) : 가변형 문자열
			- 최대크기를 설정하여, 그 이하의 데이터를 입력할 수 있다.
			varchar2(10)
				최대문자열 10bytes
				10byte이하의 문자열을 저장하고, 
				해당 크기만큼 메모리를 사용한다.
				==> 'himan' 할당된 경우 5byte 메모리를 이용하여 할당이 된다.
				==> '안녕하세요' 3X5 = 15byte 라서 할당자체가 되지않는다. 
					(최대값을 넘었기때문..)
				- 영문은 글자10, 한글은 오라클에서는 3byte가 한글자이기에
				한글은 3글자까지만 입력이 가능하다.
			
		3] char(byte) : 고정형문자열
			- 해당 설정한 데이터 크기로만 메모리를 할당하는 데이터 유형이다
			char(10) : 최대크기보다 작은 데이터가 입력가능하나
				메모리는 10byte가 할애되고 나머지는 공백이 할당된다.
				
		4] date : 날짜형 유형
			- 1/1000 초부터 초,분,시 / 일,월,년도 등과 같이 날짜관련 데이터를 저장한다.
			ps) sysdate라는 내장형 날짜 데이터를 통해서 오늘 현재시간의 
				날짜형 데이터를 입력할 수 있다. 
				
	3) 테이블 선언과 활용 
		create table 테이블명(
			컬럼명1 데이터유형 [제약조건-선택],
			컬럼명2 데이터유형,
			컬럼명3 데이터유형,
			컬럼명4 데이터유형,
			..
		);
		기존의 테이블 기반으로 테이블 생성
		==> 구조 + 데이터 (모두 복사)
		create table 테이블명
		as select * from 테이블;
		
		==> 컬럼구조만 복사하고 싶은경우(데이터는 복사안됨)
		create table as select * from 테이블명 where 1=0 ;
		
		==> 이름을 변경하거나 구조의 일부를 선택적으로 복사
		create table 테이블명 as select empno no, job, to_char(sal) salStr 
		// 숫자형데이터-> to_char로 문자형으로 변환 
		from emp;
	
	4) 데이터 등록
		- 전체 컬럼 등록
		=> insert 테이블명 values(실제 데이터1, 데이터2...)	
		- 특정 컬럼 등록
		=> insert 테이블명(컬럼1, 컬럼2) values(실제 데이터1, 데이터2...)	
		
	5) 테이블 수정
	 	update 테이블명
	 		set 컬럼명 = 수정할데이터,
	 			컬럼명 = 수정할데이터
	 			...
	 		where 비교/논리연산자 조건
	 		
	 6) 데이터 삭제
	 	delete
	 	from 테이블명
	 	where 비교/논리연산자 조건
 * */

-- 번호, 이름, 국어점수, 영어점수, 수학점수 student 테이블 생성.

CREATE TABLE student(
	NO number(3,0), --3자리에 소수점이하 필요없어요
	name varchar2(50), --최대자리수 50자리
	kor number(3,0), 
	eng number(3,0) ,
	math number(3,0) 
);
SELECT *FROM STUDENT;
INSERT INTO STUDENT values(1, '홍길동', 70,80,90);

-- ex) 물건정보를 넣는 테이블 product 
-- 물건번호(정수5자리), 물건명, 가격
CREATE TABLE product (
	NO number(5,0),
	name varchar2(50),
	price number(10,0)
);
SELECT * FROM product;
INSERT INTO PRODUCT values(10001 ,'커피',1600);
INSERT INTO PRODUCT values(10002 ,'바나나',4000);
INSERT INTO PRODUCT values(10003 ,'딸기',12000);

-- 사원정보 복사테이블
CREATE TABLE emp01
AS SELECT * FROM emp;
SELECT *FROM emp01;
-- 복사테이블은 제약조건을 복사하지는 않는다.

-- 사원정보의 구조만 복사하는 테이블
CREATE TABLE emp02 
AS SELECT * FROM emp WHERE 1=0;
SELECT * FROM emp02;

-- ex) detp01(전체복사), detp02(구조만 복사)
CREATE TABLE detp01 AS SELECT * FROM DEPT;
SELECT * FROM detp01;

CREATE TABLE detp02 AS SELECT * FROM DEPT WHERE 1=0;
SELECT * FROM detp02;

-- 사원정보중에 급여가 2000~4000 사이이고, 사원번호(no) 사원명(name) 급여로 된 테이블 생성
SELECT * FROM emp;
CREATE TABLE emp03
AS SELECT  empno NO, ename name, sal 
FROM emp 
WHERE sal BETWEEN 2000 AND 4000;

SELECT * FROM emp03;


















