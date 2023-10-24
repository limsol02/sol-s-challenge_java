package Javaexp.a10_api;

import java.util.ArrayList;

public class A01_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p01 = new Person();
		System.out.println(p01);
		// Object는 최상위 이기에 다형성에 의해서
		Object ob01 = new Person();
		Object ob02 = "하이";
		Object ob03 = new ArrayList();
		
		
		

	}

}
// 자바의 모든 클래스는 묵시적으로 extends Object로 처리되고있다.
// Object는 자바의 최상위 부모 클래스

/*

 * */
class Person extends Object{

	@Override
	public String toString() {
		return "[비밀은여기에]"+super.toString();
		//super.toString() 이게있어서 걍 내가 메인에서 호출만햇응ㄹ떄 주소값 출력
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
}