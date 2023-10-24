package Javaexp.a08_access.unclefriend;

import Javaexp.a08_access.myfriend.Gildong;

public class MyUncle {
	public void callGildongInfo() {
		Gildong g = null;   // 얘는 클래스 선언-> public class Gildong{}
		g = new Gildong();  // 얘는 생성자 선언-> public Gildong(){} 
		
		
//		System.out.println(g.privCustom);
//		ㄴ-> 다른 패키지면 당연히 private 접근안됨

//		System.out.println(g.friendPlan);
//		g.goWeekMeeting();
//		ㄴ-> default 접근자 : 외부패키지에 있는 클래스에서 해당 구성요소가
//							접근이 불가능하다.
		
		System.out.println(g.pubAnnouce); // public은 다됨
		
//		System.out.println(g.msgMyFollwer); // 외분데 상속관계가 아니라 호출안됨
	}
}
