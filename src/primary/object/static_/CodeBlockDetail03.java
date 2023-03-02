package primary.object.static_;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        B1 b1 = new B1();
    }
}
class A1{
    public A1(){
        //1.super()
        //2.调用本类的普通代码块
        System.out.println("A1()构造器被调用");
    }
}

class B1 extends A1{
    {
        System.out.println("B1的普通代码块被调用");
    }
    public B1(){
        //1.super（）
        //2.调用本类的普通代码块
        System.out.println("B1()构造器被调用");
    }
}