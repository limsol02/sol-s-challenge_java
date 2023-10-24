package Javaexp.z01_project.vo;

public class Card {
	String number;
	String exp;
	String cvv;
	Movie movie;
	public Card() {
		// TODO Auto-generated constructor stub
	}
	public Card(String number, String exp, String cvv) {
		this.number = number;
		this.exp = exp;
		this.cvv = cvv;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	public Movie getMoive() {
		return movie;
	}
	public void setMoive(Movie moive) {
		this.movie = moive;
	}
	public void reservation() {
		if(number!=null&&exp!=null&&cvv!=null) {
			System.out.println("카드결제완료");
			System.out.println("##예약된 영화정보##");
			if(movie!=null) {
				movie.showMoiveInfo();}
			else {System.out.println("영화정보를 입력해주세용");}
		}
	}

}
