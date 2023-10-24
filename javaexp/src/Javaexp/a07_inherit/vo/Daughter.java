package Javaexp.a07_inherit.vo;

public class Daughter extends Mother {
	public int height;

	
	public Daughter() {
		// TODO Auto-generated constructor stub
	}


	public Daughter(int height) {
		this.height = height;
	}
	
	public void goShpping() {
		System.out.println("딸은 쇼핑중");
	}
}
