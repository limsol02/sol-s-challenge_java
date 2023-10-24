package Javaexp.a07_inherit;

public class A04_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		# 메소드 재정의(overriding)
		1. 부모 클래스의 상속 메서드를 동일한 이름(매개변수도 동일)으로
			다시 자식 클래스에서 정의하는 것을 말한다.
		2. 목적
			최종적으로 상속관계에서 상위 클래스를 기반으로 
			상속받은 여러 클래스가 다양한 형태로 변경하는 것을 말한다.
			ex) 부모가 돈을 버는 메서드가 있을 때, 자식들이
				동일한 기능 메서드를 다양한 형태로 활용하는 것이라고
				비유할 수 있다.
		3. 기본 형식
			class 상위클래스{
				void 기능메서드1(){
					상위에 기능내용 선언
				}
			}
			class 하위클래스 extends 상위클래스{
				void 기능메서드1(){
					상위와 동일한 메서드 선언;
					하지만,{}(블럭)내에 내용을 다른내용을
					선언
				}
			}
		4. 오버라이딩 메서드 선언시 주의할 점
			1) 매개변수의 유형과 갯수도 동일하여야 한다.
				만약에 다르면 메서드 오버로딩이 된다.
			2) 상위에서 선언한 내용과 하위상속된 내용이 기능적으로
				차별성이 있어야한다.
			3) 접근제어자는 하위 객체에서 재정의하는 메서드는
				상위와 같거나 더 넓어져야한다.
				상위 default ==> 하위 default/protected/public(o)
				상위 public ==> 하위 default(x)
		 * */
		
		
		Police p01 = new Police();
		p01.working();
		System.out.println("==================================");
		
		Programmer p02 = new Programmer();
		p02.working();
		System.out.println("==================================");
		
		FireMan f01 = new FireMan();
		f01.working();
		System.out.println("==================================");
		
		Car_01 c01 = new Car_01();
		c01.driving();
		System.out.println("==================================");

		Bus b01 = new Bus();
		b01.driving();
		System.out.println("==================================");
	
	
	}

}


// Worker w01 = new Worker("경찰관");
// w01.working();
class Worker{
	private String kind;

	public Worker(String kind) {
		this.kind = kind;
	}
	public void working() {
		System.out.println(kind+"일을 합니다.");
	}
}
// Police p01 = new Police();
// p01.working(); -- > 두줄 다 나옴
class Police extends Worker{

	public Police () {
		super("경찰");
	}
	// 오버라이딩.
	public void working() {
		super.working(); // 상위 내용을 처리
		System.out.println("치안을 유지합니다. "); 
		// 추가적으로 하위 내용도 하위에서 재정의하여 처리 ..
	}
}

// Programmer 클래스를 선언하고 재정의로 소프트웨어를 개발합니다 처리하세요

class  Programmer extends Worker{

	public Programmer() {
		super("프로그래머");
		
		// TODO Auto-generated constructor stub
	}
	public void working () {
		super.working();
		System.out.println("소프트웨어를 개발합니다.");
	}
	
}
//ex1) FireMan 소방관 불을 끄다
class FireMan extends Worker{

	public FireMan() {
		super("소방관");
		
	}
//	public void working () {
//		super.working();
//		System.out.println("불을 끕니다");
//	}
	@Override 
	// 컴파일러에서 부모 클래스의 메소드 선언부와 동일한지 검사지시
	// 정확한 메소드 재정의 위해 붙여주면 된다.
	public void working() {
		super.working();
		System.out.println("불을 끕니다"); // 이거만 적으면되는 신세계
	}
	
}


//ex2) Vehicle 탈것종류, driving ()@@타고 운행하다(상위)
//		Car(안락하게 운행하다),Bus(많은사람을 태우고 운행하다. )

class Vehicle_01{
	String kind;
	public Vehicle_01(String kind) {
		this.kind=kind;
	}
	public void driving() {
		System.out.println(kind+"를 운행합니다.");
	}
}

class Car_01 extends Vehicle_01{

	public Car_01() {
		super("자동차");
	}
	public void driving () {
		super.driving();
		System.out.println("안락하게 운행합니다.");
	}
}

class Bus extends Vehicle_01{
	public Bus() {
		super("버스");
	}
	public void driving() {
		super.driving();
		System.out.println("많은 사람들을 태우고 운행합니다.");
	}
}