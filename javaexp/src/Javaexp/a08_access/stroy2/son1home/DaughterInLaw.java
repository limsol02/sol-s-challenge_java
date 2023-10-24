package Javaexp.a08_access.stroy2.son1home;

import Javaexp.a08_access.stroy2.woodcutterhome.WoodCutter;


public class DaughterInLaw {

		
		public void callWoodCutter() {
			WoodCutter wc = new WoodCutter();
//			System.out.println("private : "+ wc.privSecurity);
//			System.out.println("default : "+ wc.savingMoney);
//			System.out.println("protected : "+ wc.inhiritance);
//			상속하지 않은 클래스가 다른 패키지(외부패키지)에 있는 클래스를 쓰려면 pubulic만 가능하다
			System.out.println("public : "+ wc.announce);
		}
}
