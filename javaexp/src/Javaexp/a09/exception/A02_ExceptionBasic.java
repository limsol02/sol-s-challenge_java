package Javaexp.a09.exception;

public class A02_ExceptionBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// cnt1~100까지 줄력 하는 과정을 코딩하되
		// cnt가 50일때, 1/0 을 위와같이 하여 , 예외를
		// 발생하여 예외가 처리되는 코드를 위와같이 처리해보세요
		// A02_ExceptionBasic

//		for (int cnt = 1; cnt <= 100; cnt++) {
//			System.out.println("라인" + cnt);
//			try {
//				if (cnt == 50) {
//					System.out.println("라인" + cnt + 1 / 0);
//				}
//			} catch (Exception e) {
//				System.out.println("##에러발생##");
//				System.out.println("에러발생 내용 : " + e.getMessage());
//			}
//
//		} // 얜 50번째 에서 "에러발생 내용 : / by zero" 만 출력해주고 나머진 계속 진행
		
		System.out.println("프로그램 시작");
		try {
			for (int cnt = 1; cnt <= 100; cnt++) {
				System.out.println("라인" + cnt);
				if (cnt == 50) {
					System.out.println("라인" + cnt + 1 / 0);
				}
			}
		} catch (Exception e) {
			System.out.println("에러발생 내용 :" + e.getMessage());
		} // 얜 50에서 뚝 끊기고
		System.out.println("프로그램 종료");

	}
}