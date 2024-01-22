package lab_1;

public class Main {
    public static void main(String[] args) {
        var ch1 = new Child();
        System.out.println("============================================================================");
        ch1.Instance1();
        System.out.println("============================================================================");
        ch1.Instance2();
        System.out.println("============================================================================");
        Child.Static1();
        System.out.println("============================================================================");
        Child.Static11();
        System.out.println("============================================================================");
        Child.Static2();
        System.out.println("============================================================================");
        new Child("Ivan");
    }
}

class Parent {
    private String name;

    static public void Static1() {
        System.out.println("Parent:static 1");
    }

    public void Instance1() {
        System.out.println("Parent:instance 1");
    }

    static public void Static2() {
        System.out.println("Parent:static 2");
    }

    public Parent(){
        System.out.println("Parent:constructor");
    }

    public void Instance2() {
        System.out.println("Parent:instance 2");
    }

    public Parent(String name){
        this.name = name;
        System.out.println("Parent:name-constructor");
    }
}

class Child extends Parent {
    static public void Static11() {
        System.out.println("Child:static 11");
    }

    @Override
    public void Instance1() {
        System.out.println("Child:instance 1");
    }

    static public void Static2() {
        System.out.println("Child:static 2");
    }

    public Child(){
        System.out.println("Child:constructor");
    }

    @Override
    public void Instance2() {
        System.out.println("Child:instance 2");
    }

    public Child(String name){
        super(name);
        System.out.println("Child:name-constructor");
    }
}