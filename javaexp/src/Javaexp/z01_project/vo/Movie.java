package Javaexp.z01_project.vo;

public class Movie {
	String movieName;
	String loc;
	String date;
	String time;
	String seat;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	public Movie( String movieName,String loc,String date, String time, String seat) {
		this.date = date;
		this.time = time;
		this.loc=loc;
		this.movieName = movieName;
		this.seat = seat;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public void showMoiveInfo() {
		System.out.println("##선택하신 영화정보##");
		System.out.println("영화 이름 : " + movieName);
		System.out.println("영화관 : " + loc);
		System.out.println("영화 날짜 : " + date);
		System.out.println("영화 시간 : " + time);
		System.out.println("선택한 좌석 : " + seat);
	}
	
	}
	

