package Javaexp.a06_object;

public class A04_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		# 생성자
		1. 객체를 생성할 때, 클래스명과 동일한 함수명으로 선언하는
			것을 생성자라고 한다.
		2. 주요기능
			1) 객체를 생성할 때, 사용한다. new 객체명()
			2) 일반적으로 필드를 초기화할 때, 사용한다.
				클래스에서 선언된 필드값에 데이터를 할당하여, 초기값을
				설정할 필요가 있을 때 사용한다.
				ex) public Baby(String name){		--> 필드를 가지고와서
					this.name = name;
				}
				Baby b1 = new Baby("귀염아기");
				
		3. 형태
			1) 기본 생성자
				클래스를 선언할 때, 생성자를 선언하지 않으면
				컴파일시 자동으로 public 클래스명(){} 생성자가
				생성되어 사용할 수 있다.
				
			2) 그러나, 위 기본 생성자는 사용자 정의 생성자를 
				선언하는 순간 사라져서, 컴파일시도 자동으로 추가되지 않는다.
			3) 추가 선언하는 생성자
				생성자는 기본 생성자와 같이 매개변수가 없는 생성자를
				비롯하여 매개변수 오버로딩 규칙(매개변수의 갯수, 타입, 순서)으로 여러생성자를 선언
				할 수 있다.
			4) 생성자의 매개변수는 일반적으로 필드르 초기화하는 경우가
				많아서 동일한 경우가 많다. 이때 매개변수와 필드를 
				구분하기 위하여 this.필드명 = 매개변수명;으로 
				this를 사용한다.
				
		 * */
		//1. 객체 생성
		Mouse m01 = new Mouse();
		Mouse m02 = new Mouse("로지텍",20000);
		//필드 초기화 객체생성
		System.out.println(m02.company);
		System.out.println(m02.price);
		
		Product p01 = new Product("사과",3000,2);
		Product p02 = new Product("딸기",12000,3);
		Product p03 = new Product("바나나",4000,5);
		System.out.println(p01.pname+":"+p01.price+":"+p01.cnt);
		System.out.println(p02.pname+":"+p02.price+":"+p02.cnt);
		System.out.println(p03.pname+":"+p03.price+":"+p03.cnt);
		
		Dog d1 = new Dog();
		//생성자가 선언하지 않을 떄는 default 생성자가 컴파일시 자동
		//생성되어 사용할 수 있다.
		
//		Room r1 = new Room(); ---? default 생성자는
//				선언된 생성자가 있으면 사라진다.
		Room r2 = new Room("우리방");
		
		Phone p1 = new Phone();	// 없는거	
		Phone p2 = new Phone("삼성전자");	//문자열	
		Phone p3 = new Phone(1000000);	//숫자열	
		
		
;
	}

}
class Phone{
	String company;
	int price;
	//생성자 오버로딩 규칙
	//1. 매개변수의 갯수가 다르면 선언이 가능하다.
	//2. 매개변수의 갯수가 같더라도 타입이 다르면 가능하다.
	//3. 매개변수의 갯수가 같고, 타입도 같더라도 타입의 순서를
	//	다르게 하면 선언가능하다.
	Phone(){}
	Phone(String company){
		this.company = company;
	}
	Phone(int price){
		this.price= price;
	}
	Phone(int price, String company ){		
		this.price= price;
		this.company = company;
	}
	Phone(String company, int price){		
		this.company = company;
		this.price= price;
	}
}

class Room{
	public Room(String name) {}		///--? 이게 생성자
}


class Dog{
	// public Dog(){}    --> 디폴트로 생성
}


// ex) Product 물건/가격/갯수를 필드로 선언하고, 생성자를 통해서
//		할당하게끔 처리하고, 객체를 생성(초기화)하고 필드를 출력하세요
class Product{
	String pname;
	int price;
	int cnt;
	Product(){}
	Product(String pname,int price,int cnt){
		this.pname=pname;
		this.price=price;
		this.cnt=cnt;
	}
}


class Mouse{
	String company;
	int price;
	Mouse(){}
	Mouse(String company, int price){  // company(매개변수 String에 맞게 실제 객체에 입력하기)
		this.company = company;
		this.price=price;
	}
}