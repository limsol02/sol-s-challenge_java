package Javaexp.a06_object;

import java.util.Scanner;



public class A06_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		# 메서드
		1. 메서드는 class에서 구성된 구성요소로서 객체가 가지고 있는
			기능적인 역할을 하는 함수이다.
		2. 함수란 특정한 기능을 처리하고 결과값을 리턴하는 기능이 있다면
			이것이 객체에 종속되는 경우를 메서드라고 한다.
		3. 메서드의 핵심기능
			메서드는 매개변수로 데이터를 받아서, 전역변수에 저장하기도 하고,
			전역변수의 데이터와 관계에 있는 로직을 처리하여
			최종적으로 원하는 데이터를 리턴해주는 것이라 할 수 있다.
			 
			1) 기본 형식
				접근제어자 리턴유형 메서드명(매개변수1, 매개변수2...){
					프로세스 처리
					return 리턴할 데이터;
				}
			
			2) 구성요소 내용
				리턴유형 : 이 메서드를 통해서 처리하는 결과값을
				리턴하는데, 메서드 선언의 가장 밑부분에 실제
				리턴할 데이터의 유형을 선언하는 것을 말한다.
				실제 데이터가 5가 리턴되면 리턴 유형은 int이어야한다.
				ex) int returnexp(){
					return 5;
				}
				해당, 객체의 참조변수를 통해 기능 메서드를 호출할 때,
				리턴되는 결과값을 가지고 처리할 수 있다.
				int num01=p01.returnexp();
				// 리턴한 결과값 5를 num01에 할당
				System.out.println(p01.returnexp()+10);
				// 리턴한 결과값 5와 10을 합산해서 15를 출력한다.
				 
				-매개변수
					매개변수는 외부에서 입력한 데이터 받아서,
					이 기능 메서드의 지역변수로 활용하여 사용한다.
					메서드명과 매개변수의 선언기준을 외부에서 호출
					할떄 식별할 수 있는 여부에 따라 동일한 메서드명
					으로도 선언이 가능하다. 이것을 메서드 오버로딩
					이라고 한다.
				
				-프로세스 처리
					매개변수에 데이터를 받아, 전역변수(필드)에
					할당하거나 틀정 조건/반복 처리를 하는 등
					여러가지 알고리즘 처리도 가능하다.
				
				-최종 리턴값
					처음에 설정한 리턴유형에 맞는 최종 리턴값을
					해당 메서드를 통해서 처리할 수 있다.
					단,return  XXX형식으로 선언하지 않을 경우도
					있는데, 이떄는 반드시 return 유형을 void라고
					선언하여야한다.
				===> 메서드는 위와 같은 구성요소들을 단일 또는 복합적으로
					활용해서 원하는 결과를 처리한다.
		 * */
		ReturnExp re = new ReturnExp();
		re.call();
		int reNum = re.call01();
		System.out.println("리턴된 값을 변수에 할당 : "+ reNum);
		System.out.println(re.call01() +25);
		String reStr = re.call02();
		System.out.println("리턴된 문자열 : "+reStr);
		System.out.println(re.call02()+" 문자열 추가");

		// class ReturnExp02로 서언하여
		// 정수 실수, 문자열, boolean 리턴값을 메서드로
		// 선언하고, main ()에서 호출하여 출력하세요.
		ReturnExp2 re01 = new ReturnExp2();
		System.out.println("리턴된 정수값 : "+ re01.call01());
		double dbl01 = re01.call02();
		System.out.println("리턴된 실수값 : "+ re01.call02());//=dbl01);
		System.out.println("리턴된 문자값 : "+ re01.call03());
		System.out.println("#점수와 합격여부-랜덤#");
		if(re01.call04()) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}		
	}

}//-----------------------------------------------------------------------------------------------main()종료

class ReturnExp2{
	int call01(){
		return 25;
	}
	double call02() {
		double num01 = 3.14;
		return num01; // 지역변수 설정해서 리턴값 설정해도 됨
	}
	String call03() {
		Scanner sc = new Scanner(System.in);
		System.out.println("리턴할 문자열 입력 : ");
		String retStr = sc.nextLine();
		return retStr;
	}
	boolean call04() {
		int pt = (int)(Math.random()*101);
		System.out.println("점수 : "+pt);
		return pt>=60;
	}
}




class ReturnExp{
	void call() {
		System.out.println("리턴값이 없음");
	}
	//int num01 =5; 
	int call01() {
		return 5;
	}
	// String str = "안녕하세요";
	String call02() {
		return "안녕하세요";
	}
}


