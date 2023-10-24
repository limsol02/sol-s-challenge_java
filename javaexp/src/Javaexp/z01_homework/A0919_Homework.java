package  Javaexp.z01_homework;

import java.util.Scanner;

public class A0919_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. 아래 내용을 2중 for문을 활용하여
//		   1) 2X2(행X열)로 ♥를 표시 2) 3X2(행X열)로 ★표시 3) 입력한 행/열로 입력한 기호표시
//		ㅁ 한자 써서 특수문자 ㅋㅋㅋ
//		2. while문을 이용하여 100~90까지 출력하고, 합산결과를 출력하세요.
//		3. while문을 이용해서 학생의 점수를 등록하고 총점과 평균을 출력하되, 등록을 종료시 -1를 입력해서 처리하세요.
//		4. 배열로 점수를 3개를 초기화하여, 반복문과 Scanner를 통해서 데이터를 입력되게 하고, 총계과 평균을 출력하세요.
//		5. 배열 3개에 각각 학생명, 국어, 영어를 할당하여, 반복문을 통해서 출력하세요. 
//		6. **구구단 출력기**
//		   구구단 중 원하는 단을 시작 단과 끝 단으로 지정(입력)하여 출력하게 만드세요.
//		7. **자동비밀번호 생성기**
//		   사용자로부터 비밀번호 길이를 입력 받아, 해당 길이만큼의 비밀번호를 생성하세요. 비밀번호는 숫자와 알파벳으로 구성됩니다.
//		8. **구간별 합계**
//		   사용자로부터 두 개의 정수 A와 B를 입력받아(스캐너), A부터 B까지의 합을 출력하세요(반복문). 단, A가 B보다 클 경우에는 순서를 바꿔서 계산하세요.
//		9. **마름모 모양 숫자 출력기**
//		   사용자로부터 숫자 N을 입력받아, 마름모 모양으로 숫자를 출력하세요. (별찍기와 비슷하지만, 별 대신 숫자를 사용합니다.)
//		10. **영문자 변환기**
//		   사용자로부터 영문자 하나를 입력받아, 해당 문자가 소문자인 경우 대문자로, 대문자인 경우 소문자로 변환하여 출력하세요.
//		11. **숫자 사이의 연산자 넣기**
//		   사용자로부터 두 개의 숫자를 입력받아, 사이에 '+', '-', '*', '/' 중 하나를 넣어 계산 결과가 제일 큰 연산을 찾아 출력하세요.
//		12. **카드 게임 시뮬레이션**
//		   컴퓨터의 두 플레이어가 각각 1~10 사이의 카드를 무작위로 받고, 높은 카드를 가진 플레이어가 승리합니다. 게임은 총 5라운드로 진행되며, 승리한 라운드 횟수에 따라 최종 승자를 결정합니다.
//		13. **동전 교환기**
//		   사용자로부터 특정 금액을 입력받아, 최소한의 동전 수로 교환하는 방법을 출력합니다. 예를 들어 560원을 입력하면, 500원짜리 1개, 50원짜리 1개, 10원짜리 1개로 출력합니다.
//		14. **할인율 계산기**
//		   사용자로부터 상품의 원가와 판매가를 입력받아, 할인율을 계산하고 출력합니다.
//		주의) 모든것을 완벽하게 풀려고하지말고, 본인이 할 수있는 내용까지만 변경해서 문제 진행	
		
//		1. 아래 내용을 2중 for문을 활용하여
//		   1) 2X2(행X열)로 ♥를 표시 2) 3X2(행X열)로 ★표시 3) 입력한 행/열로 입력한 기호표시
		System.out.println("1-1) 2X2(행X열)로 ♥를 표시");
		for(int y = 1; y<=2; y++) {
			for(int x =1; x<=2; x++) {
				System.out.print("♥");
			} System.out.println();
		} System.out.println();
		
		System.out.println("1-2) 3X2(행X열)로 ★를 표시");
		for(int y = 1; y<=2; y++) {
			for(int x =1; x<=3; x++) {
				System.out.print("★");
			} System.out.println();
		} System.out.println();
		
