package Javaexp.a08_access.stroy2.son1home;

import Javaexp.a08_access.stroy2.woodcutterhome.WoodCutter;

public class Son1 extends WoodCutter {
	// 상속하는 클래스에서 호출
			public void callWoodCutterInhit() {
//				System.out.println("private : "+ privSecurity);
//				상속을 하더라도 private는 접근불가..
//				System.out.println("default : "+ savingMoney);
//				다른 패키지면 default도 불가능
				
				System.out.println("protected : "+ inhiritance);
//				상속한 외부패키지는(같은 패키지가 아닌) protected 일때 접근 가능(상속+외부패키지)
				System.out.println("public : "+ announce);

}
	/*
	ex) a08_access.shapeworld 
		Shape 클래스 선언
			protected 메서드
				도형을 그리다
		
		a08_access.triworld
			Triangle 클래스를 위 shape를 상속받아서
				protected메서드를 호출하게 처리하세요..
	 * */
			
}
