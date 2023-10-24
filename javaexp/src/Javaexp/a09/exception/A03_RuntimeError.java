package Javaexp.a09.exception;

public class A03_RuntimeError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 실행예외 처리 순서
		// 1. 실행예외 나올 코드 내용 수행.
		// 2. 해당 에러 코드를 복사 catch문에 예외 처리..
		for(int cnt = 10; cnt<-10; cnt--) {
			System.out.println("1에서 "+cnt+"를 나눈값..");
			//System.out.println((double)1 / cnt);
		}
		//이와같이 런타임 에러는 실행을 하기 전까지 에러인지가 
		//파악이 안된다. 위와 같이 나누기값이 0이 될 수도 있고,
		//그외에 숫자가 될 수도 있어 실행될 때, 예외 처리되게
		//하는 것으로 예외가 나올 수 있는 상황을 코드하여 예외
		//를 처리한다.
		
		/*
		 * # 반복문의 경우 
		 * 1. try문을 반복문 안에 넣는 경우.. 해당 step에서 예외처리를 하고 다음 step으로 넘어갈 수 있다.
		 * 
		 * for(int cnt = 10; cnt<-10; cnt--) { 
		 * 		try{
		 * 			System.out.println("1에서 "+cnt+"를 나눈값.."); 
		 * 			System.out.println((double)1 /cnt); 
		 * 		}catch(Exception e){
		 * 			 System.out.println("예외발생 :"+e.getMessage) }
		 * }
		 * 
		 * 
		 * 2. try문을 반복문 밖으로 감싸는 경우 에러 발생하면 해당 step에서 전체 반복문이 중단이 된다.
		 * 
		 * try{ 
		 * 		for(int cnt = 10; cnt<-10; cnt--) {
		 * 			System.out.println("1에서 "+cnt+"를 나눈값.."); 
		 * 			System.out.println((double)1 /cnt);
		 * 			}
		 * }catch(Exception e){
		 * 		 System.out.println("예외발생 :"+e.getMessage) }
		 */
		
			
		
		
		System.out.println("시작!");
		try {
			System.out.println(1 / 0);
		} catch (ArithmeticException e) {
			System.out.println("실행예외 발생 :" + e.getMessage());
		}
		System.out.println("종료!");
		System.out.println("===================================");

		// ex1) 실행예외 연습1
		try {
			String s = null;
			//ㄴ=> 아직 객체 생성 전
			s.toString();
			//ㄴ=> 객체의 속성을 호출.. 즉, 객체가 heap영역이 생성되지 않은 
			// 상태에서 메서드를 호출하니, 주소값이 없습니다.
			// 에러가 나오는데, 이것을 처리해주는 예외 처리내용..
			
			
		} catch (NullPointerException ne) {
			//ㄴ=> NullPointerException :
			// Pointer : 주소가 Null 없을때, Exception 에러..
			System.out.println("#예외처리#");
			System.out.println("실행예외 발생 :" + ne.getMessage());
		}
		System.out.println("종료!");
		System.out.println("===================================");

		// ex2) 실행예외 연습2
		try {
			args[1].toString();
			//ㄴ=> java A03_RuntimeError 100 200 300(run as)
			// args[0] : 100
			// args[1] : 200
			// args[2] : 300
		} catch (ArrayIndexOutOfBoundsException ab) {
			//ㄴ=> ArrayIndexOutOfBoundsException
			// 배열의 인덱스이 범위를 벗어난 예외
			System.out.println("#예외처리#");
			System.out.println("실행예외 발생 :" + ab.getMessage());
		}
		System.out.println("종료!");
		System.out.println("===================================");

		// ex3) 실행예외 연습3
		try {
			Integer.parseInt("하나");
			//ㄴ=> 숫자형 문자열을 입력해서 형변환 처리 하여야 하는데,
			//	숫자형 문자열이 아닐 떄, 실행 에러 발생
		} catch (NumberFormatException nf) {
			//ㄴ=> NumberFormatException
			// 숫자형 형식에 대한 예외
			System.out.println("#예외처리#");
			System.out.println("실행예외 발생 :" + nf.getMessage());

		}
		System.out.println("종료!");
		System.out.println("===================================");
	}

}

