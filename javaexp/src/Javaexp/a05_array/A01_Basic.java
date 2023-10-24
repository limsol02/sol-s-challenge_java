package Javaexp.a05_array;

public class A01_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		# 객체형태의 메모리 구조
		1. 배열부터는 객체로 포함되어 stack영역과 heap영역을
		  	둘다 활용하여 사용한다.
		2. 즉, heap영역에 실제 객체의 메모리를 사용하고, stack영역
			에서는 이 heap영역의 주소값을 저장해서 가지고 있다.
			ex) 도서관에서 도서를 찾는 단말기에서 도서의 위치정보를 
			가지고 있고, 실세 이 위치정보를 찾아가면 도서관에 특정한 
			곳에 책이 있는 것에 비유할 수 있다.
		3. 객체의 선언과 할당.
			1) 객체는 new 키워드나 객체 생성 설정으로 
				참조(heap영역 참조)변수로 선언하여 할당한다.
		4. 배열 객체의 사용 단계
			1) 변수선언
				타입[] 배열명;
			
			2) 배열선언과 할당.
				배열명 = new 타입[배열의 갯수];
				현재 단계까지는 배열에 default 데이터만 할당된
				상태 즉, int[]일 경우 0이 각 구성요소에 할당.
				String[]일 경우 null이 할당.
				double[]일 경우 0.0이 각 구성요소에 할당.
			
			3) 각 구성요소 데이터 할당.
				배열명[index번호] = 데이터;
				index번호 : 0부터 시작하는 index번호에 실제
				사용할 데이터를 할당한다.
				ex) int [] arry = new int [3];
				arry[0] = 5;
				arry[1] = 10;
				arry[2] = 15;
				arry : 배열의 heap영역 주소값 할당.
				arry[0] =5 ; 각 구성요소에 실제 데이터 할당.
				
			4) 배열의 선언 + 초기값 할당 처리
				double[]arry= {10.7,20.5,30.17};
				이와같이 선언과 동시에 0.0이외에 초기값을 할당하는
				처리를 한번에 할 수 있다. 
				arry : heap영역 주소값
				arry[0] : 첫번째 데이터 0.7에 할당되어 있음..
		 */
		
		int intArry[]; // 배열 선언.
		intArry = new int[5]; // 배열의 초기값 할당된 heap영역선언
		System.out.println("int형 배열의 참조변수 : "+intArry);
		//[I@58ceff1 ------------->[I : 정수형 배열
		//[I@58ceff1 ------------->8ceff1 : 16진수로 heap영역의 주소
		System.out.println(intArry[0]);
		System.out.println(intArry[1]);
		System.out.println(intArry[2]);
		System.out.println(intArry[3]);
		System.out.println(intArry[4]);
		//[I@58ceff1이 위치에 0이 할당이 된거임
		
		//ex) long형 3개짜리 배열을 선언/생성 참조변수 호출, 
		//	첫번째 데이터 출력
		//ex) double형 5개짜리 배열 선언/생성 참조변수 호출,
		//	두번째 데이터 출력
		//ex) String형 3개짜리 배열 선언/생성 1번째 데이터 출력
		
		long longArry[]; longArry = new long[3]; // =long[]larry = new long[3];
		System.out.println("long형 배열의 참조변수 :" + longArry);
		System.out.println(longArry[0]);
		
		double doubleArry[]; doubleArry = new double[5];
		System.out.println("double형 배열의 참조변수 :" + doubleArry);
		System.out.println(doubleArry[1]);
		
		String stringArry[]; stringArry = new String[3];
		System.out.println("string형 배열의 참조변수 :" + stringArry);
		System.out.println(stringArry[0]);
		
		
	}

}
