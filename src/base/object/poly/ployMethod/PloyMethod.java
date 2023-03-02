package base.object.poly.ployMethod;

public class PloyMethod {
    public static void main(String[] args) {
        //方法重载体现多态
        A a = new A();
        //传入不同的参数，调用不同的方法体现多态
        System.out.println(a.sum(10, 20));
        System.out.println(a.sum(10, 20, 30));

        //方法重写体现多态
        B b = new B();
        //子父类调用方法，输出不同的程序体现多态
        a.say();
        b.say();
    }
}

class B {
    public void say() {
        System.out.println("B say()方法被调用");
    }
}

class A extends B {
    @Override
    public void say() {
        System.out.println("A say()方法被调用");
    }

    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    public int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}