//		?3) 입력한 행/열로 입력한 기호표시
		Scanner sc=new Scanner(System.in);
		System.out.println("행, 열, 기호를 입력하세요:");
      int row = Integer.parseInt(sc.nextLine());
      int col = Integer.parseInt(sc.nextLine());
      String symbol = sc.nextLine();
      for (int i = 0; i < row; i++) {
          for (int j = 0; j < col; j++) {
              System.out.print(symbol + " "); // System.out.print("*");
          }
          System.out.println();		// for 안에 돌아갈 숫자는 따로 두고 니 스캐너 받은건 걍 한도표시로만 쓰자 ㅅㅂ
      }
      System.out.println();

//		System.out.println("1-3) 입력받은대로(행/열) *를 표시");
		
//		System.out.println("원하는 행의 수를 입력하세요 : ");
//		int x1 = Integer.parseInt(sc.nextLine());
//		System.out.println("원하는 열의 수를 입력하세요 : ");
//		int y1 = Integer.parseInt(sc.nextLine());
//		for()
//			for(j<=10;j<)  {
//			System.out.println("*");
//		}
//			System.out.print("*");
//			
//		}
			
//		2. while문을 이용하여 100~90까지 출력하고, 합산결과를 출력하세요.
		System.out.println("2.while문을 이용하여 100~90까지 출력하고, 합산결과를 출력 ");
		int cnt=90;
		int tot =0;
		while(cnt<101)
				 {
			System.out.println((cnt++)+"번째 반복");
			
			tot+=cnt;
			
		}
		System.out.println("출력된 총 합계 : "+tot);
		System.out.println();
	
//		3. while문을 이용해서 학생의 점수를 등록하고 총점과 평균을 출력하되, 등록을 종료시 -1를 입력해서 처리하세요.
		System.out.println("3.학생의 점수를 등록하고 총점과 평균을 출력하되, 등록을 종료시 -1를 입력");
		Scanner sc1=new Scanner(System.in);
		int no=1;
		int tot1 = 0;
		while(true) {
			no++;
			System.out.println("점수를 입력하세요(종료시 -1 입력)");
			int score  = Integer.parseInt(sc1.nextLine());
			tot1 += score;
			if(score==(-1)) {
				break;
			}
		}System.out.println("입력한 점수들의 총합은 : " + (tot1+1));
		System.out.println("점수들의 평균은 : " + (tot1+1)/(no-2));
		System.out.println();
		
//		4. 배열로 점수를 3개를 초기화하여, 반복문과 Scanner를 통해서 데이터를 입력되게 하고, 총계과 평균을 출력하세요.
		System.out.println("4. 배열로 점수를 3개를 초기화하여, 반복문과 Scanner를 통해서 데이터를 입력되게 하고, 총계과 평균을 출력");
		int tot2 = 0;
		int[]score1=new int[3];
		for(int idx = 0; idx<score1.length;idx++) {
			System.out.println("점수를 입력하세요 : ");
			score1[idx]  = Integer.parseInt(sc1.nextLine());
			tot2 += score1[idx];
		} System.out.println("입력한 점수의 총합은 : "+tot2);
		System.out.println("점수의 평균은 :" + tot2/score1.length);
		System.out.println();
		
//      int[] scores = new int[3];
//      int totalScore = 0;
//      for (int i = 0; i < 3; i++) {
//          System.out.println((i + 1) + "번째 점수를 입력하세요:");
//          scores[i] = sc.nextInt();
//          totalScore += scores[i];
//      }
//      double averageScore = (double) totalScore / scores.length;
//      System.out.println("총계: " + totalScore + ", 평균: " + averageScore);
//      System.out.println();

			
//		5. 배열 3개에 각각 학생명, 국어, 영어를 할당하여, 반복문을 통해서 출력하세요. // ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅄ 
		System.out.println("5. 배열 3개에 각각 학생명, 국어, 영어를 할당하여, 반복문을 통해서 출력");
		String a[]= {"학생명","국어","영어"};
		for(int idx=0;idx<a.length;idx++) {
			System.out.println(a[idx]);
		}System.out.println();
