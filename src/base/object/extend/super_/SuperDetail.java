package base.object.extend.super_;

public class SuperDetail {
    //5.super能访问父类的属性和方法,但不能访问私有属性和方法
    //6.super只能在构造器中第一行出现
    public static void main(String[] args) {
        B b = new B();
        b.test();
    }
}

