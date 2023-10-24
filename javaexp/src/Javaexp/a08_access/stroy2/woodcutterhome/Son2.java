package Javaexp.a08_access.stroy2.woodcutterhome;

public class Son2 extends WoodCutter {
	// 상속하는 클래스에서 호출
		public void callWoodCutterInhit() {
//			System.out.println("private : "+ privSecurity);
//			상속을 하더라도 private는 접근불가..
			System.out.println("default : "+ savingMoney);
			System.out.println("protected : "+ inhiritance);
			System.out.println("public : "+ announce);
		}
}
