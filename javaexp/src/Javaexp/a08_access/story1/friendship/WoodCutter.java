package Javaexp.a08_access.story1.friendship;

public class WoodCutter {
	String hiddenDeer = "덤불속에 사슴을 숨기다";
	private String hiddenCloth = "뒷동산바위밑 깊은 곳에 날개옷";
	// 접근제어자가 붙지 않는 것은 (default)
	// 외부 클래스에서 호출할 때,
	// 1. 같은 패키지에 있는 클래스는 접근가능
	// 2. 다른 패키지에 있는 클래스는 접근 불가능 
	public String child ="애 셋낳음";
	
	public void callWoodCutter() {
		WoodCutter wc = new WoodCutter();
		System.out.println("private : 같은 클래스에서만 가능"+wc.hiddenCloth);
		System.out.println("default : 같은 패키지에서만 가능"+wc.hiddenDeer);
		// public 다른 패키지도 import하면 ㄱㅏ능 
	}

}
