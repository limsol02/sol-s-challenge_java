package Javaexp.z01_homework;

public class A1108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		
[1단계:개념] 1. decode(), case when구문의 기본 형식을 정리하세요 
=> decode() 같은 경우는 select deptno decode(deptno, (첫번째데이터)10, (두번째데이터)'A' , 20,'B', 'z'(그외나머지)) from emp;
이런식으로 select 뒤에 원하는 컬럼값을 입력하고 decode안에는 컬럽값이 첫번째데이터와 일치하면
두번째데이터로 할당되는 방식입니다. 그리고 첫번째데이터에 해당되지 않는 컬럼값들은 자연스럽게 나머지 데이터로 할당됩니다.

case when 구문 같은 경우는 decode()와 비슷하지만 select 출력할컬럼 case when sal(컬럼명)>=7000 then '할당할 데이터' "애칭" 형식으로
할당하고 마지막에 else뒤에 해당하지않는 조건을 가진 컬럼값들을 할당처리하며 end로 끝내게 됩니다.


[1단계:확인] 2. decode() 활용해서, 직책별 보너스를 각각 다르게 처리하여, %로 출력하고, sal에 적용하여 금액도 출력해보세요.

==> SELECT ename 이름, sal 월급, job 직책, comm 보너스,
decode(job,'SALESMAN',10,
			'MANAGER',20,
			'CLERK',30,
			5) "직책별보너스%", 
			sal+(sal*nvl(comm,0)) "총금액출력"
			FROM emp ORDER BY job;

[1단계:확인] 3. case when 활용해서, 11,12,1,2 겨울, 3,4,5 봄 6,7,8 여름, 9,10 가을 로 입사월을 기준으로 계절을 표시하세요.

==>SELECT ename 사원명, to_char(hiredate,'MM') "입사월",
	CASE WHEN  to_char(hiredate,'MM') >=3 AND to_char(hiredate,'MM')<=5  THEN '봄'
	WHEN to_char(hiredate,'MM') >=6 AND to_char(hiredate,'MM')<=8 THEN '여름'
	WHEN to_char(hiredate,'MM') >= 9 AND to_char(hiredate,'MM')<=10 THEN '가을'
	ELSE '겨울'
	END "입사월계절"
FROM emp ORDER BY to_char(hiredate,'MM');

[1단계:개념] 4. dao 처리를 위한 환경 구성을 기술하세요.

==> 우선 DB서버 구동을 해여야 합니다. DB서버구동에는 (ip, port, DB서버명, 계정, 비밀번호)가 필요하고
jdbc 드라이버가 필요합니다. 

[1단계:개념] 5. 연결객체의 주요 선언 내용를 기술하세요

==> Connection con(연결객체) / Statement stmt(대화객체) / PreparedStatement pstmt(보안된 대화객체)
ResultSet rs(결과처리객체) 가 있고 네가지 모두 필드의 private 로 선언합니다.


[1단계:개념] 6. 아래에 내용의 sql을 작성하고 해당하는 메서드를 선언하세요.
1)EMP 테이블에서 부서 번호가 [조건]인 모든 직원의 이름을 선택하세요.
		
==> 
public List<Emp> getEname(int deptno){
		List<Emp> elist = NEW ArrayList<Emp>();
		String sql = "SELECT * FROM emp WHERE DEPTNO = "+deptno+"";
		RETURN elist;
	}
		
2)직원들 중에서 급여가 [조건] 이상인 사람들의 이름과 급여를 선택하세요.

==>
 public List<Emp> getSal(double sal){
		List<Emp> elist = NEW ArrayList<Emp>();
		String SQL = "SELECT ename, sal FROM emp WHERE sal >= "+sal+" ";
		return elist;
	}		

3)DEPT 테이블에서 모든 부서의 부서 번호와 부서 이름을 선택하세요.
		
==> 
public List<Dept> getDept(){
		List<Dept> dlist = NEW ArrayList<Dept>();
		String SQL = "SELECT deptno,dname FROM DEPT";
		RETURN dlist;
	}

4)[조건]라는 이름을 가진 직원의 모든 정보를 선택하세요.
		
==> 
public List<Emp> getEmp(String ename){
	List<Emp> elist = NEW ArrayList<Emp>();
	String SQL = "SELECT * FROM emp WHERE ename like '%"+ename+""%'";
	return elist;
}

5)각 부서별로 직원 수를 계산하세요.

==>
 public List<Integer> count(String job){
	List<Integer> cnt = NEW List<Integer>();
	String SQL = "SELECT count(*) FROM emp GROUP BY "+job+"";
	RETURN cnt;
}

6)EMP 테이블에서 직책이 [조건]인 모든 직원의 이름을 선택하세요.

==> 
public List<Emp> getEname(String job){
	List<Emp> elist = NEW ArrayList<Emp>();
	String SQL = "SELECT ename, job FROM emp WHERE job LIKE '%"+job+"%'";
	RETURN elist;
}

7)EMP 테이블에서 [조건]년에 입사한 모든 직원의 이름과 입사 날짜를 선택하세요.

==>
public List<Emp> getEmpInfo(String year){
	List<Emp> elist = NEW ArrayList<Emp>();
	String SQL = "SELECT ename, hiredate, to_char(hiredate,'YYYY') FROM emp WHERE to_char(hiredate,'YYYY')='"+year+"'";
	RETURN elist;
}

8)EMP 테이블에서 급여가 [조건]에서 [조건] 사이인 직원들의 이름을 선택하세요.

==>
public List<Emp> getEmpInfo(int START, int end){
	List<Emp> elist = NEW ArrayList<Emp>();
	String SQL="SELECT ename, sal FROM emp WHERE sal BETWEEN "+start+" AND "+end+"";
	RETURN elist;
}

9)EMP 테이블에서 직책별로 최고 급여를 받는 직원의 이름과 급여를 찾으세요.
==>
public List<Emp> getEmpInfo(String job, double sal){
	List<Emp> elist = NEW ArrayList<Emp>();
	String SQL = "SELECT ename, SAL FROM emp WHERE ("+job+", "+sal+") IN (SELECT "+job+", MAX("+sal+") FROM emp GROUP BY job)";
	returm elist;
}

10)EMP 테이블에서 마지막 이름이 '[조건]'로 끝나는 직원들의 이름을 선택하세요.
==>
public List<Emp> getEmpInfo(String ename){
	List<Emp> elist = NEW ArrayList<Emp>();
	String sql = "SELECT ename FROM emp WHERE ename LIKE '%"+ename+"'";
	RETURN elist;
}
  
 * */

	}

}
