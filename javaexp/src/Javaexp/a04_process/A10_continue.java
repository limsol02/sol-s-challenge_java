package Javaexp.a04_process;

import java.nio.file.spi.FileSystemProvider;

public class A10_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		#반복문 제어 continue, break
		1. if문과 함께 주로 사용된다.
		2. continue : 해당 반복 step 에서 나머지 코드부분은 건너뛰고
		 	다음 step으로 진행
		3. break : 반복은 중단 처리..
		 * */
		int grade = (int)(Math.random()*8+2);
		for(int cnt = 1; cnt<=9; cnt++) {
			if(cnt==4) continue;// *4는 다음단계로 넘어갑니다.
			if(cnt==8) break;// *8일떄 반복 중지처리
			System.out.println(grade+ "x" +cnt +"=" + (grade*cnt));
		}
		
		//ex) 1~10까지 홀수만 출력
		for (int cnt=1;cnt<=10;cnt++) {
			if(cnt%2==0) continue; // 짝수일때는 다음으로 넘겨
			System.out.print(cnt+",");
		}
		System.out.println();
		
		//합계가 50이 넘는 시점에 출력및 중단처리..
		int sum=0;
		int cnt=0;
		while (true) {
			cnt++;
			sum+=cnt;
			if(sum>50) {
				System.out.println("합계가 50이 넘는 최초 : "+cnt);
				System.out.println("합계 :"+sum);
				break;
			}
		}
		
		//ex1) 1~50까지 출력하되, 5의 배수는 제외하고 출력
		System.out.println("5의배수만 빼고 1~50출력");
		for(int i=1; i<=50;i++) {
			if(i%5==0) continue;
			System.out.print(i+",");
		} 
		System.out.println();
		
		
		//ex2) 구구단 5단을 출력하되, *7일땐 중단처리
		System.out.println("구구단 5단에서 5x7부터 출력 안함");
		int five =5; //선언된 변수는 재할당하면 사용할 수 있따(grade=5라고 했어도 재사용가능)
		for(int dan =1; dan<=9;dan++) {
			if (dan==7) break;
			System.out.println(five+ "x" +dan +"=" + (five*dan));
		}
		
		System.out.println();
		
		
	}

}
