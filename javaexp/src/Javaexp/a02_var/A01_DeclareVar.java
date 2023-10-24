package Javaexp.a02_var;

// class 클래스명 : 영어대문자로 시작
public class A01_DeclareVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*
			 #변수의 선언.
			 1. 기본형식
			 	1) 선언
			 	 데이터유형 변수명; ex) int num01;
			 	2) 할당
			 	 변수명 = 데이터 ex) num01 = 25
			 	3) 활용
			 		출력 Syste.out.println(변수명);
			 		데이터변수에 할당 및 연산 : 다른변수명 = 변수명 + 25;
			 			ex) int num02 = num01 + 25;
			 2. 응용(복합)
			 	1) 선언 + 할당
			 		데이터 유형 변수명 = 데이터; ex) int num02 = 30;
			 	2) 선언 + 할당 + 대입
			 		데이터유형 변수명 = 변수명 + 데이터;
			 3. 주의(에러발생)
			 	1) 변수는 기본적으로 초기화하지 않으면 사용(활용)할 수 없다.
			 		즉, 최소한 데이터를 할당한 후에 사용해야지, 선언으로 
			 		사용할 수 없다.
			 		int num01;
			 		System.out.println(num01); (x)
			 		int num02 = num01 + 25; (x)
			 
			 **/
		
			//숫자형 데이터의 기본 데이터인 정수형 데이터 선언
		int num01; //선언
		num01 = 25; //할당
		System.out.println(num01); //출력
		int num02 = num01 + 25; // 다른 변수에 재할당
		System.out.println(num02);
		// 출력시, +(연결)을 통해서 문자열과 함께 출력가능
		System.out.println();
		
		System.out.println("첫번째 정수 :" + num01);
		System.out.println("두번째 정수 :" + num02);
		System.out.println();
		// 물건의 가격을 선언/할당 분리하고,
		// 물건의 갯수는 선언 + 할당 동시에 하여,
		// 물건의 가격 : @@
		// 물건의 갯수 : @@
		// 형식으로 출력되게 하세요..
		
		int price; 
		price = 1000;
		System.out.println("물건의 가격 :"+price);
		int cnt = 3;
		System.out.println("물건의 갯수:"+cnt);
		int tot = price*cnt; //여기에서 사용된 tot 때문에 밑에 예제에서 int tot 사용 불가능
		System.out.println("총계 :"+tot);
		System.out.println();
		
		/*
		 #변수명의 선언과 규칙
		 1. 필수(에러발생)
		 	1) 반드시 숫자가 아닌 문자로 시작하여야 한다.
		 		ex) int 25Num01l (x)
		 		    int num01; (o)
		 	2) 공백을 포함해서는 안된다
		 		ex) int num 01 (x)
		 	3) 특수문자는 $, _만 선언이 가능하고 다른 특수문자는
		 	   사용할 수 없다.
		 		ex) int $nun01=25; (o)
		 		    int num01# = 30; (x)
		 		    int set_num =40; (o)
		 	4) 대소문자는 구분한다
		 		ex) int num01 = 30;
		 		    int Num01 = 50;
		 		    n/N이 다르므로 다른 변수로 인식한다
		 	5) 미리 지정된 예약어를 변수로 사용할 수 없다.
		 		ex) int break = 50; (x)
		 		    int for + 30; (x)
		 		ex) int berak01 = 50; (o)
		 		    int for01 = 30; (o)
		 		 예약어를 피하기 위해 변수명+01 등으로 numbering 
		 		 울 처리하는 경우도 있다.
		 	6) 이전에 선언된 변수는 다시 선언시, 에러발생
		 		 ex) int num01 = 30;
		 		     int num02 = 50; (x)
		 		     num01 = 35; (o)
		 2. 가독성을 위해서 준수할 내용(에러발생하지 않음)
		 	1) 클래스명은 대문자로 시작한다.
		 	2) 일반 변수명/매서드명은 소문자로 시작한다.
		 	3) 상수(한번 할당하면 변하지 않는 수)는 대문자로 선언
		 		final int PI(변하지않는수 대문자) = 3.14; 
		 	4) 합성어는 구분자로 _, 구분시작시 대문자로 처리한다.
		 		ex) int num_age01 = 50;
		 		    int numAge01 = 25;
		 		 
		 		    
		 
		 
		 * */
		
//		int 25num; 숫사먼저사용 안돼
//		int 30num = 50; 
//		int num age = 50; 공백안돼
		int $tot = 50; //특수문자는 _ $ 만
//		int #sum = 20;
//		int break = 50;
		int break01 = 50;
		int num03 = 40;
//		int num03 = 50; 같은 데이터 다시 선언하면 에러발생
		num03 = 21;
		// ex) 국어, 영어, 수학 점수를 선언과 할당하고,
		//     총점(+), 평균(/) 연산자를 활용해서 총점과
		//     평균을 출력하시오
		
		
		int kor = 80 ;
		int eng = 70 ;
		int math = 60 ;
		int tot01 = kor + eng + math; //위에 tot변수있어서 뒤에 01 붙이기
		int avg = tot01/3;
		
		System.out.println("#학생의 성적#");
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("국영수의 총합:"+ tot01); 
		System.out.println("국영수의 평균:"+ avg);
		System.out.println();
		/*
		 #var 변수사용
		 1. 자바 10 이후에는 var 변수로 데이터가 할당된 후,
		 데이터 유형이 정해지게 처리하였다.
		 * */
		
		var num10 = 25;
		var str01 = "안녕";
		System.out.println("num01:"+num01);
		System.out.println("str01:"+str01);
		System.out.println();
		/*
		 # 문자열의 데이터 처리
		 1. 문자열(문자의 배열) 데이터는 일반적으로 많이 사용하는 
		 문자데이터 처리를 위한 것이다. 배열이기에 객체개념이 포함해서
		 기본 데이터유형에 포함되지 않는다.
		 2. 다만, 아래와 같이 선언하여 사용하는 것을 확인해보자.
		 String str01 = "문자열1";
		 
		 * */
		
		String str02 = "홍길동";
		var name01 = "사과";
		
		System.out.println("이름:"+str02);
		System.out.println("과일명:"+name01);
		System.out.println();
		// ex1) 다음의 변수를 선언하고 초기화처리
		// 1)정수형 변수 age에 25를 할당하세요.
		// 2)문자열 변수 name에 "john"을 할당하세요.
		// 3)문자열 변수 greeting에 "Hello," 를 할당하고,
		//   문자열 변수 person에 "Alice"를 할당하세요
		//   두 변수를 사용하여 "Hello, Alice"라는 메세지를
		//   출력하는 코드를 작성하세요 (+)활용
		
		int age = 25;
		String name = "John"; // var name도 사용가능
		String greeting = "Hello,";
		String person = "Alice";
		System.out.println(greeting + person);
		
		/* 
		# 여러변수를 한번에 초기화 처리 
		 */
		int no1,no2,no3,no4,no5 ;
		no1=no2=no3=no4=no5=0;
		//여러변수를 한번에 선언과 한번에 초기화 처리.

	}

}