//      String[] studentNames = {"홍길동", "이순신", "강감찬"};
//      int[] koreanScores = {85, 90, 78};
//      int[] englishScores = {88, 89, 82};
//      for (int i = 0; i < 3; i++) {
//          System.out.printf("%s - 국어: %d, 영어: %d%n", studentNames[i], koreanScores[i], englishScores[i]);
//      }
//      System.out.println();

		
//		6. **구구단 출력기**
//		   구구단 중 원하는 단을 시작 단과 끝 단으로 지정(입력)하여 출력하게 만드세요.
		System.out.println("6. 2~5단까지 구구단 출력");
		for(int i =2; i <=9; i++) {
			for(int i01=1 ; i01<=9; i01++) {
				System.out.println(i+"x"+i01 + "="+i*i01);
			}if(i==5) {
				break;
			}
		}
		
//		/        System.out.print("시작 단과 끝 단을 입력하세요: ");
//      int start = sc.nextInt();
//      int end = sc.nextInt();
//      for (int i = start; i <= end; i++) {
//          for (int j = 1; j <= 9; j++) {
//              System.out.printf("%d * %d = %d%n", i, j, i * j);
//          }
//          System.out.println();
//      }
//
//    for(int cnt=1;cnt<150;cnt++) {
//       System.out.println(cnt+":"+(char)cnt);
//    }

		
		
//		7. **자동비밀번호 생성기**
//		   사용자로부터 비밀번호 길이를 입력 받아, 해당 길이만큼의 비밀번호를 생성하세요. 비밀번호는 숫자와 알파벳으로 구성됩니다.
		//48-57숫자 56-90대ㅁㅜㄴ자 97-122소문자
		// 계산하면 경우의 수 62
		System.out.println("원하는 비밀번호의 길이를 입력하십시오 : ");
		
		int pass=Integer.parseInt(sc1.nextLine());
		
		for (int i02 = 1; i02<=pass; i02++ ) {
			int passCode = (int)(Math.random()*62+48);
			System.out.print((char)passCode);
		} System.out.println();
		
//      System.out.print("비밀번호 길이를 입력하세요: ");
//      int len = sc.nextInt();
//    byte []passByes = new byte[len]; 
//     for (int i = 0; i < len; i++) {
//           byte ran = (byte)(Math.random()*62+48);
//           if(ran>=58) ran+=7;		//이거 그 특수문자 빼는
//           if(ran>=91) ran+=6;
//           passByes[i] = ran;
//     }
//     System.out.println("생성된 비밀번호: " + new String(passByes));
//     System.out.println();
//


		
//		?8. **구간별 합계**
//		 사용자로부터 두 개의 정수 A와 B를 입력받아(스캐너), A부터 B까지의 합을 출력하세요(반복문). 단, A가 B보다 클 경우에는 순서를 바꿔서 계산하세요.
//		
      System.out.print("두 개의 정수 A와 B를 입력하세요: ");
      int A = sc.nextInt();
      int B = sc.nextInt();
      if (A > B) {
          int temp = A;
          A = B;
          B = temp;
      }
      int sum = 0;
      for (int i9 = A; i9 <= B; i9++) {
          sum += i9;
      }
      System.out.printf("%d부터 %d까지의 합: %d%n", A, B, sum);
      System.out.println();      

		
		//밑에꺼가 ㄴㅐ가 한거^^...
//		System.out.println("첫번째 정수를 입력하세요");int i04=Integer.parseInt(sc1.nextLine());
//		System.out.println("두번째 정수를 입력하세요");int i05=Integer.parseInt(sc1.nextLine());
//		int plus = 0;
//		if(i04>i05) {
//			for(int a=i05;) {
//				
//			}
//		}
			
		
//		?9. **마름모 모양 숫자 출력기**
      // 실제 공백으로 들어가룹분 "" / n 으로 표시할꺼  
//		   사용자로부터 숫자 N을 입력받아, 마름모 모양으로 숫자를 출력하세요. (별찍기와 비슷하지만, 별 대신 숫자를 사용합니다.)

      System.out.print("숫자 N을 입력하세요: ");
      int N = sc.nextInt();
      for (int i7 = 1; i7 <= N; i7++) {
          for (int j = 1; j <= N - i7; j++)
              System.out.print(" ");
          for (int j = 1; j <= 2 * i7 - 1; j++)
              System.out.print(j);
          System.out.println();
      }
      for (int i8 = N - 1; i8 >= 1; i8--) {
          for (int j = 1; j <= N - i8; j++)
              System.out.print(" ");
          for (int j = 1; j <= 2 * i8 - 1; j++)
              System.out.print(j);
          System.out.println();
      }
      System.out.println();

		
		
		
		
		
