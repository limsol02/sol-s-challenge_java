-- 기본적으로 조회하는거
SELECT * FROM emp;
-- 원하는 컬럼만 조회(empno만 조회)
SELECT EMPNO  FROM emp ;
-- 원하는 컬럼에서 원하는 정보만 조회(대소문자 구분함)
SELECT ename FROM emp WHERE ename LIKE '%M%';
SELECT sal FROM emp WHERE sal BETWEEN 2000 AND 4000; 
-- 오름차순 내림차순(where 없다~~ 바로 테이블 다음에 order by 쓰고 원하는 컬럼명 쓰기)
SELECT * FROM emp ORDER BY sal DESC;
-- 다 대문자 소문자 변경
SELECT * FROM emp WHERE upper(ENAME) LIKE '%'||UPPER(m)||'%'; 
-- 테이블 만들기
CREATE TABLE bong(--안에 숫자형이면 number(숫자길이, 소수점)/varchar2(글자크기)... 넣기 );
-- 테이블 복사하기
CREATE TABLE bong AS SELECT * FROM emp;
-- 정보넣기
INSERT INTO bong values(--정보값 집어넣기)
-- 특정 정보 수정하기
UPDATE bong SET --내가 수정할 데이터들 입력(이름=임솔 꼴로 컬럼과 데이터를 함께)
WHERE -- 어떤 데이터상의 데이터를 수정할껀지 컬럼과 데이터명 (아파트=삼신아파트)
