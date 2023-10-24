package Javaexp.a06_objectreview.vo;

public class Book {
	String name;
	public Book () {
		// this : 현재 객체의 주소 (참조값)
		System.out.println("매개변수가 없는 생성자 : "+this);
//		b03 = new Book();
	}
	// Book b2 = new Book ("자바시작도서");
	public  Book(String name) {
		System.out.println("매개변수 1개 생성자"+ this);
		System.out.println("도서명 : "+name);
	} 

}
