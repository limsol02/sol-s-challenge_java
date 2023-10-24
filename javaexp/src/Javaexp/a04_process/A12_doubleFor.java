package Javaexp.a04_process;

public class A12_doubleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		# 중첩 for문
		1. for문 안에 for문 처리하는 내용
		 * */
		//구구단
		for(int grade=2;grade<=9;grade++) {
			for(int cnt=1;cnt<=+9;cnt++) {
				System.out.printf("%dx%d=%d\n",
									grade,cnt,grade*cnt);
			}
		}
		//직사각형모양 별 출력
		for(int row = 1;row<=5;row++) {
			for(int col=1;col<=8;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// ex) 하루의 시:분 표시
		//		0시0분
		//		0시1분
		//		...
		//		1시0분
		//		...
		//		23시59분
		
		for(int hour =0; hour<24;hour++) {
			for(int min = 0; min<60;min++) {
				System.out.println(hour+"시"+min+"분");
			}
		}
		//ex2) 이중for문 활용 행/열 테이블 표시(3행3열) 
		//		(1행1열)  (1행2열)  (1행3열)
		//		....
		//						 (3행3열)
		
		for(int y=1; y<=3;y++) {
			for(int x=1;x<=3;x++) {
				System.out.print("("+x+"행"+y+"열)\t");
			}System.out.println();
		}
		
		//늘어나는 별 그리기
		for(int y=1; y<=10;y++) {
			for(int x=1;x<=y;x++) {
				System.out.print("*");
			}System.out.println();
		}
		
		
		
		
		
	}

}
