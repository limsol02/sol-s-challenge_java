package Javaexp.a12_stream;

import java.io.IOException;
import java.io.InputStream;

public class Z01_Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for(int cnt = 1; cnt <=200; cnt++) {
//			System.out.println(cnt +":" + (char)cnt);
//		}
		
//		[1단계:확인] 1. 주문 메뉴를 배열로 선언하고 번호와 함께 리스트한 후,
//		InputStream read()를 통해서 주문 번호를 입력 받아, 출력하세요.
		
		String menu[] = {"짜장면","짬뽕","탕수육","냉면"};
		InputStream is = System.in;
		try {
			System.out.println("메뉴번호입력 : ");
			char code = (char)is.read();
			int idx = code -'0';
			System.out.println(menu[idx-1]);
			//48번부터 0
			//49 ==> 1
			//50 ==> 2
			//51 ==> 3
			//ex) '3'(51) - 48(='0') ==>  3
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 

	}

}
