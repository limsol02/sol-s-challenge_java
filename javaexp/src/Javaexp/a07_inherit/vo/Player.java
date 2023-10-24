package Javaexp.a07_inherit.vo;

public class Player {
	// 상위에서 선언하고, 하위에서는 모두 다 공통으로 재활용할 수 있다. 
	public void running() {
		System.out.println("달리기를 하다");
	}
	public void trainning() {
		System.out.println("연습을 하다");
	}

}
