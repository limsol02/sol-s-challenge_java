package Javaexp.a02_var;

import java.util.Scanner;

public class A04_StringToNumber {
	//70 80 90 ==> {"70","80","90"}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("# 숫자형 문자열 숫자로 변환#" +"-> 1.run as 사용");
		String kor = args[0];
		String eng = args[1];
		String math = args[2];
		System.out.println("국어 : "+ kor);
		System.out.println("영어 : "+ eng);
		System.out.println("수학 : "+ math);
		String tot = kor + eng+math;
		System.out.println("총계 : "+tot);
		//연산은 저걸로 안됨 그래서
		//Integer.parseInt("숫자형문자열") ->문자열을 숫자로 변환
		//Double.parseDouble 이 실수형 문자열 데이터를 숫자로 변환
		int korInt = Integer.parseInt(kor);
		int engInt = Integer.parseInt(eng);
		int mathInt = Integer.parseInt(math);
		int totInt = korInt+engInt+mathInt;
		System.out.println("총계 : "+totInt);
		System.out.println("평균 : "+(totInt/3));
		
		/*
		#scanner를 통해서 원화를 달러화로 변환하는 프로그램 처리.
		1. Scanner 객체 생성
		2. 현재 1달러당 1131.50원 변수 선언
		3. 입력된 데이터(원)를 문자열로 받아서 형변환 처리
		4. 계산식 달러 = 원/환율
		5. 최종 입력된 원화와 달러 출력
		 * */
		//system.in : 자바의 기본적인 입력처리하는 내장 객체
		//Scanner: 외부에 입력된 내용을 처리하는 java.util.*
		//		패키지에 내장된 객체
		Scanner sc = new Scanner(System.in);
		// import 한 후에, ctrl+s(저장단축키)를 통해서 완료하여야지
		// 내부적으로 저장과 함께 컴파일이 된다.
//		double changRatio = 1131.5;
//		
//		System.out.println("달러로 변환할 원화를 입력하세요! ");
		
//		String wonStr = sc.nextLine();
//		int won = Integer.parseInt(wonStr);// 문자열 --> 정수


		
		
		/*
		#scanner를 통해서 원화를 달러화로 변환하는 프로그램 처리.
		1. Scanner 객체 생성
		2. 현재 1달러당 1131.50원 변수 선언
		3. 입력된 데이터(원)를 문자열로 받아서 형변환 처리
		4. 계산식 달러 = 원/환율
		5. 최종 입력된 원화와 달러 출력
		 * */
		
		
		 Scanner sc1 = new Scanner(System.in);
		 System.out.println("변환할원화를 입력하세용");
		 int won = Integer.parseInt(sc1.nextLine());
		 double dollar = 1131.5;
		 
		 int $ = (int)(won/dollar);
		 System.out.println("입력한 원화 : " + won);
		 System.out.println("달러 : " + $ );
		 
	
		
			
		
		
	}

}
