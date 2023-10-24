package Javaexp.a08_access.myfriend;

public class Younghee {
	public void callGildongInfo() {
		Gildong g = new Gildong();
		System.out.println(g.friendPlan);
//		System.out.println(g.privCustom);
//		ㄴ-> 같은 패키지라도 다른 클래스라면 private 접근안됨
		g.goWeekMeeting();
		System.out.println(g.pubAnnouce); // public은 다됨
		g.callGildongInfo(); // public이라면 메소드도 언제든 호출가능
		System.out.println(g.msgMyFollwer);
	}
}
