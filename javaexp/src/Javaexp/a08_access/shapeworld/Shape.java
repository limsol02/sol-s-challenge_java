package Javaexp.a08_access.shapeworld;

public class Shape {
	
	void painting() {System.out.println("색칠하다");}
	//ㄴ-> 내부 패키지(패키지가 동일할때)
	
	protected void draw() {System.out.println("도형을 그리다");}
	//ㄴ-> 상속 + 외부패키지 일때만
	
	// public : 상속관계 없더라도 접근하여 호출 가능하다
}
