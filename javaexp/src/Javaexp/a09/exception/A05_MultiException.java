package Javaexp.a09.exception;

public class A05_MultiException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 다중 예외처리
		1. 최하위 레벨의 예외부터 처리
		2. 마지막에 최상위 예외 처리..
		
		# 상속의 메모리
		1. 상위는 다형성에 의해 하위의 모든 객체를 포함하여야 하기 때문에 
			메모리가 가장 크다.
			ex) int num = 5;
				double num02 = num;
				num = (double)num02;
				double메모리가 int를 포함하기 때문이다.
				
			ex) 다형성에 의해 
				상위 = 하위 를 많이많이 할경우
				상위 메모리가 점점 커져서, 상속한 내용을 다
				포함 하여야 한다. 
		
		# 상속관계에 최상위에 있는 것을 제일 마지막에 처리하여야 한다.
		1. 상속관계에서 위 내용을 기준으로 메모리가 가장 작은 것은
			==> 최하위객체..
		2. 최하위에 있는 작은 메모리로 처리할 수 있는 것은 먼저
			처리하고, 
		3. 그 메모리로 안되는 예외는 점점 더 큰 메모리인 상위 계층의
			메모리로 처리하여야 하기에 계층 구조를 만든다.
		 * */
		
		try {
			String str = args[0];
			int num01 = Integer.parseInt(str);
			System.out.println("입력한 수 : " + num01);
		} catch (NullPointerException ne) {
			System.out.println("ne : " + ne);
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("ae : " + ae);
		} catch (Exception e) {
			System.out.println("최상위 예외 : " + e);
		}
		
		//ex) String str01 = null;
		//	int num01 = Integer.parseInt(str01)
		//	System.out.println(num01/0);
		//	위에서 발생할 수 있는 예외 3가지를 이용해서 최종을 Exception을 계층적으로 처리
		
//		try {
//			String str01 = null;
//			System.out.println(str01.toString());
//			str01 = "이십오";
//			int num01 = Integer.parseInt(str01);
//		}catch(NullPointerException ne) {
//			System.out.println("ne : " + ne.getMessage());
//		}
		
		
		try {
			String str01 = null;
			System.out.println(str01.toString());
			int num01 = Integer.parseInt(str01);
			System.out.println(num01 / 0);
		} catch (NullPointerException ne) {
			System.out.println("ne : " + ne.getMessage());
		} catch (NumberFormatException nfe) {
			System.out.println("nfe : " + nfe.getMessage());
		} catch (ArithmeticException ae) {
			System.out.println("ae : " + ae.getMessage());
		} catch (Exception e) {
			System.out.println("최상위 예외 : " + e.getMessage());
		}

	}

}
