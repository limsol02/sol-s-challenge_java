package Javaexp.a08_access.fruit;

public class Korean_melon {
	
	String taste="참외";
	protected String friendlyC = "참외와 가까운 친척~";
	
	private void taste() {
		// 상속관계 없는 클래스에서
		Korean_melon k01 = new  Korean_melon();
		System.out.println(k01.taste+"맛 나네");
		System.out.println(k01.friendlyC);
		Apple a01 = new  Apple();
//		System.out.println(a01.taste+"맛 나네"); // 당연히 private라 안됨
	}
	// 상속관계가 있는 클래스에서 
	private void friendlyC () {
		System.out.println(friendlyC);
	}
}
