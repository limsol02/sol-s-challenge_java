package z03_yanolja;

import java.time.LocalDate;
import java.util.Scanner;

public class Reservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("메인화면에서 숙소예약으로 이동 하시겠습니까?\n(1. 네 / 2. 아니오)");
			String a01 = sc.nextLine();
			if (a01.equals("1")) {
				System.out.println("숙소 예약 페이지 입니다.");
				break;
			} else {
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}
		// 메인페이지에서 숙박이동 while문
		Area a01 = new Area();
		System.out.println("지역 검색을 시작합니다.");
		a01.locShow();
		System.out.println("원하는 지역의 번호를 입력하세요.");
		int locIdx = Integer.parseInt(sc.nextLine());
		a01.selectLoc(locIdx);
		System.out.println("=======================================");
		// 지역별 검색 구문

		int todayMD01 = 0;
		// 오늘 날짜 저장변수
		int numberOfPeople = 0;
		// 예약 인원 변수
		int checkIn = 0;
		int checkOut = 0;

		while (true) {
			System.out.println("=======================================");
			System.out.println("오늘 날짜로 기본 설정을 합니다.");
			LocalDate today = LocalDate.now();
			System.out.println("현재 날짜는 " + today + "입니다.");
			System.out.println("날짜를 변경하시겠습니까?\n(1. 네 / 2. 아니오)");
			String a02 = sc.nextLine();
			if (a02.equals("1")) {
				System.out.println("원하는 체크인 날짜를 입력해주세요 [1106~1112 중 입력] ");
				checkIn = Integer.parseInt(sc.nextLine());
				System.out.println("원하는 체크아웃 날짜를 입력해주세요 [1106~1112 중 입력] ");
				checkOut = Integer.parseInt(sc.nextLine());
				System.out.println("=======================================");
				System.out.println("입력한 체크인 날짜 : " + checkIn);
				System.out.println("입력한 체크아웃 날짜 : " + checkOut);
				System.out.println("숙박예정기간 : " + (checkOut - checkIn) + "박");
				System.out.println("=======================================");
				System.out.println("숙박 인원을 입력해주세요");
				numberOfPeople = Integer.parseInt(sc.nextLine());
				System.out.println("숙박인원 :" + numberOfPeople + "명");
				System.out.println("=======================================");
				break;
			} else {
				System.out.println("체크인 날짜는 당일로 설정합니다.");
				System.out.println("원하는 체크아웃 날짜를 입력하세요.[1106~1112 중 입력]");
				checkOut = Integer.parseInt(sc.nextLine());
				int month = today.getMonthValue();
				int day = today.getDayOfMonth();
				String todayMD = day < 10 ? String.valueOf(month) + "0" + String.valueOf(day)
						: String.valueOf(month) + String.valueOf(day);
				todayMD01 = Integer.parseInt(todayMD);
				System.out.println("=======================================");
				System.out.println("입력한 체크인 날짜 : " + todayMD01);
				System.out.println("입력한 체크아웃 날짜 : " + checkOut);
				System.out.println("숙박예정기간 : " + (checkOut - todayMD01) + "박");
				System.out.println("=======================================");
				System.out.println("=======================================");
				System.out.println("숙박 인원을 입력해주세요");
				numberOfPeople = Integer.parseInt(sc.nextLine());
				System.out.println("숙박인원 :" + numberOfPeople + "명");
				System.out.println("=======================================");
				break;
			}
		}
		// 숙박 날짜, 인원 설정 while문
		Pension p01 = new LovePension();
		Pension p02 = new HopePension();
		Pension p03 = new PeacePension();
		Pension p04 = new HellPension();
		Payment m01 = new Payment();
		boolean isCheck01 = numberOfPeople <= 4;
		boolean isCheck02 = numberOfPeople <= 2;
		boolean isCheck03 = numberOfPeople <= 4;
		boolean isCheck04 = numberOfPeople <= 6;

		try {
			p01.date(checkIn, checkOut);
			if (p01.isRPossible(checkIn, checkOut)) {
				p01.pNumber(numberOfPeople);
				if (isCheck01) {
					p01.service();
					m01.process01();
					m01.process02();
				}
			}
			p02.date(checkIn, checkOut);
			if (p02.isRPossible(checkIn, checkOut)) {
				p02.pNumber(numberOfPeople);
				if (isCheck02) {
					p02.service();
					m01.process01();
					m01.process02();
				}
			}

			p03.date(checkIn, checkOut);
			if (p03.isRPossible(checkIn, checkOut)) {
				p03.pNumber(numberOfPeople);
				if (isCheck03) {
					p03.service();
					m01.process01();
					m01.process02();
				}
			}

			p04.date(checkIn, checkOut);
			if (p04.isRPossible(checkIn, checkOut)) {
				p04.pNumber(numberOfPeople);
				if (isCheck04) {
					p04.service();
					m01.process01();
					m01.process02();
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// 입력한 날짜와 인원에 맞춰 숙소 선택 & 결제진행
		System.out.println("### 숙소 예약 정보를 조회합니다. ###");
		System.out.println("예약한 숙소 : HellPension");
		System.out.println("체크인 날짜 : "+checkIn);
		System.out.println("체크아웃 날짜 : "+checkOut);
		System.out.println("숙박인원 : "+numberOfPeople);
		m01.showPrice();
		System.out.println("=======================================");
		
	}

}
