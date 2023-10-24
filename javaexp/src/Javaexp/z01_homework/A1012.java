package Javaexp.z01_homework;


public class A1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. 추상클래스와 일반클래스의 재정의 차이점을 예제를 통해 기술하세요
//		[1단계:개념] 2. Food를 추상클래스로 선언하고, name(음식종류), eat()공통메서드 @@을 먹다, taste()추상메서드로 다양한 맛을 출력
//				좋아하는음식 3가지를 실제클래스를 선언하여 출력하세요.
//		[1단계:개념] 3. 인터페이스의 구성요소의 특징을 예제와 함께 선언하세요
//		[1단계:확인] 4. FishingWay goFishing() 인터페이스를 선언하여, 상속받은 실제클래스를 2개를 선언하고, 실제클래스 Fisher에 이름과 인터페이스 FishingWay를 선언하고
//				addFishingSkill() 할당하게 하면  해당 어부가 낙시하는 goFishing()메서드를 호출하여 처리하세요.

/*
### [1단계:개념] 1. 추상클래스와 일반클래스의 재정의 차이점 예제
추상 클래스는 일반적으로 완전히 구현되지 않은 메서드(추상 메서드)를 
포함할 수 있지만, 일반 클래스는 그렇지 않다. 따라서, 추상 클래스를 
상속 받는 하위 클래스는 추상 메서드를 반드시 재정의(오버라이드)해야 한다.
```java
// 추상 클래스
abstract class AbstractAnimal {
    abstract void sound(); // 추상 메서드
}

class Dog extends AbstractAnimal {
    @Override
    void sound() {
        System.out.println("Woof!");
    }
}

// 일반 클래스
class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Cat extends Animal {
    @Override
    void sound() { // 선택적으로 재정의 가능
        System.out.println("Meow");
    }
}
```

### [1단계:개념] 2. Food 예제

```java
abstract class Food {
    protected String name;
    Food(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + "을(를) 먹다");
    }

    abstract void taste(); // 추상 메서드
}

class Pizza extends Food {
    Pizza() {
        super("피자");
    }

    @Override
    void taste() {
        System.out.println("짭짤하고 맛있다.");
    }
}

class IceCream extends Food {
    IceCream() {
        super("아이스크림");
    }

    @Override
    void taste() {
        System.out.println("달콤하고 시원하다.");
    }
}

class Spaghetti extends Food {
    Spaghetti() {
        super("스파게티");
    }

    @Override
    void taste() {
        System.out.println("매콤하고 알싸하다.");
    }
}
```

### [1단계:개념] 3. 인터페이스의 구성요소의 특징 예제

인터페이스는 주로 추상 메서드와 상수만을 포함한다. (자바 8부터는 default 메서드와 static 메서드도 포함 가능하다.)

```java
interface ExampleInterface {
    int CONSTANT = 100; // 상수 (public static final이 자동으로 붙는다.)

    void abstractMethod(); // 추상 메서드 (public abstract이 자동으로 붙는다.)
    // default 라고 붙여서 공통메서드도 사용할 수 있다.
    default void defaultMethod() { // default 메서드
        System.out.println("This is a default method");
    }
    // static으로 객체 생성 없이 사용하는 메서드 가능하다.
    // ExampleInterface.staticMethod();
    static void staticMethod() { // static 메서드
        System.out.println("This is a static method");
    }
}
```
### [1단계:확인] 4. FishingWay 예제

```java
interface FishingWay {
    void goFishing();
}

class NetFishing implements FishingWay {
    @Override
    public void goFishing() {
        System.out.println("그물로 낚시를 한다.");
    }
}

class RodFishing implements FishingWay {
    @Override
    public void goFishing() {
        System.out.println("낚싯대로 낚시를 한다.");
    }
}

class Fisher {
    private String name;
    private FishingWay fishingWay;

    Fisher(String name) {
        this.name = name;
    }

    void addFishingSkill(FishingWay way) {
        this.fishingWay = way;
    }

    void performFishing() {
        System.out.print(name + "이(가) ");
        if(fishingWay!=null)
        	fishingWay.goFishing();
        else
        	System.out.println("아직 낚시하는 방법을 설정하지 않았습니다");
    }
}

public class Main {
    public static void main(String[] args) {
        Fisher john = new Fisher("John");
        john.addFishingSkill(new RodFishing());
        john.performFishing();
        
        Fisher jane = new Fisher("Jane");
        jane.addFishingSkill(new NetFishing());
        jane.performFishing();
    }
}
```


 
 * */
	}

}
