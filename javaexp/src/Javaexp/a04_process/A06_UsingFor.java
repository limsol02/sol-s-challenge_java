package Javaexp.a04_process;

public class A06_UsingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		#for문의 활용
		1. for문은 여러가지 출력 형식이나 지역변수/전역변수를 활용해서
			처리할 수 있다.
			1~10 합산
			전역변수 : 중괄호{} 위에 선언하여 누적된 데이터를
				처리할 때 사용한다
			cf) 전역변수 : 상대적인 개념이다 : 현재 블럭단위와
								하위에 블럭에 따라서 지역변수가 될 수
								있고 전역변수가 될 수 있다.(주의)
			코드1
			코드2
			블럭에 들어가기전에 선언한 변수는 이 코드 하위에 있는
			모든 블럭에 변수를 사용할 수 있다. : 전역변수 
			for(){
				블럭단위 안에서 선언되어 사용하는 변수
				==> 이 블럭 범위 안에서만 사용
				int num =25; 지역변수
				for(){
					num :  하위에 있는 중괄호 블럭에서 사용이 가능
				}
			}
			syso(num); ->(x)
			if(){}
			
			class클래스{
				void 기능메서드(){
					코드1
				}
			}
		2. for문은 if조건문과 함께 효과적으로 우리가 원하는 데이터를
			가지고 올 수 있다.
			
		 * */
		
		//출력형식
		//for문을 이용해서 여러가지 출력형식을 만들 수 있다.
		//1) 1+2+3+4....
		//2) 10!9!8!7!
		//3)  1  2  3  4  5
		int sum = 0; // 초기에 한번만 0으로 선언
//		cnt 1  2  3  4  5  6
//		sum 1  3  6  10 15 21
		for (int cnt=1;cnt<=10;cnt++) {
			sum+=cnt;
			System.out.println("합산값 : " + sum);
			System.out.print(cnt+"+");
		}
		System.out.println();
//		-----------------------------
		int sum2=55;
		for (int cnt=10; cnt>=0; cnt--) {
			sum2-=cnt;
			System.out.print(cnt+"!");		
		}
		System.out.println("감소되어 최종 sum2:"+sum2);
		System.out.println();
//		-------------------------------
		for(int cnt=1;cnt<=10;cnt++) {
			System.out.print(cnt+"\t");
		}
		System.out.println();
		
		
		for(int cnt=1;cnt<=10;cnt++) {
			if(cnt%3==0) {
				System.out.print("짝,");
		} else {
			System.out.print(cnt + ",");
		}
		}
		System.out.println();
		
		//1. for문은 여러가지 출력 형식이나
		//ex1) 100부터 120까지 아래와 같이 출력
		//		100  102  104  106....
		//ex2) 50부터 카운트 다운 10까지 
		//		50#45#40#...10
		//ex3) 과일의 단가 입력개당 @@@원
		//		1개 @@@원
		//		2개 @@@원
		//		.. 
		//		10개 @@@원
		
		System.out.println("1번예제");
		for(int cnt = 100; cnt<=120; cnt+=2) {
			System.out.print(cnt+"\t");
		}
		System.out.println();
		//-------------------
		System.out.println("2번예제");
		for(int cnt=50; cnt>=10; cnt-=5) {
			System.out.print(cnt+"#");
		}
		System.out.println();
		//----------------------
		System.out.println("3번예제");
		System.out.println("과일의 단가 입력 개당 : 300원");
		int pay = 300;
		for(int cnt = 1; cnt<=10; cnt++){
			System.out.println(cnt+"개"+"\t"+(pay*cnt)+"원");
		}
		
		
		
	
		
		
		
		//2. 지역변수/전역변수를 활용
		//ex1) 200+199+198+...+150
		//		합산: @@
		//ex2) 1~10까지 홀수의 합산/짝수의 합산
		//		홀수합 : @@, 짝수합 : @@
		//ex3) 1~10번의 학생의 임의 섬수(1~100사이)
		//		번호  점수
		//		1	 70
		//		2	 80
		//		3 	 90
		//		..
		//		10   54
		//		총점	@@
		//		평균 @@
		
		System.out.println("1번예제");
		int sum1= 0;
	
		for(int cnt=200; cnt>=150; cnt--) {
			sum1 += cnt;
		}
		System.out.println("150~200까지의 합산은 : " + sum1);
		//----------------------------------------------------------------
		System.out.println("2번예제");

		int odd = 0;
		int ad = 0;
		for (int cnt=1; cnt<=10; cnt++) {
			if(cnt%2==0){
				ad = ad+cnt;
		}else {
			odd = odd+cnt;
			}
		}
		System.out.println("짝수의 총합은:"+ad);
		System.out.println("홀수의 총합은 : " +odd);
		//----------------------------------------------------------
	
		int sum02= 0;
		System.out.println("번호\t점수");
		for (int ct=1; ct<=10; ct++){
			int score = (int)(Math.random()*101+1);
			sum02+=score;
			System.out.println(ct+"번"+"\t" + score);
			
		}
	
		System.out.println("총점:"+sum02);
		System.out.println("총점:"+(sum02/10));
		
		

		}		
}


