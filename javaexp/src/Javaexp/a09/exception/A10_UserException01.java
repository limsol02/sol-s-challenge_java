package Javaexp.a09.exception;

public class A10_UserException01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int cnt=1;cnt<=20;cnt++) {
//			System.out.println("카운트:"+cnt);
//			// 조건문으로 3의 배수일때..예외 던지기 
//			try {
//				if(cnt%3==0) {
//					throw new UserExpt();
//				}
//				if(cnt%3==1) {
//					throw new UserExpt("3의 배수에서 1이 남음!!");
//				}
//			}catch(UserExpt e) {
//				e.call();
//				if(e.getMessage()!=null)
//					System.out.println(e.getMessage());
//			}
//			
//		}
	}
}
//class UserExpt extends Exception{
//	
//	public UserExpt(String msg) {
//		super(msg);// ==> e.getMessage();
//	}
//	public UserExpt() {
//		// TODO Auto-generated constructor stub
//	}
//	public void call() {
//		System.out.println("사용자 정의 예외 출력(3의 배수)");
//	}
//}
/*
# 처리 순서
1. 사용자 정의 예외 처리 클래스 선언
	class XXX extends Exception{}
	
2. main()에서 호출 하는 처리
* */
// ex) 사용자 정의 예외 클래스 UserExpt 선언하고,
//     기능메서드로 void call()로  사용자 정의 예외 출력이라고 출력 추가하는
//     메서드 정의하세요.
//     그리고 반복문에서 이번에는 3의 배수일때, 호출되게 하세요.





