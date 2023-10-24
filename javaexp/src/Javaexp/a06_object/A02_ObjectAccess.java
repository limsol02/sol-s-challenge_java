package Javaexp.a06_object;

public class A02_ObjectAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		# 클래스를 통해서 만들어지는 객체의 접근 제어
		1. 일단, 클래스명은 일반 변수와 구분하기 위해서 class 선언시
			대문자로 시작한다. 
			하나 파일에 하나의 클래스로 선언하여, 외부에서 호출하는
			경우가 많다.
		2. package 개념
			1) 모든 클래스는 패키지 단위로 저장된다.
			2) 그래서 클래스 최상위에 package 패키지명을
				선언해 놓는다. ex)package Javaexp.a06_object;
				-물리적으로는 folder로 선언되어 저장된다.
			3) 같은 패키지안에 있는 클래스는 따로 선언없이 호출이 가능
				하다. 단, private 접근제어자가 아닐 때.
			4) 하지만 다른 패키지에 있는 클래스는 
				- 접근제어자 class 클래스명 
					클래스명 선언 가장 앞에 있는 접근제어자가
					반드시 public이어야 하고,
				- 사용하고자 하는/호출하는 클래스에서 import로
					선언하여야 한다.
				- 그리고, 해당 클래스에 구성요소도 public 이상의
					접근제어자 일 때, 객체 생성과 호출이 가능하다.
		 * */
		// 같은 패키지에 있을때 객체 선언
		Puppy p01 = new Puppy();
		// 필드 할당
		p01.kind = "포메라니안";
		p01.name = "멍멍이1";
		
		// Javaexp.a06_object 패키지 안에
		// Book 클래스를 선언하고, public으로 title을 	
		// 접근제어자 붙지않고 price를 설정하여
		// A02_ObjectAccess.java의 main()에서 호출해서 필드를 사용해보고
		//Javaexp.a06_object.inner안에 CallObject.java에서
		// 호출해 사용해보자
		//Javaexp.a06_object
		//	Book.java 
		//	A02_ObjectAccess.java : Book호출
		//		같은 package 이기에 import가 없고,
		//		접근제어자가 private가 아니면 모두 접근 가능..
		//		주의) private클래스 내부에서만 사용가능. 직접 접근불가
		//패키지 2 : Javaexp.a06_object.inner
		//	CallObject.java : Book호풀
		//		다른 package에서는 외부 클래스 호출시 import
		//		하어야 하고, 접근 제어자가 public일떄만 접근이 가능하다.
		
		Book b01 = new Book();
		b01.title = "자바기초";
		b01.price = 30000;
		Book b02 = new Book();
		b02.title = "오라클데이터베이스";
		b02.price = 32000;
		
		System.out.println(b01.title);
		System.out.println(b01.price);
		System.out.println(b02.title);
		System.out.println(b02.price);
		
		//class선언 호출 가능한 부분
		Baby ba01=new Baby();
		
		/*
		class의 접근제어자는
		1단계 class선언
		2단계 각 구성요소별로 접근 제어자가
			범위에 적절하게 있어야 한다.
			생성자
			필드
			메소드
		 * */
		
		
	}

}
