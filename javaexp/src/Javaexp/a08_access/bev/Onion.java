package Javaexp.a08_access.bev;

import Javaexp.a08_access.fruit.Apple;
import Javaexp.a08_access.fruit.Korean_melon;

public class Onion {
	private void taste() {
		Korean_melon k01 = new  Korean_melon();
//		System.out.println(k01.taste+"맛 나네"); --> 디폴드라 다른 패키지는 접근 안됨
		Apple a01 = new  Apple();
//		System.out.println(a01.taste+"맛 나네"); // 당연히 private라 안됨
	}
}
