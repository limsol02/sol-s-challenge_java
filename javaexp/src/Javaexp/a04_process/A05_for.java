package Javaexp.a04_process;

public class A05_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		# 반복문 for
		1. 특정 step단위로 반복문을 수행할 때, 사용된다.
		2. 기본 형식 
			-for(초기값;반복조건;증/감연산자){
				반복해서 수행할 구문
			}
			-for(;;){}
		3. 기본 구성 요소 내용
			1) 초기값 : 반복구문에 사용할 변수의 최초값
				설정할 때, 선언한다.
				한번만 수행한다. 
				일반적으로 최소값인데, 역순위로 처리할 때는
				최대값을 넣는다.
			2) 반복조건 : for문을 반복한 조건 또는 한계치를
				지정할 때, 사용한다.
				cnt <= 10 : 증가시 10까지 반복
				cnt >= 10: 감소시 0까지 반복
			3) 반복해서 수행할 구문 : 실제 {}(중괄호)로 반복할 내용
			4) 증/감 연산자 : 증가/감소 처리
				cnt++ : 1씩 증가
				cnt-- : 1씩 감소
				cnt+=3 : 3씩 증가
				cnt-=2 : 2씩 감소
		 * */
		
		for(int cnt=1;cnt<=10;cnt++) {
			System.out.println("카운트 업 : "+cnt);
		}
		for(int cnt=10;cnt>=0;cnt-- ) {
			System.out.println("카운트 다운 : "+cnt);
		}
		//100~150 
		for(int cnt=100;cnt<=150;cnt+=5) {
			System.out.println("카운트 +5씩 : "+cnt);
		}
		//50~30
		for(int cnt=50;cnt>=30;cnt-=3) {
			System.out.println("카운트 -3씩: "+cnt);
		}
		
		// EX1) 2부터 15까지 짝수로 증가
		// EX2) 9부터 2까지 홀수로 감소
		// EX3) 구구단의 3단에 1~9까지 곱셈결과출력
		
		for (int cnt = 2; cnt<=15; cnt+=2) {
			System.out.println("2~15까지 짝수로 증가"+cnt);
		}
		System.out.println("");
		
		for (int cnt = 9; cnt>=2; cnt-=2) {
			System.out.println("2~15까지 짝수로 증가" +cnt);
		}
		System.out.println();
		
		int a = 1;
		for(int cnt=3; cnt<=27; cnt+=3) {
			System.out.println("구구단 3단 : "+"3"+"X" + (a++) +"=" +cnt );
		}
		System.out.println("");
		
		for(int grade =1;grade<=9;grade++) { //1~9단
//		int grade = 3; --> 3단만
		for(int cnt=1; cnt<=9; cnt++) {
			System.out.println(grade+"x"+cnt+"="+(grade*cnt));
		}
		}
	}

}
