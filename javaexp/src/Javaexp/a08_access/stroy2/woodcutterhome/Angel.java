package Javaexp.a08_access.stroy2.woodcutterhome;

public class Angel {
	// 상속하지 않는 일반 클래스호출
		public void callWoodCutter() {
			WoodCutter wc = new WoodCutter();
			//System.out.println("private : "+ wc.privSecurity);
			// 같은 패키지는 접근이 불가능(private는 같은 클래스만 가능)
			System.out.println("default : "+ wc.savingMoney);
			System.out.println("protected : "+ wc.inhiritance);
			System.out.println("public : "+ wc.announce);
		}

}
