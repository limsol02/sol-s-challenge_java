package Javaexp.z01_homework.a;

public class A1108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
[1단계:개념] 1. decode(), case when구문의 기본 형식을 정리하세요 
[1단계:확인] 2. decode() 활용해서, 직책별 보너스를 각각 다르게 처리하여, %로 출력하고, sal에 적용하여 금액도 출력해보세요.
[1단계:확인] 3. case when 활용해서, 11,12,1,2 겨울, 3,4,5 봄 6,7,8 여름, 9,10 가을 로 입사월을 기준으로 계절을 표시하세요.
[1단계:개념] 4. dao 처리를 위한 환경 구성을 기술하세요.
[1단계:개념] 5. 연결객체의 주요 선언 내용를 기술하세요
[1단계:개념] 6. 아래에 내용의 sql을 작성하고 해당하는 메서드를 선언하세요.
		1)EMP 테이블에서 부서 번호가 [조건]인 모든 직원의 이름을 선택하세요.
		2)직원들 중에서 급여가 [조건] 이상인 사람들의 이름과 급여를 선택하세요.
		3)DEPT 테이블에서 모든 부서의 부서 번호와 부서 이름을 선택하세요.
		4)[조건]라는 이름을 가진 직원의 모든 정보를 선택하세요.
		5)각 부서별로 직원 수를 계산하세요.
		6)EMP 테이블에서 직책이 [조건]인 모든 직원의 이름을 선택하세요.
		7)EMP 테이블에서 [조건]년에 입사한 모든 직원의 이름과 입사 날짜를 선택하세요.
		8)EMP 테이블에서 급여가 [조건]에서 [조건] 사이인 직원들의 이름을 선택하세요.
		9)EMP 테이블에서 직책별로 최고 급여를 받는 직원의 이름과 급여를 찾으세요.
		10)EMP 테이블에서 마지막 이름이 '[조건]'로 끝나는 직원들의 이름을 선택하세요.

# 오전에 생각할 토론할 내용 제출 가능한 조는 결과로 제출
# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00)/과제제출 인원과 사유
3. 수업 시간 집중하였는가?   
  

1. Oracle SQL의 `DECODE()` 및 `CASE WHEN` 구문의 기본 형식:
   - `DECODE()` 함수는 다음 형식을 따릅니다:
     ```sql
     DECODE(column_or_expression, search1, result1, search2, result2, ..., default_result)
     ```
     이 구문에서 `column_or_expression`은 평가할 열이나 표현식이고, `search1`, `search2`, ...은 비교할 값이며, `result1`, `result2`, ...은 해당 값에 대한 결과입니다. `default_result`는 일치하는 `search` 값이 없을 때 반환됩니다.

   - `CASE WHEN` 구문은 다음 형식을 따릅니다:
     ```sql
     CASE
       WHEN condition1 THEN result1
       WHEN condition2 THEN result2
       ...
       ELSE default_result
     END
     ```
     여기서 `condition1`, `condition2`, ...은 평가할 조건이고, `result1`, `result2`, ...은 해당 조건이 참일 때 반환할 결과입니다. `default_result`는 어떤 조건도 참이 아닐 때 반환됩니다.

2. `DECODE()`를 활용한 직책별 보너스 적용 예제:
   ```sql
   SELECT ename, job, sal, 
          DECODE(job, 'MANAGER', sal * 0.1, 'ANALYST', sal * 0.2, 'CLERK', sal * 0.05, 0) AS bonus,
          sal + DECODE(job, 'MANAGER', sal * 0.1, 'ANALYST', sal * 0.2, 'CLERK', sal * 0.05, 0) AS total
   FROM emp;
   ```

3. `CASE WHEN`을 활용한 계절 표시 예제:
   ```sql
   SELECT ename, hiredate, 
          CASE 
            WHEN TO_CHAR(hiredate, 'MM') IN ('11', '12', '01', '02') THEN 'Winter'
            WHEN TO_CHAR(hiredate, 'MM') IN ('03', '04', '05') THEN 'Spring'
            WHEN TO_CHAR(hiredate, 'MM') IN ('06', '07', '08') THEN 'Summer'
            WHEN TO_CHAR(hiredate, 'MM') IN ('09', '10') THEN 'Fall'
          END AS season
   FROM emp;
   ```

4. DAO 처리를 위한 환경 구성:
   - 데이터베이스 드라이버를 포함: 오라클을 사용하기 위한 JDBC 드라이버를 애플리케이션의 클래스패스에 포함합니다.
   - 데이터베이스 연결 정보 설정: URL, 사용자 이름, 비밀번호 등을 포함한 데이터베이스 연결 정보를 설정합니다.
   - DAO 클래스와 인터페이스 작성: 데이터베이스 작업을 수행할 메소드를 정의합니다.
   - 예외 처리: SQLException을 포함하여 데이터베이스 작업 중 발생할 수 있는 예외를 처리합니다.

5. Java 데이터베이스 연결 객체의 주요 선언 내용:
   - `DriverManager`: JDBC 드라이버 관리자를 사용하여 데이터베이스 연결을 가져옵니다.
   - `Connection`: 데이터베이스와의 연결을 나타내며, 연결을 통해 SQL 명령을 실행합니다.
   - `Statement` / `PreparedStatement`: SQL 문을 데이터베이스로 전송하고 실행합니다.
   - `ResultSet`: SQL 쿼리의 결과를 나타냅니다.

6. 오라클 SCOTT 계정 SQL 작성과 Java DAO 메소드 선언:

1. SQL 쿼리:
   ```sql
   SELECT ename FROM emp WHERE deptno = :deptno;
   ```
   Java DAO 메서드:
   ```java
   List<String> findEmployeeNamesByDepartment(int deptno);
   ```

