package z03_yanolja;

public class HellPension extends Pension {
	private int reserCnt = 6;
	private int[] reserDate = { 1110, 1111, 1112 };
	private int price = 150000;

	public HellPension() {
		// TODO Auto-generated constructor stub
	}

	public HellPension(int reserCnt, int[] reserDate) {
		this.reserCnt = 6;
		this.reserDate = new int[] { 1110, 1111, 1112 };
		// 금토일 예약가능
	}

	@Override
	public void date(int checkIn, int checkOut) {
		boolean isEmpty = isRPossible(checkIn, checkOut);
		if (isEmpty) {
			System.out.println("HellPension에 원하시는 날짜에 예약이 가능합니다.");
		} else {
			System.out.println("HellPension에 빈방이 없어, 예약이 불가능합니다.");
			System.out.println("=======================================");
		}

	}

	public boolean isRPossible(int checkIn, int checkOut) {
		for (int date : reserDate) {
			if (checkIn < date && checkOut > date) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void pNumber(int numberOfPeople) {
		boolean isRight = numberOfPeople <= reserCnt;
		if (isRight) {
			System.out.println("입력하신 인원은 예약이 가능합니다.");
			System.out.println("HellPension 숙소의 금액은  : " + price + "원 입니다. ");
			System.out.println("=======================================");
		} else {
			System.out.println("입력하신 인원이 초과되어 해당 숙소는 예약이 불가능합니다.");
			System.out.println("=======================================");
		}
	}

	public void service() {

		System.out.println("HellPension에서 이용 가능한 서비스는," + "\n 1. 주차가능 2. 애견동반 3. 개별바베큐 4. 독채펜션 입니다.");
		System.out.println("=======================================");
	}

	public int getReserCnt() {
		return reserCnt;
	}

	public void setReserCnt(int reserCnt) {
		this.reserCnt = reserCnt;
	}

	public int[] getReserDate() {
		return reserDate;
	}

	public void setReserDate(int[] reserDate) {
		this.reserDate = reserDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
