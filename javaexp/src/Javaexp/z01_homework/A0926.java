package Javaexp.z01_homework;

public class A0926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		# 아래 내용을 java 문제로  개념 정리하고 내용 확인해주세요
//
//		[개념] 1. 배열의 선언과 할당 기본형식의 종류를 예제를 통해 기술하세요
	
		/*
		데이터타입 변수명[] = new 데이터타입[배열의 크기]
		하고 변수명[0] = 정보값; 으로 나타낼 수도 있고
		데이터타입 변수명[] = {정보값들}; 로 한번에 할당까지 나타낼 수도 있다.
		
		 * */
		
		
//		[개념] 2. 배열의 기본 속성들을 기술하세요.
		// 요소 index 길이 
		
		
//		[확인] 3. Math.random()으로 주사위 5회 던진 결과를 배열에 할당 처리하고 출력하세요.
//		int dice [] = new int[5];
//		dice [0] = (int)(Math.random()*6+1);
//		dice [1] = (int)(Math.random()*6+1);
//		dice [2] = (int)(Math.random()*6+1);
//		dice [3] = (int)(Math.random()*6+1);
//		dice [4] = (int)(Math.random()*6+1);
//		//for문으로 한번에 처리도 가능
		
		int dice [] = new int[5];
		for(int idx=0; idx<dice.length; idx++) {
			dice[idx]=(int)(Math.random()*6+1);
			System.out.println(idx+1+"번째의 주사위의 값은 : "+ dice[idx]);
		}
		
		
//		[개념] 4. 배열과 반복문의 관계를 각 속성과 예제를 통해서 설명하세요
		
		
//		[확인] 5. 학생 30명의 점수를 배열로 초기로 일단, 선언하고,
//		for문을 통해서 임의의 점수(0~100)까지 할당해 보세요.
		int student[] = new int[30];
		for (int idx = 0; idx<student.length; idx++) {
			student[idx] = (int)(Math.random()*101);
		}
		
//		[토론] 6. for문과 배열과의 관계에서 기본형식과 foreach문의 장단점과 
//		사용하는 각각 적절한 활용 시점 토의해 보자.
		
		/*
		foreach문은 배열의 정보들이 다 정해져있는경우 사용하기 좋은거같다. 코드가
		길어질 일도 없고, 간단한 코드로 끝낼수 있지만
		원하는 인덱스의 값을 내가 설정하지 못한다는 단점이 있다.
		 
		 * */

	}

}
