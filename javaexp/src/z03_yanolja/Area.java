package z03_yanolja;

public class Area {
	private String bLoc[];

	public Area(String[] bLoc) {
		this.bLoc = new String[] { "경기", "서울", "충청", "강원", "전라", "경상" };
	}

	public Area() {
		this.bLoc = new String[] { "경기", "서울", "충청", "강원", "전라", "경상" };
		;
	}

	public void locShow() {
		System.out.println("지역별 분류");
		for (int idx = 0; idx < bLoc.length; idx++) {
			System.out.print(idx + ")" + bLoc[idx] + "\n");
		}
		System.out.println("=======================================");
	}

	public void selectLoc(int idx) {
		switch (idx) {
		case 0:
			System.out.println("경기도 - 가평 으로 이동합니다.");
			break;
		case 1:
			System.out.println("서울 - 종로 로 이동합니다.");
			break;
		case 3:
			System.out.println("강원도 - 강릉 으로 이동합니다.");
			break;
		default:
			System.out.println("다른 지역에 남은 숙소가 없습니다.");
			break;
		}
	}
}
