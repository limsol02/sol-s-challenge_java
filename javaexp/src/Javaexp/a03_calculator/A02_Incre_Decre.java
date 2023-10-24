package Javaexp.a03_calculator;

public class A02_Incre_Decre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		#증감연산자
		1. 기본 : 1씩 증가/감소 처리
			++변수 : 증가하고 해당라인에 표시
			변수++ : 해당라인에 표시하고 증가
			--변수 : 감소하고 해당라인에 표시
			변수-- : 해당라인에 표시하고 감소
		#누적연산자
		1. 2개이상 증가/감소 하고 싶을때?
		
		 * */
		int no = 0; //[0]
		System.out.println(++no); // 증가시키고 출력 : [1]
		System.out.println(++no); // [2]
		System.out.println(++no); // [3]
		System.out.println(no++); // 출력하고 증가[3]이 이미 출력되고 나~중에 더하기
		System.out.println(no++); // [4] +1
		System.out.println(no++); // [5] +1
		System.out.println(--no); // [6-1=5]
		System.out.println(--no); // [4]
		System.out.println(--no); // [3]
		System.out.println(no--); // [3]-1
		System.out.println(no--); // [2]-1
		System.out.println(no--); // [1]-1
		System.out.println("최종데이터 : "+ no);
		
		//#누적연산자 : 2개 이상씩 증가 감소 원츄
		
		int no2=0;
//		int no3,no4,no5;
//		no3=no4=no5=7;
		//연산식은 왼쪽에서 오른쪽흐름, 위에서 아래흐름이 기본.
		//단, 대입연산자(=)가 있으면 오른쪽에서 왼쪽으로 대입된다. 
		no2 = no2 +2; // 2
		no2 = no2 +2; // 4
		no2 = no2 +2; // 6
		no2 +=2; // 위연산식과 동일함
		no2 +=2;
		no2 +=2;
		no2 +=2;
		no2 +=2;
		System.out.println("최종결과값 : "+ no2);
		
		no2+= 5; // 이러면 5씩늘어나
		
		//ex1) no3을 초기값 0 으로 설정하고 3씩 3번 증가한 결과값을 출력하세요
		//ex2) no9를 초기값 10으로 설정하고 1씩 ㄱ감소 5번한 내용을 출력하세요
		//ex3) no5를 초기값 100으로 설정하고, 2씩 5번 감소한 내용을 출력하세요
		
		int no3 = 0; 
		no3 += 3;
		no3 += 3;
		no3 += 3;
		System.out.println("no3의 최종결과물 : " + no3);
		
		
		int no9 = 10;
		no9 -=1;
		no9 -=1;
		no9 -=1;
		no9 -=1;
		no9 -=1;
		System.out.println("no9의 최종결과물 : " + no9);
		
		int no5 = 100;
		System.out.println(no5);
		no5 -= 2;
		no5 -= 2;
		no5 -= 2;  //
		no5 -= 2;
		no5 -= 2;
		System.out.println("no5의 최종결과물 : " + no5);
		
		
		int num01 = 1;
		System.out.println("#사칙 누적 연산#");
		System.out.println("num01*=2 : "+(num01*=2));
		System.out.println("num01*=2 : "+(num01*=2));
		System.out.println("num01*=2 : "+(num01*=2));
		
		System.out.println("num01/=2 : "+(num01/=2));
		System.out.println("num01/=2 : "+(num01/=2));
		
		System.out.println("num01%=2 : "+(num01%=2));
		System.out.println("num01%=2 : "+(num01%=2));
		
		

} 
}
