/*
# 테이블의 구조 변경
1. 테이블을 사용하다보면 여러가지 상황에 따라 테이블의 구조를 변경하는 경우가 발생한다.
	테이블의 구조를 변경하는데 필요한 명령어를 파악하고, 테이블 구조의 변경시 발생하는
	데이터 처리에 대한 내용을 파악해보자.
	
2. 테이블 구조의 변경 유형
	1) 컬럼의 추가, 컬럼의 삭제, 컬럼의 속성의 변경, 제약 조건의 추가/삭제/변경 등.
	
# 컬럼의 추가
1. 테이블에 컬럼을 추가하기 위해서는 아래의 기본구믄으로 처리한다.

2. 기본형식
	alter table 테이블명
	add 컬럼명 데이터유형[default 디폴트 데이터, 제약조건.. ]
 * */

SELECT * FROM emp02;
DROP TABLE emp02; -- 테이블 삭제
CREATE TABLE emp02 
AS SELECT empno, ename, job, sal FROM emp;
-- 선택한 컬럼으로 테이블 생성
SELECT * FROM emp02;
ALTER TABLE EMP02 ADD address varchar2(20) DEFAULT '주소입력없음';
-- 기본값으로 주소입력없음 이라는 컬럼 추가가 됨..

-- ex)emp08 로 부서번호, 사원명, 직책, 급여로 복사테이블을 만들고 
--	해당 테이블에 bonus 컬럼을 추가하고, 디폴트 0 ㄱㄱ
CREATE TABLE emp08 
AS SELECT deptno, ename, job, sal FROM emp;
ALTER TABLE emp08 ADD bonus NUMBER DEFAULT 0;
SELECT * FROM emp08;

/*
# 컬럼삭제
1. 테이블의 특정 컬럼과 컬럼의 데이터를 삭제 처리
2. 형식
	alter table 테이블명
	drop column 컬럼명
	
3. 주의사항
	1) 2개 이상의 컬럼이 존재하는 테이블에서만 삭제가능
	=> 하나의 컬럼을 삭제한 테이블에 대한 의미가 없기에 삭제 불가
	
	2) 한번에 하나의 컬럼만 삭제 가능
 * */
SELECT * FROM emp02;
ALTER TABLE emp02
DROP COLUMN ename;

-- ex) emp 테이블을 이용하여 emp08을 만들고 해당 테이블에 dname, loc 컬럼추가/deptno컬럼 삭제
ALTER TABLE emp08 ADD dname varchar2(50);
ALTER TABLE emp08 ADD loc varchar2(30);
ALTER TABLE emp08 DROP COLUMN deptno;
SELECT * FROM emp08;

/*
# 테이블 컬럼 변경
1. 테이블의 컬럼의 타입, 크기, 기본 값은 변경이 가능하다.
2. 기본 형식
	alter table 테이블명
	modify 컬럼명 변경할 타입/크기/기본값;
	
3. 변경시 주의사항
	0) 다른 유형으로는 변경 불가능(char<->varchar2 만 유형변경 가능 -> 데이터 있을때! 없을땐 아무렇게나 변경가능~)
	
	1) 해당 컬럼에 데이터가 없는 경우
	=> 컬럼의 타입이나 크기 변경이 자유롭다.
	
	2) 기존 데이터가 있는 경우
	=> 다른 타입 변경은 char/varchar2 만 허용된다.
	=> 변경한 컬럼의 크기가 저장된 데이트의 크기보다 같거나 클경우 변경가능
	=> 숫자 타입에는 정밀도를 증가시키는 것만 가능하다.
	
	3) 기본값의 변경은 변경 후에 입력되는 데이터 부터 적용된다.
	
# 테이블 컬럼명 변경
 * */
CREATE TABLE emp09
AS SELECT * FROM emp WHERE 1=0;
SELECT * FROM emp09;

-- 데이터가 없는 경우에는 타입 변경이 자유롭다.
ALTER TABLE emp09 MODIFY job number;

DROP TABLE emp10;
CREATE TABLE emp10 AS SELECT * FROM emp;
-- # 데이터가 있을 때
-- 1. 작은 데이터 유형에서 큰 데이터 유형 변경은 가능
ALTER TABLE emp10 MODIFY (ename varchar2(50), job varchar2(50), empno number);
SELECT * FROM emp10;

-- 2. 하지만 데이터 기준으로 데이터가 입력된 크기 이하로는 변경 불가
SELECT max(LENGTH(ename)) FROM emp10; -- =6
-- 저장된 데이터까지 변경하는것은 가능(큰=>작은도 되는데 입력된 데이터 값 미만으로는 못감)
ALTER TABLE emp10 MODIFY ename varchar2(6);

--ALTER TABLE emp10 MODIFY ename varchar2(5); 이건안됨 최대치가 6인데 6미만으로 떨어져버리면 에러

/*

 * */
CREATE TABLE emp12 
AS SELECT * FROM emp;

SELECT * FROM emp12;
RENAME emp12 TO emp12_new;

ALTER TABLE emp12_new 
RENAME COLUMN ename TO name;

-- ex) emp02테이블을 emp02_cpy로 변경하고,
--	empno -> ni, ename->name sal -> salary 변경

SELECT * FROM emp02_cpy;

RENAME emp02 TO emp02_cpy;

INSERT INTO emp02_cpy VALUES (1,'홍길동','사원',7777,sysdate,5000,100,10);

ALTER TABLE emp02_cpy 
RENAME COLUMN sal TO salary;

