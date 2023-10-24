package Javaexp.a06_objectreview;

public class A03_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		# 메서드
		1. 객체안에 있는 기능 함수를 메서드라고 한다.
			0) 기본형식
				리턴값유형 메서드명(매개변수1, 매개변수2,...){
					프로세스
					return 실제리턴값;
				}
			1) return 값..
				void : 리턴값이 없을떄
				실제 리턴값에 할당가능한 리턴값유형을 선언하여야 한다. 
			2) 매개변수
			3) 프로세스 처리(로직처리)
			4) 3개의 구성요소 조합/객체의 필드와 조합된 내용..
		 * */
		
		Person p01 = new Person();
		p01.call();
		int num01 = p01.call02();
		System.out.println("리턴된 데이터 :"+ num01);
		System.out.println("리턴된 데이터 :"+ p01.call03());
		// ex) Calculator 라는 클래스를 선언하고,
		//		리턴유형이 없는 메서드 , 25+30 합산한메서드,
		//		"+" 리턴한 메서드, 25*4.5리턴 메서드
		//		를 선언하고 호출
		
		Calculator c01 = new Calculator();
		c01.call(); // 메서드 안에 출력 프로그램이 있어서 굳이 여기서 출력안하고 호출만하면 된다 
		c01.call01();
		c01.call02();
		c01.call03();
		System.out.println("리턴된 데이터 : "+ c01.call01());
		System.out.println("리턴된 데이터 : "+ c01.call02());
		System.out.println("리턴된 데이터 : "+ c01.call03());
		
		
		
		Student st01 = new Student("홍길동",25,230101);
		st01.showAll();
		st01.setName("마길동"); // 변경
		st01.setAge(22);
		st01.showAll();
		
		//ex) Airplane 에 기종, 항로(노선), 속도를 필드로 하여
		//		생성자를 통해서 초기화 하고, show()를 통해서 출력하세 하세ㅐ용
		
		Airplane a01 = new Airplane("air523","인천-오사카",200);
		a01.show();
		a01.setRoute("인천-도쿄");
		a01.show();

	}

}
class Airplane {
	private String num;
	private String route;
	private int speed;
	public Airplane(String num, String route, int speed) {
		this.num = num;
		this.route = route;
		this.speed = speed;
	}
	public void show() {
		System.out.println("#비행기 정보 출력#");
		System.out.println("비행기 편명 : "+num);
		System.out.println("비행기 노선 : "+route);
		System.out.println("비행기 속도 : "+speed);
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
// 필드와 연동해서 처리하는 형식
class Student{
	private String name;
	private int age;
	private int studentID;
	public Student(String name, int age, int studentID) {
		this.name = name;
		this.age = age;
		this.studentID = studentID;
	}
	public void showAll() {
		System.out.println("#학생정보#");
		System.out.println("학생의 이름 : "+name);
		System.out.println("학생의 나이 : "+age);
		System.out.println("학생의 학번 : "+studentID);
	}
	// 저장된 필드값을 간접적으로 호풀처리
	public String getName() {
		return name;
	}
	//매개변수로 받아서 핅드값 변경 메서드
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
}


class Calculator{
	void call() {
		System.out.println("Calculator의 메서드 call호출 (리턴값없음)");
	}
	int call01() {
		return 25+30;
	}
	String call02() {
		return "+";
	}
	double call03() {
		return 25*4.5;
	}
}

class Person {
	void call() {
		System.out.println("Person의 메서드 call호출(리턴값 없음)");
	}
	//int num01=25;
	int call02() {
		return 25;
	}
	String call03() {
		return "홍길동";
	}
}