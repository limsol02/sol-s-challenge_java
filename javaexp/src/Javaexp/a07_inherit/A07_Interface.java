package Javaexp.a07_inherit;

public class A07_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		# 인터페이스(interface)
		
		1. 이해를 위한 도입
			Robot
			Mz : 지구를 지키는 로봇, 초기에는 하늘을 날지 못함
			Mz에서 Flyway를 중앙장치로 컨트롤할 수 있는 메모리와
			외부에서 실체 날개가 부착이 되어 처리할 수 있는 어댑터
			어깨에 만들어 상호 작용할 수 있게 만듦
			
			Flyway(인터페이스) : 날게됨
				껍데기(어깨에 정보를 입력/출력 하게 하는 처리 장치를
				붙여 사용하게함)
			Wing01(날개1호) 만들기 : 날개가 부착해서 붙여놓은
				인터페이스에 의해 실제 컨트롤로 작동하게함..
			이후, 날개2호, 날개3호가 계속 만들어지지만, 
			Mz는 변경하지 않고, 더 좋은 성능의 날개를 사용하게 된다.
		
		2. 인터페이스란? 
			1) 개발 코드와 객체가 서로 통신하는 접점
				- 개발 코드는 인터페이스의 메서드만 알고 있으면 된다.
			2) 역할
				- 개발 코드가 객체에 종속되지 않고 실제 객체가 교체할 수
				있도록 하는 역할
				- 개발코드가 변경 없이 리턴값 또는 실행 내용이 다양해
				질 수 있음.
		
		3. 인터페이스의 활용
		 	1) 인터페이스의 이름 - 자바 식별자 작성 규칙에 의해
		 		대문자 시작으로 작성
		 	2) 소스 파일 또는 클래스 하위에서 생성
		 	3) 선언 : 접근제어자 interface 인터페이스명{}
		 	4) 구성요소
		 		- 상수 : 인터페이스에 선언된 모든 변수는 기본적으로
		 			상수이다.
		 			int FIYNO = 1; ==>
		 			앞에 public static final 이 사용으로 붙는다.
		 		
		 		- 메서드 : 인터페이스는 재정의 메서드가 기본적으로
		 			추상메서드로 붙는다.
		 			void fly(); ==> 앞에 public abstract가 
		 			자동으로 붙음
		 			
		 		- 기타 : default메서드, 정적 메서드 지원
		 			default 리턴유형 메서드명(){}
		 			static 리턴유형 메서드명(){}
		 	5) 인터페이스의 특징
		 		- 인터페이스는 extends를 통해 부모를 여러개 상속받아서 
		 		사용할 수 있다. 
		 		- 인터페이스를 상속받은 실제클래스는 여러개의 인터페이스를 
		 		선언하여 사용할 수 있다.
		 		class 실제객체 implements 인터페이스1, 인터페이스2{}
		 		
		 		
		 * */
		Flyway f01 = new Wing01(); f01.fly();
		Flyway f02 = new Wing02(); f02.fly();
		System.out.println("==================================");
		
		SwimmingWay sw01 = new RuberDuckSwim(); sw01.swimming();
		SwimmingWay sw02 = new NormalDuckSwim(); sw02.swimming();
		System.out.println("==================================");
		
		Mz m1 = new Mz();
		m1.attack();
		m1.flying();
		// Flyway f01 = new Wing01();  --> 추상클래스 = 하위클래스 다형성 쓴거잖아
		m1.setFlyway(new Wing01());
		m1.flying();
		m1.setFlyway(new Wing02());
		m1.flying();
		m1.setFlyway(new Wing03());
		m1.flying();
		System.out.println("==================================");
		
		System.out.println("##꽥꽥이 세계##");
		Duck d01 = new Duck();
		d01.quack(); d01.showSwimming(); // 객체전달 ㄴㄴ --> 꽥꽥이 없음
		d01.addSwimFun(new RuberDuckSwim()); 
		// ㄴ=> 여기서 생성자 오리0>0가 수영하는 방법을 배웠습니다. 출력
		d01.showSwimming();
		d01.addSwimFun(new NormalDuckSwim());
		d01.showSwimming();
		System.out.println("==================================");
	}

}//=========================메인=======================================================
class Mz{
	private Flyway flyway; // 그래서 연결장치라는 거구나 ㄹㅇ 연결만해주네 지인소개맹키로
	private String name;
	public Mz() {
		name = "마징가제트 로봇";
	}
	public void attack() {
		System.out.println(name+"가 공격을 하며 지구를 지킵니다.");
	}
	// 날개장착하는 메서드
	public void setFlyway(Flyway flyway) {
		this.flyway = flyway;
		System.out.println(name+"가 날개를 장착함..");
	}
	public void flying() {
		System.out.println(name+"은 !!");
		if(flyway!=null) {
			flyway.fly(); // 추상메서드 호출 --> 날개1호 2호로 Flyway 에 내용입력한상태 
		}else {
			System.out.println("날개가 없어서 뛰어다닙니다.");
		}
	}
}

interface Flyway{ // 연결하는 껍데기(인터페이스 선언)
	String NAME="날개인터페이스";
	void fly(); // 재정의필요 
}

class Wing01 implements Flyway{
	@Override
	public void fly() { //  재정의
		System.out.println(NAME+" : 날개1호로 우리 동네를 나르다!!");
	}
}

class Wing02 implements Flyway{
	@Override
	public void fly() { //  재정의
		System.out.println(NAME+" : 날개2호로 우리나라 창공을 나르다!!");
	}
}

// ex1) 날개3호 선언 : 지구의 하늘을 나르다..
//		main() 에서 할당해서 처리

class Wing03 implements Flyway{

	@Override
	public void fly() {
		System.out.println(NAME+" : 날개3호로 지구의 하늘을 나르다!!");
	}
}



//====================================================================================

// ex) interface로 SwimmingWay swim();
//		class RuberDuckSwim : 고무장난감오리가 목욕탕에서 수영을하다.
//		class NormalDuckSwim : 일반집오리가 호수에서 수영을하다.
// ex2) Duck 클래스 SwimmingWay 필드로 선언 
//		addSwimFun() : 인터페이스를 통해 실체 객체 할당 메서드 선언
//		showSwimming(); : 오리가 수영하는 내용 출력
class Duck{
	private SwimmingWay swimmingway;
	private String kind;
	
	public Duck() {
		kind ="오리0>0";
	}
	public void quack() {
		System.out.println(kind+"꽥꽥 거리며 돌아다닙니다");
	}

	public void addSwimFun(SwimmingWay swimmingway) {
		this.swimmingway = swimmingway;
		System.out.println(kind+"가 수영하는 방법을 배웠습니다.");
	}
	public void showSwimming() {
		System.out.println(kind+"!!!");
		if(swimmingway!=null) {
			swimmingway.swimming();
		}else {
			System.out.println("꽥꽥이 수영 못배움 ㅠㅠ");
		}
	}
	
}


interface SwimmingWay{
	String NAME = "[수영인터페이스]";
	void swimming();
}

class RuberDuckSwim implements SwimmingWay{

	@Override
	public void swimming() {
		System.out.println(NAME+"고무장난감오리가 목욕탕에서 수영을하다.");
	}
}
class NormalDuckSwim implements SwimmingWay{
	
	@Override
	public void swimming() {
		System.out.println(NAME+"일반집오리가 호수에서 수영을하다.");
	}
}