//		System.out.println("원하는 숫자를 입력하십시오 : ");
//		int N = Integer.parseInt(sc1.nextLine());
//		String sN = N + "";
//		for(int yn=1; yn<N;yn++){
//			for(int xn=1;xn<=yn;xn++);{
//			System.out.print(sN);// 너 왜 옆으로 증식이 안도ㅐ??
//		}
//			System.out.println();
//		
//		} System.out.println();
		
//		?10. **영문자 변환기**
//		   사용자로부터 영문자 하나를 입력받아, 해당 문자가 소문자인 경우 대문자로, 대문자인 경우 소문자로 변환하여 출력하세요.

//      System.out.print("영문자 하나를 입력하세요: ");
    // 65~90 (대문자), 97~122(소문자)
      char ch = sc.next().charAt(0);
      int codVal = ch;
      System.out.println(codVal);
      if(codVal>=65 && codVal<=90) {
         codVal +=32;
      }else if(codVal>=97&&codVal<=122) {
         codVal -=32;
      };
      System.out.println((char)codVal);

		
		
		
		
		
		
//		System.out.println("10.영문자 변환기");

//    System.out.print("영문자 하나를 입력하세요: ");
//  // 65~90 (대문자), 97~122(소문자)
//    char ch = sc.next().charAt(0);
//		ㄴ입력된 내용에서 char값을 가져오기 우ㅣ한 처리
//    int codVal = ch;
//    System.out.println(codVal);
//    if(codVal>=65 && codVal<=90) {
//       codVal +=32;
//    }else if(codVal>=97&&codVal<=122) {
//       codVal -=32;
//    };
//    System.out.println((char)codVal);

      
      
      
      
      //		System.out.println("원하는 영문자 하나를 입력하세요.");
//		String lag =sc1.nextLine();
//		char[] lag1=
//			if(lag)
//		
//		?11. **숫자 사이의 연산자 넣기**
//		   사용자로부터 두 개의 숫자를 입력받아, 사이에 '+', '-', '*', '/' 중 하나를 넣어 계산 결과가 제일 큰 연산을 찾아 출력하세요.
		
      System.out.print("두 개의 숫자를 입력하세요: ");
      int num11 = sc.nextInt();
      int num12 = sc.nextInt();
      char op = '+';
      double maxResult = num11 + num12;
      if (num11 - num12 > maxResult) {
          maxResult = num11 - num12;
          op = '-';
      }
      if ((double) num11 * num12 > maxResult) {
          maxResult = (double) num11 * num12;
          op = '*';
      }
      if (num12 != 0 && (double) num11 / num12 > maxResult) {
          maxResult = (double) num11 / num12;
          op = '/';
      }
      System.out.printf("가장 큰 연산 결과: %f (%d %c %d)%n", maxResult, num11, op, num12);
      System.out.println();

		
		
		
		
//		
//		System.out.println("원하는 첫번째 숫자를 입력하십시오 : "); int num1 = Integer.parseInt(sc1.nextLine());
//		System.out.println("원하는 두번째 숫자를 입력하십시오 : "); int num2 = Integer.parseInt(sc1.nextLine());
//		int plus = num1+num2; int minus = num1-num2; int mul  = num1*num2; int div = num1/num2;
//		if(num1<num2) {
//			System.out.println("-가 제일 큽니다. 결과값 : " + minus); 
//		}else {
//				if(mul>plus) {
//					System.out.println("*가 제일 큽니다. 결과값 : " + mul); 
//					if(plus>mul) {
//						System.out.println("+가 제일 큽니다. 결과값 : " + minus); 
//					}
//				}
//			}
		
