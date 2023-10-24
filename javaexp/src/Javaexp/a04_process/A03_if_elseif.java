package Javaexp.a04_process;

public class A03_if_elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		#if else if
		1. 기본 형식
			
			if(조건1){  // if(pt>=90)
			
			}else if(조건2){  // else if(pt<90 && pt>=80) 이거 굳이 pt<90 안써도됨
				조건1을 제외하고 조건2일때..
			}else if(조건3){
			
			}else{
			
			}
		 * */
		int moodValue = (int)(Math.random()*10+1); //1~10까지 기분의 수치 (10이 가장 좋은 기분)
		if(moodValue>=9) {
			System.out.println("기분이 째져");
		}else if(moodValue>=7) {//9이상 (1조건은) 당연히 제외됨
			System.out.println("기분이 좋아요");
			
		}else if(moodValue>=5) {
			System.out.println("기분 보통");
		}else if(moodValue>=3) {
			System.out.println("기분 우울");
		} else {
			System.out.println("집에보내주새ㅔ요");
		}
		
		String animal = "임솔";
		if(animal.equals("강아지")) {
			System.out.println("멍멍!");
		} else if (animal.equals("고양이")) {
			System.out.println("냥냥!");
		} else if (animal.equals("소")){
			System.out.println("음메");
		} else if (animal.equals("닭")) {
			System.out.println("꼭꼬!");
		} else {
			System.out.println("알수없는소리입니다.");
		}
		
		// ex) 보유 연료량 500L~10000L 임의 연료량 
		// 6000L 이상이면 태양까찌 여행가능
		// ~5000리터 화성
		// ~2000리터 금성
		// ~1000리터 달
		// 그외는 우주여행 불가..
		
		int l = (int)(Math.random()*9501+500);
		if(6000<=l) {
			System.out.println("태양여행 가능");
		} else if(5000<=l) {
			System.out.println("화성여행 가능");
		} else if(2000<=l) {
			System.out.println("금성여행 가능");
		} else if(1000<=l) {
			System.out.println("달여행 가능");
		} else { 
			System.out.println("우주여행 불가");
		}
		System.out.println("가지고 있던 연료량 : " +l+ "L");
		System.out.println();
		
		
		

	}

}
