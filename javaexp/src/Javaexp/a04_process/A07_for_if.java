package Javaexp.a04_process;

public class A07_for_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		#for문에서 if문 활용
		1. 반복문 처리시 여러가지 화면 처리나 조건에 의해서 
			원하는 데이터를 출력할 수 있다.
		2. for문에서 if문 처리 유형
			1) 조건에 따른 출력 형식 처리
		 * */
		//1~100까지 출력하되 각 단위별로 기본 탭간격, 5단위 마다 
		//줄바꿈 처리
		for (int cnt=1;cnt<=100;cnt++) {
			System.out.println(cnt+"\t");
			if (cnt%5==0) {
				System.out.println();
			}
		} 
		
		//1~10까지 홀/짝 표시..
		for(int cnt=1;cnt<=10;cnt++) {
			System.out.println(cnt);
			if(cnt%2==0) {
				System.out.println("(짝)\t");
			} else {
				System.out.println("(홀)\t");
			}
		} System.out.println();
		//ex1) 0~100까지 짝수만 출력하기 2,4,...
		//ex2) 1~100중 3과5의 공배수(3과 5의 배수) 출력하기
		//ex3) 1~100까지 합계 중 1000을 초과하는 최초의 숫자 출력
		//ex4) 1~100까지 숫자 중에 7로 나누었을때 4인 숫자 출력
		//ex5) 10~50까지 숫자 중에 13으로 나누었을때 떨어지는
		//		첫번째 숫자 출력
	
		// ex1) 0~100까지 짝수만 출력하기 2,4,...
		System.out.println("#1번");
		for (int cnt = 0; cnt <= 100; cnt++) {
			if (cnt % 2 == 0) {
				System.out.print(cnt + ",");
			}
		}
		System.out.println();

		// ex2) 1~100중 3과5의 공배수(3과 5의 배수) 출력하기
		System.out.println("#2번");
		for (int cnt = 1; cnt <= 100; cnt++) {
			if (cnt % 3 == 0 && cnt % 5 == 0) {
				System.out.println(cnt);
			}
		}
		System.out.println();

		// ex3) 1~100까지 합계 중 1000을 초과하는 최초의 숫자 출력
		System.out.println("#3번");
		int sum01 = 0;
		for (int cnt = 1; cnt <= 100; cnt++) {
			sum01 += cnt;
			if (sum01 > 1000) {
				System.out.println("1000을 초과한 최초의 숫자 : " + sum01);
				break;
			}

		}
		System.out.println("1000을 초과한 최초의 숫자 : " + sum01);

		System.out.println();

		
//		int first1000=0;        --> 초과할 떄, 번호
//		int sum = 0;			--> 누적 합계
//		boolean isFirst = false;-->첫번째 일 때 , 트루 할당
//		for (int cnt = 1; cnt <= 100; cnt++) {
//			sum += cnt;			--> 누적처리
//		if (sum > 1000) {		-->1000을 넘겼을때
//			if(!isFirst) {		-->isFirst = false; 처음만 처리
//					first1000=cnt;->데이터 할당
//					isFirst = ture;->isFirst = true; 로 변경
//		syso("첫번쨰로 합산이 100ㅐ 오버"+(!isFirst?"없음":first1000));
		
//	}}}
//			
		
		
		
	

		// ex4) 1~100까지 숫자 중에 7로 나누었을때 4인 숫자 출력
		System.out.println("#4번");
		for (int cnt = 1; cnt <= 100; cnt++) {
			if (cnt % 7 == 4) {
				System.out.println("7로 나누었을때 나머지가 4인수" + cnt);
			}
		}
		System.out.println();

		// ex5) 10~50까지 숫자 중에 13으로 나누었을때 떨어지는
		// 첫번째 숫자 출력
		System.out.println("#5번");
		for (int cnt = 10; cnt <= 50; cnt++) {
			if (cnt % 13 == 0) {
				System.out.println("첫번쨰 13으로 나누어지는 숫자 : " + cnt);
				break;
			}
		}

		
		System.out.println("#5번예제 두번째방법");
		int chFirst = 0; //합ㄱㅖ변수
		boolean isFirst2 = false;
		for (int cnt = 10; cnt <= 50; cnt++) {
				if(cnt%13==0) {
					if(!isFirst2) {
						chFirst = cnt;
						isFirst2 = true;
					}
				}
		}
		System.out.println("첫번째 숫자 : " + (!isFirst2?"없음":chFirst));
		
		
		
	}

}
