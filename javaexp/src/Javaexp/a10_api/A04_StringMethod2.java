package Javaexp.a10_api;

public class A04_StringMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		# 문자열을 찾아서 변경할 떄 사용하는 replace
		1. 기본형식
			문자열.replace("찾을 문자열","변경할 문자열")
		 * */
		String target = "자바는 객체지향 프로그램입니다! 자바는 풍부한api지원";
		String newStr = target.replace("자바", "JAVA");
		System.out.println("수정후 결과 : "+ newStr);
		
		/*
		# 코드성 문자열을 추출하여 원하는 데이터를 처리한 substring
		1. 특정 범위의 문자열을 추출하여 처리한다.
			문자열.substring(추출할 시작위치(0~), 추출할 마지막위치(1~))
		 * */
		String data = "홍길동 70, 80, 90";
		String name = data.substring(0,3);
		String kor = data.substring(4,6);
		String eng = data.substring(8,10);
		String math = data.substring(12,14);
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		
		// ex) 본인의 주민번호를 선언하고, 생년 월 일을 위
		//		substring에 의해서 추출하세ㅐ요
		
		String civilCode = "960202";
		String year = civilCode.substring(0, 2);
		String month = civilCode.substring(2, 4);
		String day = civilCode.substring(4, 6);
		System.out.println("생년 : "+ year);
		System.out.println("월 : "+ month);
		System.out.println("일 : "+ day);
		
		/*
		# 특정한 구분자를 통해서 데이터를 구분하여 추출하는 형식 split
		1. 기본형식
			String[] arry = 문자열.split("구분자");
			특정한 구분자를 기분해서 문자열 데이터를 만드는 메서드이다.
		 * */
		String[] friuts = "사과&바나나&딸기".split("&");
		System.out.println("#과일종류#");
		for(String friut :friuts ) {
			System.out.println(friut);
		}
		
//		ex) 서울-대전-대구-광주-제주 라는 문자열을
//		구분하여 배열로 만들어서 출력하세요..
		
		String [] locs = "서울-대전-대구-광주-제주".split("-");
		for(String loc : locs) {
			System.out.print(loc+"찍고 ");
		}
		
		
	}

}
