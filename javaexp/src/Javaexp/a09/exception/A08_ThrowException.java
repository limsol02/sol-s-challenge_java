package Javaexp.a09.exception;

public class A08_ThrowException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		# throw : 특정한 조건이나 코드에서 강제 예외처리
		1. 기본 코드
			throw new 강제예외 Exception(); 호출..
		 * */
		try {
			System.out.println("#강제 예외 처리#");
			System.out.println("프로세스1");
			System.out.println("프로세스2");
			System.out.println("프로세스3");
			// 특정 라인에서 예외를 던지기 처리..
			throw new Exception("강제 예외 입니다.");
			// 생성자로 넘겨준 문자열 내용은
			// e.getMessag()로 해당 값을 리턴할 수 있다.
		} catch (Exception e) {
			System.out.println("강제 예외 처리 결과 : " +
								e.getMessage());//=강제예외입니다}
		System.out.println("=================================================");
		
		try {
			System.out.println("#강제 예외 처리(for문 )#");
			for (int cnt = 1; cnt <= 10; cnt++) {
				System.out.println(cnt + "번째");
				if (cnt == 5) {
					throw new Exception(cnt + " ,강제 예외 입니다.");
				}
			}
		} catch (Exception e1) {
			System.out.println("강제 예외 처리 결과 : " + e1.getMessage());
		}
		
		// ex) 1~10까지 반복문에서 짝수번쨰에 NullPointerException을 강제처리하세여
		
		for (int cnt = 1; cnt <= 10; cnt++) {
			System.out.println(cnt + "번째");
			try {
				if (cnt % 2 == 0) {
					throw new NullPointerException(cnt + "는 짝수");
				}
			} catch (NullPointerException npe) {
				System.out.println("#짝수번째 예외 발생#");
				System.out.println(npe.getMessage());
				// 아 그니까 예외가 발생한 이유를 출력해주는 앤데
//				얘는
				// 위에서 강제로 예외로 발생시킨 메서드를 cnt + "는 짝수"이걸 그대로 수행을 하는거야?
				// npe.getMessage() 빈칸이면 null로 출력시키고?
			}

		}
		
		
//		try {
//			for (int cnt = 1; cnt <= 10; cnt++) {
//				System.out.println(cnt);
//				if (cnt % 2 == 0) {
//					String str = null;
//					str.toString();
//					throw new Exception(str.toString());
//				}
//			}
//		} catch (Exception e) {
//			System.out.println("강제 예외 처리 결과 : " + e.getMessage());
//		}
		
	}

	}}
