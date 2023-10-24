package Javaexp.z01_homework;

import java.util.Random;
import java.util.Scanner;

public class A1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. Wrapper클래스를 사용하는 이유와 기본 선언 형식을 기술하세요
//		[1단계:개념] 2. 기본적인 Boxing/UnBoxing과 AutoBoxing/AutoUnBoxing을 기본 예제를 통해 설명하세요.
//		[1단계:확인] 3. Math클래스를 이용해서, 학생 3명의 점수(0~100)사이 로딩하고, 최고점, 최저점, 평균점(반올림) 출력을 하세요
//		[1단계:개념] 4. Math.random()과 Random 클래스의 차이점을 기능 메서드 위주로 기술하세요.
//		[1단계:확인] 5. Random를 활용하여 컴퓨터와 가위/바위/보 게임 3회를 실시하여 @승 @무 @패 출력하세요.
//		[1단계:개념] 6. 컬렉션 상위 3개 인터페이스의 특징을 기술하세요.
//		[1단계:확인] 7. List의 주요메서드 이용하여, 장바구니 물건정보(물건명, 가격, 갯수)를 3개를 담고, 수정, 삭제 해보세요.
//		[1단계:확인] 8. Map을 이용하여  key로는 1학년1반30번, value으로는 80(점수)를 넣어 학생 3명의 점수를 할당하고 출력해보세요.
//		[1단계:확인] 9. List안에 class로 회원정보(아이디,패스워드,이름,권한,포인트)를 선언하고, 회원5명을 정보를 등록 및 리스트 출력하세요.
/*
각 질문에 대한 자바 코드 예제와 설명을 제공하겠습니다.

**[1단계:개념] 1. Wrapper 클래스 사용 이유 및 기본 선언 형식**

- 사용 이유: 
  1. 기본 자료형(primitive data type)에 대한 객체 표현이 필요할 때 사용합니다.
  2. 컬렉션과 같은 객체만을 저장하는 자료구조에 기본 자료형 값을 저장하기 위해 사용됩니다.
  List<Integer> list = new ArrayList<Integer>();
  list.add(25);
  list.add(75);
  list.add(85);
  3. 클래스에 따른 유용한 메서드들을 사용할 수 있습니다.
  
- 기본 선언 형식:
  ```java
  Integer intObj = new Integer(123);
  Integer intObj = Integer.valueOf(123);
  ```

**[1단계:개념] 2. Boxing/UnBoxing 및 AutoBoxing/AutoUnBoxing**

- Boxing: 기본 자료형의 값을 래퍼 객체로 변환하는 것
  ```java
  Integer boxedInt = new Integer(10);
  ```

- UnBoxing: 래퍼 객체의 값을 기본 자료형으로 변환하는 것
  ```java
  int unboxedInt = boxedInt.intValue();
  ```

- AutoBoxing: 기본 자료형의 값을 자동으로 래퍼 객체로 변환하는 것
  ```java
  Integer autoBoxedInt = 10;
  ```

- AutoUnBoxing: 래퍼 객체의 값을 자동으로 기본 자료형으로 변환하는 것
  ```java
  int autoUnboxedInt = autoBoxedInt;
  ```

**[1단계:확인] 3. Math 클래스를 이용한 학생 점수 계산**

```java
public class ScoreCalculator {
    public static void main(String[] args) {
        double[] scores = {Math.floor(Math.random() * 101), Math.floor(Math.random() * 101), Math.floor(Math.random() * 101)};

        double maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        double minScore = Math.min(scores[0], Math.min(scores[1], scores[2]));
        double averageScore = (scores[0] + scores[1] + scores[2]) / 3;

        System.out.println("최고점: " + maxScore);
        System.out.println("최저점: " + minScore);
        System.out.println("평균점: " + Math.round(averageScore));
    }
}
```

**[1단계:개념] 4. Math.random()과 Random 클래스 차이**

- `Math.random()`: 0.0(포함)과 1.0(미포함) 사이의 double 값을 반환하는 정적 메서드.
- `Random` 클래스: 다양한 타입의 랜덤 값을 생성할 수 있는 메서드들을 제공하는 클래스. 예를 들면, `nextInt()`, `nextLong()`, `nextDouble()` 등의 메서드가 있습니다. 또한 시드(seed) 값을 설정하여 동일한 랜덤 시퀀스를 생성할 수 있습니다.

**[1단계:확인] 5. Random를 활용한 가위/바위/보 게임**


```java
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] choices = {"가위", "바위", "보"};
        Random rand = new Random();

        for (int i = 0; i < 3; i++) {
            int computerChoice = rand.nextInt(3);
            // 사용자의 선택은 예를 들어 항상 "가위"로 가정
            System.out.println("컴퓨터의 선택: " + choices[computerChoice]);
            // 여기에 승/무/패 판정 로직 추가
        }
    }
}
```

*/
		Random r = new Random();
		int com = r.nextInt(3);
		Scanner sc = new Scanner(System.in);

		int meWin = 0;
		int meLose = 0;
		int meSame = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println("가위바위보 중 하나를 입력하세요");
			String me = sc.nextLine();

			if (com == 0) {
				System.out.println("컴퓨터는 가위");
			}
			if (com == 1) {
				System.out.println("컴퓨터는 바위");
			}
			if (com == 2) {
				System.out.println("컴퓨터는 보");
			}
			if (me.equals("가위")) {
				if (com == 0) {
					System.out.println("무승부");
					meSame += 1;
				} else if (com == 1) {
					System.out.println("사용자 패배");
					meLose += 1;
				} else {
					System.out.println("사용자 승리");
					meWin += 1;
				}
			}
			if (me.equals("바위")) {
				if (com == 0) {
					System.out.println("사용자승리");
					meWin += 1;
				} else if (com == 1) {
					System.out.println("무승부");
					meSame += 1;
				} else {
					System.out.println("사용자 패배");
					meLose += 1;
				}
			}
			if (me.equals("보")) {
				if (com == 0) {
					System.out.println("사용자 패배");
					meLose += 1;
				} else if (com == 1) {
					System.out.println("사용자 승리");
					meWin += 1;
				} else {
					System.out.println("무승부");
					meSame += 1;
				}
			}
		}

		System.out.println("사용자 승리 :" + meWin + "판\n" + 
		"사용자 패배 :" + meLose + "판\n" + "무승부:" + meSame + "판\n");
		
		
	}

}
