package Javaexp.y01_util;



public class A03_RandomCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int num=33; num<=126; num++) {
			System.out.println(num + ": " + (char)num);
		}
		
		//영문 대문자 중에서 4개를 추출해서 임의의 비번 설정..
		// 65~90
		int rCode1 = (int)(Math.random()*26+65);
		int rCode2 = (int)(Math.random()*26+65);
		int rCode3 = (int)(Math.random()*26+65);
		int rCode4 = (int)(Math.random()*26+65);
		System.out.print((char)rCode4);
		System.out.print((char)rCode3);
		System.out.print((char)rCode2);
		System.out.println((char)rCode1);
	
		System.out.println("8개의 임시비번");
		for(int cnt=1;cnt<=8;cnt++) {
			int rCode = (int)(Math.random()*26+65);
			System.out.print((char)rCode);
		}
		System.out.println("");
		
		
		// ex1) 소문자8자를 임의로 출력처리(97~122)122-97=35
		System.out.println("소문자8자 임의출력");
		for (int a =1; a<=8; a++) {
			int aCode = (int)(Math.random()*26+97);
			System.out.print((char)aCode);
		}
		System.out.println("");
		
		// ex2) 숫자4자를 임의로 출력처리 (48~57)
		System.out.println("숫자4자 임의출력");

		for (int n = 1; n<=4; n++) {
			int nCode = (int)(Math.random()*10+48);
			System.out.print((char)nCode);
			
		}
		System.out.println("");
		
		// ex3) 대문자 +소문자+특수문자를 포함한 16자 임시비번생성33~126
		System.out.println("다포함16자 임의출력");

//		for(초기값1;반복조건2;증감연산자4)
		for (int all = 1; all<=16; all++) {
			int allCode = (int)(Math.random()*93+33);
			System.out.print((char)allCode);
	
	}
		
		System.out.println("");
	
}
}