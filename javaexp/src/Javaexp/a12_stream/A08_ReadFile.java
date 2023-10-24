package Javaexp.a12_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A08_ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		# 파일의 내용을 가져오는 Reader객체
		1. 상속관계
			InputStream >(을 상속받아) Reader > FileReader
		2. 내용
			특정한 경로의 파일에 있는 문자열을 읽어와서 화면에 출력하거나,
			변수에 할당하여 원하는 데이터를 사용할 때 활용하는
			객체이다.
		3. 주요 가능 매서드
			1) 생성자 : new FileReader(경로/파일명);
			2) 기능메서드 : read() 글자 한글자씩 code값을 int로 가져온다.
				char 
				타입캐스팅시, 문자로 변환
				공백이나 줄바꿈들도 포함해서 가져온다.
				System.out.print((char)code)
			3) code 값이 -1 일 때, 더이상 문자가 없을 때 이다.
			4) close() 자원해제..
		 * */
		
		String path = "C:\\b01_javaexp\\workspace\\Javaexp\\src\\Javaexp\\a12_stream\\a05fileread\\";
		String fname = "a01_poem.txt";
		try {
			FileReader fin = new FileReader(path+fname);
			StringBuffer sbf = new StringBuffer();
			while(true) {
				int code = fin.read();
				if(code==-1) { // 더이상 데이터 값 없을때까지
					break;
				}
				System.out.print((char)code);
				sbf.append((char)code);
				// 파일에 있는 내용을 화면에 출력
			}
			fin.close();
			System.out.println("\n파일읽기종료");
			System.out.println("#STRINGBUFFER#");
			System.out.println(sbf);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ex) a02_memberList.txt 에 있는 파일의
		// 내용을 가져와서
		// 이름 :@@@, 국어 : @@ , 영어, 수학..
		// 로 출력하세여 hint)문자열.split
		
		String path02 = "C:\\b01_javaexp\\workspace\\javaexp\\src\\Javaexp\\a12_stream\\a04_filewrite\\";
		String fname02 = "a02_memberList.txt";
		
		try {
			FileReader fr = new FileReader(path02+fname02);
			int code02 = fr.read();
			while(true) {
				if(code02==-1) {
					break;
				}
				
			}
			char info[]= {(char)code02};
			String info02 = new String(info);
			String info03[] = info02.split(",");
			for(String slist : info03) {
				System.out.println(slist);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
