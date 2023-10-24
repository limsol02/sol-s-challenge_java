package Javaexp.a07_inherit;

import Javaexp.a07_inherit.vo.Daughter;
import Javaexp.a07_inherit.vo.ScoccerPlayer;

public class A01_Basic {
	/*
	# 상속
	1. 자바는 상위 클래스를 상속하면 하위 클래스의 내용에서
		상위 클래스의 구성요소를 그대로 사용할 수 있을 뿐만 아니라
		추가된 내용을 처리할 수 있다.(상속1단계)
		
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s1 = new Son();
		s1.name = "아들 홍길동"; // 상속을 받았기 때문에 사용가능
		s1.age = 25;
		s1.show(); // 상위 클래스에 있으면 그대로 사용가능
		s1.show2();
		
		
	Daughter d01 = new Daughter();
	d01.hobby = "눕기"; // 상위에 있는 클래스의 필드
	d01.cooking(); // 상위에 있는 클래스의 메서드 
	d01.height=165; // 추가적인 필드
	d01.goShpping(); // 추가적인 메서드
	
// ex) vo 패키지 안에서 Player 운동선수 running() 달리기를 하다
//	Player를 상속받아 ScoccerPlayer 축구선수 drivingBall() 공을 몰다
	ScoccerPlayer s01 = new ScoccerPlayer();
	s01.running(); // 상위메서드
	s01.drivingBall(); // 하위메서드
	s01.runningWithBall(); // 하위메서드
	s01.trainning(); //  상위메서드

	
	}

}

class Father{
	String name;
//	Father (String name){
//		this.name=name;
//	}
	void show() {
		System.out.println("이름 : "+name);
	}
}
class Son extends Father{
	int age;
	void show2() {
		show();
		System.out.println("나이 : "+age);
	}
}	





