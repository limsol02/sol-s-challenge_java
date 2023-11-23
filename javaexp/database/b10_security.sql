/*
# 데이터베이스 보안을 위한 설정
1. 데이터베이스 관리자(DBA)는 사용자가 데이터베이스 객체(테이블, view, sequence)에 대한
특정 권한을 가질 수 있게 하며, 다수의 사용자가 데이터베이스에 저장된 정보를 공유하면서도 
정보에 대한 권한이 이루어지게 한다. 

2. DB 서버에 접근시, 필요한 사용자 계정/암호를 통해 로그인 인증을 받는다.

3. 권한의 역할과 종류
	1) create user : 사용자를 새롭게 생성하는 권한
	2) drop user : 사용자를 삭제하는 권한
	3) drop any table : 테이블을 삭제하는 권한
	4) query rewrite : 함수 기반 인덱스 생성 권한
	5) backup any table : 테이블 백업 권한
	6) create session : 데이터베이스에 접속할 수 있는 권한
	7) create table/view/sequence/procedure : 데이터베이스의 객체를 생성하는 권한
	
	8) resource : 여러 객체들을 생성/ 사용 가능한 권한
	9) dba : 관리자 권한으로 계정을 생성하고, 권한을 부여할 수 있는 권한
	
# 추가 사용자 생성하기
1. system 관리자 계정으로 접근하여 scott에 dba 권한을 부여하여
    계정 생성과 권한 부여가 가능하게 하여야 한다.
    
2. 권한 부여
    system/1111
    grant dba to scott;
    
3. 사용자 생성
    create user 사용자명 identified by 비밀번호;
    ex) create user user01 identified by 7777;
    
4. 권한 부여
    grant 권한명 to 계정명;
    create session - 접속권한
    ex ) grant create session to user01;
    
    conn user01/7777;
**/