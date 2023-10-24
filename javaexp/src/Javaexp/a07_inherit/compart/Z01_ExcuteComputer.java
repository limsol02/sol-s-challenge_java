package Javaexp.a07_inherit.compart;

public class Z01_ExcuteComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1단계 : 공통내용 처리
		// 2단계 : 재정의 기능메서드 내용 처리
		// 3단계 : 다형성 처리
		Part p01 = new Cpu();
		p01.same(); p01.system();
		
		Part p02 = new Ram();
		p02.same(); p02.system();
		
		Part p03 = new Ssd();
		p03.same(); p03.system();
		System.out.println("==================================");
		
		// Part 를 추상클래스로 만들어버렸기 때문에
		// Part p00=new Pert(); 같이 단독객체를 사용해서 
		// p00.same(); 이든지 p00.system(); 의 기능을 사용하지못한다.
		
		
		
	}

}
