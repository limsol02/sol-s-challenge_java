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


SELECT ename FROM emp WHERE empno=7369;
-- 확인해야할 사원번호[ text입력 ] [검색]<= 버튼 : 사원번호를입력
-- 해당사원번호 해당하는 이름 @@@ 입니다. : 사원명을 출력 
-- ==> DB서버에 접속 해서 그 결과를 받고(sql) 그 결과를 자바 객체로 변경(기능메서드)하여 화면에 최종결과 출력.

/*
# sql연습
==> Java객체/변수로(기능메서드) 만드는방법
해당사원번호 해당하는 이름 @@@ 입니다. : 사원명을 출력 
ㄴ=> 여기서 출력할 내용을 메서드 리턴 유형과 리턴값으로 선언..

리턴유형 메서드명(입력값){
	return 실제리턴값;
}

### SELECT ename FROM emp WHERE empno=7369; ###
에서 출력할 ename 을 리턴유형으로 설정하고 입력해야할 empno를 입력할 매개변수로 설정
String getEname(int empno){
	String sql="SELECT ename FROM emp WHERE empno="+empno;
	String ename = null;
	return ename;
}
 * */

/*
확인할 사원명 : [  ] [급여검색]
해당 사원의 급여는 @@@ 입니다.
 * */
SELECT * FROM emp;
SELECT sal FROM emp WHERE ename='SMITH';
/*
public Double getSal(String ename){
	Double sal = 0;
	String sql = "SELECT sal FROM emp WHERE ename='"+ename+"'";
	return sal;
}  
 * */

-- 사원번호 : [] 검색! 시 해당사원의 직책은 @@@ 입니다. 
SELECT job FROM emp WHERE empno = 7369;
/*
public String getJob(int empno){
	String job = null;
	String sql = "SELECT job FROM emp WHERE empno = "+empno;
	return job;
}
 * */




/*
sql 데이터 웹화면에 보이고자 할때... 
java로 보일려고 하면
 * */


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


INSERT INTO test values(2,'김정현');
INSERT INTO test values(3,'이정현');


