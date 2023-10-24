package Javaexp.a08_access.myfriend;

public class Gildong {
	
	//public Gildong(){} // -> 생성자 자동생성
	
	//protected : 상속관계
	protected String msgMyFollwer="하이요! 내팔로우에게는 상금10만원을 드립니다~";
	
	// public : 어디서든 마음대로 ~
	public String pubAnnouce = "구독자 100만 유투버예용";
	
	// default : 같은 패키지에서만 공유하는 정보 
	String friendPlan=" 여름에 제주도 친구들과 여행"; 
	
	// private : 이 클래스에서만 사용가능
	private String privCustom = "이상한 잠꼬대를 한다";
	
	void goWeekMeeting() {
		System.out.println("친구들과 주말 모임");
	}
	
	// 외부에서 호출하는 내용.
	public void callGildongInfo() {
		Gildong g = new Gildong();
		System.out.println(g.friendPlan);
		System.out.println(g.privCustom);
		System.out.println(g.pubAnnouce);
		System.out.println(g.msgMyFollwer);
		g.goWeekMeeting();
	}
}
