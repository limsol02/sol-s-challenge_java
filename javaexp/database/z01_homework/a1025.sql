
--급여에 10% 증가시킨 금액 조회
SELECT sal 기본급여, sal*1.1 "급여10%상승" FROM emp; 

--사원명과 입사일을 연결하여 조회
SELECT ename||'-'||hiredate "사원명-입사일" FROM emp;

--사원명과 해당 사원의 관리자번호와 연결하여 조회
SELECT ename||'-'||mgr "사원명-입사일" FROM emp;

--@@@(사원명)의 입사일은 @@@인데, 현재 급여와 보너스 합산액은 @@@이고,
--이중에서 8%인 @@@이 세금입니다.(출력)
SELECT ename || '의 입사일은 ' || hiredate || '인데, 현재 급여와 보너스 합산액은 ' || (sal + NVL(comm, 0)) || '이고, 이중에서 8%인 ' || ((sal + NVL(comm, 0)) * 0.08) || '이 세금입니다' FROM emp;
-- hiredate : 날짜형 ==> 특정한 형식으로 문자열로 보이고자 to_char()내장 함수사용
-- to_char(날짜,형식)


-- 관리자번호가 중복되지 않게 출력하세요
SELECT DISTINCT mgr 관리자번호 FROM emp;

-- WHERE조건문을 활용하여 아래내용 처리
-- 급여가 3000이상인 사원정보 출력
SELECT * FROM emp WHERE sal>=3000;

--부서번호가 10이고 급여가 4000미만인 사원정보 출력
SELECT * FROM emp WHERE DEPTNO=10 AND sal<4000;

--3. 컬럼=null과 컬럼 is null의 차이점을 sql을 통해서 설명하세요 
/*
 컬럼=null은 정보값이 없는 경우가 아니고 문자열 'null' 자체를 의미합니다. 
 컬럼 is null은 정보값이 null(정보값이 없는 상태)를 의미합니다
 * */
-- 간단한 예제를 들자면
SELECT * FROM emp WHERE comm=NULL; --이라고 쳤을때는 아무런 정보가 조회되지않지만,
SELECT * FROM emp WHERE comm IS NULL; -- 이라고 입력시에는 보너스 정보값이 없는 사람들을 출력해 줍니다.



