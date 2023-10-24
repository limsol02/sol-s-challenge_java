package Javaexp.a07_inherit.vo;

public class Mother {
	// 접근제어자 public 
	// 어머니의 hobby(필드)
	// 어머니가 cooking() 요리를 한다.(메서드)
	public String hobby;
	

	public Mother() {
		// TODO Auto-generated constructor stub
	}
	public Mother(String hobby) {
		this.hobby = hobby;
	}

	public void cooking() {
		System.out.println("요리를 잘한다!");
	}
}
// ex) public class Daughter 
//		추가적인 필드height (키)
//		추가적인 goShpping () 쇼핑을 하다(메서드)
// A01_Basic에서 Daughter 객체 필드 및 메서드 호출