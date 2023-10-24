package Javaexp.a06_objectreview.vo;

public class Bulb {
	private String color;
	private int price;
	private Room room;
	public Bulb() {
		// TODO Auto-generated constructor stub
	}
	public Bulb(String color, int price) {
		this.color = color;
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public void showBulb() {
		System.out.println("전구 색상  : "+color);
		System.out.println("전구 가격  : "+price);
	}

}
