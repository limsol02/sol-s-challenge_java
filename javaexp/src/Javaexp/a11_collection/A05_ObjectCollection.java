package Javaexp.a11_collection;

import java.util.ArrayList;
import java.util.List;

import Javaexp.a11_collection.vo.Person;
import Javaexp.a11_collection.vo.Student;

public class A05_ObjectCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		# 객체형 Collection 활용
		1. 자바의 클래스를 만들어서 단위 객체를 사용할 수 있게 하고,
			이것을 Collection에 활용하는 형태
		2. 실무적으로 활용도가 높다.
		
		# 처리순서
		1. class 선언
			컬렉션에 넣을 단위 내용을 VO클래스로 선언한다.
		2. List/Map에 할당하여 처리하기
			생성자나 메서드를 통해서 데이터를 넣을 컬렉션을 만든다.
		3. 반복문을 통해서 개별 단위 객체를 가지고오고,
			해당 속성들을 getXXX()에 의해서 로딩 및 활용한다.
		 * */
		// 학생정보(이름, 국어, 영어, 수학)
		List<Student> studs = new ArrayList<Student>();
		studs.add(new Student("홍길동",70,80,90));
		studs.add(new Student("김길동",80,80,95));
		studs.add(new Student("신길동",90,85,80));
		
		List<String> stList = new ArrayList<String>();
		stList.add("사과");
		stList.add("바나나");
		System.out.println("#단일 String");
		System.out.println(stList.get(0));
		/*
		String fruit = new String("사과") 또는
		String data = "사과"
		참조변수는 클래스 내에 toString()으로 정의된 내용을 리턴한다.
		==> System.out.println(fruit)
		 * 
		class String {
			private String str;
			String(String str){
				this.str=str;
			}
			String toString(){
				return str;
			}
		}
		
		
		class Object{ (대부분의 객체)
			String toString(){
				return 패키지명.클래스명@주소값
			}
		}
		 * */
		System.out.println("#단일 객체#");
		Student stu = new Student();
		System.out.println(stu); // 이름 : null,국어 : 0,영어 : 0,수학 : 0, 총점 : 0, 평균 : 0 
		// toString 재정의한 내용이 나옴
		// 원래 객체 생성해서 변수명만 넣으면 주소값이 뜨는데 그게 객체 클래스의 
		// toString 의 역할
		System.out.println(studs.get(0));
		//위아래 출력하는게 같은 말임
		
		/*
		 참조변수를 호출했을때, 특정하게 원하는 형식으로 데이터를
		 가져오고 싶으면 ==> overriding (상위 선언된 내용을 재정의)
		 * */
		
		System.out.println("이름\t국어\t영어\t수학");
		for(Student st :studs ) {
			System.out.print(st.getName()+"\t");
			System.out.print(st.getKor()+"\t");
			System.out.print(st.getEng()+"\t");
			System.out.print(st.getMath()+"\n");
		}
		
		// ex) 기본단위정보를 Person으로 사람의 이름, 나이, 사는곳으로
		//	하여, 해당 Person 3명의 정보를 위 List<Person>으로
		//  처리하여 출력해보세요
		
		List<Person> p01 = new ArrayList<Person>();
		p01.add(new Person("홍길동",25,"서울"));
		p01.add(new Person("김길동",28,"광주"));
		p01.add(new Person("최길동",30,"부산"));
		System.out.println("이름\t나이\t사는곳");
		for(Person plist : p01) {
			System.out.print(plist.getName()+"\t");
			System.out.print(plist.getAge()+"\t");
			System.out.print(plist.getLoc()+"\n");
		}
	}

}
