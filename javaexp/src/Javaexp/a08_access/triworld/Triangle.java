package Javaexp.a08_access.triworld;

import Javaexp.a08_access.shapeworld.Shape;

public class Triangle extends Shape {
	// 오버라이딩
	public void draw() {
		//super.painting();
		//접근제어자가 default라 외부패키지 접근 불가,,
		super.draw();
		// protected 이상일 때만 상속 + 외부패키지 일때 접근가능
		System.out.println("삼각형 도형 완성!!");
	}
}
