package primary.object.innerclass;

public class StaticInnerClass01 {
    //(4)静态内部类
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();
        System.out.println("=======================");

        //6.外部类其他类调用内部类
        //方式1：
        //因为静态内部类，是可以通过类名直接访问（前提是满足访问权限）
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();

        System.out.println("=======================");
        //方式2：
        //编写一个方法，可以返回静态内部类的对象实例
        Outer10.Inner10 inner101 = outer10.getInner10();
        inner101.say();

        System.out.println("=======================");
        //方式3：
        //通过静态方法类调用
        Outer10.Inner10 inner10_ = Outer10.getInner10_();
        inner10_.say();
    }
}

class Outer10 {
    private int n1 = 10;
    private static String name = "张三";

    private static void cry() {
    }

    //Inner10就是静态内部类
    //1.放在外部类的成员位置
    //2.使用static修饰
    //3.可以直接访问外部类的所有位置，包含私有的，但不能直接访问非静态方法(只有静态内部类才不能)
    //4.可以添加任意访问修饰符（public、protected、default、private），因为它的地位就是一个成员
    //5.作用域：同其他的成员，为整个类体
    //7.如果外部类和静态内部类的成员重写时，静态内部类访问时，默认遵循就近原则，
    //  如果想访问外部类的成员，则可以使用（外部类名.成员）去访问
    static class Inner10 {
        private  String name = "hsp";

        public void say() {
            System.out.println("name=" + name + " 外部类name=" + Outer10.name);
            cry();
            //System.out.println(n1);
        }
    }

    public void m1() {
        Inner10 inner10 = new Inner10();
        inner10.say();
    }

    public Inner10 getInner10() {
        return new Inner10();
    }

    public static Inner10 getInner10_() {
        return new Inner10();
    }
}
