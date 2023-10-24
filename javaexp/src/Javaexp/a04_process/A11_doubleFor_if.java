package Javaexp.a04_process;

import java.util.Scanner;

public class A11_doubleFor_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		# 중첩 if문
//		1. if문 안에 if문을 처리하는 것을 말한다.
//		2. 중첩 if 구문의 경우 &&로 처리할 수 있다.
//		
//		ex ) 나이와 성별을 입력받아서 4가지 조건으로 중첩문을 사용하자.
		int age=25;
		String gender = "남";
		if(age >= 18) {
			System.out.println("성인입니다.");
			//조건안에 &&로도 가능
		if(gender.equals("남")) {
			System.out.println("신사입니다");
		}else {
			System.out.println("숙녀입니다");
		 }
		
		}
		 else {
			System.out.println("미성년입니다.");}
		if(gender.equals("남")) {
			System.out.println("소년입니다");
		}else {
			System.out.println("소녀입니다");
		}
		
		//ex) 주말여부를 선언, 공휴일 여부를 선언 
		// 주말이면서 공휴일이 아닌경우 ==> 휴일
		//주말이면서 공휴일인 경우 ==> 대체휴일
		//그외는 평일..
		boolean isWeekend=true; //주말여부
		boolean isHoliday=false; //공휴일여부
		
		if(isWeekend) {//주말
			if(isHoliday) {//주말인데 후일 ==> 대체휴일
				System.out.println("대체휴일입니다");
			}else {
				System.out.println("휴일입니다");
			}
			}else { // 주말아님
				System.out.println("휴일아님");
			}
		
		
		//ex2) 영화 입장료가 15000일떄,
		//		성별과 나이를 입력받아
		//		남성과 25세 미만일경우 5%할인
		//		여성과 25세 이상일 경우 10%할인.. 최종 금액 출력
		Scanner sc = new Scanner(System.in);
		
		int pay = 15000;
		System.out.println("성별을 입력하세요");
		String sex = sc.nextLine();
		System.out.println("나이을 입력하세요");
		int age1 =Integer.parseInt(sc.nextLine());
		
		if(sex.equals("남성")) {
			if(age1<25) {
				System.out.println( "25세미만 남성의 5%할인가격 :" + (int) pay*0.95);
			}else {
				System.out.println("정상가격입니다");			}
		} else {
			if(age1>=25) {
				System.out.println( "25세이상 여성의 10%할인가격 :" + (int) pay*0.90);
			}else {
				System.out.println("정상가격입니다");
			}
		}
		//=======================================================================================
		int age2 = 25;
		System.out.println("성별을 입력하세요");
		String gender1 = sc.nextLine();
		System.out.println("나이을 입력하세요");
		int age3 =Integer.parseInt(sc.nextLine());
		double dis =0.0;
		if(gender1.equals("남")) {
			if(age3<25) {
				dis = 0.05;
			}
		}else if(gender1.equals("여")){
			if(age3>=25) {
				dis = 0.1;
			}
		}
		//if(gender1.equals("남")&&age<25) dis = 0.05;
		//if(gender1.equals("여")&&age>=25) dis = 0.1;
		//둘다 사용가능 
		int pay1 = 15000;
		int result = pay-(int)(pay*dis);
		System.out.println("할인율 : "+(int)(dis*100)+"%");
		System.out.println("최종금액 : "+result+"원");
		
//		#중첩 for문
//		1. for문 안에 for문이 중첩적으로 사용되는 것을 말한다.
		

	

}
}
