package Javaexp.a08_access.unclefriend;

import Javaexp.a08_access.myfriend.Gildong;
// Gildong과 상속관계에 있는 외부 패키지에서
public class GildongFollower extends Gildong {
	// 상속관계에서 접근 멤버 확인
	public void callGildongInfo() {
		// 상속관계라 굳이 객체 생성안해도됨 (객체만들어서 호출할필요없이 걍 상속으로 받으니까)
//		System.out.println(privCustom); --> private 는 해당 클래스만 가능
//		System.out.println(friendPlan); --> default 는 같은 패키지만 가능
//		goWeekMeeting(); --> default 는 같은 패키지만 가능
		System.out.println(pubAnnouce); // public은 다가능
		System.out.println(msgMyFollwer); // protected 는 상속관계라 외부인데도 가능
	}

}
