package Javaexp.a12_stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class A02_InputStream_OutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// A02_InputStream_OutputStream.java
		//		정답번호를 입력 :	주의)1 != '1' 오 ! = 가 합쳐지면 자동으로 != 이 되네 ㅋㅋㅋㅋ = > 도 합쳐지면=> 자동 화살표
		// 		입력된 번호 : @@
		
		System.out.print("정답번호를 입력하세요 : ");
		InputStream is = System.in;
		OutputStream os = System.out;

		try {
			int numCode = is.read();
			// ㄴ=>'A' ==> 65
			System.out.println("입력된 번호는");
			os.write(numCode);
			// OutputStream 의 write()에서는
			// 숫자 코드값을 char로 변환하여 출력처리..
			
			// 이거하면 내가 콘솔창에 입력한거 한번 더 출력해줌
			System.out.println("\n입력된 코드값 : "+numCode);
			System.out.println("입력된 번호 :" + ((char) numCode));
			// 밑에 os닫기전에 처리해놔야 얘도 출력됨
			
			// Stream의 자원해제..
			os.flush(); // 이거쓰면 내가 입력했던 데이터가 날라감
			os.close(); // close하면 이제 내가 더이상 입력 못하게 닫아줌
			is.close();
			// 약간 같이 세트로 다닌다고 생각하면 편함

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
