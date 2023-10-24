package  Javaexp.z01_homework;

import java.util.Scanner;

public class A0918_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		#`switch-case` 문을 사용하는 사용하여 아래 문제를 풀어보세요
//		1 커피의 종류를 입력하면 해당 커피의 가격을 출력하는 프로그램을 작성해보세요.
//		2.**계절 출력기**:
//		월(1-12)을 입력받아 해당 월의 계절을 출력하세요.
//		3. **도형의 넓이 계산기**:
//		도형 이름(직사각형, 원, 삼각형)을 입력 받아, 해당하는 도형의 넓이를 계산하여 출력하세요. 
//		필요한 추가 정보(예: 길이, 반지름)는 사용자로부터 입력받아 계산합니다.
//		# for문 활용
//		1. for(기본) 기본 형식을 활용해서 아래 데이터를 출력하세요
//		     1) 200~300 10단위 출력, 2) 1000~950 3단위 감소, 3) 100~0까지 2로 나눈값
//		2. 김밥의 단가를 입력받아서 1~20개의  갯수별 총가격을 출력하세요.
//		3. 입력할 과일의 3개의  과일명과 과일가격을 입력받아, 아래 형식으로 출력하되 총비용을 출력 하세요
//		       no 과일명  가격
//		        1 사과    3000            
//		        2 바나나   4000           
//		        3 딸기    12000
//		          총계    19000  
//		4. for(지역/전역) - 곰돌이가 하루 빵을 2개씩 증가해서 먹어(첫째날 2개, 둘째날 4개, 셋째날 6개 ...) 
//		      총 10일 동안 먹은 빵의 갯수를 누적하여 아래와 같이 출력하세요
//		   # 출력 형식
//		  날짜  갯수 누적
//		   1일차 2개  2개
//		   2일차 4개  6개
//		   3일차 6개 12개
//		5. for을 이용하여 100까지 4의 배수만 # 표시 및 합산,그 외는 숫자 표시, 하단에 4의 배수 합산표시.
//		6. for을 이용하여 3,6,9게임을 출력하세요(20까지)- 마지막에 3이 포함될 때 처리
//		
		
//		#`switch-case` 문을 사용하는 사용하여 아래 문제를 풀어보세요
//		1 커피의 종류를 입력하면 해당 커피의 가격을 출력하는 프로그램을 작성해보세요.
		System.out.println("#1.커피의 가격을 출력");
		Scanner sc = new Scanner(System.in);
		System.out.println("원하시는 커피의 종류를 입력하세요 : ");
		String coffee = sc.nextLine();
		switch(coffee) {
		case "아메리카노" : 
			System.out.println("아메리카노의 가격은 3000원 입니다.");
				break;
		case "아인슈페너" :
			System.out.println("아인슈페너의 가격은 4500원 입니다.");
				break;
		case "카페라떼" :
			System.out.println("아인슈페너의 가격은 4000원 입니다.");
				break;
		default : 
			System.out.println("주문하신 커피는 판매하고 있지 않습니다.");
		}
		System.out.println();
		
//		2.**계절 출력기**:
//		월(1-12)을 입력받아 해당 월의 계절을 출력하세요.
		System.out.println("#2.월(1-12)을 입력받아 해당 월의 계절을 출력");
		System.out.println("해당 달을 입력하십시오('월'까지 입력) : ");
		String month = sc.nextLine();
		switch(month) {
		case "3월" :
		case "4월" :
		case "5월" :
			System.out.println("입력하신 달의 계절은 봄입니다."); 
				break;
		case "6월" :
		case "7월" :
		case "8월" :
			System.out.println("입력하신 달의 계절은 여름입니다."); 
				break;
		case "9월" :
		case "10월" :
		case "11월" :
			System.out.println("입력하신 달의 계절은 가을입니다."); 
				break;
		default : 
			System.out.println("입력하신 달의 계절은 겨울입니다.");
			
		} System.out.println();
		
