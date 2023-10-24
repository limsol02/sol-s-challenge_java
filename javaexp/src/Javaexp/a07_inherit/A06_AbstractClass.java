package Javaexp.a07_inherit;

import java.util.ArrayList;

public class A06_AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		# 추상클래스(Abstract Class)
		
		1. 추상 : 실체들 간에 공통되는 특성을 추출한 것을 말한다.
			삼성, 현재, LG ==> 회사
			새, 곤충, 물고기 ==> 동물
		
		2. 추상클래스
			실제클래스들의 공통되는 필드와 공통 메소드 정의한 클래스
			추상적인 메서드를 선언하고, 하위 클래스에서 이 메서드를
			반드시 재정의하게 한 것을 말한다. 
			==> 추상메서드가 하나라도 있으면 추상클래스가 된다. 
			공통내용(공통기능메서드) + 개별적으로 다른 기능 처리(추상메서드)
		
		3. 특징
			1) 일반 클래스와 거의 유사하고, 추상 메서드 있다.
			2) 추상메서드는 하위에서 반드시 재정의해야 하는 부분(다형성 처리 필요)
				- 하위 클래스에서 추상메서드 강제화(컴파일에러 발생)
			3) 추상클래스는 단독으로 객체 생성을 하지 못한다.
				추상클래스 = new 상속받은 실체객체(); 로만 객체 생성.
			
		4. 단계별 진행 내용
			1) 1단계 
				1] 추상클래스 선언: 재정의할 추상메서드 선언
				2] 위 추상클래스를 통해 상속받을 하위 실제 클래스
				3] 추상클래스 = 하위 클래스(다형성)
					참조변수.재정의메서드();
			
		 * */
		//Polygon p = new Polygon(); (X)
		// 추상클래스는 혼자 객체 생성해서 사용하지 못한다.
		// 상위 = 하위(다형성)을 통해 처리
		Polygon p01 = new Triangle ();
		p01.drawing();
		Polygon p02 = new Quadrangle();
		p02.drawing();
		System.out.println("==================================");
		
		// ex) Computer usingApp(); 추상메서드 선언
		//		상속받은 Mac, SamsungPc, LgPc
		
//		Computer c01 = new Mac();
//		c01.usingApp();
//		Computer c02 = new SamsungPc();
//		c02.usingApp();
//		Computer c03 = new LgPc();
//		c03.usingApp();
		ArrayList<Computer> comList = new ArrayList<Computer>();
		comList.add(new Mac());
		comList.add(new SamsungPc());
		comList.add(new LgPc());
		comList.get(0).usingApp();
		comList.get(1).usingApp();
		comList.get(2).usingApp();
		System.out.println("==================================");
	}
}


abstract class Computer{
	abstract void usingApp();
	void operating() {
		System.out.println("컴퓨터를 작동하다.");
	}
}
class Mac extends Computer{

	@Override
	void usingApp() {
		System.out.println("맥컴퓨터 그림을 그리다");
	}
	
}
class SamsungPc extends Computer{
	
	@Override
	void usingApp() {
		System.out.println("삼성컴퓨터 프로그래밍을 하다");
	}
	
}
class LgPc extends Computer{
	
	@Override
	void usingApp() {
		System.out.println("엘지컴퓨터 온라인게임을 하다");
	}
	
}

//============================================================================
abstract class Polygon{ 
	
	// 추상메서드 --> 추상메서드가 하나라도 있으면 걘 추상클래스라고 부름
	abstract void drawing(); // body가 없음. 어차피 밑에서 제정의할용도로 적어만 두는거라
	
	// 실제메서드(공통된메서드)
	void paint() {
		System.out.println("색칠하다");
	}
}
class Triangle extends Polygon{
//	super.paint();  --> 에러뜸
	@Override
	void drawing() {
		System.out.println("삼각형을 그리다");
	}
	
}
class Quadrangle extends Polygon{
	@Override
	void drawing() {
		System.out.println("사각형을 그리다");
	}
	
}