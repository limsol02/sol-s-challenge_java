package Javaexp.a07_inherit;

public class A02_Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		# 상속관계에 있어서 super
		1. 필드
			상위에서 선언된 필드를 그대로 사용할 수 있지만, 
			재정의했을 때, 상위에 선언된 필드와 하위에 선언된
			필드를 구분할 때, super를 이용한다.(실무적 활용도는 낮은편)
			this.필드 : 현재 필드
			super.필드 : 상위 필드
		
		2. 생성자
			상속을 하는 순간, 반드시 상위에 선언된 생성자를 호출하여야한다. 
			1) default 생성자 
			2) 사용자 정의 생성자
				- 매개변수가 있는 경우
				- 매개변수가 없는 경우
		
		3. 메서드
			상위에 선언된 메서드를 그대로 사용할떄 구분을 위해서 사용
		 * */
		
		Child c1= new Child();
		c1.show();
		System.out.println("================================");
		
//		ElectronCar e01 = new ElectronCar();
//		e01.startEngine();
//		System.out.println("================================");
		
		EleProduct ep = new EleProduct();
		System.out.println(ep.kind);
		EleProduct2 ep2 = new EleProduct2();
//		EleProduct2 ep3 = new EleProduct2("호출"); 
//		ㄴ=> 매개변수가 맞는 생성자가 선언되어 있지 않기 때문에 에러발생
		EleProduct3 ep3 = new EleProduct3();
		EleProduct4 el4 = new EleProduct4();
		EleProduct5 el5 = new EleProduct5();
		// 아 메서드가 아니고 생성자에 넣어놔서 걍 이래도 출력되는구나
		Fruit01 f01 = new Fruit01();
		f01.show();
		System.out.println("상위에 있는 필드 접근 "+ f01.name);
		
	}

}

//ex) Product01 클래스에 name으로 필드를 선언하고 초기화하는 생성자를 선언하고
//	Fruit01 클래스로 과일이라는 문자열로 상위 생성자를 
//	호출하여 처리해보세요...

class Product01 {
	String name;
	public Product01(String name) {
		this.name = name;
	}
}

class Fruit01 extends Product01{
	public Fruit01() {
		super("과일");
	}
	public void show() {
		System.out.println("호출한 상위클래스 생성자 : "+super.name);
	}
}

//======================================================================================
	// 아무것도 없는 생성자 둘
class Product{
	String kind = "기본물건";
}
class EleProduct extends Product{
	//public EleProduct() {}  --> 생성자를 따로 입력 안하면 자동으로 디폴트 생성자 생성
}

//========================================================================================
	// 하위 클래스 생성자 생성
class Product2{
	String kind = "기본물건";
}
class EleProduct2 extends Product2{
	public EleProduct2() {
		System.out.println("선언된 생성자 내용 호출");
	}  
}

// EleProduct3 exp3 = new EleProduct3();
// 상위에 있는 System.out.println("선언된 생성자 내용 호출"); 까지 출력
// 이부분이 super()에 의해 출력되고, 
// 하위에 있는 System.out.println("선언된 생성자 내용 호출(default생성자)");도 출력처리된다. 

//========================================================================================
	// 위에꺼 상속받으면서 자동적으로 super 생성자 자동으로 선언됨
class EleProduct3 extends Product2{
	public EleProduct3() {
		// super() : default 상위클래스 생성자 호출..
		// 상속관계에서 모든 생성자에서는 default 상위 생성자
		// 호출 형식을 처리한다. 
		System.out.println("선언된 생성자 내용 호출(default생성자)");
	}  
}

//=======================================================================================

class Product4 {
	Product4(){
		System.out.println("###상위 클래스 생성자 호출!!");
	}
}
	//EleProduct4 el4 = new EleProduct4();
class EleProduct4 extends Product4{
	public EleProduct4() {
		// ## 주의 : 반드시 상위 생성자에 있는 생성자를 호출하여야한다.
		// default로는 super()
		System.out.println("###선언된 생성자 내용 호출!!4");
	}  
}

// # Super는 클래스 안에서 현재 클래스와 상속해주는 상위 클래스와 멤버의 구분을 위해서 사용한다.
//==========================================================================

class Product5 {
	//Product5(){}  -->> 이걸 하던가 
	//상위에 매개변수가 있는 생성자 선언 
	Product5(String name){
		System.out.println("###상위 클래스 생성자 호출!!"+name);
	}
}
class EleProduct5 extends Product5{
	public EleProduct5() {
		super("홍길동");
		// default로는 super()
		// ## 주의 : 반드시 상위 생성자에 있는 생성자를 호출하여야한다.
		System.out.println("###선언된 생성자 내용 호출!!5");
	}  
}
//=======================================================================================
class Vehicle {
	String kind;
	Vehicle(String kind){
		this.kind=kind;
	}
}
class Car extends Vehicle{
	// public Car(){} --> 자동생성됨
	Car(){
		super("자동차");  //  상위에 있는 생성자를 반드시 호출하는 코드를 설정하여야 한다. 
	}
}
//======================================================================================
// ex) Car(kind, startEngine()) / ElectronCar 위 Car상속
//		super키를 활용해서 필드와 메서드를 상위/현재 클래서 호출해서 출력
//class Car{
//	public String kind="자동차";
//	public void startEngine() {
//		System.out.println(kind+"엔진이 작동합니다.");
//	}
//}
//class ElectronCar extends Car{
//	public String kind = "전기자동차";
//	
//	//같은 필드에 다른 정보를 입력
//	//클래스 하위에서 선언해서 호출하여야 한다.
//	//현재 클래스에 있는 멤버(구성요소)와 상위 클래스에 있는 내용을
//	//구분하기 위하여 super와, this를 사용한다. 
//	public void startEngine() {
//		System.out.println(super.kind+"를 작동합니다.");
//		System.out.println("자동차의 이름은"+this.kind);
//		super.startEngine();
//		System.out.println("전기도 작동을 합니다!");
//	}
//}
/*

# super는 클래스 안에서 현재 클래스와 상속해주는 상위 클래스와 멤버의 구분을 위하여 사용한다
# this.필드/메서드 : 상속관계에서는 상위클래스에 있는 동일한 필드와 메서드를 구분하기 위하여 사용한다.
# super.필드/메서드 : 상속관계에서 상위클래스의 필드와 메서드를 지칭하는 것으로
 					현재 필드와 메서드가 동일하게 선언되었을때, 구분하기 위하여 사용한다.
 					하위클래스 안에서 사용한다. 
 * */
//==========================================================================================
class Parent{
	String name="부모님";
	void show() {
		System.out.println("부모 클래스의 메서드");
	}
}
class Child extends Parent{
	String name = "자식"; // 상위 클래스의 필드 재정의
	void show() {
		super.show(); // 같은 이름의 부모 클래스의 메서드 호출
		System.out.println("자식 클래스의 메서드");
		System.out.println("# 필드 #");
		System.out.println("현재 객체의 필드 : "+this.name);
		System.out.println("부모 객체의 필드 : "+super.name);
	}
}
