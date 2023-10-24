package Javaexp.a07_inherit.compart;

public abstract class Part {
	// 공통으로 된 컴퓨터부품입니다. 출력 메서드 선언
	// 하위에 재정의 할 기능 처리.. @@기능을 가지고 있습니다
	// Cpu, Ram, SSd 클래스 생성 
	public void same() {
		System.out.println("공통으로 된 컴퓨터 부품입니다.");
	}
	// 재정의할 기능 : 
	// ex) 추상메서드 정의 => 추상클래스 선언
	// 메인메서드에서 에러나지 않게 처리
	public abstract void system() ;
	
}
