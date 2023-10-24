package Javaexp.a06_objectreview.vo;

/*
 CarOWner c01 = new CarOwner();
 c01.name : null
 c01.car : null
 * */

public class CarOwner {
	// 필드에 적어만 놓는건 들어갈 공간 메모리를 할당할 준비만 하는상황.
	private String name;
	private Car car;
	// 지금 이것만 써놓는 상황에서는 car에는 아무 정보가 없음
	public CarOwner() {
		// TODO Auto-generated constructor stub
	}
	public CarOwner(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	/*
	CarOWner c01 = new CarOwner(); 
	
	c01.setName("홍길동"); // 바로할당
	String name01 = "홍길동";
	c01.setName(name01); // 변수를 통해서 할당
	*/
	public void setName(String name) { // String name = "홍길동"; 
		this.name = name; // "홍길동" 문자열이 선언된 필드에 할당
	}
	
	/*
	==========================================위 아래 같은개념
	
	c01.setCar(new Car("현대","그렌저",0));
	Car car = new Car("기아","k7",0)'
	c01.setCar(car);
	c01.buyCar(new Car("대우","G5",0));
	Car car01 = new Car ("대우","G5",0);
	c01.buyCar(car01);
	
	 * */
	public Car getCar() {
		return car;
	}
	
	// 차의 객체를 할당할 때, setCar/buyCar를 통해서만 할당이 가능.
	public void setCar(Car car) { // Car car = new Car ("현대","그렌저",0)
		this.car = car; // new Car()객체가 필드에 할당.
	}
	public void buyCar(Car car) { // Car car = new Car("대우","G5",0)
		this.car=car; // this.car로 필드에 할당..
	}
	public void showMyCarInfo() {
		System.out.println("자동차 주인의 이름 : "+ name);
		if(car!=null) {// 객체가 할당되어 있을 때..
			System.out.println("소유 차량 정보");
			System.out.println(car.getCompany());
			System.out.println(car.getModel());
			System.out.println(car.getSpeed());
		}else {// 객체가 할당되지 않을 때..
			System.out.println("차가 없으시네용ㅋㅋ");
		}
	}
}
