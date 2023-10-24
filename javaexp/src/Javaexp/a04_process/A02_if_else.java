package Javaexp.a04_process;

import java.util.Scanner;

public class A02_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		#if else 구문
		1. 특정 조건이 true/false 로 분기하여 처리해야하는 경우에
			주로 사용된다.
		 * */
		
		int iNum =3; // 입력한값
		if(iNum ==3) {
			System.out.println("3일때, 정답");
		}else {
			System.out.println("오답입니다.");
			}

		// ex) 컴퓨터가 1~5까지 임의로 저장할 때, -math
		//	입력한 데이터가 위 컴퓨터의 수를 맞추면 정답
		//	그 외는 오답을 출력하세요 스케너 활용
		
		//1)변수 지정해서 1~5 임의의 수 저장 hint)짝수/홀수 표시..
		//2)스캐너를 통해서 예상되는 수를 입력받게 처리
		//3) if else을 이용해서 맞추면 정답 그외에 오답
		
//		System.out.println("컴퓨터와 놀아용!");
//		int com = (int)(Math.random()*5+1); // 컴퓨터의 임의의 수
//		System.out.println("hint)");
//		if(com%2==0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//				
//			}
//		System.out.print("예상되는 수 입력 (1~5)");
//		Scanner sc = new Scanner(System.in);
//		int com1 = Integer.parseInt(sc.nextLine());
//		System.out.println("컴퓨터의 수 :" + com);
//		
//		if(com==com1) {
//			System.out.println("정답");
//		} else {
//			System.out.println("오답");
//		}
//		}
//		}
		

		int com = (int)(Math.random()*5+1);
		System.out.print("힌트");
		if(com%2==0) {
			System.out.println("짝수");
		} else{
			System.out.println("홀수");
			}
		System.out.println("예상하는 수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int com1 = Integer.parseInt(sc.nextLine());
		if (com==com1) {
			System.out.println("정답");
		} else {System.out.println("오답");
		}
		System.out.println("컴퓨터의 임의의 수 : " + com);
		
		
	
	}
}