//		3. **도형의 넓이 계산기**:
//		도형 이름(직사각형, 원, 삼각형)을 입력 받아, 해당하는 도형의 넓이를 계산하여 출력하세요. 
//		필요한 추가 정보(예: 길이, 반지름)는 사용자로부터 입력받아 계산합니다.
		System.out.println("#3.도형의 넓이 계산");
		System.out.println("도형의 이름을 입력하세요");
		
		String name = sc.nextLine();
		
		switch (name) {
			case "원" :
				System.out.println("도형의 반 지름을 입력하십시오");
				int a1  = Integer.parseInt(sc.nextLine());
				System.out.println(a1*Math.PI*a1);
				//Math.PI : 상수(변하지 않는값)
					break;
			case "삼각형" : 
				System.out.println("도형의 밑변의 길이를 입력하십시오");
				int tr1  = Integer.parseInt(sc.nextLine());
				System.out.println("도형의 높이의 길이를 입력하십시오");
				int tr2  = Integer.parseInt(sc.nextLine());
				System.out.println((tr1*tr2)/2);
					break;
			case "직사각형" : 
				System.out.println("도형의 한 변의 길이를 입력하십시오");
				int sq1  = Integer.parseInt(sc.nextLine());
				System.out.println("도형의 다른 한 변의 길이를 입력하십시오");
				int sq2  = Integer.parseInt(sc.nextLine());
				System.out.println(sq1*sq2);
					break;
			default : 
				System.out.println("해당 도형을 찾을 수 없습니다.");
		} System.out.println();
		
		
//		# for문 활용
//		1. for(기본) 기본 형식을 활용해서 아래 데이터를 출력하세요
//		     1) 200~300 10단위 출력, 2) 1000~950 3단위 감소, 3) 100~0까지 2로 나눈값
		System.out.println("#1-1) 200~300 10단위 출력");
		for(int cnt =200;cnt<=300;cnt+=10) {
			System.out.print(cnt+",");
		} System.out.println("\n");
		
		System.out.println("#1-2) 1000~950 3단위 감소");
		for(int cnt =1000;cnt>=950;cnt-=3) {
			System.out.print(cnt+",");
		} System.out.println("\n");
		
		System.out.println("#1-3) 100~0까지 2로 나눈값");
		for(int cnt =0;cnt<=100;cnt++) {
			System.out.print(cnt%2+",");
		} System.out.println("\n");
		
//		2. 김밥의 단가를 입력받아서 1~20개의  갯수별 총가격을 출력하세요.
		System.out.println("#2.김밥의 단가를 입력받아서 1~20개의  갯수별 총가격을 출력 ");
		System.out.println("김밥의단가를 입력하세요(숫자만 입력)");
		int money = Integer.parseInt(sc.nextLine());
		for (int cnt=1; cnt<=20; cnt++) {
			System.out.println(cnt + "개의 총 가격은 : " +(money*cnt)+"원입니다.");
		} System.out.println();
		
		
//		3. 입력할 과일의 3개의  과일명과 과일가격을 입력받아, 아래 형식으로 출력하되 총비용을 출력 하세요 (for문으로 할수있을거같은데?? 반복문 통해서)
//	       no 과일명  가격
//	        1 사과    3000            
//	        2 바나나   4000           
//	        3 딸기    12000
//	          총계    19000  
		
		System.out.println("#3. 과일명, 가격입력받아 총비용 출력");
		
//		System.out.println("첫번째 과일의 이름을 입력하세요");String fr1 = sc.nextLine();
//		System.out.println("입력한 과일의 가격을 입력하세요"); int pay1=Integer.parseInt(sc.nextLine());
//		System.out.println("두번째 과일의 이름을 입력하세요");String fr2 = sc.nextLine();
//		System.out.println("입력한 과일의 가격을 입력하세요"); int pay2=Integer.parseInt(sc.nextLine());
//		System.out.println("세번째 과일의 이름을 입력하세요");String fr3 = sc.nextLine();
//		System.out.println("입력한 과일의 가격을 입력하세요"); int pay3=Integer.parseInt(sc.nextLine());
//		System.out.println("no\t과일명\t가격");
//		int payAll = 0;
//		for (int cnt=1;cnt<=3;cnt++) {
//			payAll = 
//		}
		  
		//필요한 전역변수 2개 
			int total = 0; //  가격합산 전역변수
	        String prn = "no\t과일명\t가격\n"; // 출력할 내용 전역변수
	        for (int i = 1; i <= 3; i++) {
	            System.out.print("과일명 입력 : ");
	        	String fruitName = sc.next();
	            System.out.print("과일 가격 입력 : ");
	        	int fruitPrice = sc.nextInt();
	        	// 출력할 내용을 문자열로 누적처리.
	            prn += i + "\t"+fruitName + "\t" + fruitPrice+"\n";
	            total += fruitPrice; // 가격누적 
	        }
	        System.out.println(prn);
	        System.out.println("총계    " + total);

		
