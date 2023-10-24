package Javaexp.a04_process;

import java.util.Scanner;

public class A04_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 기본 switch구문 형식
		switch(데이터){
			case 케이스1: 
				처리할 내용
				break; // break가 나오기 전까지 처리한다.
			case 케이스2: 
				처리할 내용
				break;
			..
			default:
				위에 선언된 케이스가 아닐 때..
		}
		 switch 데이터로 활용할 수 있는 유형
		 1. 정수형 (char 포함)
		 2. 문자열
		 
		 * */
		switch(25) {}
		switch('A') {}
		switch("안녕") {}
//		switch(true) {}
//		switch(3.14) {}
		
		
		//커피의 종류에 따른 내용.
		String chCoffee = "아인슈페너"; 
		//사용자로부터 입력받은 커피종류
		switch(chCoffee) {
		case "아메리카노" : 
			System.out.println("시원하고 깔끔한 선택");
			break;
		case "카푸치노" : 
			System.out.println("풍성한 거품이 좋으신가보군요!");
			break;
		case "라떼" : 
			System.out.println("부드러운 우유를 좋아하는 당신!");
			break;
		default:
			System.out.println("그런메뉴는 판매하지않습니다.");
		}
		
		//월별로 날수 처리.
		int month=(int)(Math.random()*12+1); //1~12월
		switch(month) {
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println("30일까지 있는 달입니다.");
			break; 
				// 상위에서 하위로 내려가면서 break를 만나면
				// switch문을 벗어난다.
		case 2 :
			System.out.println("28,29일까지 있는 달입니다.");
			break;
		default :
			System.out.println("31일까지 있는 달입니다.");
		}
		System.out.println("임의로 선택한 달은"+month+"월");
		
//		ex ) 이번주 날짜를 기준으로 해서
//			날짜를 입력받아 요일을 출력하세요..                                                                            
//			18 == 월요일  24 ==>일
//	1. 스캐너입력 2.%7 해서 요일 지정 3)18%7--4 월 5 화 6 수 0 목
//		ex) 정답을 입력하세요ㅕ 1,3 정답 2,4오답 그외 입력번호는 1~4번까지 입력가능합ㄴ다
//	
	
		
	Scanner sc = new Scanner(System.in);
	System.out.println("1일부터 31일 중 날짜를 입력하세요(숫자만입력)");
	int day= Integer.parseInt(sc.nextLine());
	int day01 = day%7 ;
	switch (day01) {
	case 4 :
		System.out.println("월요일입니다.");
			break;
	case 5 :
		System.out.println("화요일입니다.");
			break;
	case 6 :
		System.out.println("수요일입니다.");
			break;
	case 0 :
		System.out.println("목요일입니다.");
			break;
	case 1 :
		System.out.println("금요일입니다.");
			break;
	case 2 :
		System.out.println("토요일입니다.");
			break;
	default : System.out.println("일요일입니다.");
		
	}
	System.out.println("");
	
	
	System.out.println("정답을 입력하세요 : ");
	int ans= Integer.parseInt(sc.nextLine());
	switch(ans) {
	case 1 :
	case 3 :
		System.out.println("정답입니다");
			break;
	case 2 :
	case 4 :
		System.out.println("오답입니다");
			break;
	default : System.out.println("1~4번까지 입력가능합ㄴ다.");
	}
		
		
	}
	
	
	
	
	
	
	}