//		if(num1+num2>(num1-)
				
				
//		12. **카드 게임 시뮬레이션**
//			컴퓨터의 두 플레이어가 각각 1~10 사이의 카드를 무작위로 받고, 높은 카드를 가진 플레이어가 승리합니다.
//			게임은 총 5라운드로 진행되며, 승리한 라운드 횟수에 따라 최종 승자를 결정합니다.
		
		System.out.println("12.카드 게임 시뮬레이션");
		int player1=0;
		int player2=0;
		for(int game=1;game<=5;game++) {
			int ranno1 = (int)(Math.random()*10+1);
			int ranno2 = (int)(Math.random()*10+1);
			if(ranno1>ranno2) {
				System.out.print("첫번째 플레이어의 숫자는:"+ranno1+"\t두번째 플레이어의 숫자는:"+ranno2+"\t이번승자는 첫번째 플레이어");
				System.out.println();
				++player1;
			} else if (ranno1==ranno2) {
				System.out.println("첫번째 플레이어의 숫자는:"+ranno1+"\t두번째 플레이어의 숫자는:"+ranno2+"\t둘이 동점~");
				System.out.println();
			}
			else {
				System.out.println("첫번째 플레이어의 숫자는:"+ranno1+"\t두번째 플레이어의 숫자는:"+ranno2+"\t이번승자는 두번째 플레이어");
				System.out.println();
				++player2;
			}
		}
		if(player1>player2) {
			System.out.println("최종승자는 첫번째 플레이어 ! 이긴횟수 : " + player1);
		}else {
			System.out.println("최종승자는 두번째 플레이어 ! 이긴횟수 : " + player2);
		}
		
//      int player1Wins = 0, player2Wins = 0;
//      for (int i = 0; i < 5; i++) {
//          int card1 = (int)(Math.random()*10+1);
//          int card2 = (int)(Math.random()*10+1);
//          System.out.printf("라운드 %d: 플레이어1(%d) vs 플레이어2(%d)%n", i + 1, card1, card2);
//          if (card1 > card2) {
//              player1Wins++;
//              System.out.println("플레이어1 승리!");
//          } else if (card2 > card1) {
//              player2Wins++;
//              System.out.println("플레이어2 승리!");
//          } else {
//              System.out.println("무승부!");
//          }
//      }
//      if (player1Wins > player2Wins)
//          System.out.println("최종 승자: 플레이어1");
//      else if (player2Wins > player1Wins)
//          System.out.println("최종 승자: 플레이어2");
//      else
//          System.out.println("최종 결과: 무승부"); 
		
//		13. **동전 교환기**
//		   사용자로부터 특정 금액을 입력받아, 최소한의 동전 수로 교환하는 방법을 출력합니다. 
//		예를 들어 560원을 입력하면, 500원짜리 1개, 50원짜리 1개, 10원짜리 1개로 출력합니다.
		System.out.println("13.동전 교환기");
		System.out.println("교환할 금액을 입력하세용");
		int coin = Integer.parseInt(sc1.nextLine());
		int coin500 = coin%500;
		int coin100 = coin%100;
		int coin50 = coin%50;
		int coin10 = coin%10;
		if(coin>=500) {
			
			System.out.println("500원 짜리 : " +coin/500 + "개");
			if(coin500>=100) {
				System.out.println("100원 짜리 : "+ coin500/100 + "개");
			if(coin100>=50) {
				System.out.println("50원 짜리 : "+ coin100/50 + "개");
				if(coin50>=10) {
					System.out.println("10원 짜리 :" + coin50/10 + "개");
				}
					
			}
			}
		}
		
//      System.out.print("교환할 금액을 입력하세요: ");
//      int amount = sc.nextInt();
//
//      int[] coins = {500, 100, 50, 10};
//      int[] counts = new int[coins.length];
		//각각의 갯수를 할당	{3,3,1,1}-500,100,50,10원짜리 갯수들
//
//      for (int i = 0; i < coins.length; i++) {
//          counts[i] = amount / coins[i];
		// 1200/500 --> 2
//          amount %= coins[i];
		// 1200%500 --> 200
//      }
//
//      for (int i = 0; i < coins.length; i++) {
//          if (counts[i] > 0) {
//              System.out.printf("%d원짜리 %d개%n", coins[i], counts[i]);
//          }
//      }
//      System.out.println();

		
		
