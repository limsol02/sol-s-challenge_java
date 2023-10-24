package Javaexp.y01_util;

public class A02_ErrorTracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int no = 0;
//		System.out.println(++no+ "번째 라인 코드");
//		System.out.println(++no+ "번째 라인 코드");
//		System.out.println(++no+ "번째 라인 코드");
//		System.out.println(++no+ "번째 라인 코드");
//		System.out.println(++no+ "번째 라인 코드");
//		System.out.println(++no+ "번째 라인 코드");
//		System.out.println(++no+ "번째 라인 코드");
//		System.out.println(++no+ "번째 라인 코드");
//		System.out.println(++no+ "번째 라인 코드");
//		System.out.println(++no+ "번째 라인 코드");
//		System.out.println(++no+ "번째 라인 코드");
//		System.out.println(++no+ "번째 라인 코드");
//		System.out.println(++no+ "번째 라인 코드");
//		System.out.println(++no+ "번째 라인 코드");
		
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
		
	}

}
