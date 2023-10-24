package Javaexp.a01_start;

public class A03_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ctrl+art+화살표 아래 : 해당 커서의 라인 줄복사
		System.out.println("안녕1");
		System.out.println("안녕2");
		System.out.println("안녕3");
		//println() : 라인 단위로 명령을 출력..
		System.out.print("사과");
		System.out.print("바나나");
		System.out.print("딸기");
		// print() : 줄바꿈 없이 명령을 출력
		// ex1) 친구3명의 이름을 줄바꾸기로 출력하고, 
		// ex2) 좋아하는 음식 3가지를, (콤마)단위로 줄바꾸지 않고 출력해보세요.
		System.out.println();
		System.out.println("#친구 3명");
		System.out.println("이민경");
		System.out.println("안윤희");
		System.out.println("박주연");
		
		System.out.print("좋아하는 음식3가지 : ");
		System.out.print("1)피자,");
		System.out.print("2)라면,");
		System.out.print("3)김치볶음밥");
		System.out.println();
		/*
		 #줄바꿈과 탭간격 특수문자 처리(\가 특수문자)
		 1. 문자열 출력 명령문 안에서 바로 줄바꿈 처리를 할려면
		 \n을 포함하여야 한다. 
		
		 2. 문자열 출력 명령문에서 탭간격으로 데이터를 출력하려면 
		 \t를 포함하여 처리한다
		 * */
		
		System.out.println("사과\n바나나\n딸기\n오렌지");
		
		System.out.println("no\t물건명\t가격");
		System.out.println("1\t사과\t3000");
		System.out.println("2\t바나나\t4000");
		System.out.println("3\t딸기\t12000");
		
		//ex) println으로 학생 3명의 국어점수를 줄바꾸어 출력하세요
		//ex) 학생의 번호, 이름, 영어점수를 탭간격으로 처리하여
		//출력하세요
		
		System.out.println("#학생 3명의 국어점수#");
		System.out.println("이민경:10점\n박주연:20점\n안윤희:5점");
		
		System.out.println("번호\t이름\t영어점수");
		System.out.println("1\t임솔\t40점");
		System.out.println("2\t임봉\t90점");
		System.out.println("3\t임의진\t15점");
		/*
		#printf("출력 format만들기", 매핑할 변수)
		 형식울 선언 후 , 해당 형식안에 들어갈 데이터를 처리하는 형식
		 * */
		String name="홍길동";
		int age = 25;
		double salary = 5000.5134;
		System.out.printf("이름 : %5s%n",name); //%s : 문자열들어가요 , %n 정수형들어가요 -->앞에 5 넣으면 띄어쓰기 5칸
		System.out.printf("나이 : %5d%n",age);
		System.out.printf("연봉 : %4.2f%n",salary);
		//%s : 문자열들어가요(문자열 데이터 처리) , 
		//%d : 정수형들어가요(정수형 데이터 처리)
		//%f : 실수형 데이터 처리
		//%자리수s : 자리수와 문자열 데이터 유형처리
		//%자리수d : 자리수와 정수형 데이터 유형처리
		//%소숫점이상.소숫점이하f : 자리수와 실수형데이터 유형 처리
		
	}

}
