package Javaexp.a09.exception;

public class A10_UserException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int cnt = 1; cnt <= 30; cnt++) {
			System.out.println(cnt);
			try {
				if (cnt % 3 == 0) {
					throw new UserExpt(cnt + "번 예외처리!");
				}
//				if(cnt%3==1) {
//					throw new UserExpt("3의 배수에서 1이 남음 ㅎ");
//					
//				}
			} catch (UserExpt ue) {
				ue.setStar("****");
				System.out.println(ue.getStar()+cnt);
				ue.call();
//				[사용자 정의 예외 출력]24번 예외처리!3의배수!
//				"[사용자 정의 예외 출력]" + getMessage()
				
//				if(ue.getMessage()!=null) {
//					System.out.println(ue.getMessage());
//				}
//				****24
			}
		}

	}

}
/*
 # 처리 순서
 1. 사용자 정의 예외 처리 클래스 선언
 	class XXX extends Exception{}
 
 2. main() = 메인메서드에서 호출하는 처리 
 * */
// ex) 사용자 정의 예외 클래스 UserExpt 선언하고
//	기능메서드로 void call()로 사용자 정의 예외 출력이라고 출력추가하는
//	메서드 정의하세요.
//	그리고 반복문에서 이번에는 3의 배수일때, 호출되게 하세여
class UserExpt extends Exception {
	private String star;
	public UserExpt(String message) {
		super(message + "3의배수!");

	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

	
	public void call() {
		System.out.println("[사용자 정의 예외 출력]" + getMessage());
	}

	public String getStar() {
		return star;
	}

	public void setStar(String star) {
		this.star = star;
	}
	
}
