package Javaexp.a06_object;

public class A09_StaticMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		# static 변수
		1. 클래스를 통해 객체를 생성해서 사용하다 보면,
			동일한 클래스를 통해 나온 객체들이 공유하는 메모리가
			필요로 한다. 이것을 static 변수/메서드 라고 한다.
		2. static은 객체 공유 메모리이기에 변수로는 클래스명.static변수
			로 사용하고, 메서드로는 클래스명.static메서드()로
			사용한다.
			ex) Math.PI : Math클래스의 공유 메모리 영역의 PI사용
				Math.random() Math클래스의 공유 메서드
				영역을 random() 사용..
		
		#상수
		1. 객체에서 한번 할당하면 변경할 수 있는 내용을 상수라고 한다.
			객체별 상수..
		2. static 상수 : 객체들의 공유 메모리이기에 클래스에 한번만 할당되면
			변경되지 않는 수를 말한다. 일반적으로 자바에서 상수는 이 static
			상수를 의미하고 주로 대문자로 사용한다. ex) Math.PI
		 * */
		Member01.no2++;
		// static변수는 객체 생성 하지 않더라도 사용할 수 있다.
		
		Member01 m01= new Member01();
		m01.no1++;
		m01.no2++;
		Member01 m02= new Member01();
		m02.no1++;
		m02.no2++;
		Member01 m03= new Member01();
		m03.no1++;
		m03.no2++;
		// 일반변수는 객체마다 변수가 가지고 있지만 ..
		System.out.println("일반 변수 : "+m01.no1);
		System.out.println("일반 변수 : "+m02.no1);
		System.out.println("일반 변수 : "+m03.no1);
		// static변수는 객체의 공유메모리 이기에 모든 객체가 공유하고 있다.
		System.out.println("static 변수 : "+m01.no2);
		// static변수는 객체의 공통 class변수 라고 하기도 하고,
		// 클래스명.static변수로 사용하기도 하며,
		// 객체 생성없이도 사용할 수 있다.
		System.out.println("static 변수 : "+Member01.no2);
		Member02 m1 = new Member02(5);
		Member02 m2 = new Member02(7);
		Member02 m3 = new Member02(9);
		System.out.println("상수1 : "+m1.no3);
		System.out.println("상수2 : "+m2.no3);
		System.out.println("상수3 : "+m3.no3);
		// m1.no3 = 5; 객체별로 상수를 할당할 수 있다. 변경안됨
		
//		Member03.no04 = 15; // 이미 밑에서 할당해서 얜 더이상 할당안됨
		System.out.println("static final 상수 : "+Member03.NO04 );
		
		// 객체 생성없이 바로 사용가능하다.
		// 사용하는 변수는 static 변수이다.
		Member04.call();
		Member04.call();
		Member04.call();
		Member04.call();
		Math.random();
		System.out.println(Math.PI); // static final
		Math.floor(2.5); // static 메서드.
		Math.round(2.5); // static 메서드.
		Math.ceil(2.5); // static 메서드.
		
	}

}//------------------------------------------------------------------------------------------------------------------------
class Member01{
	int no1;
	static int no2; //공유하는 메모리
}
class Member02{
	final int no3; // 상수
	Member02(int no3){
		this.no3= no3;
	}
}
class Member03 {
	// 객체의 공유 메모리인 클래스 단위로 상수 설정했기에
	// 한번 할당하면 더이상 변경하지 못한다.
	static final int NO04=15; // 초기화 안햇다고 에러남 할당까지같이
}
class Member04{
	static int no; 
	int no2;
	static void call() { // 스테틱 메서드 안에서는 스테틱 변수만 사용가능
		System.out.println("스테틱 메서드(객체 생성없이 사용)");
		System.out.println("스테틱 변수 사용 :"+(++no));
//		System.out.println("일반 변수 사용 : "+(++no2) ); :에러발생
	}
}