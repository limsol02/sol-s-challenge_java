package Javaexp.z01_homework;

public class A1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
[1단계:확인] 1. 주문 메뉴를 배열로 선언하고 번호와 함께 리스트한 후, InputStream read()를 통해서 주문 번호를 입력 받아, 출력하세요.
[1단계:개념] 2. File 객체에서 디렉토리와 파일의 만드는 방법의 차이를 예제를 통해 기술하세요.
[1단계:개념] 3. 파일 객체와 파일의 쓰는 객체의 생성자, 메서드를 기술하고 기본예제를 통해서 처리하게 하세요. 
[1단계:확인] 4. 반의 정보를 파일명으로(1학년1반.txt)으로 하여, 배열로 선언된 학생 이름과 점수를 입력되게 하세요.
[1단계:확인] 5. 오늘날짜를 YYYYMMDD 형식으로 입력받아, 일기장을 내용을 입력하고, Q를 입력시, 종료하여, 해당 날짜.txt파일로 일기를 쓰는 처리를 하세요
[1단계:개념] 6. FileWriter, FileReader 차이점과 주요 메서드와 기능 처리 내용을 기술하세요.
[1단계:확인] 7. product.txt라는 파일에 물건 정보를 포함(사과&3000&2 형식-다중행처리)시켜놓고, 해당 물건 정보를 탭간격으로 출력되게 하세요.


이 질문들에 대한 자바 코드를 아래에 작성하였습니다.

#### 1. 주문 메뉴를 배열로 선언하고 번호와 함께 리스트한 후, InputStream read()를 통해서 주문 번호를 입력 받아, 출력하세요.
```java
public class OrderSystem {
    public static void main(String[] args) throws IOException {
        String[] menu = {"Burger", "Pizza", "Pasta", "Salad"};
        System.out.println("Choose a menu item by entering the number:");
        // 배열의 for
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        int orderNum = System.in.read() - '0';
        // 번호와 배열의 index -1 차이
        System.out.println("You ordered: " + 
        	menu[orderNum - 1]);
    }
}
```

#### 2. File 객체에서 디렉토리와 파일의 만드는 방법의 차이를 예제를 통해 기술하세요.
```java
import java.io.File;

public class FileDirectoryExample {
    public static void main(String[] args) {
        // Creating a directory
        File dir = new File("myDirectory");
        dir.mkdir();

        // Creating a file
        File file = new File("myFile.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

#### 3. 파일 객체와 파일의 쓰는 객체의 생성자, 메서드를 기술하고 
     기본예제를 통해서 처리하게 하세요.
```java
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        File file = new File("sample.txt");
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("This is a sample text.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

#### 4. 반의 정보를 파일명으로(1학년1반.txt)으로 하여, 
배열로 선언된 학생 이름과 점수를 입력되게 하세요.
```java
import java.io.FileWriter;
import java.io.IOException;

public class ClassInfo {
    public static void main(String[] args) {
        String filename = "1학년1반.txt";
        String[] students = {"John:85", "Jane:90", "Doe:78"};

        try {
        	FileWriter fw = new FileWriter(filename);
        	
            for (String student : students) {
                fw.write(student + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

#### 5. 오늘날짜를 YYYYMMDD 형식으로 입력받아, 일기장을 내용을 입력하고, Q를 입력시, 종료하여, 해당 날짜.txt파일로 일기를 쓰는 처리를 하세요.
이 내용은 상당히 길어져서, 아래에 직접 추가로 작성하겠습니다.

#### 5. 오늘날짜를 YYYYMMDD 형식으로 입력받아, 일기장을 내용을 입력하고, Q를 입력시, 종료하여, 해당 날짜.txt파일로 일기를 쓰는 처리를 하세요.
```java
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiaryEntry {
    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter today's date in YYYYMMDD format:");
        String date = reader.readLine();
        String path = "경로명..";
        
        File f = new File(path+date);
        if(!f.exists()){
        	f.createNewFile();
        }
        System.out.println("Write your diary entry. Enter 'Q' on its own line to finish.");
        StringBuffer entry = new StringBuffer();
        String line;
        while (true) {
            line = reader.readLine();
            if(line.equals("Q")){
            	break;
            }
        	entry.append(line).append("\n");
        }
        try{
        	FileWriter fw = new FileWriter(path+date );
            fw.write(entry.toString());
        }catch(IOException e){
        	System.out.println(e.getMessage());
        }
    }
}
```

#### 6. FileWriter, FileReader 차이점과 주요 메서드와 기능 처리 내용을 기술하세요.
`FileWriter`와 `FileReader`는 각각 텍스트 파일에 문자 데이터를 쓰거나 읽을 때 사용되는 클래스입니다.

- **FileWriter**: 텍스트 파일에 문자 데이터를 쓰기 위해 사용됩니다.
  - 주요 메서드:
    - `write(int c)`: 한 문자를 씁니다.
    - `write(char[] cbuf)`: 문자 배열을 씁니다.
    - `write(String str)`: 문자열을 씁니다.
    - `flush()`: 버퍼를 비우고, 모든 변경 사항을 파일에 씁니다.
    - `close()`: 파일을 닫습니다.
    
- **FileReader**: 텍스트 파일에서 문자 데이터를 읽기 위해 사용됩니다.
  - 주요 메서드:
    - `read()`: 한 문자를 읽습니다.
    - `read(char[] cbuf)`: 문자 배열로 데이터를 읽습니다.
    - `close()`: 파일을 닫습니다.

#### 7. product.txt라는 파일에 물건 정보를 
포함(사과&3000&2 형식-다중행처리)시켜놓고, 
해당 물건 정보를 탭간격으로 출력되게 하세요.
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProductReader {
    public static void main(String[] args) {
    	/*
        try (BufferedReader br = new BufferedReader(new FileReader("product.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("&");
                System.out.println(parts[0] + "\t" + parts[1] + "\t" + parts[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileReader fr = new FileReader("경로"+product.txt);
        StringBuffer sbf = new StringBuffer();
        while(true){
        	int code = fr.read(); // 코드값 가져오기..
        	sbf.append((char)code);
        	if(code==-1){ // 마지막 라인에 이를때..
        		break;
        	}
        }
        // sbf ==> toString()을 호출..
         StringBuffer  split() 기능 가지지 않음..
         sbf.toString() 통해서  String으로 변환.
        String[] rowProds= sbf.toString().split("\n");
       	for(String row : rowProds){ // 행단위로..
       	    // 사과&3000&2 
       	    String arry[] = row.split("&");
       	    System.out.print(arry[0]+"\t"); 
       	    System.out.print(arry[1]+"\t"); 
       	    System.out.print(arry[2]); 
       	}
        
        */
		
		


	}

}
