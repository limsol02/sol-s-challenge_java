package  Javaexp.z01_homework;

import java.util.Scanner;

public class A0915_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 ### 문제 1 
**두 수 비교하기**(3항연산자활용) 
두 숫자를 입력받아 크거나 같은 수를 출력하십시오. 

### 문제 2 
**최대값 찾기** 
임의의 세 수를 변수에 할당하여 최대값을 출력하십시오. 

### 문제 3 
**등급 판별하기** 
점수를 입력받아 등급을 출력하십시오. 

### 문제 4 
도시의 온도가 20도를 넘으면 아이스크림을 먹으러 갑니다. 그렇지 않으면 핫초코를 마십니다. 온도가 20도일 때는 뭐를 해야할지 선택하세요. 
온도를 `int temperature`로 가정하고, 뭐를 할지를 삼항 연산자를 이용하여 결정하세요. 

### 문제 5 
어떤 학생의 수학 점수는 85점, 과학 점수는 90점입니다. 이 학생의 수학 점수가 80점 이상이고 과학 점수가 85점 이상이면 '합격'이라는 메시지를 출력하고, 그렇지 않으면 '불합격'이라는 메시지를 출력하세요. 
점수는 `int mathScore = 85, scienceScore = 90;`로 가정합니다. 

### 문제 6 
두 숫자 `a`와 `b`가 있습니다. 두 숫자의 평균이 50 이상이면 "평균 이상", 그렇지 않으면 "평균 미만"이라는 메시지를 출력하세요. 
숫자는 `int a = 40, b = 60;`으로 가정합니다. 

### 문제 7(3항연산자활용) 
변수 `hoursWorked`가 임의로 주어지고, 40시간을 초과하면 "과로하세요", 그렇지 않으면 "정상 근무 시간입니다"라는 메시지를 출력하세요. 

### 문제 8 
변수 `day`에 요일을 입력하고 "일요일"나 "토요일"이면 "주말입니다", 그렇지 않으면 "평일입니다"라는 메시지를 출력하세요. 

### 문제 9 
변수 `height`의 값이 150cm 미만이면 "놀이기구를 이용할 수 없습니다", 그렇지 않으면 "놀이기구를 이용하세요"라는 메시지를 출력하세요. 
물론이죠! `if`와 `if-else` 문을 활용한 재미있는 자바 연습문제와 정답을 제공하겠습니다. 

### 문제 10: 기본 요금 계산기 
요일별로 다른 교통비 요금을 계산하는 프로그램을 작성하세요. 월요일부터 금요일까지는 1200원, 주말(토요일, 일요일)은 800원입니다. 
```java 
String dayOfWeek = "토요일"; // 사용자로부터 입력 받은 요일 
int fare; 
``` 
### 문제 11: 영화 추천 프로그램 
사용자의 연령에 따라 영화 장르를 추천해주는 프로그램을 작성하세요. 13세 미만은 "애니메이션", 13세 이상 19세 이하는 "로맨틱 코미디", 20세 이상은 "액션" 장르를 추천합니다. 
```java 
int age = 25; // 사용자로부터 입력 받은 나이 
String movieRecommendation; 
``` 
### 문제 12: 계절 확인 프로그램 
달을 입력 받아 해당 계절을 출력하는 프로그램을 작성하세요. 3~5월은 봄, 6~8월은 여름, 9~11월은 가을, 12~2월은 겨울입니다. 
```java 
int month = 10; // 사용자로부터 입력 받은 월 
String season; 
```
		 * */
		
		System.out.println("#1.삼항연산자 활용해 크거나 작은수 크기 비교");
		int num01 = (int)(Math.random()*20+1);
		int num02 = (int)(Math.random()*20+1);
		System.out.println("1번째 숫자"+num01);
		System.out.println("2번째 숫자"+num02);
		String result = num01>num02? "1번째 숫자가 더 크다":"2번째 숫자가 더 크다";
		System.out.println("결과 : " + result);
		System.out.println("-----------------------------------");
		
		System.out.println("#2. 최대값 찾기");
		int a1 = (int)(Math.random()*20+1); System.out.println("1번째 숫자는"+a1);
		int a2 = (int)(Math.random()*20+1); System.out.println("2번째 숫자는"+a2);
		int a3 = (int)(Math.random()*20+1); System.out.println("3번째 숫자는"+a3);
		String a4 = a1>a2?"1번째 숫자가 제일크다":(a2>a3?"2번째숫자가 제일크다":"3번째 숫자가 제일크다");
		System.out.println("3가지 수의 비교 결과는 " + a4);
		System.out.println("-----------------------------------");
			
		System.out.println("#3.점수 입력받아 등급출력");
		Scanner sc = new Scanner(System.in);
		System
		.out.println("점수를 입력하세요.");
		int point = Integer.parseInt(sc.nextLine());
		if( point >= 80) {
			System.out.println("입력하신 점수는 : " +  point);
			System.out.println("해당하는 학점은 : A");
		} else if ( point>=70) {
			System.out.println("입력하신 점수는 : " +  point);
			System.out.println("해당하는 학점은 : B");
		} else if ( point>=60) {
			System.out.println("입력하신 점수는 : " +  point);
			System.out.println("해당하는 학점은 : C");
		} else { 
			System.out.println("입력하신 점수는 : " +  point);
			System.out.println("해당하는 학점은 : D");
		}
		System.out.println("------------------------------");
		
		System.out.println("#4. 삼항연산자 이용해서 온도에따른 음료");
		int temperature = (int)(Math.random()*45+1);
		String tem = temperature>=20?"아이스크림":"핫초코";
		System.out.println("현재 기온은 "+ temperature +"도 입니다.");
		System.out.println("선택한 음료는 "+ tem +"입니다.");
		System.out.println("------------------------------");
		
