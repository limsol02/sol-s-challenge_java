package Javaexp.a07_inherit.vo;

public class ScoccerPlayer extends Player {
	public void drivingBall() {
		System.out.println("공을몰다");
	}
	// 상속은 상위에 공통된 필드와 메서드(멤버)를
	// 접근제어자 범위 안에서 현재 클래스에서 사용가능하다. 
	public void runningWithBall() {
		System.out.println("축구선수가");
		running(); // 상위클래스 메서드 사용
		drivingBall(); // 현제클래스 메서드 사용
	}

}
