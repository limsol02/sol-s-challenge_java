package Javaexp.a08_access.story1.friendship;

public class Deer {

	public void callWoodCutter() {
		WoodCutter wc = new WoodCutter();
		
		//System.out.println("private : 같은 클래스에서만 가능"+wc.hiddenCloth);
		// 접근 제어자가 private는 같은 패키지 클래스에서 접근 불가능(같은 클래스만 접근 가능)
		
		System.out.println("default : 같은 패키지에서만 가능"+wc.hiddenDeer);
		// default는 같은 패키지에서는 접근가능
		// public 다른 패키지도 import하면 ㄱㅏ능 
	}
}
