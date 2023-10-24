package Javaexp.a02_var;

public class A03_ChangeType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	 	#형변환 처리
	 	1. 기본 유형
	 		1)작은데이터 유형===> 큰데이터 유형
	 			자동(묵시적) 타입 변환 : promotion
	 		2)큰데이터유형 ===> 작은데이터유형
	 			강제(명시적) 타입 변환 : casting
	 		3) 연산에 의해서 꼭 형변환이 필요한 경우에도 casting 
	 			을 처리한다.
	 			int ==> char 으로 표현..
	 			int code = 66;
	 			char char01 = (char)code;
	 			
	 			연산의 의해 실수가 표현하여야 할 떄..
	 			double dbl01 = (double)10/3;
	 			10/3 --> 정수형 3
	 			(double)10/3 --> 실수형 3.33333333..........
		
		 * */
		
		int n0 = 3;
		double d1 = n0 ;
		System.out.println(d1); // 3.0
		
		double d2 = 1.23;
		//int n2 = d2; 바로 큰->작 에러떠버리네
		int n2 = (int)d2;
		System.out.println(n2); // 1
		
		int n4 = Integer.parseInt("25");
		System.out.println(n4); // 25 이게 정수형문자열에서 걍 정수
		
		double d4 = Double.parseDouble("25.7");
		System.out.println(d4); // 25.7 이게 실수형문자열에서 걍 실수
		System.out.println();
		
		byte num01 = 25;
		int num02 = num01;//자동형변환
		double num03 = num02;
		System.out.println(num01); // 25
		System.out.println(num02); // 25
		System.out.println(num03); // 25.0
		
		double num04 = 24322.245;
		int num05 = (int)num04; // 강제형변환 (casting) ***핵심***
		byte num06= (byte)num04; // 강제형변환 (casting)
		//
		System.out.println(num04); // 24322.245
		System.out.println(num05); // 24322
		//32bit(int) 2진수로 ===> 8bit casting해서 10진수로 변환한 데이터만 남음
		System.out.println(num06); // 2
		// 자바에서 정수/정수 ==> 정수 (소수점 이하 안나옴)
		System.out.println(10/3); // 원래 3.33333인데 자바는 3만 나옴
		//실수형데이터가 필요한 경우 나눗셈 피연산자 하나를 
		//강제 형변환해서 처리하여야한다.
		System.out.println(10/(double)3);//3.3333333333335
		
		
		/*
		1.사용자로부터 초를 입력받아, 해당 초를 '시, 분, 초' 형태로 출력하세요
		  (예 : 3661초는 1시간 1분 1초입니다)
		 * */
		int seconds = 5233;
//		//초*60===>분*60===>시
//		//시===>시/60===>분===>분/60(초)
//		int hour = 5233 - 3600;
//		int min = hour - 360;
//		System.out.println((seconds/3600)+"시"+(hour/360)+"분"+ (min/60)+"초");
//		
		
		int hours = seconds/60/60; 
		System.out.println(hours+"시");
		System.out.println(hours*60*60+"초(1시간)");
		int minues = seconds/60-(hours*60);
		System.out.println(minues+"분");
		int rest = seconds-(hours*60*60)-(minues*60);
		System.out.println(rest+"초");
		
//		int seconds = 5233; 
//		System.out.println(seconds+"초"); int minute = seconds/60;
//		System.out.println(minute+"분"); int hour = minute/60;
//		System.out.println(hour+"시");
		
		
		/*
		2. 문자열데이터와 숫자형 변환
			1) 전제조건
				숫자형 문자열 이여야한다 "25", "23.17"
				그외 문자열 "이십오" "삼점일칠" 에러발생.
			2) 정수형문자열을 정수형으로 변환해주는
				int num01 = Integer.parseInt("25") 이 매소드 걍 암기
			3) 실수형문자열을 실수형으로
				double num02 = Double.parseDouble("3.17")
		 * */
		String num10Str = "25";
		int num10 = Integer.parseInt(num10Str);
		String num11Str = "3.17";
		double num11 = Double.parseDouble(num11Str);
		System.out.println("정수형 변환 숫자 +10:"+(num10+10));
		System.out.println("실수형 변환 숫자 +10.5:"+(num11+10.5));
				
		
	}

}
