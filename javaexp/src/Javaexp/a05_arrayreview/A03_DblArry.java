package Javaexp.a05_arrayreview;

public class A03_DblArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		# 이중 배열
		1. 데이터 유형 [][][] = new 데이터 유형[각 차원의 크기][크기][크기];
			[][] : 차원의 갯수 
		* */
		// 반별 학생의 국어 점수
		// 반이 5반 까지 있고, 한반에 학생이 30명이 있을 때,
		// 국어점수 할당 배열
		int kors[][] = new int[5][30];
		int kors2[][] = new int[5][]; // 5반인데 반 별 학생수
//		int kors3[][] = new int [][]; 에러발생.. 둘다 동적으로는 안됨
		// 반은 5반인데 각반에 학생수를 다르게 할때
		
		kors[0][0] =75;
		kors[0][1] =85;
		kors[1][0] =75;
		kors[1][1] =80;
		kors[1][2] =85;
		// 이렇게 하나하나 지정해서 번호별로, 동적배열을 만들기는 가능
		
		// 1반에 1번 점수 할당.
		kors[0][0]= 70;
		//5반에 30번에 점수 할당
		kors [4][29] = 80;
		//1반 학생들 점수를 임의로 할당
		for(int idx = 0 ; idx<30; idx++) {
			// 1반에 인덱스를 1~30까지 점수 할당
			kors[0][idx]=(int)(Math.random()*101);
			System.out.println(idx+1+"번"+kors[0][idx]);
		}	
		System.out.println("반의 갯수:"  + kors.length );
		System.out.println("2반의 학생의수:"  + kors[1].length );
			
		System.out.println("----------------------------------");
//		for(int idx = 0 ; idx<kors.length; idx++) {
//			//반 돌리기
//			System.out.println(idx+":"+(idx+1)+"반");
//			System.out.println(kors[idx].length+"명");
//			// 번호 돌려서 번호마다 점수넣기
//			for(int jdx=0; jdx<kors[idx].length; jdx++) {
//				kors[idx][jdx] = (int)(Math.random()*101);
//				System.out.println((idx+1)+"반"+(jdx+1)+"번 점수 : "
//										+kors[idx][jdx]+",");
//			}
//		}System.out.println();
		
		// 2차원 데이터가 for문에서 할당하는 구조 이해여부 확인
		// 1. kors.length와 kors.[idx].length의 차이점을 알고 있는지?
		
		// 2. kors[idx][jdx] 왜? 두개를 다른 idx, jdx를 사용해서 
		//		데이터를 할당하고 있는지?
		//		idx의 의미는 무엇이고, jdx의 의미는 무엇인지?
		
		// idx : 반 정보에 대한 index 0부터 시작
		// jdx : 반안에 학생들의 번호 index 0부터 시작
		
		// 3. 2차원 데이터를 for문을 2개 사용해야 하는 이유를 알고 있는지?
		
		// 반/번호라는 계층구조로 2차원 배열을 선언했기 떄문에
		// 반을 접근할 때 for문과 번호를 접근할 때 for문이
		// 필요로 한다.
		
//		ex) 기차가 ktx 1~5호차까지, 각 호차별로 좌석이 60개 있을떄, 
//	 		예약자명을 할당하는 배열을 선언하고 
//		 	1호차 30번, 2호차 2번, 5호차 3번 좌석에 
//		 	홍길동 	  김길동		신길동 을 예약처리하고
//			for문을 통해 출력해보세요 
		
		String [][] seat = new String[5][60] ;
		
		seat[0][29]="홍길동";
		seat[1][1]="김길동";
		seat[4][2]="신길동";
		
		for (int idx = 0; idx<seat.length; idx++) {
			for(int jdx = 0; jdx<seat[idx].length; jdx++) {
				
				if(seat[idx][jdx] != null) {
				System.out.println("좌석 예약 확인 :"+ (idx+1)+"칸 "+
				(jdx+1)+"좌석 "+seat[idx][jdx] +" 예약 완료!");
				}
				
				else {
					System.out.println((idx+1)+"칸 "+
							(jdx+1)+"좌석은 빈좌석입니다. ");
				}
			}
		}
		
		
		
		for (int i = 0; i < seat.length; i++) {
	         for (int j = 0; j < seat[i].length; j++) {
	            System.out.println(i + 1 + "호차"
	            		+ " " + (j + 1) + "번 예약자 : " 
	            			+ seat[i][j]);
	         } 
		}
	}
		
		
	}

