package Javaexp.a06_object;

import java.util.ArrayList;
import java.util.List;

public class A03_Field {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 클래스의 구성요소
		1. 필드 : 객체의 데이터가 저장되는 곳
			eX) 사람을 비유하면 두뇌에 정보를 저장하는 것을 말한다 
		2. 생성자 : 객체가 가지는 기능메서드 중에서 클래스명과 동일하면
			주로 필드값을 초기화할 때 사용된다.
			주로, new 키워드를 통해서 해당 선언된 생성자가 호출되는데,
			기본적으로 default 생성자를 통해서 내장된 생성자를 사용할 
			뿐만 아니라, 선언된 생성자를 호출해서 처리하는 경우도 많다.
			ex) 선언
				public Baby(String name, String gender, int age) {
				this.name = name;
				this.gender = gender;
				this.age = age;
				}
				호출
				new Baby("아기1", "남자", 0);
				new Car("그렌져", 3500);
		3. 매서드 : 데이터입력, 데이터의 리턴처리, 조건문이나 반복문에 의해
			알고리즘 처리 등 여러가지 기능적인 처리를 하는 함수를 말한다.
			1) 리턴값 선언/리턴값 처리
			2) 입력값 처리
			3) 중괄호({})블럭을 통한 여러가지 비지니스 로직처리..
		
		#필드
		1. 필드의 종류
			1) 객체의 고유 데이터 선언
			2) 객체가 가져야할 부품 객체 
				1:1, 1:다객체
			3) 객체의 현재 상태 데이터
		2. 필드의 접근제어자
		 1) 필드는 일반적으로 private로 접근제어자를 선언하여 외부에서
		 	직접적으로 접근할 수 없게 한다. 
		 	간접적인 접근을 할 수 있다.(특정한 기능 메서드를 통해서)
		 	ex) 리모컨과 TV에서 채널을 변경할 때, 리모컨의 버튼을
		 		통해서만 가능..
		3. 필드의 사용.
			1) 객체의 생성후.
				ex) Person p01=new Person();
			2) 참조변수.필드명 형태(접근 제어자가 호출가능한 범위로 선언시)
		 		ex) p01.name = "홍길동";
		 			system.out.println(p01.name)
		 	3) 하나의 객체안에는 여러가지 형태의 필드를 선안할 수 있다.
		 		이름, 나이, 사는곳 등 여러가지(속성들을) 다른유형으로 선언..
		 	4) 이 필드는 클래스의 관점에서 보면, 전역변수로 해당 클래스
		 		내에서 다른 구성요소(생성사, 메서드)에서는 접근해서
		 		할당할 수 있다. 
		 	5) 생성자나 메서드의 매개변수나 지역변수가 동일한 명으로
		 		선언되어 있을 때는 this.필드명으로 구분하여 사용한다.
		 		String name;
		 		public Person(String name){
		 			this.name = name;
		 		}
		 		public void setName(String name){
		 			this.name=name;
		 		}
		 		public void call(){
		 			String name = "안녕"; // 매서드 지역변수
		 			// 지역변수를 전역변수에 할당
		 			// this : 지역변수와 전역변수 구분을 위해
		 			// 사용한다
		 			this.name = name; 
		 		}
		 * */

//		Car c01 = new Car();
//		c01.kind="그렌져";
//		c01.maxSpeed = 220;
//		Car c02 = new Car();
//		c02.kind="소나타";
//		c02.maxSpeed = 200;
//		System.out.println("c02의 차량의 종류 : "+ c02.kind);
//		System.out.println("c02의 차량의 최대속도 : " +c02.maxSpped);
//		
		// # 아래와 같은 속성을 가진 클래스를 선언하고, main()에서 호출하세요
		//	1. Bus (버스번호, 경유지(시작~끝) )
		//	2. Car (종류, 나이, 성별)
		//	3. Computer(제조사, 사양)
		//	4. Student(번호, 이름, 국어):
			//			학생 3명을 생성하고 국어의 평균점수 출력
		Bus b01= new Bus(); // 이게 객체생성이다
		b01.no = 2000;
		b01.route="강남역~진접역";
		System.out.println("해당버스의 번호는 : "+ b01.no+"\t해당경유지는 : "+b01.route);
		System.out.println();
		
		Cat c1= new Cat();
		c1.kind = "먼치킨";
		c1.age= 8;
		c1.gender="암컷";
		System.out.println("해당 고양이의 종류는 : "+ c1.kind+"\t나이는 : "+c1.age+"\t고양이의 성별은:"+c1.gender);
		System.out.println();
		
		Computer c2= new Computer();
		c2.company= "삼성";
		c2.a="좐나조음";
		System.out.println("해당 컴퓨터의 제조사는 : "+ c2.company+"\t성능은 : "+c2.a);
		System.out.println();
		
		Student s01 = new Student();
		Student s02 = new Student();
		Student s03 = new Student();
		s01.no = 1; s01.name = "홍길동"; s01.kors=50;
		s02.no = 2; s02.name = "김길동"; s02.kors=60;
		s03.no = 3; s03.name = "최길동"; s03.kors=70;
		
		
		Student[] arry = new Student[3]; // 배열생성
		arry[0].no=1; 
		arry[0].name="홍길동"; 
		arry[0].kors=90;
		List<Student> slist = new ArrayList<Student>();
		slist.add(new Student());
		// 국어 평균 점수 출력
//		s01.no = 1;
//		s01.no = 2;
//		s01.no = 3;
//		s01.name = "Alice";
//		s02.name = "Bob";
//		s03.name = "Charlie";
//		s01.kors = 85;
//		s02.kors = 90;
//		s03.kors = 88;
//		double avg = (double) (s01.kors + s02.kors + s03.kors) / 3;
//		System.out.printf("Average Korean Score of the students: %.2f", avg);
		
		System.out.println(s01.no+"번째 학생의 국어점수는:" +"\t"+s01.name+"\t"+s01.kors+"점");
		System.out.println(s02.no+"번째 학생의 국어점수는:" +"\t"+s02.name+"\t"+s02.kors+"점");
		System.out.println(s03.no+"번째 학생의 국어점수는:" +"\t"+s03.name+"\t"+s03.kors+"점");
		System.out.println("국어의 평균점수는 : "+(s01.kors+s02.kors+s03.kors)/s03.no);
		System.out.println();
	}
}
class Car1{
	String kind;
	int maxSpeed;
	// public car(){} : 컴파일시, 생성자 자동생성 - 생략상태-
}

class Bus{
	int no;
	String route;
}
class Cat{
	String kind;
	int age;
	String gender;
}
class Computer{
	String company;
	String a;
}
class Student{
	int no;
	String name;
	int kors;
}