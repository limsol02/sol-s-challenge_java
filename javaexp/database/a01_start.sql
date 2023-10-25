SELECT * FROM emp;
-- DB 주석문 커서를 해당 라인에 위치시키고
-- ctrl+enter로 명령 실행
/*
# 여러줄 주석문 처리
# 조회믄 기본처리
1. 데이터는 select구문을 이용하여 저장된 데이터를
	호출(query)할 수 있다.
2. 기본 형식
	select * : 전체컬럼 호출
			empno, ename : 특정컬럼 호출
	from 테이블 명; 마지막에 ; (세미콜론을 통해서 명령문 종료 처리)
 *  */
SELECT empno, ename, jop
FROM emp;
SELECT *
FROM emp;
-- ex1 ) emp 테이블의 ename, job, sal 컬럼을 선택하여 출력
SELECT ename, job, sal FROM emp;
-- ex2 ) dept 테이블의 deptno, dname 출력
SELECT deptno, dname FROM dept;
-- ex3 ) salgrade 테이블의 전체컬럼을 출력
SELECT * FROM SALGRADE ;

/*
# 컬럼명 별칭으로 사용하기
1. 모든 테이블의 구성요소 컬럼명은 select 컬럼명
	으로 사용하여 호출 할 수 있다.
2. 그러나, 특정한 경우에는 컬럼을 변경하거나,
	통합퇴 컬럼명으로 처리해야 하는 경우가 있다.
	ex ) 컬럼간의 연산, 문자열 연결
	select empno||ename 사원번호와 사원명
	DB에서는 + 숫자형 연산시에만 활용, 문자열 연결은 ||을 활용한다. 
3. 기본형식
	select 컬럼명 as 컬럼명별칭
		: as alias 로 지정하는 경우
	select 컬럼명 컬럼명별칭(약식)
		: 공백을 주고 컬럼명의 별칭을 사용하는 경우
4. 별칭컬럼명의 예외 사항
	1) 컬럼명은 특수 문자나 공백을 포함할 경우
		"특수문자"
		와 같이 ""사이에 넣어서 처리한다
		
 * */
SELECT empno, empno AS 사원번호별칭,
	   ename 사원명,
	   job "직 책?"
	FROM emp;
SELECT * FROM emp;
-- empno : 사원번호, ename : 사원명, job : 직책,==> 공백도 특수문자처럼 "" 안에 넣기
-- mgr : 관리자번호, hiredate : 입사일, sal : 급 여!
-- deptno : 부서번호 로 각 컬럼명을 alias를 사용하여 출력

SELECT empno AS 사원번호,
ename 사원명, job 직책,
mgr 관리자번호, hiredate 입사일, sal "급 여!",
deptno 부서번호 FROM emp;




