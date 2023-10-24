package Javaexp.a12_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A09_ReaderFileExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "C:\\b01_javaexp\\workspace\\javaexp\\src\\Javaexp\\a12_stream\\a04_filewrite\\";
		String fname = "a02_memberList.txt";
		
		try {
			FileReader fin = new FileReader(path+fname);
			StringBuffer sbf = new StringBuffer();
			
			while(true) {
				int data = fin.read();
				if(data==-1) {
					break;
				}
			sbf.append((char)data);
			}
			fin.close();
			System.out.println("현재 데이터 : "+ sbf);
			
			String []arr = sbf.toString().split("\n");
			// 1단계 : 줄바꿈 자르기
			System.out.println("뽑아온 데이터");
			System.out.println("이름\t국어\t수학\t영어");
			for(String str :arr ) {
//				System.out.println(str);
				String [] arr2 = str.split(",");
				// 2단계 : , 자르기
				System.out.print(arr2[0]+"\t");
				System.out.print(arr2[1]+"\t");
				System.out.print(arr2[2]+"\t");
				System.out.println(arr2[3]);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		try {
//			FileReader fr = new FileReader(path02+fname02);
//			int code02 = fr.read();
//			char info[]= {(char)code02};
//			String info02 = new String(info);
//			while(true) {
//				if(code02==-1) {
//					break;
//				}
//				info02+=(char)code02;
//			}
//			String info03[] = info02.split(",");
//			for(String slist : info03) {
//				System.out.println(slist);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
// ================================================================== 수정		
//		try {
//		    FileReader fr = new FileReader(path02 + fname02);
//		    int code02;
//		    String info02 = "";
//
//		    while ((code02 = fr.read()) != -1) {
//		        info02 += (char) code02;
//		    }
//
//		    String[] info03 = info02.split(",");
//		    System.out.println("이름: " + info03[0] + ", 국어: " 
//				+ info03[1] + ", 영어: " + info03[2] + ", 수학: " + info03[3]);
//
//		    fr.close();
//		} catch (FileNotFoundException e) {
//		    e.printStackTrace();
//		} catch (IOException e) {
//		    e.printStackTrace();
//		}
	}

}
