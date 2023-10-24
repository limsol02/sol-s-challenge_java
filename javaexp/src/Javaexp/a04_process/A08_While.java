package Javaexp.a04_process;

import java.util.Scanner;

public class A08_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		# While문 : 조건에 따라 반복을 계속할지 결정하는 경우에 활용하는 반복문
		1. 기본형식
			-while(반복할 조건){
				반복할 조건이 true일 때, 처리할 내용
			}
			무한 반복 안에서 break
			-while(true){
				처리할 내용
				if(반복문을 벗어날 조건){
					break;
				}
			}
		 * */
	
		int cnt = 1;
		while (cnt<=10) {
			System.out.println((cnt++)+"번째 반복");
		}
		// ex1) while문을 이용해서 10~20까지 출력하세요..
		// ex2) 아래 Scanner를 이용해서 회원명을 등록하고 종료시 !로 처리하세요
		
		System.out.println("ex1)");
		int i=10;
		while (i<=20) {
			System.out.println((i++) +"번째 출력" );
		}System.out.println();
		
//		// ex2) 아래 Scanner를 이용해서 회원명을 등록하고 종료시 !로 처리하세요
//		System.out.println("ex2)");
//		Scanner sc = new Scanner(System.in);
//		
//		String name = "";
//		String data = "회원명\t포인트\n";
//		while (!name.equals("!")) {
//			System.out.print("회원명을 입력하세요(종료시 !) : ");
//			name = sc.nextLine();
//			if (!name.equals("!")) {
//				data += name + "\t"; // 회원명 누적
//				System.out.println("기본 포인트 입력");
//				name = sc.nextLine(); //회원 포인트 누적
//				data+= name +"\n";
//				
//			}
//					}
//		System.out.println("#등록회원정보#");
//		System.out.println(data);
//		
//		//------------------------------------
//		// 구매할 과일명을 입력받아 리스트하고, 종료할 때, Q를 입력처리
//		
//					
//		
//		String fruitList = "";
//		String inData="";
//		while(!inData.equals("Q")) {
//			System.out.println("구매할 과일명을 입력(종료시 Q:)");
//			inData=sc.nextLine();
//			if(!inData.equals("Q")) {
//				fruitList+=inData+" ";
//			}
//		}
//		System.out.println("#구매할 과일 리스트#");
//		System.out.println(fruitList);
		
		//while (true) {} : 무한반복
		//if(조건) break ; : 반복문을 중단 처리할 때
		
		//등록된 학생 리스트 처리
		
//		Scanner sc3 = new Scanner (System.in);
//		String stList ="";
//		while (true) {
//			System.out.print("학생명등록(종료시 Q) : ");
//			String stname = sc3.nextLine();
//			if(stname.equals("Q")) {
//				break; // Q입력시 break(반복종료)
//			}else {
////				
//				stList+=stname +",";
//			}
//			System.out.println(sc3.nextLine());
//		}System.out.println("등록학생명: " + stList);
		
		//번호별로 학생의 점수를 입력받아서 총점과 평균을 처리
//		Scanner sc4 = new Scanner(System.in);
//		int no = 0; //학생번호&수
//		int tot = 0; // 누적되는 학생의 점수
//		while(true) {
//			System.out.println(++no + "번째 학생의 점수입력 : (종료시 -1)");
//			int pt = Integer.parseInt(sc4.nextLine());
//			//주의 : 동일한 유형을 입력받을때는 문제가 없으나,
//			// 		숫자형과 문자열을 번갈아 받을 때는 반드시 형변환 함수를 
//			//		활용하여야 한다
//			if(pt==-1) {
//				--no;
//				break;
//			} else {
//			tot +=pt ;}
//		} 
//		System.out.println(no + "명의 학생의 점수");
//		System.out.println("학생들의 총점 : " + tot );
//		System.out.println("학생들의 평균 : " + tot/no );
		
		// ex) while, break를 이용하여 좋아하는 점심 메뉴를 입력받아서
		// 		최종적으로 출력하세요! 종료시  ! 입력
		
		Scanner sc5= new Scanner(System.in);
		String lunch = "";
		int no = 0;
		while(true) {
			System.out.println(++no + "번째 좋아하는 점심메뉴를 입력하세요(종료시 !) : ");
			String food = sc5.nextLine();
			if(food.equals("!")) {
				System.out.println("입력완료!");
				no--;
								break;
			} else {
				lunch += no+")"+ food +"\n";
			}
		} System.out.println("좋아하는 점심메뉴" + no + "가지 입력");
		System.out.println( lunch);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
