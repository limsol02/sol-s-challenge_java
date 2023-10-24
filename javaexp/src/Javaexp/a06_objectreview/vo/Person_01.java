package Javaexp.a06_objectreview.vo;

public class Person_01 {
	private String name;
	private int age;
	private Passport passport;
	
	public Person_01() {
		// TODO Auto-generated constructor stub
	}
	public Person_01(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	public void show01() {
		if(passport!=null) { 
		// 객체가 할당되지 않았을때 passport.getxxx() 에러발생을 위해 굳이 설정
		{System.out.println("##여권 정보##");
		System.out.println("여권 발급국 : "+ passport.getNation());
		System.out.println("여권 유효기간 : "+ passport.getNo());
		System.out.println("##인물 정보##");
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		}
		}else {
			System.out.println("여권 발급 정보가 없습니다.");
		}
	}

}
