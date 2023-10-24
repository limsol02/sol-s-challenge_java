package Javaexp.a06_objectreview.vo;

public class Passport {
	
	private String nation;
	private String no;
	private Person_01 person;
	public Passport() {
		// TODO Auto-generated constructor stub
	}
	public Passport(String nation, String no) {
		this.nation = nation;
		this.no = no;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public Person_01 getPerson() {
		return person;
	}
	public void setPerson(Person_01 person) {
		this.person = person;
	}
	
	

}