/*
# 예외와 예외클래스

 1. 프로그래밍을 하면, 에러나 여러가지 오류로 인하여 처리가 문제가
 	발생하는 경우가 있다. 이러한 문제는 프로그램에 대한 신뢰성에
 	치명적으로 영향을 미치기에 보다 효과적으로 대응하는 것이 필요하다.

 2. 자바는 이러한 프로그래밍의 에러나 예외적인 상황에 대응하기 위하여
 	예외처리 코드를 api로 지원하고 있다.
 	Exception(내장된 내용) : 만들어진 것을 활용.
 	try {
 		예외가 나올만한 코드1
 		예외가 나올만한 코드2
 		예외가 나올만한 코드3
 		
 	}catch(예외처리 클래스){
 	
 	}
 
 3. 오류의 종류 
 	1) 에러를 처리하려면 우선 자바에서 발생하는 오류의 종류를 알고,
 		해당 사항에 대한 적절한 오류 처리 방법을 코드로 구현하여야 한다.
 	
 	2) 오류는 크게 2가지로 나뉜다. 
 		
 		-에러(치명적)
 			하드워에어의 잘못된 동작 또는 고장으로 인한 오류
 			에러가 발생되면 프로그램 종료
 			정상 실행 상태로 돌아갈 수 없음
 		-예외(경미)
 			사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 인한 오류
 			예외가 발생되면 프로그램이 종료된다.
 			예외 처리 추가하면 정상 실행 상태로 돌아갈 수 없음
 		==> 예외 처리를 통해, 에러의 내용을 파악하고, 에러가 나더라도
 			프로그램이 멈추지 않고 정상적인 처리를 하는 것으로 
 			사용자의 신뢰성 확보를 할 수 있다.
 	
 	3) 프로그래밍 처리 방법으로 인한 구분
 		
 		- 일반(컴파일 체크)예외
 			예외 처리 코드 없으면 컴파일 오류 발생하는 것으로 보통
 			컴파일도 안되기에 툴에서는 왼쪽에 발간색으로 표기 된다.
 			==> 필수 예외 처리가 필요한 것으로 IO(input output)
 			처리되는 것과 메모리가 로딩되는 것 등이 주로 이 예외처리 에러이다.
 			ex) IO(파일읽기/쓰기/데이터 전송 등), DB처리, 네트워킹 처리 등
 		
 		- 실행(런타임 에러)예외
 		 	예외 처리 코드를 생략하더라도 컴파일이 되는 예외로
 		 	경험에 따라 예외 처리 코드 작성이 필요하다.
 		 	실행 후, 실행되어 처리되는 데이터에 대한 예외를 발생하는 
 		 	경우 ==> heap메모리 호출에러(NullPointException),
 		 	배열에러(IndexOutOfBoundsException), 0나누기(ArithMethicsException) 등
 		 	프로그램에 흔하게 발생하는 에러 처리이다.
 
  4. 단계별 예외 처리 형식
  	1) 1단계 기본형식
  		try{
  			1
  			2 예외가 나올만한 코드
  				==> 해당 라인에서 예외 던짐 throw new XXXX();
  					사용자 정의 예외 이외는 내부적으로 예외를 던짐
  			3 이후 라인은 수행하지 못 함
  			4
  		}catch(Exception e){
  			Exception 상속관계의 상위이기에 하위 모든 예외를 받음
  			예외가 나왔을 때, 처리할 내용
  			e.기능메서드() : 예외에 대한 정보를 처리할 수 있는 내용 수행
  			e.getMessage() : 예외의 가장 기본 정보를 가져온다.
  		}
  		
  	2) 2단계 계층적 처리
  		try{
  			
  		}catch(최하위 예외클래스){
  			메모리가 가장 작고 좁은 범위의 최하위 예외에 대한
  			처리를 먼저 
  		}catch(차상위 예외클래스){
  		
  		}catch(상위 예외클래스){
  		
  		}finally{} 예외 상관없이 처리..
  		
  	3) 3단계 예외의 위임
  		필요성 : 예외가 나오는 구문을 위 try{}catch{} 블럭으로
  		모든 곳에 메서드별로 처리해야 하는데, 이것을 기능메서드 별로
  		구분하여 처리하지않고, 이 메서드가 호출할 때, 처리하는 것을
  		예외의 위임이라고 한다.
  		
  		- 코드의 중복성을 줄이고
  		try{}catch(){}블럭 각 메서드 별로 try{}catch(){}블럭
  		사용하지 않아도 된다.
  		
  		- 체계적으로 분류하여 예외 처리를 관리하기 위한 목적
  			다중 예외처리를 통해 효과적으로 관리할 수 있다.
  			ex) NullPointer 처리할 예외 블럭 내용 기수
  			수학관련 처리할 예외 블럭 내용 기술
  			배열관련 처리할 예외 블럭 내용 기술
  			컴파일관련 처리할 예외 블럭 기술
  		메소드별로 예외를 위임하여 처리 : 2개 이상도 예외를 위임할 수 있다.
  		
  		void 메소드명() throws 위임할 예외1, 위임할 예외2..{
  		
  		}
  		try {
  			메소드명 예외가 위임되어 호출되는 내용
  		}catch(위임된 예외 처리클래스1){
  		
  		}catch(위임된 예외 처리클래스2){}
 * */
