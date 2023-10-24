package Javaexp.z01_homework;

import java.util.Random;
import java.util.Scanner;

public class Z01_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 컴퓨터와 하는 가위/바위/보 게임
		0. 배열로 가위/바위/보 선언
		1. 나는 Scanner에 의해 번호로 선택 (1.가위 2.바위 3.보)
		2. 컴퓨터는 랜덤
		3. 두개의 내용을 비교하여 승/무/패 결정
		4. 위 내용을 3회 반복 처리하여 승/무/패 누적
		 * */
		
		/*
					{"가위","바위","보"}
		chIdx		  0 	 1	   2
		comIdx		  0 	 1	   2
		1. 비길때, chIdx = comIdx
		
		2. 사용자 승리 chIdx  0  1  2    
					 comIdx  2  0  1  ==> (chIdx+2)%3==comIdx
		
		3. 사용자 패배 chIdx  0  1  2    
					 comIdx  1  2  3  ==> (chIdx+1)%3==comIdx
		 * */
		
		System.out.println("#컴퓨터와 하는 가위바위보 게임");
		String[] games = { "가위", "바위", "보" };
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int win, eq, def;
		win = eq = def = 0;
		// 승무패 선언

		for (int i = 0; i < 3; i++) {
			System.out.println("***"+i+1+"번째 게임***");
			System.out.print("(1.가위 2.바위 3.보) 중 번호를 입력하세요");
			int chIdx = sc.nextInt() - 1;
			String myChoice = games[chIdx];
			System.out.println("당신의 선택은 : " + myChoice);
			int comIdx = r.nextInt(3); // 0~2 임의로 나온다.
			String comResult = games[comIdx]; // 임의의 index로 컴퓨터 선택
			System.out.println("임의의 가위/바위/보(컴퓨터) : " + comResult);
			if (chIdx == comIdx) {
				System.out.println("무승부");
				eq++;
			} else if ((chIdx + 2) % 3 == comIdx) {
				System.out.println("사용자 승리");
				win++;
			} else {
				System.out.println("사용자패배");
				def++;
			}
		}
		System.out.println("#결과합계#");
		System.out.println("사용자 승리 횟수 : "+win+"\n무승부 횟수 : "+eq+"\n사용자 패배횟수 : "+def);
	}
	
	
//  #결과합계#
//	사용자 승리 횟수 : 3
//	무승부 횟수 : 0
//	사용자 패배횟수 : 0
//  운이좋네!
}
