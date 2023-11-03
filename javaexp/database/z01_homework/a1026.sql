/*
[1단계:개념] 7. 데이터베이스의 keyword 검색의 기본 형식을 예제를 통해서 기술하세요.
select (내가 원하는 애들입력) from (어느 테이블에서 가져올지 입력) where (내가 원하는 조건을 넣을 컬럼명 입력) like (그중에서도 원하는 정보값 조건명 입력);

[1단계:확인] 8. 사원정보를 정렬하여 출력하되 부서번호(deptno)를 1차(오름차순)로 급여(sal) 2차(내림차순)으로 부서번호, 급여, 사원명을 출력하세요.
 * */
SELECT deptno, sal, ename FROM emp ORDER BY deptno ;
SELECT deptno, sal, ename FROM emp ORDER BY sal DESC;