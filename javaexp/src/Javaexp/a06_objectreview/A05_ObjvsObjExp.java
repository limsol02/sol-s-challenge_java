package Javaexp.a06_objectreview;

import Javaexp.a06_objectreview.vo.Employee;
import Javaexp.a06_objectreview.vo.Office;
import Javaexp.a06_objectreview.vo.Student;
import Javaexp.a06_objectreview.vo.Subject;


public class A05_ObjvsObjExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		ex) Office(포함될 객체)
				location(위치) , capcity(수용인원)
			Employee(포함할 객체)
				name(이름) , age(나이)
				Office office
				set xxx
				get xxx
				void showMyOfficeInfo() 위 포함될 객체의 정보 출력
		 * */
		
		
		
		Employee e01 = new Employee ();
//		Office o01 = new Office("서울",100);
		e01.setOffice(new Office("서울",100));
		e01.setName ("홍길동");
		e01.setAge(25);
		e01.showMyOfficeInfo();
		
		e01.setOffice(new Office("남양주",500));
		e01.showMyOfficeInfo();
		System.out.println("=============================");
		
		// ex) 다른 사무실 정보 할당 후..
		// showMyOfficeInfo() 호출
		
		/*
		Subject 포함될 클래스
			과목, 점수
			
		Student 
			번호 이름
			Subject subject;
			
			void showPyPoint(); 학생의 번호 이름 과목 점수 출력
		 * */
		
		Student s01 = new Student();
		s01.setSname("홍길동");
		s01.setNo(18);
		s01.showMyPoint();
		System.out.println("===============================");
		Subject sb01 = new Subject("국어",80);
		s01.setSubject(sb01);
		s01.showMyPoint();
		System.out.println("==========변경후======================");
		s01.setSubject(new Subject("영어",66));
		s01.showMyPoint();
		
		
		Student st1 = new Student (1,"홍길동");
		st1.showMyPoint();
		st1.setSubject(new Subject("영어",80));
		st1.showMyPoint();
		
		
		
		

	}

}
