package Javaexp.a06_object;

public class A01_Basic {
	
	/*
	#객체 지향 프로그램
	1. OOP : Object Oriented Programming
		부품 객체를 먼저 만들고 이것을 하나씩 조립해 완성된 프로그램을
		만드는 기법
	2. 객체란? 
		1) 물리적으로 존재하는 것 - 자동차, 책, 사람
		2) 추상적인 것(회사, 날짜) 주에서 자신의 속성과 동작을 가지는 모든것
		3) 객체는 필드(속성)과 메소드(동작)으로 구성된다.
			자바 객체로 모델링 가능하다.
			-현실세계
				사람 -[속성] : 이름, 나이
					-[동작] : 웃다, 먹다, 말한다.
					
			-자바세계
				사람객체 - [필드] : 이름, 나이
					  - [메소드] : 웃다, 먹다, 말한다.
	3. 객체의 상호작용
		- 객체들은 서로 간의 기능(동작)을 이용해서 데이터를 주고 받는
			기능을 처리한다.
		-사람 객체<==> 전자계산기 객체
		-물건 객체<==> 쇼핑몰 객체
		
	# 객체와 클래스
	1. 현실세계 비유
		현실세계 : 설계도 ==> 구체적인 사물/객체
			ex) 롯데월드타워의 설계도를 통해서 롯데월드타워 건축
		자바 : 클래스 ==> 객체
			ex) class Tower{} => Tower t1 = new Tower();
	
	2. 클래스에서 객체를 생성하기 위한 필드와 메소드가 정의
	class Person{		--> 건물(person)을 지을껀데 그건물은 이름이랑 나이 가 필요해~ 대충 이딴늒미?
	String name;
	int age;
	}
	
	3. 클래스로부터 만들어진 객체를 해당 클래스의 인스턴스(instance)
		instance : 참조 - heap영역의 주소를 참조해서 변수를 
			만들었기 떄문에 참조변수라고 한다.
		ex) 하나의 클래스를 기준으로 여러개의 객체가 여러개의 
			참조변수로 생성가능하다.
			Person p01 = new Person();		//new Person(); 새건물 뚝딱! -> 그 건물의 이름(주소)은 p01이야~ 이런느낌인가?
			Person p02 = new Person();
			Person p03 = new Person();
			p01, p02, p03 등 다른 주소로 객체가 생성이 된다.
	
	4. 하나의 클래스로부터 여러 개의 인스턴스를 만들 수 있다.
		하나의 롯데월드타워 도면으로부터 서울, 부산, 제주도에
		실제 건물을 건축할 수 있다.
		
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// main() 안에서만 실제 메모리를 만들고 처리가 된다.
		// 클래스를 기준으로 실제 객체인 p01이라는 인스턴스/참조변수로
		// 만든다.
		Person p01 = new Person(); // 1층 만듦=Person p01
		System.out.println(p01); // heap영역에 특정한 주소.7c30a502
		p01.name="홍길동"; // 1층 1호(name)는 홍길동씨가 사용한다는 느낌....
		p01.age = 25;
		
		Person p02 = new Person();//건물2층만듦
		System.out.println(p02); // 49e4cb85 위에랑 다른주소
		p02.name = "김길동";
		p02.age = 27;
		System.out.println(p01.name+":"+p01.age);
		System.out.println(p02.name+":"+p02.age);
		//같은 클래스로 생성했지만, 다른 객체 (ㄷㅏ른 정보들)
		Tower t1 = new Tower(); // 객체생성
		t1.loc = "서울에 있는 타워";
		Tower t2 = new Tower();
		t2.loc = "부산에 있는 타워";
		Tower t3 = new Tower();
		t3.loc = "제주에 있는 타워";
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		// ㄴ 주소값들
		
		System.out.println(t1.loc);
		System.out.println(t2.loc);
		System.out.println(t3.loc);
	}

}
// 도면과 같은 클래스 정의 
class Person{
	String name;
	int age;
}

// Tower 클래스 ,loc속성을 지정해서..
// 이것을 통래서 만들어진 t1,t2,t3로 객체를 생성ㅎ고ㅗ, loc
// 에 서울/부산/제주로 선언하여 heap영역의 주소값과 각각의 loc를
// 출력해

class Tower{
	String loc;
}