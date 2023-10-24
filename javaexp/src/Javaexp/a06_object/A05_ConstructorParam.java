package Javaexp.a06_object;

public class A05_ConstructorParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		# 매개변수의 선언과 활용
		1. 생성자와 메서드는 해당하는 이름과 함께 매개변수로 선언하여
			식별한다.
		2. 매개변수는 특정한 객체에 데이터를 입력할 때, 사용하는 형태이다.
		3. 매개변수의 type(유형)에 맞게 호출하여야 한다.
			즉, 해당 데이터유형을 입력이 가능하는 매개변수를 선언하고
			호출하여야 한다. 
		 */
		new ParamExp();
//		new ParamExp(5); = String str = 5 ; --> 여기에 5를 할당하겠습니다. (에러) 
		new ParamExp("홍길동"); // =String str = "홍길동";
		new ParamExp(25); // = int num01 = 25;
		
		// ex) class ParamExp2로 선언하고, 매개변수가 없는것
		// 		문자열 데이터할당, 정수형 데이터 할당, 실수형 데이터 할당
		// 		생성자를 선언하고 호출하세요
		
		new ParamExp2 ();
		new ParamExp2 ("홍길동");
		new ParamExp2 (10);
		new ParamExp2 (10.254);
		new ParamExp2 ("홍길동", 25);
		new ParamExp2 (25,"홍길동");
		// 전달시, 구분해서 넘길 수 있을때, 선언이 가능하다.
		
		Person01 p01 = new Person01();
		System.out.println("이름:"+p01.name);
		System.out.println("나이:"+p01.age);
		System.out.println("사는곳:"+p01.loc);
		//위에는 디폴트 생성자로 생성된거 출력하는거 
		
		Person01 p02 = new Person01("홍길동",35);
		System.out.println("#매개변수 2개(이름,나이)#");
		System.out.println(p02.name);
		System.out.println(p02.age);
		//Person01(String name, int age){} 로 다른 클래스에서 매개변수 2개를 설정해놓은애를 끌고와서 객체를 생성하고 바로 옆에 정보넣고 출력
		
		Person01 p03 = new Person01("마길동",27,"서울");
		System.out.println(p03.name);
		System.out.println(p03.age);
		System.out.println(p03.loc);
		
		
		//-----------------------------------------------
		//String 과 같이 객체의 경우 heap메모리에 할당되지
		//않는 경우 default값은 null
		//숫자형의 경우 객체는 default값으로 0이 할당이 된다. ""인경우 공백문자가 들어간다.
		//main()에서 쓰는 데이터는 초기화를 하여야 사용이 가능하다.
//		String name;
//		System.out.println(name);  -- > 사용불가
		String name=null; System.out.println(name); //--> 초기화 해서 사용가능
		
		int num01=0; System.out.println(num01);
		// 객체에 종속된 변수는 객체 생성시 자동으로 초기화가 되어
		// 있기 때문에 바로 사용할 수 있다.
		
		
		
		Product01 pd01 = new Product01();
		//주의 ) 객체로 생성하는 순간  
		System.out.println("물건명: " + pd01.name);
		System.out.println("가격: " + pd01.price);
		
		Product01 pd02 = new Product01("아메리카노");
		System.out.println("물건명 : "+pd02.name);
		
		Product01 pd03 = new Product01(1600);
		System.out.println("가격 : "+pd03.price);
		
		Product01 pd04 = new Product01("아메리카노",1600,1);
		System.out.println("물건명 : "+pd04.name);
		System.out.println("가격 : "+pd04.price);
		System.out.println("갯수 : "+pd04.cnt);

		}
}//----------------------------------------------------------------------------------------------main()끝
// ex) Product01 클래스에 필드로 물건명 , 가격, 갯수를 선언하고
//		매개변수 없는것(초기값 선언), 매개변수1(물건), 매개변수1(가격),
//		매개변수3개 (물건명, 가격, 갯수)로 선언하고 호출하게 하세용
class Product01{
	String name;
	int price;				//이 3개들이 필드 근데 이걸
	int cnt;
	double discount;
	Product01(){
		//name = "아메리카노";
		price = 1600;		//필드들을 그냥 기본값(숫자인경우 0같은 애들이나 null)으로 디폴트 생성자 안에 설정하는경우는 의미없음
		cnt=1;				//어차피 main()에서 객체 생성하면 자동으로 초기화 (초기값=기본값)으로 설정됨
		System.out.println("#매개변수 없음 디폴트 설정#\n->만약 암것도 설정안하고 출력하면 물건명 : null,가격 : 0출력됨 ");
		// 매개변수를 입력하지 않을때에는 클래스에 변수 설정까지 해줘야 한다. 안그러면 문자는 null , 숫ㅈㅏ는 0(0.0)이 출력됨
	}
	Product01(String name){
		this.name=name;
		System.out.println("#매개변수 한개#");
	}
	Product01(int price){
		this.price=price;
		System.out.println("#매개변수 한개#");
	} // 만약에 밑에 생성자 int cnt 매개변수 1개짜리 만들면 에러날꺼임
	//price와 cnt는 이름은 구분되지만 컴퓨타는 실제 정수형으로 
	//선언되는것으로 구분하기에 int를 정의하면 에러발생..
	Product01(String name,int price,int cnt){
		this.name=name;
		this.price=price;
		this.cnt=cnt;
		System.out.println("#매개변수 세개#");
	}
}






//----------------------------------------------------------------------------------------
// 동일한 package에서는 같은 이름의 클래스를 선언하지 못한다.
class Person01{
	String name;
	int age;
	String loc;
	Person01(){
		//default 생성자 값 설정처리..
		name ="무명"; //메인 칸에서 클래스를 불러오고 , 객체를 생성한뒤(p01)
		age = 1;	// 밑에 클래스에서 만들어진 자료들을 위에서 출력하는거임
		loc="거주지없음";
	}
	Person01(String name){
		this.name=name;
	}
	Person01(int age){
		this.age=age;
	}
	Person01(String name, int age){
		this.name=name;
		this.age=age;
	}
	Person01(String name, int age, String loc){
		this.name=name;
		this.age=age;
		this.loc=loc;
		System.out.println("#매개변수 3개 생성: 이름, 나이, 사는곳#");
	}
}



//------------------------------------------------------------------------------------------------------------------
class ParamExp2{
	ParamExp2(){
		System.out.println("매개변수가 없음.");
	}
	ParamExp2(String str){
		System.out.println("문자열 1개 입력: " + str);
	}ParamExp2(int num01){
		System.out.println("정수형 1개입력 : "+num01);
	}ParamExp2(double num02){
		System.out.println("실수형 1개입력 : "+num02);
	}
	ParamExp2(String name, int age){
		System.out.println("#매개변수 2개#");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}ParamExp2(int age,String name){
		System.out.println("#매개변수 2개#");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
}
//------------------------------------------------------------------------------------------------------------------
class ParamExp{
	ParamExp(){
		System.out.println("매개변수가 없음.");
	}
	ParamExp(String str){
		System.out.println("문자열 1개 입력: " + str);
	}
	ParamExp(int num01){
		System.out.println("정수형 1개입력 : "+num01);
	}
	
	// 생성 오버로딩 규칙에 의해서 여러가지 매개변수 추가 선언
}