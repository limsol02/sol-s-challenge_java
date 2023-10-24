package Javaexp.a06_objectreview.vo;

public class Subject {
	private String name ;
	private int pt;
	
	public Subject() {
	}
	public Subject(String name, int pt) {
		this.name = name;
		this.pt = pt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPt() {
		return pt;
	}
	public void setPt(int pt) {
		this.pt = pt;
	}
	
	
}
