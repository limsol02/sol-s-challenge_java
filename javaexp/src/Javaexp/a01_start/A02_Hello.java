package Javaexp.a01_start;

import java.util.Scanner;

public class A02_Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("두번째 자바 실행");
		// ctrl+shift+f : 소스정리 단축키.. 자동으로 들여쓰기 하면서 정리해줌
		System.out.println("안녕");
		System.out.println("두번째 안녕");

System.out.println("ex2)");
Scanner sc = new Scanner(System.in);

String name = "";

String data = "회원명\t포인트\n";

while (!name.equals("!")) {
	System.out.print("회원명을 입력하세요(종료시 !) : ");
	name = sc.nextLine();
	
	if (!name.equals("!")) {
		data += name + "\t"; // 회원명 누적
		System.out.println("기본 포인트 입력");
		name = sc.nextLine(); //회원 포인트 누적
		data+= name +"\n";}
	}
	System.out.println("#등록회원정보#");
	System.out.println(data);

}}