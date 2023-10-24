package Javaexp.a12_stream;

import java.io.File;

public class A05_DirectoryMake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		# 디렉토리도 파일 객체에 의해 생성한다.
		1. 단, mkdir()라는 메서드로 디렉토리 생성.
		 * */
		String path = "C:\\b01_javaexp\\workspace\\Javaexp\\src\\Javaexp\\a12_stream\\";
		File path01 = new File(path+"a03_exp");
		path01.mkdir();
		
		// ex) a01_exp 디렉토리 안에 위 코드 기준
//				a01_dir1~ a10_dir10까지 생성
		
		String path1 = "C:\\b01_javaexp\\workspace\\Javaexp\\src\\Javaexp\\a12_stream\\a01_exp\\";
		for(int i=1; i<=10; i++) {
			String dir01= "a01_dir1"+i;
			File path02 = new File(path1+dir01);
			path02.mkdir();
		}

	}

}
