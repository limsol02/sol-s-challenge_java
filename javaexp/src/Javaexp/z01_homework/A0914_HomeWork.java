package  Javaexp.z01_homework;

import java.util.Scanner;

public class A0914_HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1. 두 개의 정수 변수를 선언하고 값들을 할당하십시오.
			이들의 평균을 double로 계산하고 출력하십시오
		2. 평균 계산:
			사용자로부터 5개의 숫자를 입력받아 그 평균을 출력하십시오
		3.환율 변환:
			사용자로부터 달러 금액을 입력받아 원화로 변환하여 출력하십시오
				(환율은 임의로 1달러 = 1100원으로 설정)
		4.사각형의 면적 및 둘레계산:
			사용자로부터 사각혀으이 가로와 세로길이를 입력받아 면적 및 둘레를 계싼하시오
		5.byte byteValue = 42;
		//암시적 형변환을 사용하여 byteValue값을 double 타입의 변수에 저장하셈
		
		6.float floatValue _123.456f;
		//명ㅅ;적 형변환을 사용하여 floatValue 값을 int 타입의 변수에 저장
		7.int intValue = 100;
		  double doubleValue = 150.5;
		//두개를 더하고 그 결과를 int 타입의 변수에 저장하셈
		//결과값 출력
		8. "5678"이라는 문자열을 int 타입으로 변환
		9."-456.789"라는 문자열을 double타입으로 변환하십시오
		10. 숫자 피라미드 출력 System.out.print/System.out.println 등 
		숫자 피라미드를 증감 연산자를 사용하여 출력하는 예시 입니다
		
	                          1
	                        2   3
	                      4   5   6
	                    7   8   9   10
	                        
	
		 * 
		 * */
		
		//1번예제
		int kor = 80;
		int eng = 40;
		int tot = kor+ eng ;
		//() : 최우선 연산
		double tot1 = tot;
		double av = tot1 /2;
		System.out.println("두과목의 총합 : "+ tot1);
		System.out.println("두 과목의 평균값 : " + av);
		
		//2번예제 평균계산
		int a1=10; int a2=20; int a3=30; int a4=40; int a5=50;
		int a6 = a1+a2+a3+a4+a5;
		int a7 = a6/5;
		System.out.println("다섯 점수의 평균값은 : " + a7);
		
		Scanner sc = new Scanner(System.in);
		
		//sc.nextIn(); // 입력된 데이터 정수으로 변환하여 처리
		//Integer.parseInt(sc.nextLine()); : 입력된 문자50열을
		//	정수로 변환 처리
		
		System.out.println("******2번예제 : 스캐너를 통해서 평균점수 산출하기*****");
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("첫번째 점수 입력 : ");
		int pt01 = Integer.parseInt(sc1.nextLine());
		System.out.println("두번째 점수 입력 : ");
		int pt02 = Integer.parseInt(sc1.nextLine());
		System.out.println("세번째 점수 입력 : ");
		int pt03 = Integer.parseInt(sc1.nextLine());
		System.out.println("네번째 점수 입력 : ");
		int pt04 = Integer.parseInt(sc1.nextLine());
		System.out.println("다섯번째 점수 입력 : ");
		int pt05 = Integer.parseInt(sc1.nextLine());
		int avg = (pt01 + pt02 + pt03 + pt04+pt05)/5;
		System.out.println("평균점수 점수 입력 : " + avg);
		
		
		
		//3번예제 환율변환
		int $ = 1100;
		System.out.println("현재 40달러의 원화가격은 : " + 40*$);
		
		//4번예제 사각형 넓이
		int b1 = 30;
		int b2 = 40;
		int b3 = b1*b2;
		System.out.println("30,40센치로 이루어진 사각형의 넓이는 : " + b3);
		
		System.out.println("가로 길이를 입력하세요 : "); // width
		int sq01 = Integer.parseInt(sc1.nextLine()); // height
		System.out.println("세로 길이를 입력하세요 : ");
		int sq02 = Integer.parseInt(sc1.nextLine());
		int sq03 = (sq01+sq02)*2; // round
		System.out.println("사각형의 둘레 길이는 : " + sq03);
		int sq04 = sq01*sq02; // area
		System.out.println("사각형의 넓이는 : " +sq04);
		
		// 우선연산자(상기) : 선언된 순서에 우선하여 먼저 처리된다.
		// 1.()
		// 2.*,/ 곱셈과 나눗셈
		// 3.+,-
		
		
		
		
		//5번예제
		byte byteValue = 42;
		double byteValue01 = byteValue; // 자동형변환
		System.out.println("double의 값 : " + byteValue01);
		
		//6번예제 
		float floatValue = 123.456f;
		int fV = (int)floatValue; // 큰->작 : 강제형변환(casting) 필요
		System.out.println(fV);
		
		//7번예제
		int intValue = 100;
		double doubleValue = 150.5;
		int plus = intValue + (int)doubleValue; 
		int sumInt = (int)(intValue+doubleValue);
		System.out.println("합산된 int값 결과 : "+ plus);
		System.out.println("합산된 int값 결과 : "+ sumInt);
		
		//8번예제 
		 String s1 = "5678";
		int s01 = Integer.parseInt(s1); //int s01 = Integer.parseInt("5678"); 로 바로 들어가도 무관
		System.out.println("정수형 변환 :"+ s01);
		
		//9번예제
		String s2 = "-456.789";
		double s02 = Double.parseDouble(s2); //double s02 = Double.parseDouble("-456.789"); 가능
		System.out.println("정수형 변환 :" +s02);
		
		//10번예제
		int p1 = 0;
		p1+=1;
		System.out.println("\t\t\t"+p1);
		p1+=1;										//syso("\t\t\t"+(no++)); 가능(기본으로 p1=1로 설정한경우)
		System.out.print("  "+p1);
		p1+=1;
		System.out.print(" "+p1); System.out.println();
		p1+=1;
		System.out.print(p1);
		p1+=1;
		System.out.print("  "+p1);
		p1+=1;
		System.out.print("  "+p1);
		

	}

}
