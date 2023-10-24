package Javaexp.a05_arrayreview;

import Javaexp.a06_object.Puppy;

public class A01_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		# 배열 객체 
		1. 같은 유형의 데이터 여러개를 하나의 메모리에 할당하여 처리
			ex) 기차의 호차
		2. 메모리 입장
			1) stack : heap 영역의 주소값 할당
				배열형태  배열명
			2) heap : 실제 배열 객체 저장
			
		 * */
		// 배열의 선언(heap영역 할당하지 않고, 선언)
		int[] intArry; // 정수형 배열 선언
		double [] dbArry; // 실수형 배열 선언
		String [] strArry; // 문자열 배열 선언
		// 배열의 할당(heap영역에 메모리 할당)
		// 1) 크기지정 : 각 구성요소(index)에 초기값을 할당
		intArry = new int[5]; // 5개 int(정수)형 배열초기값으로 
		//0이 할당된 배열생성
		System.out.println(intArry[0]); //  배열명[index번호]
		System.out.println(intArry[1]); //  배열명[index번호]
		System.out.println(intArry[2]); //  배열명[index번호]
		System.out.println(intArry[3]); //  배열명[index번호]
		System.out.println(intArry[4]); //  배열명[index번호]
//		System.out.println(intArry[5]); //  이건 할당된 크기를 넘는거라 바로 에러
		// 에러발생 5개짜리 정수는 index로 4개까지만 선언하고 호출이 가능하다.
		// ex) 정수형 pts 3개짜리 배열 선언하고 초기값을 확인하세요
		int pts[];
		pts = new int[3];	
		// 객체는 Puppy p01 = new Puppy();
		System.out.println(pts[0]);
		System.out.println(pts[1]);
		System.out.println(pts[2]);
		// 각 배열의 구성요소에서 할당 처리..
		pts[0]=70;
		pts[1]=80;
		pts[2]=90;
		
		strArry = new String [3];
		// String은 객체이기에 초기값이 null에 할당되어있음
		System.out.println(strArry[0]);
		strArry[0] = "오렌지";
		strArry[1] = "사과";
		strArry[2] = "바나나";
		
		/*
		1. 어떤 데이터를 배열처리 할것인가?
			기본데이터유형 ==> 배열 ==> 객체
			String ==> 배열 ==> 객체
			Person ==> 배열 ==> 객체
		2. 초기 크기를 통해서 선언하는 방법?
			new 데이터유형[크기];
			참조변수.length
		3. 초기값에 할당된 내용
		3. index란 무엇인가? index를 통해서 할당 및 호출?
			배열명[0] : 저장/ 호출 둘 다 가능
		 * */
		System.out.println("배열의 크기 : "+ intArry.length); 
		// 5 -->intArry = new int[5];
		
		//자바에서 배열의 선언과 바로 데이터 할당(java에서만 차이가 있다.)
		int pts2[] = {70,80,90}; // 선언과 할당 동시에
		// [70,80,90] 대부분 프로그램은 이렇게 선언하고 초기화값 할당
		int pts3[];
		pts3 = new int[] {80,90,100};
		// 선언 하고 할당할꺼면 new 데이터유형 []으로 하여야한다.
//		pts3 = {80,90,100};
		//바로 이렇게 들어가버리면 바로 에러남
		System.out.println(pts3[0]);
		System.out.println(pts3[1]);
		System.out.println(pts3[2]);
		
		// ex1) double 형으로 선언과 초기화를 바로 처리하는 배열(요소3개)
		// ex2) boolean 형으로 선언후 초기값 설정 처리하는 배열 (요소5개)처리
//		double dbArry1[];
//		dbArry1= new double[] {0.1,0.2,0.3};
		
		double[] dbarry1= {0.1,0.2,0.3};
		System.out.println(dbarry1[0]);
		System.out.println(dbarry1[1]);
		System.out.println(dbarry1[2]);
		
		boolean blArry [];
		blArry = new boolean[] {true,true,true,true,false};
		blArry[1] = false; // 특정한 값 변경... 
		System.out.println(blArry[0]);
		System.out.println(blArry[1]);
		System.out.println(blArry[2]);
		System.out.println(blArry[3]);
		System.out.println(blArry[4]);
//		boolean[] blArry1= {true,true,true,true,false};		

	}

}
