package Javaexp.a08_access.story1;

import Javaexp.a08_access.story1.friendship.WoodCutter;

public class Hunter {

	public void callWoodCutter() {
		WoodCutter wc = new WoodCutter();
		//System.out.println("private : 같은 클래스에서만 가능"+wc.hiddenCloth);
		//private는 해당 클래스 내에서만 사용가능, 외부 클래스 접근불가
		//System.out.println("default : 같은 패키지에서만 가능"+wc.hiddenDeer);
		//default는 같은 패키지 클래스끼리만 접근이 가능
		//다른 패키지에 있는 클래스는 접근 불가능
		//다른 패키지에 있는거 쓰려면 ->public 다른 패키지도 import하면 ㄱㅏ능 
		System.out.println("public : 다른클래스 ㅇㅋ+import"+wc.child);
	}
	
}
