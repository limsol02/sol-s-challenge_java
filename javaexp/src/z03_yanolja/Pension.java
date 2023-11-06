package z03_yanolja;


public abstract class Pension {
	private int reserCnt;
	private int reserDate;
	
	
	public abstract void date(int checkIn, int checkOut);
	public abstract void pNumber(int numberOfPeople);
	public abstract boolean isRPossible(int checkIn, int checkOut);
	public abstract void service();
	
	
}
