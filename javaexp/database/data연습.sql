SELECT * FROM emp WHERE ename LIKE '%A%';
-- 리턴할 객체 List<Emp>	getList(String name)
/*
private int empno;
private String ename;
private String job;
private int mgr;
private Date hiredate;
private double sal;
private double comm;
private int deptno;
 */

SELECT * FROM member01;
CREATE TABLE member01(
	mno NUMBER, 
	name varchar2(30),
	id varchar2(30),
	pwd varchar2(30),
	auth varchar2(30),
	point NUMBER
);

INSERT INTO member01 values(1,'홍길동','himan','7777','관리자',1000);
INSERT INTO member01 values(2,'김길동','hello','7777','일반',500);
INSERT INTO member01 values(3,'핵길동','badman','7777','일반',800);
INSERT INTO member01 values(4,'팍길동','goodman','7777','준관리자',1500);
SELECT max(sal) FROM emp WHERE deptno=10;
-- ex) 위 구문 처리할 때 메서드 선언..
-- public double getMax(int deptno){double max = 0; return max;}

SELECT ename FROM emp where empno = 7369;
-- public String getEname(int empno){String ename=""; return ename}

SELECT hiredate FROM emp WHERE ename = 'SMITH';
-- public Date getHiredate(String ename){Date hire=null; return hire;}

SELECT empno, ename, job FROM emp WHERE empno=7369;
-- empno, ename, job 데이터 유형 확인
-- int 	  String String 
-- ==> VO 처리 필수(여러개의 열 인경우)
/* 
 public EmpShort getEmpSht(int empno){ EmpShort es =null; return es;}
기존의 Emp안에 포함되어 있다면, 추가할 필요 없이 재활용 가능
 class EmpShort{
 	private int empno;
 	private String ename;
 	private String job;
 	//1. 기본생성자 2.매개변수생성자 3.set/get메서드 선언..
 	}
 * */

SELECT count(*) FROM DEPT d WHERE deptno=10;
-- public int getCount(int deptno){int cnt=0; return cnt;}

SELECT * FROM dept WHERE dname='ACCOUNTING';
--  public class Dept{
--		private int deptno;
-- 		private String dname;
-- 		private String loc;
-- 		밑에 이제 생성자1,2 set/get 넣기}
-- pubulic Dept getDetp(String dname){Dept d01=null; return d01;}

/* 한개의 열에 여러 행이 있는 리턴값, 입력값은 2개(숫자형) */
SELECT ename FROM emp WHERE sal BETWEEN 1000 AND 2000;
/*
## List<데이터유형>
==> List<String>, List<Integer>, List<Double>, List<Date>
public List<String> getEnames(int start, tne end){}
 * */

SELECT sal FROM emp WHERE deptno=10;
/*
 public List<Double> getSal(int deptno){
		List<Double> sal = new ArrayList<Double>();
		String sql = "SELECT sal FROM emp WHERE deptno="+deptno+"";
		return sal;
	}
 * */

SELECT * FROM emp WHERE sal BETWEEN 1000 AND 3000;
/*
public List<Emp> getEmpList(int start, int end){
	List<Emp> emplist = new ArrayList<Emp>();
	String sql="SELECT * FROM emp WHERE sal BETWEEN "+start+" AND "+end+"";
	return emplist;
}
 * */
SELECT * FROM dept WHERE dname LIKE '%S%';
/*
- 행이 여러개인지? List(여러개)
- 열이 여러개인지? 단일타입 String/int/double=2단계 + 객체 클래스선언


 public List<Dept> getDList(String dname){
 	List<Dept> dlist = new ArrayList<Dept>();
 	String sql = "SELECT * FROM dept WHERE dname LIKE '%"+dname+"%'";
 	return dlist;
 }
 * */
CREATE TABLE MEMBER01(
	mno NUMBER,
	name varchar2(50),
	id varchar2(50),
	pwd varchar2(30),
	auth varchar2(20),
	point NUMBER );

