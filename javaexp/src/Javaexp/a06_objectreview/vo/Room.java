package Javaexp.a06_objectreview.vo;

public class Room {
	private String space;
	private int cnt;
	private Bulb bulb;
	public Room() {
		// TODO Auto-generated constructor stub
	}
	public Room(String space, int cnt) {
		this.space = space;
		this.cnt = cnt;
	}
	public String getSpace() {
		return space;
	}
	public void setSpace(String space) {
		this.space = space;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public Bulb getBulb() {
		return bulb;
	}
	public void setBulb(Bulb bulb) {
		this.bulb = bulb;
	}
	public void showRoom(){
		System.out.println("##방 정보##");
		System.out.println("방 평수 : "+space);
		System.out.println("방의 전구 갯수 : "+cnt);
		if(bulb!=null) {
			System.out.println("##전구정보##");
			bulb.showBulb();
		}else {
			System.out.println("정보값이 없습니다.");
		}
	}

}
