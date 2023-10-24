package Javaexp.a08_access.stroy2.woodcutterhome;

public class WoodCutter {
	/*
	private : 개인적인 비밀
	x : 가족들과 여행계획/ 가족들의 살림(가족들끼리만 얘기함)
	protected : 유산을 숨긴곳
		 	다른 패키지에 있지만, 상속관계가 있는 클래스에서는
		 	접근이 가능한 제어자
	public : 막내딸의 결혼식
	 * */
	private String privSecurity="천사옷은 뒷동산 바위 밑에(같은 클래스만 ㅇㅋ)";
	String savingMoney="가족끼리 쓸 꽁짓돈은 뒷 마당 항아리 밑에(같은 패키지 ㅇㅋ)";
	protected String inhiritance = "아들들 줄 유산은 집 천정위에(상속관계에서 ㅇㅋ)";
	public String announce = "막내딸이 이달 보름에 결혼합니다.(다른패키지도 ㅇㅋ)";
	
	// 상속하는 클래스에서 호출
	public void callWoodCutterInhit() {
		System.out.println("private : "+ privSecurity);
		System.out.println("default : "+ savingMoney);
		System.out.println("protected : "+ inhiritance);
		System.out.println("public : "+ announce);
	}
	
	// 상속하지 않는 일반 클래스호출
	public void callWoodCutter() {
		WoodCutter wc = new WoodCutter();
		System.out.println("private : "+ wc.privSecurity);
		System.out.println("default : "+ wc.savingMoney);
		System.out.println("protected : "+ wc.inhiritance);
		System.out.println("public : "+ wc.announce);
	}
}
