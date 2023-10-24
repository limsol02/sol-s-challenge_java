package Javaexp.a06_objectreview.vo;

public class Employee {
	private String name;
	private int age;
	private Office office;
	
	
	public Employee () {
	}
	public Employee(String name, int age, Office office) {
		this.name = name;
		this.age = age;
		this.office = office;
	}
	public void showMyOfficeInfo() {
		System.out.println("##정보##");
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("회사정보 : "+ office.loc);
		System.out.println("회사정보 : "+ office.capcity);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Office getOffice() {
		return office;
	}
	public void setOffice(Office office) {
		this.office = office;
	}
	
}
