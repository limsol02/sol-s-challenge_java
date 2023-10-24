package Javaexp.a06_objectreview.vo;

public class Student {
	private int no;
	private String sname;
	private Subject subject;
	
	
	public Student() {
	}
	
	public Student(int no, String sname) {
		this.no = no;
		this.sname = sname;
	}

	public Student(int no, String sname, Subject subject) {
		this.no = no;
		this.sname = sname;
		this.subject = subject;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public void showMyPoint() {
		if(subject!=null) {
			System.out.println("##학생정보##");
			System.out.println("학생 이름 : "+sname);
			System.out.println("학생 번호 : "+no);
			System.out.println("과목 이름 : "+subject.getName());
			System.out.println("과목 점수 : "+subject.getPt());
	
		}
		else {
			System.out.println("시험 보신거맞나요");
	}

}
}