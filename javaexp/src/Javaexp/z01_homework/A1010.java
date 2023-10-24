package Javaexp.z01_homework;

public class A1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
1. 상속의 기본 구조

상속의 기본 구조는 자식 클래스가 부모 클래스의 필드와 메서드를 상속받아 사용하는 것을 의미합니다.
class Parent {
}

class Child extends Parent {
}

}
2. Child, Parent 상속관계에서 메서드 상속

class Parent {
    void show() {
        System.out.println("This is parent class method.");
    }
}

class Child extends Parent {
}

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();  // Outputs: "This is parent class method."
    }
}
3. 상속에서 super 사용

super 키워드는 자식 클래스에서 부모 클래스의 필드나 메서드를 참조할 때 사용합니다.
주로 자식 클래스의 생성자에서 부모 클래스의 생성자를 호출할 때 사용합니다.

4. Animal Dog에서 this, super 이용
class Animal {
    String kind;

    Animal(String kind) {
        this.kind = kind;
    }

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    Dog(String kind) {
        super(kind);
    }

    @Override
    void sound() {
        System.out.println("Woof Woof!");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog");
        dog.sound();  // Outputs: "Woof Woof!"
    }
}


5. Person 클래스 상속하는 Student 클래스
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}

class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    void introduce() {
        System.out.println("My name is " + name + ", I am " + age + " years old and I am in grade " + grade + ".");
    }
}


// 6. Animal 클래스와 상속받는 Dog, Cat 클래스
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("야옹");
    }
}

// 7. Person 클래스와 상속받는 Employee 클래스
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    String company;
    String job;

    Employee(String name, int age) {
        super(name, age);
        this.company = null;
        this.job = null;
    }
}

// 8. Person 클래스와 상속받는 Student 클래스
class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        Employee employee = new Employee("John", 25);
        System.out.println(employee.name + ", " + employee.age + ", " + employee.company + ", " + employee.job);

        Student student = new Student("Alice", 20, 3);
        System.out.println(student.name + ", " + student.age + ", " + student.grade);
    }
}



 
 */
		

	}

}
