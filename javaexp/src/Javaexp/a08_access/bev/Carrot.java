package Javaexp.a08_access.bev;

import Javaexp.a08_access.fruit.Apple;
import Javaexp.a08_access.fruit.Korean_melon;

public class Carrot {
	private void taste() {
		Korean_melon k01 = new  Korean_melon();
//		System.out.println(taste+"맛 나네"); --> 디폴트라 외부패키지 접근안됨
		Apple a01 = new  Apple();
//		System.out.println(a01.taste+"맛 나네"); // 당연히 private라 안됨
	}
}
