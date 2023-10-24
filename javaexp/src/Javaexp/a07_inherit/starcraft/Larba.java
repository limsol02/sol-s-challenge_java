package Javaexp.a07_inherit.starcraft;

public abstract class Larba {
	//ㄴ-> 추상 메서드가 1개라도 있으면 추상 클래스가 된다.
	
	// 모든 유닛에 공통되는 내용 처리
	public void gameInfo() {
		System.out.println("스타's 저그 유닛입니다.");
	} 
	
	// 각 유닛마다 재정의할 내용
	public abstract void attack();
}

// extends Larba
