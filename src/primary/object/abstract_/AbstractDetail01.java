package primary.object.abstract_;

public class AbstractDetail01 {
    public static void main(String[] args) {
        //1.抽象类不能被实例化
        //new A();
    }
}

//2.抽象类不一定要包含abstract方法。也就是说，抽象类可以没有abstract方法，还可以实现方法,
//  但抽象方法一定属于抽象类
abstract class A {
}

//3.abstract 只能修饰类和方法，不能修饰属性和其他的
class C {
    //public abstract int n1 = 1;
}

//4.抽象类可以有任意成员（抽象类本质还是类） 比如：非抽象方法，构造器，静态属性等等
abstract class D {
    public int n1 = 10;
    public static String name = "hsp";

    public void hi() {
        System.out.println("hi");
    }

    public static void ok() {
        System.out.println("ok");
    }
}

//5.如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法，除非它自己也声明为abstract类
abstract class E {
    public abstract void hi();
    public void hello(){};

}

abstract class F extends E {

}

class G extends E {
    @Override
    public void hi() {
        //所谓是实现，就是有方法体
    }
}

//6.抽象方法不能有主体，即不能实现
//public abstract void eat(){};

//7.抽象方法不能使用private、final、static来修饰，因为这些关键字都是和重写相违背
//final:因为final不能被继承
//static:1.static关键字和方法重写无关，static不能被重写  2.static方法要被类直接调用，而抽象方法没有方法体
//private:私有的方法无法访问，不能被重写