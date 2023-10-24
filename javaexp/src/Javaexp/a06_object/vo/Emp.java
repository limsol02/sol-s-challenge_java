package Javaexp.a06_object.vo;

public class Emp {
	// 기본속성 (private - 외부접근불가)
	private int empno;
	private String ename;
	private String ejop;
	private double salary;
	public Emp() {
		
	//디폴트생성자
		
	}
	public Emp(int empno, String ename, String ejop, double salary) {
		this.empno = empno;
		this.ename = ename;
		this.ejop = ejop;
		this.salary = salary;
	}
	public void show() {
		System.out.println("사원번호 : "+empno);
		System.out.println("사원명 : "+ename);
		System.out.println("직책명 : "+ejop);
		System.out.println("급여 : "+salary);
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEjop() {
		return ejop;
	}
	public void setEjop(String ejop) {
		this.ejop = ejop;
	}
	public double getSalary() {
		return salary;
	}
	public void setSaleary(double salary) {
		this.salary = salary;
	}
	
}
