package Javaexp.z01_project.vo;

public class Monster {
	String mname;
	int mlevel;
	int mhp;
	int mexp;
	int mdefen;
	int mpower;
	public Monster(String mname, int mlevel, int mhp, int mdefen, int mpower, int mexp) {
		this.mname = mname;
		this.mlevel = mlevel;
		this.mhp = mhp;
		this.mdefen = mdefen;
		this.mpower = mpower;
		this.mexp = mexp;
	}
	public void mshow () {
		System.out.println("#몬스터 정보#");
		System.out.println("몬스터 이름 : "+ mname);
		System.out.println("몬스터 레벨 : "+ mlevel);
		System.out.println("몬스터 HP : "+ mhp);
		System.out.println("몬스터 공격력 : "+ mpower);
		System.out.println("몬스터 방어력 : "+ mdefen);
		System.out.println("몬스터 경험치 : "+ mexp);
	}
	public void mfull ( ) {
		if(mname.equals("달팽이")) {
			this.mhp = 20;
		}
		if(mname.equals("슬라임")) {
			this.mhp = 30;
		}
		if(mname.equals("주황버섯")) {
			this.mhp = 40;
		}
		if(mname.equals("리본돼지")) {
			this.mhp = 50;
		}
		if(mname.equals("스톤골렘")) {
			this.mhp = 60;
		}
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getMlevel() {
		return mlevel;
	}
	public void setMlevel(int mlevel) {
		this.mlevel = mlevel;
	}
	public int getMhp() {
		return mhp;
	}
	public void setMhp(int mhp) {
		this.mhp = mhp;
	}
	public int getMexp() {
		return mexp;
	}
	public void setMexp(int mexp) {
		this.mexp = mexp;
	}
	public int getMdefen() {
		return mdefen;
	}
	public void setMdefen(int mdefen) {
		this.mdefen = mdefen;
	}
	public int getMpower() {
		return mpower;
	}
	public void setMpower(int mpower) {
		this.mpower = mpower;
	}
	

}
