package Javaexp.z01_project.vo;

public class Character {
	String name;
	int level ; 
	int hp ; 
	int power;
	int exp;
	int defen;
	public Character() {}
	public Character(String name, int level, int hp, int power, int defen, int exp) {
		this.name = name;
		this.level = 1;
		this.hp = 100;
		this.power = 10;
		this.defen=10;
		this.exp = 0;
	}
	public void show() {
		System.out.println("#캐릭터 정보#");
		System.out.println("캐릭터 이름 : "+ name);
		System.out.println("캐릭터 레벨 : "+ level);
		System.out.println("캐릭터 HP : "+ hp);
		System.out.println("캐릭터 공격력 : "+ power);
		System.out.println("캐릭터 방어력 : "+ defen);
		System.out.println("캐릭터 현재 경험치 : "+ exp);
	} 
	public void levelUp () {
		level++;
		hp=100;
		power+=7;
		defen+=7;
		exp=0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public void getDefen(int defen) {
		this.defen=defen ;
	}
	public void setDefen(int defen) {
		this.defen =defen;
	}
	
}
