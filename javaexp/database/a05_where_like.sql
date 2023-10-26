SELECT * FROM emp;

/*
# where 조건문 키워드 검색
1. 컬럼 like를 활용하면 빕슷한 키워드로 검색을 할 수 있다.
2. 기본형식
	1) where 컬럼명 like '%키워드%'
		키워드가 포함되면 검색 처리
	
	2) where 컬럼명 like '시작키워드%'
		해당문자여로 시작되면 검색
	
	3) where 컬러명 like '%키워드'
		해당 키워드로 끝나면 검색
		
	4) where 컬럼명 like '_A%'
		두번쨰 자리에 A가 포함되면 검색.
	
	5) where 컬럼명 like '__A__'
		전체자리수가 5자리이고, 3번쨰 문자가 
		A이면 검색
 * */
SELECT * FROM emp;

SELECT * FROM emp WHERE ename LIKE '%A%'; -- A가 포함되어 있는 사원명 검색
SELECT * FROM emp WHERE ename LIKE 'A%'; -- A로 시작되어 있는 사원명 검색
SELECT * FROM emp WHERE ename LIKE '%MAN'; -- MAN으로 끝나는 사원명 검색
SELECT * FROM emp WHERE ename LIKE '_A%'; -- 두번째자리 A가 포함되어 있는 사원명 검색
SELECT * FROM emp WHERE ename LIKE '__E__'; -- 다섯자리중에 3번쨰 자리에 E포함되어 있는 사원명 검색

-- ex) 앞에서 4,5번째 ES를 포함한 직책(job)이 있는 사원정보
SELECT *FROM emp WHERE job LIKE '___ES%';
-- ex) 뒤에서 세번쨰 자리에 M이 포함된 직책 검색
SELECT * FROM emp WHERE job LIKE '%M__';
-- ex) 자리수가 5자리 이고 중간에 I자가 포함된 사원명 검색
SELECT * FROM emp WHERE ename LIKE '__I__';






