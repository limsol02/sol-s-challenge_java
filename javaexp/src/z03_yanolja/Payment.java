package z03_yanolja;

import java.util.Scanner;

public class Payment {
	HellPension h01 = new HellPension();
	private String cardNumber;
	private String expirationDate;
	private String coupon;
	private int point;

	Scanner sc = new Scanner(System.in);

	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getCoupon() {
		return coupon;
	}

	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public void process01() {
		System.out.println("결제를 진행합니다.");
		while (true) {
			System.out.println("할인쿠폰이 있으면 1, 없다면 2 를 입력하세요");
			String a01 = sc.nextLine();
			if (a01.equals("2")) {
				System.out.println("차감할 포인트를 입력하세요");
				 this.point = Integer.parseInt(sc.nextLine());
				System.out.println("포인트를 차감한 결제금액 : " + (h01.getPrice() - point));
				System.out.println("=======================================");
				break;
			} else {
				break;
			}
		}

	}
	public void process02() {
		System.out.println("카드번호를 입력하세요.");
		this.cardNumber=sc.nextLine();
		System.out.println("유효기간을 입력하세요.");
		this.expirationDate=sc.nextLine();
		System.out.println("결제를 완료하였습니다.");
		System.out.println("=======================================");
	}
	public void showPrice() {
		System.out.println("결제금액 : "+(h01.getPrice() - point) );
	}
}
