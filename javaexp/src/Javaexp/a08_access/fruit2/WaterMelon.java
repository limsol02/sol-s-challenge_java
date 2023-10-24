package Javaexp.a08_access.fruit2;

import Javaexp.a08_access.fruit.Korean_melon;

public class WaterMelon extends Korean_melon {
	private void taste() {
		// 상속관계 없는 클래스에서 
		Korean_melon k01 = new  Korean_melon();
//		ㄴ-> 객체생성으로 호출하는 것으로 상속개념으로 사용하는 것이 아니기에 접근불가

//		System.out.println(k01.taste+"맛 나네"); //default
//		System.out.println(k01.friendlyC); // protected
		// 같은 패키지 안에 있어서 일단 상속관계 없어도 쓸수있는애들은 사용 가능
	}
	
	private void friendlyC () {
		// 상속관계가 잇는 클래스에서
//	System.out.println(taste+"맛 나네"); //default--> 상속이 되도 외부패키지라 접근안된다~
	System.out.println(friendlyC); // friendlyc 야도 protected라 내부는 걍 쌉가능 
	}
}
