package Javaexp.a04_process;

import java.util.Scanner;

public class A09_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		1. 반복시, 최소한 1번을 수행하고, 반복을 중단 처리할 때
			사용하는 구문이 do{}while(조건); 구문이다.
		2. 기본 형식
			do{
				반복수행할 내용 :  최소 한번은 수행
			} while(반복조건);
		 * */
		//비밀번호 확인 올바른 비밀번호 입력까지 계속 비번 물어보는 내용
//		Scanner sc = new Scanner(System.in);
//		String corPass = "java123";
//		String inPass;
//		do { // 우선 수행할 내용 (최소 1번은 수행)
//			System.out.println("비밀번호를 입력 : ");//
//			inPass = sc.nextLine();
//		}while(!inPass.equals(corPass));{ 
//			// 비밀번호와 입력내용 같지 않을때 계속 반복
//			System.out.println("비밀번호 일치! 인증처리!");
//		}
		
		
		// ex1) 점수를 입력받아서 누적합을 출력하되, 종료시 0번을 입력처리
		// ex2) 컴퓨터와 숫자맞추기 게임, 컴퓨터의 임의의 숫자를
		//		맞출땎짜ㅣ 반복하는데, 중간에 보다 큰지 작은지 
		// 		hint 로 준다.
	
	// ex1) 점수를 입력받아서 누적합을 출력하되, 종료시 0번을 입력처리
		
		Scanner sc1 = new Scanner(System.in);
		int ptSum = 0;
		int pt;
		do{
			System.out.println("점수를 입력하세요 : ");
			pt = Integer.parseInt(sc1.nextLine()); 
			ptSum += pt;
			System.out.println("현재까지 누적합 : "  +ptSum);
		}while(pt!=0); 
		System.out.println("종료 ");
			
		
			// ex2) 컴퓨터와 숫자맞추기 게임, 컴퓨터의 임의의 숫자를
			//		맞출땎짜ㅣ 반복하는데, 중간에 보다 큰지 작은지 
			// 		hint 로 준다.
		int ran = (int)(Math.random()*50+1);
		int me ;
		do {
				System.out.println("1~50 중 생각하는 숫자가 ㅁㅓ야 ? ");
			me = Integer.parseInt(sc1.nextLine());
				if(ran>me) {
				System.out.println("hint : " + "컴퓨터의 숫자가 더 커");
			}   if(ran<me) {
				System.out.println("hint : " + "컴퓨터의 숫자가 더 작아");
			} 
		} while (ran!=me);
			System.out.println("정답~");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
