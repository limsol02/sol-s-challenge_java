package Javaexp.a10_api;

import java.util.ArrayList;

public class A06_WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		# Wrapper 클래스
		1. 기본데이터유형을 사용하다보면 여러형태로 변환이 필요하거나
			기능적으로 처리해야되는 경우가 많다. type이 기본 유형으로
			되다보니 형변환이 일어나지 않으면 이러한 기능에 대한 한계가 
			발생한다.
		2. 이 떄, 자바api에서는 기본 데이터유형과 연결되는 객체유형을
			만들어 필요에 따라 제공되는 메서드를 이용해서 
			여러가지 데이터 유형 변경, 치환 기능을 처리할 수 있게
			하는데 이것이 Wrapper 클래스라고 한다.
		3. 형태(기본유형과 연결)
		 	byte => Byte
		 	char => Character(*)
		 	..
		 	int => Integer(*)
		 	double => Double
		 	boolean => Boolean
		 * */
		int num01 = 25; // 기본데이터 유형
		// 기본데이터 유형을 Wrapper클래스(객체)로 만듦
		Integer num01Ob = Integer.valueOf(num01);	
		// 이렇게 객체로 만들면 여러가지 기능메서드 활용가능
		System.out.println(num01Ob.byteValue());
		System.out.println(num01Ob.hashCode());
		System.out.println(num01Ob.MAX_VALUE);
		// 이와 같이 기본데이터 유형을 기능메서드를 이용하기 위해서
		// 객체러 변환하는 것을 Boxing 이라고 한다. 			
		// 이렇게 객체를 이용해서 여러가지 기능을 처리하다가
		// 최종적인 데이터를 다시 기본유형에 할당하여 처리하는 것을
		// UnBoxing 이라고 한다.
		int num02 = num01Ob.intValue();
		System.out.println("언박싱된 num02 : "+num02);
		
		/*
		ex) 위 코드를 기반으로 char 유형과 double유형의
		데이터를 할당하고, Boxing 과 UnBoxing 처리를 해보세요.
		 * */
		
		char c01 = '홍';
		Character c01Ob = Character.valueOf(c01);
		System.out.println("Boxing 된 c : "+c01Ob.charValue());
		System.out.println("Boxing 된 c : "+c01Ob.hashCode()); 
		// 객체 해시코드란 객체를 식별하는 하나의 정수값을 말한다. 그래서 a는 97로 나옴
	
		char c02 = c01Ob.charValue();
		System.out.println("UnBoxing 된 c : "+c02);
		
		double dbl01 = 3.14;
		Double dblObj02 = Double.valueOf(dbl01);
		dblObj02.byteValue(); // 여러가지 메서드 사용
		double dbl02 = dblObj02.doubleValue();
		System.out.println(dbl02);
		
		/*
		#  Auto Boxing/ Auto UnBoxing
		1. 기본데이터 유형을 보다 간편하게 객체형 또는 다시 객체를
			기본 데이터 유형으로 변경하는 처리가 필요로 하는데
			이것을 Auto라고 붙여서 사용한다
		2. Auto Boxing 
			Wrapper 클래스  = 기본데이터;
			이렇게 기본 데이터를 기능 메서드 사용없이 바로 객체에
			바로 할당하는 것을 AutoBoxing 이라고 한다.
		 * */
		
		Integer intOb=30; // 바로 데이터
		System.out.println(intOb.compareTo(40));
		System.out.println(intOb.compareTo(30));
		System.out.println(intOb.compareTo(20));
		// 객체.compareTo(객체) 로 두 값을 비교하고 적으면 -1
		// 같으면 0 많으면 1이었으나.. 바로 AutoBoxing이
		// 일어나서 처리가 가능하다.
		
		// ps) String에서 배웠던 indexOf 는 같으면 0 다르면 -1
		
		int num03 = intOb;
		// 객체도 다시 원래대로 기본유형으로 할당하여 사용할 수 있다.
	
		//ex) Byte, Boolean 으로 AutoBoxing과 AutoUnBoxing을
		//	사용해서 처리되게 하세여
		
		Byte bOb01 = 30;
		float flootNum = bOb01.floatValue(); // float로 데이터 변환 메서드 처리.(객체메서드 사용 예시)
		byte b01 = bOb01; // 기본데이터로 변경
		
		Boolean istrue = true;
		boolean result = istrue.parseBoolean("false"); // 기능메서드 사용
		boolean isnoyflase = istrue; // 기본데이터로 변경.
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(30);
		numList.add(40);
		numList.add(50);
		// 구성요소인 Integer에 기본 데이터 할당, autoBoxing됨..
		int num05= numList.get(1); // = 이후는 Integer객체 , 얘를 기본 데이터 유형에 할당
		// 구성요소에 Integer로 된 내용을 기본 데이터유형으로 할당.
		// autoUnBoxing 처리..
		
		
		System.out.println(bOb01.compareTo(b01));//0
		System.out.println(istrue.compareTo(isnoyflase));//0
		
	
	}

}