//		14. **할인율 계산기**
//		   사용자로부터 상품의 원가와 판매가를 입력받아, 할인율을 계산하고 출력합니다.
		System.out.println("14.할인율 계산기");
		System.out.println("상품의 원가를 입력하세여"); double real = Integer.parseInt(sc1.nextLine());
		System.out.println("상품의 판매가를 입력하세여"); double sell = Integer.parseInt(sc1.nextLine());
		double discount = ((real-sell)/real)*100;
		System.out.println("상품의 원가 : " + real + "원 ");
		System.out.println("상품의 판매가 : " + sell + "원 ");
		System.out.println("상품의 할인율 : "+ discount +"%");
		
//      System.out.print("상품의 원가를 입력하세요: ");
//      double originalPrice = sc.nextDouble();
//      System.out.print("상품의 판매가를 입력하세요: ");
//      double salePrice = sc.nextDouble();
//
//      double discountRate = (originalPrice - salePrice) / originalPrice * 100;
//
//      System.out.printf("할인율: %.2f%%", discountRate);
//      System.out.println();      
		
	}

}
//1. 아래 내용을 2중 for문을 활용하여
//1) 2X2(행X열)로 ♥를 표시 2) 3X2(행X열)로 ★표시 3) 입력한 행/열로 입력한 기호표시
//    ㅁ(한자)
//2. while문을 이용하여 100~90까지 출력하고, 합산결과를 출력하세요.
//3. while문을 이용해서 학생의 점수를 등록하고 총점과 평균을 출력하되, 등록을 종료시 -1를 입력해서 처리하세요.
//4. 배열로 점수를 3개를 초기화하여, 반복문과 Scanner를 통해서 데이터를 입력되게 하고, 총계과 평균을 출력하세요.
//5. 배열 3개에 각각 학생명, 국어, 영어를 할당하여, 반복문을 통해서 출력하세요. 
//6. **구구단 출력기**
//구구단 중 원하는 단을 시작 단과 끝 단으로 지정(입력)하여 출력하게 만드세요.
//7. **자동비밀번호 생성기**
//사용자로부터 비밀번호 길이를 입력 받아, 해당 길이만큼의 비밀번호를 생성하세요. 비밀번호는 숫자와 알파벳으로 구성됩니다.
//8. **구간별 합계**
//사용자로부터 두 개의 정수 A와 B를 입력받아, A부터 B까지의 합을 출력하세요. 단, A가 B보다 클 경우에는 순서를 바꿔서 계산하세요.
//9. **마름모 모양 숫자 출력기**
//사용자로부터 숫자 N을 입력받아, 마름모 모양으로 숫자를 출력하세요. (별찍기와 비슷하지만, 별 대신 숫자를 사용합니다.)
//10. **영문자 변환기**
//사용자로부터 영문자 하나를 입력받아, 해당 문자가 소문자인 경우 대문자로, 대문자인 경우 소문자로 변환하여 출력하세요.
//11. **숫자 사이의 연산자 넣기**
//사용자로부터 두 개의 숫자를 입력받아, 사이에 '+', '-', '*', '/' 중 하나를 넣어 계산 결과가 제일 큰 연산을 찾아 출력하세요.
//12. **카드 게임 시뮬레이션**
//컴퓨터의 두 플레이어가 각각 1~10 사이의 카드를 무작위로 받고, 높은 카드를 가진 플레이어가 승리합니다. 게임은 총 5라운드로 진행되며, 승리한 라운드 횟수에 따라 최종 승자를 결정합니다.
//13. **동전 교환기**
//사용자로부터 특정 금액을 입력받아, 최소한의 동전 수로 교환하는 방법을 출력합니다. 예를 들어 560원을 입력하면, 500원짜리 1개, 50원짜리 1개, 10원짜리 1개로 출력합니다.
//14. **할인율 계산기**
//사용자로부터 상품의 원가와 판매가를 입력받아, 할인율을 계산하고 출력합니다.
//주의) 모든 것은 완벽하게 풀려고 하지 말고, 본인 할 수 

