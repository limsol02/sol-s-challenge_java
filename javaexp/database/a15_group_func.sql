/*
# 그룹함수란?
1. 테이블의 전체 행을 하나 이상의 컬럼을 기준으로 그룹화하여 그 함수를 말한다.
2. 그룹함수는 통계쩍인 결과를 출력하는데 자주 사용된다.
3. 형식
	select 그룹할 컬럼, 그룹함수(대상컬럼)
	from 테이블
	grpup by 그룹할컬럼
	having 그룹함수의 결과기준으로 조건처리
4. 그룹합수의 종류
	count() : 행의 갯수
	max () : null을 제외한 모든 행의 최대값
	min () : null을 제외한 모든 행의 최소값
	sum () : null을 제외한 모든 행의 합
	avg () : null을 제외한 모든 행의 평균값
	stddev(표준편차) , variance(분산)
 * */