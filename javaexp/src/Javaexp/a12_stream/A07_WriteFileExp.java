package Javaexp.a12_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A07_WriteFileExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String path = "C:\\b01_javaexp\\workspace\\Javaexp\\src\\Javaexp\\a12_stream\\a04_filewrite\\";
		String fname = "a02_memberList.txt";
		
		try {
			FileWriter fw = new FileWriter(path + fname);
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.println("회원이름을 입력하세여");
				String name = sc.nextLine();
				System.out.println("회원아이디을 입력하세여");
				String id = sc.nextLine();
				fw.append("회원이름 : " + name + "\t");
				fw.append("회원아이디 : " + id + "\n");
				System.out.println("계속 입력 하시겠습니까?(y/n)");
				String isCon = sc.nextLine();
				if (!isCon.equals("y")) {
					System.out.println("입력종료");
					break;
				}
			}

//			fw.write("회원이름 : 홍길동,\t 회원아이디 : hong01\n");
//			fw.append("회원이름 : 김길동,\t 회원아이디 : kim01\n");
//			fw.append("회원이름 : 박길동,\t 회원아이디 : park01\n");
//			fw.append("회원이름 : 신길동,\t 회원아이디 : sin01\n");
			fw.flush();
			fw.close();
			System.out.println("종료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