//Scanner sc = new Scanner(System.in);
//// 1. 2중 for문 활용
//// 2x2 ♥
//for (int i = 0; i < 2; i++) {
// for (int j = 0; j < 2; j++) {
//     System.out.print("♥ ");
// }
// System.out.println();
//}
//System.out.println();
//
//// 3x2 ★
//for (int i = 0; i < 3; i++) {
// for (int j = 0; j < 2; j++) {
//     System.out.print("★ ");
// }
// System.out.println();
//}
//System.out.println();
//
//// 사용자 입력 행/열/기호
//
//System.out.println("행, 열, 기호를 입력하세요:");
//System.out.print("행을 입력:");
//int row = Integer.parseInt(sc.nextLine());
//System.out.print("열을 입력:");
//int col = Integer.parseInt(sc.nextLine());
//System.out.print("기호를 입력:");
//String symbol = sc.nextLine();
//for (int i = 0; i < row; i++) {
// for (int j = 0; j < col; j++) {
//     System.out.print(symbol + " ");
// }
// System.out.println();
//}
//System.out.println();
//
//// 2. while문: 100~90 출력
//int number = 100;
//int sum = 0;
//while (number >= 90) {
// System.out.println(number);
// sum += number;
// number--;
//}
//System.out.println("합계: " + sum);
//System.out.println();
//
//// 3. 학생 점수 등록
//int total = 0;
//int count = 0;
//while (true) {
// System.out.println("점수를 입력하세요 (-1을 입력하면 종료):");
// int score = sc.nextInt();
// if (score == -1) {
//     break;
// }
// total += score;
// count++;
//}
//double average = (double) total / count;
//System.out.println("총점: " + total + ", 평균: " + average);
//System.out.println();
//