/*
class Member{
	private int mno;
	private String name;
	private String id;
	private String pwd;
	private String auth;
	private int point;
}
 * */

SELECT * FROM member01;

INSERT INTO member01 values(1,'홍길동','himan','7777','admin',1000);
INSERT INTO member01 values(2,'김길동','goodman','7777','normal',2000);
/*

 * */

-- 회원가입
/*
INSERT INTO member01 values(1,'홍길동','himan','7777','admin',1000);
public void insertMember(Member ins){}
 * */
-- 회원리스트확인
SELECT * FROM member01 WHERE name LIKE '%길동%';
/*
 SELECT * FROM member01 WHERE name LIKE '%길동%';
 public List<Member> schMember(String nameSch)
 * */
-- 로그인처리


SELECT * FROM dept01;
DELETE FROM dept01 WHERE DEPTNO=0;

SELECT * FROM emp02;

CREATE TABLE emp02 as SELECT * from emp;

CREATE TABLE USER(
NO number, 
name varchar2(30),
id varchar2(30),
pwd varchar2(30),
address varchar2(100),
phone varchar2(15),

);


-- 유저 테이블
CREATE TABLE Users (
	userno number PRIMARY KEY, -- 회원번호(기본키)
    UserID VARCHAR2(30) PRIMARY KEY, -- 유저아이디(기본커)
    Name VARCHAR2(30) NOT NULL, -- 유저이름
    Username VARCHAR2(30) UNIQUE, -- 닉네임
    Password VARCHAR2(30) NOT null, -- 비밀번호
    Address VARCHAR2(100) NOT null, -- 주소
    PhoneNumber VARCHAR2(15) NOT null, -- 핸드폰 번호
    PetStatus CHAR(1) CHECK (PetStatus IN ('Y', 'N')), -- 반려동물 여부
    SubStatus CHAR(1) CHECK (SubscriptionStatus IN ('Y', 'N')), -- 구독여부
    Role VARCHAR2(10) CHECK (Role IN ('Admin', 'User')) -- 역할
);

-- 멍멍 테이블
CREATE TABLE Pets (
    petno NUMBER PRIMARY KEY, -- 멍멍번호(기본키 엮을꺼임)
    PetName VARCHAR2(30) NOT null, -- 멍멍이름
    PetType VARCHAR2(30) NOT null, -- 멍멍?야옹?꿀꿀?찍찍?
    Breed VARCHAR2(50), -- 멍멍 종류(선택란)
    Age NUMBER NOT null, -- 멍멍 나이
    Gender CHAR(1) CHECK (Gender IN ('F', 'M') , -- 동물 성별 
    Neutered CHAR(1) CHECK (Neutered IN ('Y', 'N')), -- 중성화 여부
    Weight NUMBER, -- 몸무게 (선택기입)
    ImageURL VARCHAR2(255), -- 이미지파일 첨부
    FOREIGN KEY (petno) REFERENCES Users(userno) -- 테이블 엮기
);


SELECT * FROM LOCATIONS;
-- 단위 객체 VO 설정 할 속성과 타입
/*
 * resultType을 쓰는 경우는 단위/다중리스트 상관없이 컬럼명 property를 동일하게 사용할수 있을 때..
class Location{
	private int location_id;
	private String street_address;
	private String postal_code;
	private string city;
	private String state_province;
	private String country_id;
}
 * */
CREATE TABLE emp01(
	id varchar2(100)
);

SELECT * FROM jobs;
/*
private String job_id;
private String job_title;
private int min_salary;
private int max_salary;
 * */

SELECT * FROM emp WHERE job LIKE '%'||''||'%' AND ename LIKE '%'||''||'%';

/*
 * 
 * SELECT * FROM emp WHERE job LIKE '%'||''||'%' AND ename LIKE '%'||''||'%';
private int no; // emp
private String name; // ename 
private double salary; // sal
private String grade; // job
 * */
