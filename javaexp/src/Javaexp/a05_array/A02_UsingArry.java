package Javaexp.a05_array;

public class A02_UsingArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		#배열의 활용
		1.배열을 index단위 호출하거나 할당할 수 있다.
			int [] iArry = new int[3];
			String[] arry = {"사과", "바나나", "딸기"};
			iArry[0] = 45;
			iArry[1] = 50;
			
			system.out.println(arry[0]);
			arry[1] = "오렌지";
		
		2. 배열은 lengh 배열의 길이를 가져올 수 있다.
			iArry.length : 3
			
		2. 배열과 반복문
			1) for(int idx =0; idx<배열명.length; idx++){
					배열명[idx] 
			}
			//idx<배열명.length: 배열의 index와 배열의
			  길이가 정수형을 1차이가 나기 때문에 <(미만)으로
			  표기하여야한다. (주의)
			
			2) for(단위 객체 : 배열객체){
				//배열안에 있는 구성요소 하나씩 가져와서 처리후,
				 다음 index의 배열을 가져온다.
				  
			}
		 * */
		
		String[] fruits = {"사과", "바나나", "딸기"};
		int[] fruPrices = new int[3]; // 초기데이터 0 으로 할당
		fruPrices [0] = 2000; // 배열명[index번호]로 저장할 수 있다.
		fruPrices [1] = 4000;
		fruPrices [2] = 12000;
//		fruprices [3] = 5000; 에러발생 : 배열의 크기보다 더 많은 index호출
		
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		System.out.println(fruPrices [0]);
		System.out.println(fruPrices [1]);
		System.out.println(fruPrices [2]);
		// 배열에 저장된 데이타 index호출하여 가져올 수 있다.
		System.out.println("과일들의 배열의 크기 : "+fruits.length);
		System.out.println("과일가격들의 배열의 크기 : "+fruPrices.length);
		
		//ex) 3학생의 학점 등급을 문자 'A','C','D'등으로 할당하였다.
		//		배열에 할당하여 출력하세요
		char grede[] = {'A','C','D'};
		System.out.println(grede[0]);
		System.out.println(grede[1]);
		System.out.println(grede[2]);
		
		
		//ex2) 회원의 몸무게를 소숫점 1자리까지 저장하게 5명을 배열로 선언하고
		//	index로 접근하여 할당하고 출력하세요.
		
		double weight[] = new double[5];
		weight[0] = 50.1;
		weight[1] = 50.2;
		weight[2] = 50.3;
		weight[3] = 50.4;
		weight[4] = 50.5;
		System.out.println(weight[0]);
		System.out.println("몸무게 배열의 갯수 : "+weight.length);
		
		//배열과 mapping된 for문 처리
		//int idx=0 : 배열의 시작 index
		//idx<weight.length : 배열의 한계치 범위 index는 크기보다 1 작다.
		//idx++ : 배열의 증가처리
		//weight[idx] : 배열의 구성요소 접근 처리
		for(int idx=0; idx<weight.length;idx++) {
			System.out.print(idx+"번째 회원몸무게 : ");
			System.out.println(weight[idx]+"kg");
		}
		
		//ex) 회원 3명의 이름과 회원의 나이를 배열로 선언 할당 후,
		//		반복문 for를 통해서 출력하세요
		//		번호	회원명	회원나이
		//		1	@@@		@@
		//		2	@@@		@@
		//		3	@@@		@@
		
		String mname[] = {"임솔", "임의진","임봉"};
		int mage[] = {20,21,22};
		System.out.println("번호\t회원명\t회원나이");
		for(int idx = 0; idx<mname.length;idx++) {
				System.out.println((idx+1) +"\t"+mname[idx]+"\t"+mage[idx]);
		}
		
		//for (단위:배열)
		System.out.println("#forEach구문을 통한 배열 데이터#");
		for(String name:mname) {
			System.out.println(name);
		}
		
		//ex1) 위 mage를 for each 구문을 통해 출력하고,
		//		전역변수를 활용하여 평균나이를 출력하세요
		//ex2) [알고리즘 문제]
				//		전역변수 추가하고 최대나이를 출력하세요
		int tot =0;
		int maxAge=0;
		
		for(int age:mage) {
			tot +=age;
			if(age>maxAge){
				maxAge =age;
			}
			System.out.println("나이:" + age);
		}
		System.out.println("평균나이 : " + (tot/mage.length));
		System.out.println("최대나이 : " + maxAge);
		
		// 영어의 알파벳의 모음여부 출력하기
		char[] greets = {'H','e','l','l','o'};
		for (char c : greets) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				System.out.print("[모음]");
			}
			System.out.print(c+",");
		} System.out.println();
		//대소문자 구분여부
		for (char c : greets) {
			if(c>=97&&c<=122) {
			System.out.print("[소문자]");
			}else {
				System.out.print("[대문자]");
			}System.out.print(c+",");
		}
		System.out.println();
		
		
		
		byte bytes[] = new byte[16];
		for(int idx=0; idx<bytes.length; idx++) {
			bytes[idx]=(byte)(Math.random()*90+33);
		}
		// byte[]==>char[]==>String
		String tmpPass = new String(bytes);
		System.out.println("임의의 비밀번호 : "+tmpPass );
		// 33~122 90
		
		
		//		for(int code=65;code<=122;code++) {
//			System.out.println(code+":"+(char)code); // 유니코드 확인
//		}
		
		
		
	}

}
