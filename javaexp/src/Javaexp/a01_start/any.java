package Javaexp.a01_start;

import java.util.Scanner;

import z03_yanolja.HellPension;
import z03_yanolja.HopePension;
import z03_yanolja.LovePension;
import z03_yanolja.Payment;
import z03_yanolja.PeacePension;
import z03_yanolja.Pension;

public class any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 LocalDate today = LocalDate.now();
//		 System.out.println(today);
		Scanner sc = new Scanner(System.in);

		int numberOfPeople = 6;

		// 예약 인원 변수
		int checkIn = 1110;
		int checkOut = 1112;

		Pension p01 = new LovePension();
		Pension p02 = new HopePension();
		Pension p03 = new PeacePension();
		Pension p04 = new HellPension();
		Payment m01 = new Payment();
		boolean isCheck01 = numberOfPeople <= 4;
		boolean isCheck02 = numberOfPeople <= 2;
		boolean isCheck03 = numberOfPeople <= 4;
		boolean isCheck04 = numberOfPeople <=6;
		
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

	}

}
