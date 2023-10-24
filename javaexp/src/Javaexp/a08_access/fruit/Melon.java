package Javaexp.a08_access.fruit;

public class Melon extends Korean_melon {
	
	/*
	# 상속관계에 있는 같은 패키지에 있는 클래스에서는
	default와 protected가 상관없이 처리가 된다.
	 * */
	
	private void taste() {
		// 상속관계 없는 클래스에서 
		Korean_melon k01 = new  Korean_melon();
		System.out.println(k01.taste+"맛 나네"); //default
		System.out.println(k01.friendlyC); // protected
		// 같은 패키지 안에 있어서 일단 상속관계 없어도 쓸수있는애들은 사요가능
	}
	
	private void friendlyC () {
		// 상속관계가 잇는 클래스에서
	System.out.println(taste+"맛 나네"); //default
	System.out.println(friendlyC); // friendlyc 야도 protected라 내부는 걍 쌉가능 
	}

}
