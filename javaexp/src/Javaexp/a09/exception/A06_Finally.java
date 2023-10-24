package Javaexp.a09.exception;

public class A06_Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		# finally
		1. 예외가 발생하건 발생하지 않건 상관없이 수행할 구문이 필요할 때, 사용한다.
		2. 명시적으로 특정한 블럭 구문을 만들어 예외에 상관 없이
		 	처리할 내용을 나타낼 때, 사용한다. 
		 * */
		try {
			String str = null;
			System.out.println(str.toLowerCase());
		} catch (NullPointerException ne) {
			System.out.println("# 예외 발생 #");
		} finally {
			System.out.println("예외 상관없이 처리할 내용");
		}
		System.out.println("========================================");
		
		try {
			String str = "HIMAN";
			System.out.println(str.toLowerCase());
		} catch (NullPointerException ne) {
			System.out.println("# 예외 발생 #");
		} finally {
			System.out.println("예외 상관없이 처리할 내용");
		}
	}

}
