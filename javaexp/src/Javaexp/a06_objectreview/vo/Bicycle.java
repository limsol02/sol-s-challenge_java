package Javaexp.a06_objectreview.vo;

public class Bicycle {
	
	public Bicycle() {
		//Bicycle bi01 = new Bicycle();
		System.out.println("매개변수 x-참조변수"+this);
	}
	public Bicycle(String name) {
		//Bicycle bi01 = new Bicycle("임솔자전거");
		System.out.println("매개변수1개"+ this);
		System.out.println("자전거 이름 : " + name);
	}
	public Bicycle(String name,int year) {
		//Bicycle bi01 = new Bicycle("임솔자전거",2);
		System.out.println("매개변수 2개"+this);
		System.out.println("자전거이름 : "+name+"\t"+"자전거연수 : "+year);
	}

}
