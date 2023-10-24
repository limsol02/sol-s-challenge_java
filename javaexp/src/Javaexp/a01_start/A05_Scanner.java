package Javaexp.a01_start;

import java.util.*; // 외부 객체를 사용할 때, 선언


public class A05_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("이름을 입력하세요");
		// 내장된 객체로 문자열 데이터 입력
		//Scanner sc = new Scanner(System.in);
		// 입력한 데이터를 String으로 하는 name에 할당해서
		// 하단에 출력한다.
		//String name = sc.nextLine();
		//System.out.print("입력한 이름은");
		//System.out.println(name);
		
		//ex)좋아하는 과일명을 입력후 출력하세요
		// 		String Fruit로 문자열에 할당 처리..
		
//		System.out.print("좋아하는 과일을 입력하세요:");
//		Scanner sc = new Scanner(System.in);
//		String fruit = sc.nextLine();
//		System.out.print("입력한 과일은");
//		System.out.println(fruit);
		
//		Scanner sc = new Scanner(System.in);
//	      System.out.print("숫자 N을 입력하세요: ");
//	      int N = sc.nextInt();
//	      for (int i7 = 1; i7 <= N; i7++) {
//	          for (int j = 1; j <= N - i7; j++)
//	              System.out.print(" ");
//	          for (int j = 1; j <= 2 * i7 - 1; j++)
//	              System.out.print(j);
//	          System.out.println();
//	      }
//	      for (int i8 = N - 1; i8 >= 1; i8--) {
//	          for (int j = 1; j <= N - i8; j++)
//	              System.out.print(" ");
//	          for (int j = 1; j <= 2 * i8 - 1; j++)
//	              System.out.print(j);
//	          System.out.println();
//	      }
//	      System.out.println();
		
	      String[] studentNames = {"홍길동", "이순신", "강감찬"};
	      int[] koreanScores = {85, 90, 78};
	      int[] englishScores = {88, 89, 82};
	      for (int i = 0; i < 3; i++) {
	    	  System.out.println( studentNames[i] +"-" +"국어: "+koreanScores[i]+"영어: "+ englishScores[i]);
	      }		
	      System.out.println();


//	      System.out.printf("%s - 국어: %d, 영어: %d%n", studentNames[i], koreanScores[i], englishScores[i]);
	}

}
