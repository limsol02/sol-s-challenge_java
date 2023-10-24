package Javaexp.a06_objectreview;

import Javaexp.a06_objectreview.vo.Car;
import Javaexp.a06_objectreview.vo.CarOwner;

public class A04_ObjvsObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarOwner co01 = new CarOwner("홍길동");
		System.out.println("##자동차 할당이 없을때##");
		co01.showMyCarInfo(); // 차량 객체에 정보가 없을때 나오는 "차가 없으시네요 ㅋㅋ"
		System.out.println("===================================");
		
		System.out.println("##자동차 Car객체에 정보값을 할당했을때##");
		Car c01 = new Car("현대","그렌저",0);
		co01.setCar(c01);
		co01.showMyCarInfo();
		
		co01.buyCar(new Car ("기아","k7",0));
		co01.showMyCarInfo();

	}

}
