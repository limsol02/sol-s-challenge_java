package Javaexp.a03_calculator;

import java.util.Scanner;

class A03_EquCalcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 비교연산자
		1. 비교를 통해서 논리값 boolean (true/false)을 저장하거나
			출력하는 연산자를 말한다
			>, <, >=, <=, ==(같다), !=(같지않다)
			25>3 : true
			25>=3 : true 크거나or같을떄 자동 or 포함
			25<3 : false
			25=3 : false
			25<=3 : false
			25==3 : false
			25!=3 : ture
			ex) 20세이상은 성년여부를 처리할 때 
				int age = 17
				성년여부 : age >= 20  f
				 age = 60
				성년여부 : age >= 20  t
		
		# 논리연산자
		1. 위의 비교연산자에 의한 결과를 2개 이상으로 연결하여
		2. 논리합 (or) : 비교연산식을 2개이상 처리할때,
			두 조건비교연산식에서 하나이상 true이면 true
			
			ex) 놀이공원에서 나이가 3세미만, 65세이상은 무료입장일때
			무료여부를 체크할때
			age<3 || age>=65 
			
			ex) kor>=80||eng>=80||math>=80
			과목의 점수가 하나만이라도 80점이상이면 true
		3. 논리곱 (and) 
			두 조건비교연산식에서 모두 다 true여야 트루고
			그외는 다 false
			
			ex) 로그인시 아이디와 패스워드 모두다 인증되어야지
				로그인 됨
			ex) 청소년 요금제는 14세이상이고, 19세 미만이여야만 된다
				age>=14 && age<=19
		4. 부정연산자
			위 논리연산식 포함해서 비교연산자가 true이면, false
			위 논리연산식 포함해서 비교연산자가 false이면, true로
			처리되는 연산자 조건식 !(조건식)
			ex) !(age>=14 && age<=19) => 청소년 요금제에 해당하지 않을때 true
			ex) 불합격 하는조건 !(point>=70) 
		 * */
		int age = 25 ;
		System.out.println("성년여부 : " + (age >= 20));
		age=18;
		System.out.println("성년여부 : " + (age >= 20));
		
		int corNum = 3; 
		int inputNum = 2;
		boolean isHit = corNum==inputNum;
		System.out.println("정답여부 : "+isHit);
		System.out.println();
		
//		System.out.println("#놀이공원 입장#");
//		System.out.println("나이를 입력하세요 : ");
//		Scanner sc = new Scanner(System.in);
//		// import 단축키 ctrl + shifh + o 하고 저장까지 (ctrl + s)
//		int inAge = Integer.parseInt(sc.nextLine());
//		boolean isFree = inAge>=65||inAge<3;
//		// 논리합으로 둘중에 하나이상 true 이면 true처리
//		System.out.println("무료여부 : "+isFree);
		
		// ex) scanner를 통해서 국어/영어/수학 점수를 입력받아
		//		논리합 (or)로 하나라도 80점 이상이면 상금여부가 true가 처리되게
		//		하세요..
		// 		1.Scanner 객체 생성
		// 		2.국어 입력 변수로 할당
		// 		3.영어 입력 변수로 할당
		// 		4.수학 입력 변수로 할당
		//		5.상금여부 isDadPrize  로 선언하여 국어>=80|| 영어>=80|| 수학>=80
		//		6.상금여부 출력
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요 : ");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.println("영어점수를 입력하세요 : ");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.println("수학점수를 입력하세요 : ");
		int math = Integer.parseInt(sc.nextLine());
		
		boolean isDadPrize = kor>=80||eng>=80||math>=80;
		
		System.out.println("상금여부 : " + isDadPrize);
		System.out.println();
		
		
		
	}

}