//		### 문제 5 
//		어떤 학생의 수학 점수는 85점, 과학 점수는 90점입니다. 이 학생의 수학 점수가 80점 이상이고 과학 점수가 85점 이상이면 '합격'이라는 메시지를 출력하고, 그렇지 않으면 '불합격'이라는 메시지를 출력하세요
		System.out.println("#5. 수학 과학점수가 뭣이 중헌디");
		int math = 85;
		int sci = 90;
		String pass = math>=80&&sci>=85? "합격":"불합격";
		System.out.println("어떤 학생의 시험 결과는 : " + pass);
		System.out.println("------------------------------");
		
//		### 문제 6 
//		두 숫자 `a`와 `b`가 있습니다. 두 숫자의 평균이 50 이상이면 "평균 이상", 그렇지 않으면 "평균 미만"이라는 메시지를 출력하세요.
		System.out.println("#6번예제");
		int ran01 = (int)(Math.random()*100+1);
		int ran02 = (int)(Math.random()*100+1);
		int av = (ran01+ran02)/2;
		if (av>=50) {
			System.out.println("평균이상");
		} else {
			System.out.println("평균미만");
		}
		System.out.println("-----------------------------");
		
//		### 문제 7(3항연산자활용) 
//		변수 `hoursWorked`가 임의로 주어지고, 40시간을 초과하면 "과로하세요", 그렇지 않으면 "정상 근무 시간입니다"라는 메시지를 출력하세요.
		System.out.println("#7번예제");
		int hoursWorked = (int)(Math.random()*100+1);
		String hW = hoursWorked > 40? "과로하세요":"정상 근무 시간입니다.";
		System.out.println("오늘 하루는"+ hW);
		System.out.println("-----------------------------");
		
//		### 문제 8 
//		변수 `day`에 요일을 입력하고 "일요일"나 "토요일"이면 "주말입니다", 그렇지 않으면 "평일입니다"라는 메시지를 출력하세요.
		System.out.println("#8번예제");
		System.out.println("요일을 입력하세요 : ");
		String day = sc.nextLine();
		switch(day){
		case "토요일" : 
		case "일요일" : 
			System.out.println("주말입니다.");
			break;
		default:
			System.out.println("평일입니다.");
			break;
			}
		System.out.println("-------------------------------");
		
//		### 문제 9 
//		변수 `height`의 값이 150cm 미만이면 "놀이기구를 이용할 수 없습니다", 그렇지 않으면 "놀이기구를 이용하세요"라는 메시지를 출력하세요.
		System.out.println("#9번예제");
		int height = (int)(Math.random()*100+100);
		String height01 = height<150?"놀이기구를 이용할 수 없습니다." : "놀이기구를 이용하세요";
		System.out.println("당신의 키는 "+height+"입니다.");
		System.out.println("당신의 키는" + height01);
		
//		### 문제 10: 기본 요금 계산기 
//		요일별로 다른 교통비 요금을 계산하는 프로그램을 작성하세요. 월요일부터 금요일까지는 1200원, 주말(토요일, 일요일)은 800원입니다.
		System.out.println("#10번예제");
		System.out.println("요일을 입력하세요 : ");
		String day1 = sc.nextLine();
		switch(day1) {
		case "토요일" :
		case "일요일" :
			System.out.println("입력하신 요일의 요금은 800원입니다.");
				break;
		default : 
			System.out.println("입력하신 요일의 요금은 1200원입니다");
				break;
			}
		
//		### 문제 11: 영화 추천 프로그램 
//		사용자의 연령에 따라 영화 장르를 추천해주는 프로그램을 작성하세요. 13세 미만은 "애니메이션", 13세 이상 19세 이하는 "로맨틱 코미디", 20세 이상은 "액션" 장르를 추천합니다.
		System.out.println("#11번예제");
		System.out.println("나이를 입력하세요");
		int age = Integer.parseInt(sc.nextLine());
		if(age<13) {
			System.out.println("추천영화는 애니메이션 입니다.");
		} else if (age<=19) {
			System.out.println("추천영화는 로맨틱코메디 입니다.");
		} else { 
			System.out.println("추천영화는 액션입니다.");
		}
		System.out.println("---------------------------------");
		
//		### 문제 12: 계절 확인 프로그램 
//		달을 입력 받아 해당 계절을 출력하는 프로그램을 작성하세요. 3~5월은 봄, 6~8월은 여름, 9~11월은 가을, 12~2월은 겨울입니다.
		System.out.println("#12번예제");
		System.out.println("해당 월을 입력하세요.(숫자만 입력)");
		int month = Integer.parseInt(sc.nextLine());
		switch (month) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println("해당하는 달의 계절은 봄입니다.");
				break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("해당하는 달의 계절은 여름입니다.");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println("해당하는 달의 계절은 가을입니다.");
			break;
		default : System.out.println("해당하는 달의 계절은 겨울입니다.");
		break;
		}
		System.out.println("---------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
