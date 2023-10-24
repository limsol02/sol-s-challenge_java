package Javaexp.a05_array;

public class A03_MultiArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		기본데이터 유형 ==> 배열 ==> 배열안에 배열(다차원배열)==> object(객체)=2차원의 데이터를 다 포함할수있는거
		
		# 다차원 배열
		1. 배열이 2차원 이상인 경우를 말한다.
			- 변수는 초기에 한개의 데이터를 할당한다.
			- 1차원의 배열에는 두개 이상의 데이터를 하나의 이름으로
				index로 구분하여 연속적으로 할당한다.
			- 2차원 이상 배열은 위 1차원 배열이 여러 개를 
				처리하는 것을 말한다.
		2. 자바의 1차원 배열을 이용하요 2차원 이상의 배열을 처리한다.
			1) 선언
				-1차원 배열
					데이터 유형[]배열명;
					ex) 기차의 호수 (직진느낌)
				-2차원 배열
					데이터유형[][] 배열명;
					ex) 기차의 호차가 있고, 그안에 좌석번호(1~60)
				-다차원 배열
					데이터유형[][][]...배열명;
					ex) 학년 반 번호
			2) 데이터 할당
				- 1차원 배열
					배열명 = new 데이터유형[크기];
					배열명[index번호]; -->접근방법
					배열명.lenght
				- 2차원 배열
					배열명 = new 데이터유형[상위차원갯수][하위차원갯수];
					배열명[상위차원index번호][하위차원index번호];
					ex) 기차가 5호차까지 있고,
					각 호차마다 좌석이 60좌석이 있을 때..
					train = new 기차[5][60];
					(접근할때)train[0][0];
					//index는 0부터 시작, 위에코드가 말하는건 첫번째 호차의 첫번째 좌석
				
				
		 * */
		boolean [][] trainSeats = new boolean[5][60];
		//기차 5개 호차가 있고, 각 호차마다 좌석 60개가 있는데
		//각 좌석에 비어있으면 false, 좌석이 차 있으면 true로
		//처리하는 2차원 구조의 배열 선언..
		System.out.println("1호차의 첫번쨰 좌석 : "+trainSeats[0][0]);
		System.out.println("5호차의 마지막 좌석 : "+trainSeats[4][59]); 
		// 야 솔아 호출할땐 index번호 하나씩 줄여써라 0 부터 시작한다 선언할떄 크기랑헷갈리지마라
		
		//예약처리(true로 처리)
		//ex1) 3호차의 40번 
		trainSeats[2][39] = true ;
		//ex2) 4호차의 2번
		trainSeats[3][1] = true ;
		//ex3) 5호차의 16번
		trainSeats[4][15] = true ;
		
		System.out.println("3호차의 40번쨰 좌석 : "+trainSeats[2][39]);
		System.out.println("4호차의 2번쨰 좌석 : "+trainSeats[3][1]);
		System.out.println("5호차의 16번쨰 좌석 : "+trainSeats[4][15]);
		
		
		// 학년에 반과 번호에 해당하는 점수
		// 	한학년에	여섯반, 20명씩 --> 국어점수 할당
		// 3학년 6반이 있고 각반 20명 국어점수처리 2차원배열...
		int [][] kors = new int[6][20];
		// 3반 2번학생의 80점
		// 4반 16번 학생의 90
		// 5반 7번  85점
		kors[2][1]=80; 
		kors[3][15]=90; 
		kors[4][6]=80; 
		System.out.println("반의 수 : "+ kors.length); // 상위의 배열크기
		System.out.println("하나의 반의 학생수 : "+kors[0].length); // 각 단위 하위의 배열크기
		for(int clsIdx=0; clsIdx<kors.length; clsIdx++) {
			System.out.println(clsIdx+1+"반의 점수");
			for(int noIdx=0; noIdx<kors[clsIdx].length; noIdx++) {
				System.out.println("\t"+(noIdx+1)+"번호점수"+kors[clsIdx][noIdx]);
			// 배열명 [상위index][하위index]
			}
		}
	}

}
