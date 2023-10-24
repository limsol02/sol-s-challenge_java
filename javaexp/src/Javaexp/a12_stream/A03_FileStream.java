package Javaexp.a12_stream;

import java.io.File;
import java.io.IOException;

public class A03_FileStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		# 파일 처리 Stream
		1. 파일을 하드웨어적으로 만들거나, 파일을 소프트웨어적으로 처리하는 
			사용할 때, 활용된다.
		2. api에 있는 File객체
			1) 데이터 코드를 통해서 프로그램의 메모리에 할당해서
				전송/출력할 수도 있고, 하드웨어적으로 특정한
				물리적 파일을 생성하고, 저장할 수도 있다.
			2) 파일 처리 순서
				- 파일객체 생성 : File f01 = new File("경로와 파일명");
				- 기능 메서드를 통해 물리적 파일 생성
					creatNewFile()
			3) 지원하는 여러가지 기능메서드
				creatNewFile() : 파일 생성
				mkdir() : 디렉토리 생성
				mkdirs() : 경로에 없는 모든 디렉토리 생성
				delete() : 파일 또는 디렉토리 삭제, 파일이 있으면
					해당 파일을 물리적으로 삭제 처리
				canExecute() : 실행 파일 여부
				canRead() : 읽을 수 있는지 여부
				canWrite() : 쓸 수 있는지 여부
				getParent() : 파일 이름 리턴
				File getParentFile() : 부모 디렉토리를 File객체로
					생성 후 리턴
				String getPath() : 전체 경로 리턴
				isDirectory() : 디렉토리 인지(boolean)
				isFile() : 파일인지? (boolean)
				long length() : 파일의 저장 크기 선언
				String [] list() : 경로에 포함된 파일명 또는
					서브 디렉토리명 리턴
				File[] listFiles() : 경로에 포함된 파일 및 서브 디렉토리
					목록 전부를 File 배열로 리턴
		 * */
		
		String path = "C:\\b01_javaexp\\workspace\\Javaexp\\src\\Javaexp\\a12_stream\\a01_exp\\";
		// 1. 폴드와 파일을 지정
		String f01Name = path+"a01_file.txt";
		// 2. 파일갹채 선언
		File f01 = new File(f01Name); 
		System.out.println("해당 파일이 있는지 여부");
		System.out.println(f01.exists());
		if(!f01.exists()) {
			try {
				// 파일이 생성될 때 컴파일 예외 처리
				f01.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	// ex) A04_FileMake.Java
	// a02_exp 폴드 만들고 해당안에 파일 생성
	}

}