//		
//		4. for(지역/전역) - 곰돌이가 하루 빵을 2개씩 증가해서 먹어(첫째날 2개, 둘째날 4개, 셋째날 6개 ...) 
//	      총 10일 동안 먹은 빵의 갯수를 누적하여 아래와 같이 출력하세
//		요
//	   # 출력 형식
//	  날짜  갯수 누적
//	   1일차 2개  2개
//	   2일차 4개  6개
//	   3일차 6개 12개

		System.out.println("#4.곰돌이의 빵 갯수");
		int breadSum = 0;
		int bread = 2;
		System.out.println("날짜\t갯수\t누적");
		for(int cnt=1;cnt<=10;cnt++ ) {
			breadSum += bread*cnt; 
			System.out.println(cnt+"일차\t"+ (bread*cnt)+"개\t"+ breadSum + "개");
		} System.out.println();
		
		
//		5. for을 이용하여 100까지 4의 배수만 # 표시 및 합산,그 외는 숫자 표시, 하단에 4의 배수 합산표시.
		
		System.out.println("#5.4의배수");
		int fourSum = 0;
		for(int cnt=1;cnt<=100;cnt++) {
			if(cnt%4!=0) {
			System.out.print(cnt+",");}
			if(cnt%4==0) { 
				System.out.println(cnt+"#,");
				fourSum+=cnt;
				System.out.println(fourSum);
			}
		}		System.out.println();
		
		
//		6. for을 이용하여 3,6,9게임을 출력하세요(20까지)- 마지막에 3이 포함될 때 처리
		// 1~10까진 문제없음 아 3의 배수로 하면 12가 짝이되버리는구나
		// n%10 11->1 ...2 3 4 5 6 7 8 9 0
		// n%10/3 11->1 ...2 0 4 5 0 7 8 0 0
		//10,20,30 ==> 0이기 때문에 10단위로 나누어 지는것은 제외
		// i%10 != 0
		System.out.println("#6.for를 이용한 3,6,9");
		for(int cnt=1;cnt<=20;cnt++) {
//			if(cnt%3!=0) {System.out.print(cnt);
//			}
			if(cnt%10!=0 && cnt%10/3==0) {
				System.out.print("짝!");
			}
			
				break;
			}
		
		
		
//		#`switch-case` 문을 사용하는 사용하여 아래 문제를 풀어보세요
//		1 커피의 종류(3종류정도)를 입력하면 해당 커피의 가격을 출력하는 프로그램을 작성해보세요.
//		2.**계절 출력기**:
//		월(1-12)을 입력받아 해당 월의 계절을 출력하세요.
//		3. **도형의 넓이 계산기**:
//		도형 이름(직사각형, 원, 삼각형)을 입력 받아, 해당하는 도형의 넓이를 계산하여 출력하세요. 
//		필요한 추가 정보(예: 길이, 반지름)는 사용자로부터 입력받아 계산합니다.
//		# for문 활용
//		1. for(기본) 기본 형식을 활용해서 아래 데이터를 출력하세요
//		     1) 200~300 10단위 출력, 2) 1000~950 3단위 감소, 
//           3) 100~0까지 2로 나눈값
//		2. 김밥의 단가를 입력받아서 1~20개의  갯수별 총가격을 출력하세요.
//		3. 입력할 과일의 3개의  과일명과 과일가격을 입력받아, 아래 형식으로 출력하되 총비용을 출력 하세요
//		       no 과일명  가격
//		        1 사과    3000            
//		        2 바나나   4000           
//		        3 딸기    12000
//		          총계    19000  
/*		
			String print= "no 과일명  가격\n";
			for(1~3)
				String name = sc.nextLine()
				int price = sc.nextLine()
				print+=no+"\t"+name+"\t"+price +"\n";
				
		    sysout(print)
*/		
//		4. for(지역/전역) - 곰돌이가 하루 빵을 2개씩 증가해서 먹어(첫째날 2개, 둘째날 4개, 셋째날 6개 ...) 
//				총 10일 동안 먹은 빵의 갯수를 누적하여 아래와 같이 출력하세요
//		   # 출력 형식
//		  날짜  갯수 누적
//		   1일차 2개  2개
//		   2일차 4개  6개
//		   3일차 6개 12개
//		5. for을 이용하여 100까지 4의 배수만 # 표시 및 합산,그 외는 숫자 표시, 하단에 4의 배수 합산표시.
//		6. for을 이용하여 3,6,9게임을 출력하세요(20까지)- 마지막에 3이 포함될 때 처리
        Scanner scanner = new Scanner(System.in);

        // 1. 커피 가격
