package Javaexp.a06_objectreview;

import Javaexp.a06_objectreview.vo.Bulb;
import Javaexp.a06_objectreview.vo.Passport;
import Javaexp.a06_objectreview.vo.Person_01;
import Javaexp.a06_objectreview.vo.Room;

public class A06_ObjvsObjExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		1. *사람과 여권*
		한 사람은 하나의 여권만 소유할 수 있고, 여권은 한 사람에게만 발급됩니다.
		class Person{
			Passport passport;
		}
		class Passport{
			Person person
		}
		
		2. *방과 전구*
		한 방에는 하나의 전구만 설치됩니다
		class Room{
			Bulb bulb
		}
		class Bulb{
			Room room;
		}
		 * */ 
		
		//1. *사람과 여권*
		Person_01 p01 = new Person_01("홍길동",25);
		p01.setPassport(new Passport("한국","2024년10월5일"));
		p01.show01();
		System.out.println("======================================");
		
		//2. *방과 전구* 
		
		Room r01 = new Room("6평",2);
		r01.setBulb(new Bulb("흰색",5000));
		r01.showRoom();
		System.out.println("======================================");

	}

}
