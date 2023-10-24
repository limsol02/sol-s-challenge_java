package Javaexp.a07_inherit.starcraft;

public class Dron extends Larba{
	
	
//	public void attack1() {}
//	ㄴ-> 오타가 나면 재정의가 아니고 새로운 메서드를 생성해버림

	public void attack1() {
		System.out.println("드론이 공격합니다.");
	}

	@Override
	public void attack() {
		System.out.println("드론이 공격합니다!!(new)");
	}
//  추상 클래스를 상속받은 클래스는
//	추상 메서드를 반드시 선언하여야 한다.(필수 오버라이딩)
}