//        System.out.print("커피의 종류를 입력하세요: ");
//        String coffee = scanner.nextLine();
//        switch (coffee) {
//            case "아메리카노":
//                System.out.println("3,000원");
//                break;
//            case "카페라떼":
//                System.out.println("3,500원");
//                break;
//            case "카푸치노":
//                System.out.println("4,000원");
//                break;
//            default:
//                System.out.println("메뉴에 없는 커피입니다.");
//        }

        // 2. 계절 출력기
//        System.out.print("월(1-12)을 입력하세요: ");
//        int month = Integer.parseInt(scanner.nextLine());
//        switch (month) {
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("겨울");
//                break;
//            case 3,4,5:
//                System.out.println("봄");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("여름");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("가을");
//                break;
//            default:
//                System.out.println("올바른 월을 입력하세요!");
//        }

        // 3. 도형의 넓이 계산기
//        System.out.print("도형 이름을 입력하세요 (직사각형, 원, 삼각형): ");
//        String shape = scanner.next();
//        double area;
//        switch (shape) {
//            case "직사각형":
//                System.out.print("가로 길이: ");
//                double width = scanner.nextDouble();
//                System.out.print("세로 길이: ");
//                double height = scanner.nextDouble();
//                area = width * height;
//                System.out.println("도형의 넓이: " + area);
//                break;
//            case "원":
//                System.out.print("반지름: ");
//                double radius = scanner.nextDouble();
//                // Math.PI : 상수(변하지않는값) 내장 api
//                area = Math.PI * radius * radius;
//                System.out.println("도형의 넓이: " + area);
//                break;
//            case "삼각형":
//                System.out.print("밑변 길이: ");
//                double base = scanner.nextDouble();
//                System.out.print("높이: ");
//                double triangleHeight = scanner.nextDouble();
//                area = (base * triangleHeight) / 2;
//                System.out.println("도형의 넓이: " + area);
//                break;
//            default:
//                System.out.println("올바른 도형 이름을 입력하세요!");
//        }

//        scanner = new Scanner(System.in);
//
        // 1. for(기본)
//        for (int i = 200; i <= 300; i += 10) {
//            System.out.println(i);
//        }
//
//        for (int i = 1000; i >= 950; i -= 3) {
//            System.out.println(i);
//        }
//
//        for (int i = 100; i >= 0; i--) {
//            System.out.println(i / 2.0);
//        }
//
//        // 2. 김밥 가격 계산
//        System.out.print("김밥의 단가를 입력하세요: ");
//        int price = scanner.nextInt();
//        for (int i = 1; i <= 20; i++) {
//            System.out.println(i + "개의 김밥 가격: " + (i * price) + "원");
//        }
//
//        // 3. 과일 가격 계산
//        int total = 0; // 가격합산 전역변수
//        String prn = "no\t과일명\t가격\n"; // 출력할 내용 전역변수
//        for (int i = 1; i <= 3; i++) {
//        	System.out.print(i+"번째 과일명 입력:");
//        	String fruitName = scanner.nextLine();
//        	System.out.print("과일의 가격입력:");
//            int fruitPrice = Integer.parseInt(scanner.nextLine());
//            // 출력할 내용을 문자열로 누적처리.
//            prn += i + "\t"+fruitName + "\t" + fruitPrice+"\n";
//            total += fruitPrice; // 가격누적
//        }
//        System.out.println(prn);
//        System.out.println("총계    " + total);
//
//        // 4. 곰돌이 빵 먹기
//        System.out.println("날짜  갯수 누적");
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            int today = i * 2;
//            sum += today;
//            System.out.println(i + "일차 " + today + "개  " + sum + "개");
//        }
//
//        // 5. 4의 배수 표시 및 합산
//        int fourMultipleSum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 4 == 0) {
//                4의 배수 누적 처리.
//                fourMultipleSum += i;
//                System.out.print("# ");
//            } else {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println("\n4의 배수의 합: " + fourMultipleSum);
//
//        // 6. 3,6,9 게임
        // 1~10
        // n 	  11 12 13 14 15 16 17 18 19 20
        // n%10    1  2  3  4  5  6  7  8  9 0
        // n%10/3  1  2  0  1  2  0  1  2  0 0 
        // 10, 20, 30 ==> 0이기에 10단위로 나누어지는 것은 제외
        //  i%10!=0
//        for (int i = 1; i <= 20; i++) {
//            if (i%10!=0 && i%10 % 3 == 0 ) {
//                System.out.print("짝 ");
//            } else {
//                System.out.print(i + " ");
//            }
//        }		
//		
		
		
//	}
//
//}

		
		
		
		
		
		
	}

}