//
//
//// 4. 배열로 점수 3개 초기화
//int[] scores = new int[3];
//int totalScore = 0;
//for (int i = 0; i < 3; i++) {
// System.out.println((i + 1) + "번째 점수를 입력하세요:");
// scores[i] = sc.nextInt();
// totalScore += scores[i];
//}
//double averageScore = (double) totalScore / scores.length;
//System.out.println("총계: " + totalScore + ", 평균: " + averageScore);
//System.out.println();
//
//// 5. 학생명, 국어, 영어 할당
//String[] studentNames = {"홍길동", "이순신", "강감찬"};
//int[] koreanScores = {85, 90, 78};
//int[] englishScores = {88, 89, 82};
//for (int i = 0; i < 3; i++) {
// System.out.printf("%s - 국어: %d, 영어: %d%n", 
//		studentNames[i], koreanScores[i], englishScores[i]);
//}
//System.out.println();
//
//// 6. 구구단 출력기
//System.out.print("시작 단과 끝 단을 입력하세요: ");
//int start = sc.nextInt();
//int end = sc.nextInt();
//for (int i = start; i <= end; i++) {
// for (int j = 1; j <= 9; j++) {
//     System.out.printf("%d * %d = %d%n", i, j, i * j);
// }
// System.out.println();
//}
//
//for(int cnt=1;cnt<150;cnt++) {
//	System.out.println(cnt+":"+(char)cnt);
//}
//// 7. 자동 비밀번호 생성기 숫자 48~57 65~90, 97~122
////                        10    26     26
////                        52 + 10 = 62
////                        시작수 48 58+7, 91+6
//
//System.out.print("비밀번호 길이를 입력하세요: ");
//int len = sc.nextInt();
//byte []passByes = new byte[len]; 
//for (int i = 0; i < len; i++) {
//     byte ran = (byte)(Math.random()*62+48);
//     if(ran>=58) ran+=7;
//     if(ran>=91) ran+=6;
//     passByes[i] = ran;
//}
//System.out.println("생성된 비밀번호: " + new String(passByes));
//System.out.println();
//
//// 8. 구간별 합계
//System.out.print("두 개의 정수 A와 B를 입력하세요: ");
//int A = sc.nextInt();
//int B = sc.nextInt();
//if (A > B) {
// int temp = A;
// A = B;
// B = temp;
//}
//int sum = 0;
//for (int i = A; i <= B; i++) {
// sum += i;
//}
//System.out.printf("%d부터 %d까지의 합: %d%n", A, B, sum);
//System.out.println();		
//// 9. 마름모 모양 숫자 출력기 
//  " " : 라인별 갯수  n : 출력할 내용
//System.out.print("숫자 N을 입력하세요: ");
//int N = sc.nextInt();
//for (int i = 1; i <= N; i++) {
// for (int j = 1; j <= N - i; j++)
//     System.out.print(" ");
// for (int j = 1; j <= 2 * i - 1; j++)
//     System.out.print(j);
// System.out.println();
//}
//for (int i = N - 1; i >= 1; i--) {
// for (int j = 1; j <= N - i; j++)
//     System.out.print(" ");
// for (int j = 1; j <= 2 * i - 1; j++)
//     System.out.print(j);
// System.out.println();
//}
//System.out.println();
//
//// 10. 영문자 변환기
//System.out.print("영문자 하나를 입력하세요: ");
//// 65~90 (대문자), 97~122(소문자)
// 입력된 내용에서 char값을 가져오기 위한 처리
//char ch = sc.next().charAt(0);
//int codVal = ch;
//System.out.println(codVal);
//if(codVal>=65 && codVal<=90) {
//	codVal +=32;
//}else if(codVal>=97&&codVal<=122) {
//	codVal -=32;
//};
//System.out.println((char)codVal);
//
//// 11. 숫자 사이의 연산자 넣기
//System.out.print("두 개의 숫자를 입력하세요: ");
//int num1 = sc.nextInt();
//int num2 = sc.nextInt();
//char op = '+';
//double maxResult = num1 + num2;
//if (num1 - num2 > maxResult) {
// maxResult = num1 - num2;
// op = '-';
//}
//if ((double) num1 * num2 > maxResult) {
// maxResult = (double) num1 * num2;
// op = '*';
//}
//if (num2 != 0 && (double) num1 / num2 > maxResult) {
// maxResult = (double) num1 / num2;
// op = '/';
//}
//System.out.printf("가장 큰 연산 결과: %f (%d %c %d)%n", maxResult, num1, op, num2);
//System.out.println();
//
//// 12. 카드 게임 시뮬레이션
//int player1Wins = 0, player2Wins = 0;
//for (int i = 0; i < 5; i++) {
// int card1 = (int)(Math.random()*10+1);
// int card2 = (int)(Math.random()*10+1);
// System.out.printf("라운드 %d: 플레이어1(%d) vs 플레이어2(%d)%n", i + 1, card1, card2);
// if (card1 > card2) {
//     player1Wins++;
//     System.out.println("플레이어1 승리!");
// } else if (card2 > card1) {
//     player2Wins++;
//     System.out.println("플레이어2 승리!");
// } else {
//     System.out.println("무승부!");
// }
//}
//if (player1Wins > player2Wins)
// System.out.println("최종 승자: 플레이어1");
//else if (player2Wins > player1Wins)
// System.out.println("최종 승자: 플레이어2");
//else
// System.out.println("최종 결과: 무승부");		
// 13. 동전 교환기
//System.out.print("교환할 금액을 입력하세요: ");
//int amount = sc.nextInt();
//
//int[] coins = {500, 100, 50, 10};
//int[] counts = new int[coins.length];
// 각각의 동전의 갯수을 할당  {3,3,1,1}   
//
//for (int i = 0; i < coins.length; i++) {
// counts[i] = amount / coins[i];
	//  1270/500 ==> 2    {2,0,0,0}
// amount %= coins[i];
 //  1270%500 ==> 200  {2,2,1,2}
//}
//
//for (int i = 0; i < coins.length; i++) {
// if (counts[i] > 0) {
//     System.out.printf("%d원짜리 %d개%n", coins[i], counts[i]);
// }
//}
//System.out.println();

// 14. 할인율 계산기
//System.out.print("상품의 원가를 입력하세요: ");
//double originalPrice = sc.nextDouble();
//System.out.print("상품의 판매가를 입력하세요: ");
//double salePrice = sc.nextDouble();
//
//double discountRate = (originalPrice - salePrice) / originalPrice * 100;
//
//System.out.printf("할인율: %.2f%%", discountRate);
//System.out.println();		