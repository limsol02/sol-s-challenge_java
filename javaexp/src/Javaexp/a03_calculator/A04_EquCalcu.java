package Javaexp.a03_calculator;

import java.util.Scanner;

public class A04_EquCalcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 두개이상의 조건이 모두 다 true일 때,
		 1) 숫자인 경우 연속된 범위에 있을 때,
		 	-청소년 요금제 범위(나이가 14~19),
		 	-점수의 유효 범위(0~100)
		 2) 입력된 id와 password가 다 맞을떄 인증여부가 true 처리.
		 	-String 객체 api에서 한번 더 언급(java만 그래요)
		 * */
		
		int inputAge = 18;
		boolean isAdolpay = inputAge>=14 && inputAge<=19;
		System.out.println("입력한 나이 : " + inputAge);
		System.out.println("청소년 요금제여부 : " + isAdolpay);
		
//		Scanner sc = new Scanner(System.in); 
//		System.out.println("로그인#");
//		System.out.print("아이디 입력 : ");
//		String id = sc.nextLine();
//		System.out.println("himan여부 : "+ (id=="himan"));
//		System.out.println("himan여부 : "+ (id.equals("himan")));
//		
//		//System.out.print("아이디 입력 : ");
//		//String pass = sc.nextLine();
//		//걍 지금은 자바에서는 문자열 비교할때는 equals() 이거씀 자세한 이야기는 나중에!
//		// == : stack 영역의 데이터 비교
//		
//		System.out.print("패스워드 입력 : ");
//		String pass = sc.nextLine();
//		System.out.println("입력한 아이디 " +id);
//		System.out.println("입력한 패스워드 " +pass);
//		//himan과 7777압력시 로그인이 성공된더ㅏ
//		boolean isValid = id.equals("himan") && pass.equals("7777");
//		System.out.println("로그인성공여부 : " + isValid);
		
		//ex1) 점수를 입력해서 입력된 점수가 유효한지 여부를 출력하세요.
		//	 유효범위(0~100)
		//ex2)
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("점수를 입력하세요 : ");
//		int score = Integer.parseInt(sc.nextLine());
//		boolean isValid = 0<=score && 100>=score ;
//		System.out.println("입력된 점수 : " + score);
//		System.out.println("유효한 점수인가요?" + isValid);
		
		/*
		# !(not) : 부정연산자
		1. 논리식을 처리할 때, true이면 false, false이면 true를 
			처리해야 하는 경우가 있다. 이때, 활용하는 논리연산자가
			부정연산자 !(not) 이다.
		2. 기본적인 비교연산식을 ture <=> false로 처리할 뿐 아니라
			-!(age>=18) ===> age<18 
		3. and,or 가 포함된 논리연산자는 !을 통해서 드로므강법칙이
			적용된 내용을 처리해준다.
			- 조건1 && 조건2 ==> 조건1이 true이고 조건2가 true일 때.
			- !(조건1 && 조건2) ==> 드모르강법칙에 의해
				!조건1 || !조건2 로 처리를 하는 경우이다. 
			- && -> || , ||->&&
			ex) himan//7777이 인증 조건이라면
				로그인 되지 않을 조건은 himan이지 않거나 7777이 아닌경우
				를 말한다.
				-!(himan&&7777) --> !himan || !7777
				-age>=65 || age<3 : 무료
				-!(age>=65 || age<3) : 유료
				   -> age<65 && age>=3 : 유료
		 * */
		
		int pt =80;
		boolean isPass = pt>=70;
		System.out.println("합격여부 : " + isPass);
		System.out.println("불합격여부 : " + !isPass);
		
		int age = 20;
		boolean isFree = age>=65 || age<3 ;
		System.out.println("무료여부 : " + isFree);
		System.out.println("유료여부 : " + !isFree);
		
		//1~10까지 임의의 수를 출력하고
		//1. 홀수이면서 3의 배수인경우와 
		// %2==0 짝수, 점수%3==0 3의배수
		//2. 짝수이거나 3의 배수가 아닌 경우를 위 !(not) 연산자를 이용해 출력
		
//		Scanner sc = new Scanner(System.in);
//		int
//		System.out.println("숫자를 입력하세요 : ");
//		int  = Integer.parseInt(sc.nextLine());
	
//		int num = (int)(Math.random()*10+1);
//		System.out.println("1~10중에 임의로 출력 : " + num);
//		boolean isOdd3Dbl = num%2==1&&num%3==3;
//		System.out.println("홀수이면서 3의배수여부 : "+isOdd3Dbl);
//		System.out.println("짝수이거나 3의 배수가 아닌경우 : "+ !isOdd3Dbl);
		
		
		int ran = (int)(Math.random()*10+1);
		System.out.println("1~10중 임의의 수 : " + ran);
		boolean isOdd3 = ran%2==1 && ran%3==0 ;
		System.out.println("홀수면서 3의 배수 : " + isOdd3 );
		System.out.println("짝수이면서 3의 배수 아닌경우 : " + !(isOdd3) );
		
		
				
		

		
		
	}

}