2. SQL 쿼리:
   ```sql
   SELECT ename, sal FROM emp WHERE sal >= :salary;
   ```
   Java DAO 메서드:
   ```java
   List<Employee> findEmployeesWithSalaryAbove(double salary);
   ```

3. SQL 쿼리:
   ```sql
   SELECT deptno, dname FROM dept;
   ```
   Java DAO 메서드:
   ```java
   List<Department> findAllDepartments();
   ```

4. SQL 쿼리:
   ```sql
   SELECT * FROM emp WHERE ename = :ename;
   ```
   Java DAO 메서드:
   ```java
   Employee findEmployeeByName(String ename);
   ```

5. SQL 쿼리:
   ```sql
   SELECT deptno, COUNT(*) AS emp_count FROM emp GROUP BY deptno;
   ```
   Java DAO 메서드:
   ```java
   class DeptCount{
   	   private int deptno;
   	   private int count;
   }
   public DeptCount getEmpDeptCount();  
   Map<Integer, Integer> countEmployeesByDepartment();
   ```

6. SQL 쿼리:
   ```sql
   SELECT ename FROM emp WHERE job = :job;
   ```
   Java DAO 메서드:
   ```java
   List<String> findEmployeeNamesByJob(String job);
   ```

7. SQL 쿼리:
   ```sql
   SELECT ename, hiredate FROM emp WHERE EXTRACT(YEAR FROM hiredate) = :year;
   ```
   Java DAO 메서드:
   ```java
   List<Employee> findEmployeesByHireYear(int year);
   ```

8. SQL 쿼리:
   ```sql
   SELECT ename FROM emp WHERE sal BETWEEN :minSalary AND :maxSalary;
   ```
   Java DAO 메서드:
   ```java
   List<String> findEmployeeNamesBySalaryRange(double minSalary, double maxSalary);
   ```

9. SQL 쿼리:
   ```sql
   SELECT job, MAX(sal) FROM emp GROUP BY job;
   ```
   Java DAO 메서드:
   ```java
   Map<String, Double> findMaxSalaryByJob();
   ```

10. SQL 쿼리:
    ```sql
    SELECT ename FROM emp WHERE ename LIKE '%' || :lastNameSuffix;
    ```
    Java DAO 메서드:
    ```java
    List<String> findEmployeeNamesEndingWith(String lastNameSuffix);
    ```




4. 토론 주제:

- **DAO 패턴을 사용하지 않는 경우의 잠재적 문제점:**
  - **유지보수성 감소**: 데이터베이스 로직이 애플리케이션 코드와 혼합되어 있으면, 변경 사항이 생겼을 때 해당 로직이 있는 모든 곳을 찾아 수정해야 합니다.
  - **재사용성 부족**: 데이터베이스 코드가 분산되어 있어, 같은 코드를 다른 곳에서 재사용하기 어렵습니다.
  - **테스트 어려움**: 데이터베이스 연산이 애플리케이션 코드에 밀접하게 결합되어 있어, 독립적인 단위 테스트가 어려워집니다.
  - **의존성 문제**: 데이터베이스의 변경이 애플리케이션 코드에 직접적인 영향을 미쳐, 다른 데이터베이스나 스키마로 전환하기 어려워집니다.

- **DAO와 DTO의 차이점과 역할:**
  - **DAO (Data Access Object)**: 데이터베이스와의 상호작용을 담당하는 객체로, 데이터베이스 쿼리 실행, 데이터 저장, 조회 등의 작업을 수행합니다. 이는 데이터베이스 연산을 추상화하여, 데이터 소스의 변경에 독립적인 코드를 작성할 수 있게 해줍니다.
  - **DTO (Data Transfer Object)**: 계층 간 데이터 교환을 위한 객체로, 주로 데이터베이스 레코드의 데이터를 서비스 또는 컨트롤러 계층으로 전달하는 데 사용됩니다. DTO는 로직을 포함하지 않으며, 단지 데이터를 담는 컨테이너 역할을 합니다.

- **DAO 패턴과 객체 지향 프로그래밍 원칙의 부합성:**
  - **단일 책임 원칙 (Single Responsibility Principle)**: DAO는 데이터 접근에 대한 책임만 지며, 비즈니스 로직이나 프레젠테이션 로직과 분리됩니다.
  - **개방-폐쇄 원칙 (Open/Closed Principle)**: DAO 인터페이스는 확장에 열려 있고, 변경에 닫혀 있어, 다른 데이터베이스 구현으로 확장할 수 있지만, DAO 인터페이스 자체는 변경할 필요가 없습니다.
  - **의존성 역전 원칙 (Dependency Inversion Principle)**: 상위 모듈이 하위 모듈의 구현 세부사항에 의존하지 않고, 인터페이스를 통해 의존성을 역전시킵니다.

5. 간단한 퀴즈:

- **DAO 패턴의 주된 목적:** 데이터 액세스 로직과 비즈니스 로직을 분리하여, 데이터 소스의 변경이나 다른 데이터베이스로의 전환에 대한 유연성을 높이고 유지보수를 용이하게 하는 것입니다.
  
- **데이터베이스 연결을 관리하는 자바 클래스 라이브러리 이름:** JDBC (Java Database Connectivity) API입니다.

- **CRUD 작업의 DAO 메서드 시그니처 예시 (Create 작업):**
  ```java
  public boolean createEmployee(Employee employee);
  ```
  이 메서드는 `Employee` 객체를 받아 데이터베이스에 새 직원을 추가하는 역할을 수행합니다. 메서드는 작업의 성공 여부를 나타내는 boolean 값을 반환합니다.
  
  
  
 * */
	}

}
