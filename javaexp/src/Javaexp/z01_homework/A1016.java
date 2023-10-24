package Javaexp.z01_homework;

public class A1016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
### [1단계:개념] 1. 예외처리 기본 형식과 구체적인 예외 처리 순서 프로세스

자바에서 예외처리는 `try-catch` 블록을 사용하여 처리합니다. 

기본 형식:
```java
try {
    // 예외가 발생할 가능성이 있는 코드
} catch (예외타입1 변수명) {
    // 예외 처리 코드
} catch (예외타입2 변수명) {
    // 예외 처리 코드
} finally {
    // 항상 실행되는 코드
}
```

예외 처리 순서 프로세스:
1. `try` 블록 내에서 코드가 실행됩니다.
2. 예외가 발생하면 즉시 해당 예외를 처리할 수 있는 가장 가까운 `catch` 블록으로 제어가 이동됩니다.
3. `finally` 블록은 예외 발생 여부와 관계 없이 항상 실행됩니다.

### [1단계:확인] 2. Scanner에서 숫자형 예외 처리

```java
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("숫자를 입력하세요: ");
            try {
                int number = Integer.parseInt(scanner.nextLine());
                System.out.println("입력한 숫자: " + number);
                break; // 반복문을 빠져나가서 프로그램 종료
            } catch (NumberFormatException e) {
                System.out.println("숫자형 데이터를 입력해주세요.");
                
            }
        }
    }
}
```

### [1단계:개념] 3. 실행예외와 컴파일예외의 차이점

- **실행예외(Runtime Exception)**: 컴파일 시점에서 체크되지 않는 예외들. 주로 프로그램의 실행 도중 발생.
 		예) `NullPointerException`, `ArrayIndexOutOfBoundsException`.
- **컴파일예외(Compile-time Exception)**: 컴파일 시점에 체크되는 예외들.예외 처리를 강제함. 
		예) `FileNotFoundException`, `ClassNotFoundException`.

```java
// 예외 위임을 하지 않더라도 처리가능(런타임예외)
public void runtimeExceptionExample() {
    int[] arr = new int[5];
    arr[10] = 50;  // ArrayIndexOutOfBoundsException
}

// 예외 위임을 반드시 하여야 처리가능(컴파일 예외)
public void compileTimeExceptionExample() throws FileNotFoundException {
    File file = new File("nonexistent.txt");
    FileInputStream fis = new FileInputStream(file);
}
```

### [1단계:확인] 4. 컴파일 예외로 SQLException 처리

```java
import java.sql.*;

public void databaseQuery() {
    try {
    	// 데이터베이스 처리시 반드시 필수 예외 처리하여야 한다.
        Connection connection = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/dbname", "user", "password");
        
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM tableName");
    } catch(SQLException e) {
        e.printStackTrace();
    }
}
```

### [1단계:개념] 5. 예외 계층구조 이유

자바의 예외 계층구조는 객체 지향적인 상속의 원칙을 따릅니다. 
이 계층구조를 통해 예외들을 그룹화하고, 공통된 로직을 재사용할 수 있습니다.
예를 들어, 여러 예외들이 같은 부모 예외로부터 상속받는다면, 해당 부모 예외만으로 여러 예외를 함께 처리할 수 있습니다.

### [1단계:개념] 6. 예외의 위임

예외 위임이란 메서드나 생성자에서 발생하는 예외를 그대로 호출한 곳으로 던져서 처리하게 하는 것을 말합니다. 
`throws` 키워드를 사용하여 예외를 위임합니다.

```java
public void exampleMethod() throws SomeException {
    //...
    throw new SomeException();
}
```

### [1단계:

확인] 7. 예외 위임 코드 배열 데이터 범위 처리

```java
public class ArrayExample {
    public void method1() throws ArrayIndexOutOfBoundsException {
        int[] arr = new int[5];
        method2(arr);
    }

    public void method2(int[] arr) throws ArrayIndexOutOfBoundsException {
        arr[10] = 50;  // 예외 발생
    }

    public static void main(String[] args) {
        ArrayExample example = new ArrayExample();
        try {
            example.method1();
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 범위를 벗어났습니다.");
        }
    }
}
```

### [1단계:개념] 8. 예외의 강제

예외 강제란 특정 조건에서 프로그래머가 의도적으로 예외를 발생시키는 것을 말합니다. 
`throw` 키워드를 사용하여 예외를 강제로 발생시킬 수 있습니다.

### [1단계:조별] 9. Scanner로 데이터 입력 강제 예외 처리

```java
import java.util.Scanner;

public class ProductInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String productName ="";
        String price ="";
        String count ="";
        
        while(true){
        	try{
	        	System.out.println("물건명을 입력하세요: ");
	        	productName = scanner.nextLine();
	        	if(productName.equals("")){
	        	   throw new Exception("물건명 입력");
	        	}
	        	break;
        	}catch(Exception e){
        		System.out.println(e.getMessage());
        	}
        }
        
        while(true){
        	try{
	        	System.out.println("가격을 입력하세요: ");
	        	price = scanner.nextLine();
	        	if(price.equals("")){
	        	   throw new Exception("가격 입력");
	        	}
	        	break;
        	}catch(Exception e){
        		System.out.println(e.getMessage());
        	}
        }
          
         while(true){
        	try{
	        	System.out.println("갯수를 입력하세요: ");
	        	count = scanner.nextLine();
	        	if(count.equals("")){
	        	   throw new Exception("갯수 입력");
	        	}
	        	break;
        	}catch(Exception e){
        		System.out.println(e.getMessage());
        	}
        }     

        System.out.println("물건명: " + productName + ", 가격: " + price + ", 갯수: " + count);
    }
}

이 코드는 사용자가 올바른 값을 입력하지 않을 경우 강제로 예외를 발생시켜 경고합니다.
*/
	}

}
