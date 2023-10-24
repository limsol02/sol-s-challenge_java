package Javaexp.a06_object.inner;
import Javaexp.a06_object.Book;
import Javaexp.a06_object.Puppy;


//package Javaexp.a06_object.inner;
//앞에 패키지명이 같더라도 모든 패키지가 다르면
//다른 패키지다.
public class CallObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 외부 패키지에 있는 클래스를 
		// 객체로 생성하려면
		// 1. import (컨트롤 쉬프트 o)
		// 	+ 클래스 앞에 public이 있어야됨
		// 2. 객체 생성해서
		// 3. 해당 구성요소가 접근제어자가 public 이어야한다.
		Puppy p01; //  class에 선언시 접근제어자 확인 <public> class Puppy 나 퍼피라는 클래스에 p01이라는 변수 설정할께~
		p01 = new Puppy();
		p01.name="봉이";
		//이거를 줄인게 밑에꺼
		Puppy p02 = new Puppy(); //  class에 포함된 생성자에 따라 확인, 생성자 앞에 퍼블릭 없으면 얘도 에러남
		// p01.kind는 접근제어자가 public이 아니기에 
		// 외부패키지에서 호출이 안된다.
		//p01.kind는 접근제어자가 public이 아니기에 호출이 안된다.
		p02.name="댕댕이2";
		
		
		
		Book b01=new Book();
		b01.title = "정글에서 살아남기";
//		b01.price = 9500; // int price; 라고 앞에 public 이 없어서 제어당함 ㅋㅋ 바로 에러뜸
		// int price : 접근제어자 범위가 public이 아니기에 외부에서 
		//		직접적으로 호출해서 사용할 수 없다.
		
	}

}
