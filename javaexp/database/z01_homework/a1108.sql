-- 2. decode() 활용해서, 직책별 보너스를 각각 다르게 처리하여, %로 출력하고, sal에 적용하여 금액도 출력해보세요.
SELECT * FROM emp;
SELECT ename 이름, sal 월급, job 직책, comm 보너스,
decode(job,'SALESMAN',10,
			'MANAGER',20,
			'CLERK',30,
			5) "직책별보너스%", 
			sal+(sal*nvl(comm,0)) "총금액출력"
			FROM emp ORDER BY job;

-- 3. case when 활용해서, 11,12,1,2 겨울, 3,4,5 봄 6,7,8 여름, 9,10 가을 로 입사월을 기준으로 계절을 표시하세요.
SELECT * FROM emp;

SELECT ename 사원명, to_char(hiredate,'MM') "입사월",
	CASE WHEN  to_char(hiredate,'MM') >=3 AND to_char(hiredate,'MM')<=5  THEN '봄'
	WHEN to_char(hiredate,'MM') >=6 AND to_char(hiredate,'MM')<=8 THEN '여름'
	WHEN to_char(hiredate,'MM') >= 9 AND to_char(hiredate,'MM')<=10 THEN '가을'
	ELSE '겨울'
	END "입사월계절"
FROM emp ORDER BY to_char(hiredate,'MM');

--1)EMP 테이블에서 부서 번호가 [조건]인 모든 직원의 이름을 선택하세요.
--SELECT * FROM emp WHERE DEPTNO = 10;
--public List<Emp> getEname(int deptno){List<Emp> elist = NEW ArrayList<Emp>(); RETURN elist;}

--2)직원들 중에서 급여가 [조건] 이상인 사람들의 이름과 급여를 선택하세요.
--SELECT ename, sal FROM emp WHERE sal >= 3000;
--public List<Emp> getSal(double sal){
--	List<Emp> elist = NEW ArrayList<Emp>();
--	String SQL = "SELECT ename, sal FROM emp WHERE sal >= "+sal+" ";
--	return elist;
--}


--3)DEPT 테이블에서 모든 부서의 부서 번호와 부서 이름을 선택하세요.
--SELECT deptno,dname FROM DEPT  ;
--public List<Dept> getDept(){
--	List<Dept> dlist = NEW ArrayList<Dept>();
--	String SQL = "SELECT deptno,dname FROM DEPT";
--	RETURN dlist;
--}

--4)[조건]라는 이름을 가진 직원의 모든 정보를 선택하세요.
SELECT * FROM emp WHERE ename like '%A%';

--public List<Emp> getEmp(String ename){
--	List<Emp> elist = NEW ArrayList<Emp>();
--	String SQL = "SELECT * FROM emp WHERE ename like '%"+ename+""%'";
--	return elist;
--}

--5)각 부서별로 직원 수를 계산하세요.

SELECT count(*) FROM emp GROUP BY job;
--public List<Integer> count(String job){
--	List<Integer> cnt = NEW List<Integer>();
--	String SQL = "SELECT count(*) FROM emp GROUP BY "+job+"";
--	RETURN cnt;
--}

--6)EMP 테이블에서 직책이 [조건]인 모든 직원의 이름을 선택하세요.
SELECT ename, job FROM emp WHERE job LIKE '%A%';

--public List<Emp> getEname(String job){
--	List<Emp> elist = NEW ArrayList<Emp>();
--	String SQL = "SELECT ename, job FROM emp WHERE job LIKE '%"+job+"%'";
--	RETURN elist;
--}

--7)EMP 테이블에서 [조건]년에 입사한 모든 직원의 이름과 입사 날짜를 선택하세요.
SELECT ename, hiredate, to_char(hiredate,'YYYY') FROM emp WHERE to_char(hiredate,'YYYY')='1981' ;

--public List<Emp> getEmpInfo(String year){
--	List<Emp> elist = NEW ArrayList<Emp>();
--	String SQL = "SELECT ename, hiredate, to_char(hiredate,'YYYY') FROM emp WHERE to_char(hiredate,'YYYY')='"+year+"'";
--	RETURN elist;
--}
--8)EMP 테이블에서 급여가 [조건]에서 [조건] 사이인 직원들의 이름을 선택하세요.

SELECT ename, sal FROM emp WHERE sal BETWEEN 2000 AND 4000;\

--public List<Emp> getEmpInfo(int START, int end){
--	List<Emp> elist = NEW ArrayList<Emp>();
--	String SQL="SELECT ename, sal FROM emp WHERE sal BETWEEN "+start+" AND "+end+"";
--	RETURN elist;
--
--}
--9)EMP 테이블에서 직책별로 최고 급여를 받는 직원의 이름과 급여를 찾으세요.
SELECT ename, SAL FROM emp WHERE (job, sal) IN (SELECT job, MAX(sal) 최대급여 FROM emp GROUP BY job);

public List<Emp> getEmpInfo(String job, double sal){
	List<Emp> elist = NEW ArrayList<Emp>();
	String SQL = "SELECT ename, SAL FROM emp WHERE ("+job+", "+sal+") IN (SELECT "+job+", MAX("+sal+") FROM emp GROUP BY job)";
	returm elist;
}


--10)EMP 테이블에서 마지막 이름이 '[조건]'로 끝나는 직원들의 이름을 선택하세요.
SELECT ename FROM emp WHERE ename LIKE '%N';
--public List<Emp> getEmpInfo(String ename){
--	List<Emp> elist = NEW ArrayList<Emp>();
--	String sql = "SELECT ename FROM emp WHERE ename LIKE '%"+ename+"'";
--	RETURN elist;
--}


