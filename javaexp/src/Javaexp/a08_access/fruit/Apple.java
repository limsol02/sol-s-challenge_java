package Javaexp.a08_access.fruit;

public class Apple {
	private String taste = "사과";
	private void taste() {
		Korean_melon k01 = new  Korean_melon();
		System.out.println(k01.taste+"맛 나네");
		Apple a01 = new  Apple();
		System.out.println(a01.taste+"맛 나네");
	}
}
