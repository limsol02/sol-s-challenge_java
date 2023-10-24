package Javaexp.a11_collection.vo;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	@Override
	public String toString() {
		int tot = kor+eng+math;
		int avg = tot/3;
		return "이름 : "+name+",국어 : "+kor+",영어 : "+eng+",수학 : "+math+
				", 총점 : "+tot+", 평균 : "+avg;
	}
	
}
