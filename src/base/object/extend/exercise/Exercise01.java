package base.object.extend.exercise;

public class Exercise01 {
    public static void main(String[] args) {
        B b = new B();
        //this调用B的有参构造器,因为有参构造器有默认super所有先输出父类A
    }
}

class A {
    A() {
        System.out.println("a");
    }

    A(String name) {
        System.out.println("a name");
    }
}

class B extends A {
    B() {
        this("abc");
        System.out.println("b");
    }

    B(String name) {
        //默认super();
        System.out.println("b name");
    }
}
