package primary.object.exercise;


/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Exercise05 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
    }
}

class A {
    private String name = "hsp";

    public void f1() {
        class B {//局部内部类
            private static final String NAME = "tao";
            private String name = "hsp";
            public void show() {
                System.out.println(NAME);
                System.out.println(name);
                System.out.println(A.this.name);
            }
        }
        B b = new B();
        b.show();
    }
}