package Javaexp.a06_object.vo;

public class Rectangle {
	// 필드 접근 제어 private : 직접접근 불가..
	private double width;
	private double height;
	// 생성자를 통해서 초기화 처리..
	// Rectangle rt = new Rectangle(10, 20);
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	// 필드에 입력되 width와 height를 기준으로
	// 면적을 가져오는 메서드
	// rt.getArea()
	public double getArea() {
		return width*height;
	}
	// rt.getWidth()
	public double getWidth() {
		return width;
	}
	// rt.getHeight()
	public double getHeight() {
		return height;
	}
	
}

