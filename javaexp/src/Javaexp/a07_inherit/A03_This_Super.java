package Javaexp.a07_inherit;

public class A03_This_Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Product02 p02= new Product02();
//		System.out.println("물건이름 : "+p02.name);
//		System.out.println("물건가격 : "+p02.price);
//		System.out.println("물건갯수 : "+p02.cnt);
		Fruit f01 = new Fruit(3000);
		System.out.println(f01.name);
		System.out.println(f01.price);
		System.out.println(f01.cnt);

	}

}


/*
# this() 생성자
1. 현재 클래스에서 정의된 생성자 호출
2. 현재 재정의된 생성자를 호출할 때, 사용된다.
3. 현재 클래스와 상위 클래스의 생성자와 구분할 때도 사용된다.
 * */
class Person{
	String name;
	int age;
	String loc;
	Person(){
		// 이게 있어서 밑에 Man 클래스가 따로 생성자 호출안했지만 에러안남
		name="이름없음";
		loc="지역없음";
	}
	Person(String name){
		this(); // 현재 정의된 생성자중에 매개변수가 없는 생성자 호출
		this.name = name;
		// this.필드, this.메서드() 현재 이 객체 (클래스)가
		// 포함하고 있는 구성요소를 호출할 때.
	}
	Person(String name,int age){
		this(name); // 현재 정의된 생성자 중에 이름이 있는 생성자
		this.age=age;
	}
	Person(String name, int age, String loc){
		this(name,age);
		// 위에꺼 안쓰면 하나하나 this.name=name; this.age=age; 다 적어야됨
		// 현재 정의된 생성자 중에 이름과 나이가 있는 생성자 호출  
		this.loc=loc;
	}
}
class Man extends Person{
	/*
	## default 로 들어가 있는데, 상위에 매개변수가 없는 생성자가 없는 순간 반드시 호출하여야한다.
	pubilc Man(){
		super(); <- 가 자동으로 만들어져있는 사상태
	}
	 * */
	public Man(String name) {
		// 여러개의 상위 클래스 생성자 중에 추가하여 선택적으로 호출할 수 있다. 
		// super();
		super(name);
		// 1. 매개변수가 있는 생성자를 명시적으로 호출하여 사용한다. 
		
	}
	public Man (String name,int age) {
		//this(name); // 현재 클래스에 있는 생성자 호출
		super(name,age); 
		// super, this 생성자 호출은 첫 라인에서만 선언가능하다 (하나밖에못함)
	}
}
// 같은 패키지에 동일한 이름의 클래스가 선언되면 에러 발생
// ex) this() 여러 매개변수 생성자를 이용해서 
// 	물건명, 가격, 갯수를 선언하되, 다양한 매개변수로 초기화 하게 처리하세요.
class Product02{
	String name;
	int price;
	int cnt;
	public Product02() {
		this.name= "물건명 입력없음";
//		this.price=3000;
		this.cnt=1;
		// 이렇게 선언해놓으면 처음 정보 쭉 감 따로 null이나 0으로 초기화하지않는한
	}
	public Product02(String name) {
		this(); // 위에 정보 가져옴->이름을 제외하곤 위에 디폴트 생성자의 내용을 그대로 쓰겠ㄷㅏ
		this.name = name;
	}
	public Product02(String name, int price) {
		this(name);
		//this.name = name;
		this.price = price;
	}
	public Product02(String name, int price, int cnt) {
//		this.name = name;
//		this.price = price;
		this(name,price);
		this.cnt = cnt;
	}
}
	class Fruit extends Product02{
		Fruit (int price){
			// 상위에 선언된 생성자 중에, 매개변수가 2개있는 생성자 호출
			super("과일",price);
		}
		Fruit(String name, int price, int cnt){
			super(name,price,cnt);
		}
	}
	
	
