package primary.object.final_;

public class FinalDetail01 {
    //1.final修饰的属性在定义时，必须赋初值，并且不能再修改，赋值可以在如下位置之一
    public static void main(String[] args) {
        CC cc = new CC();
        new DD().cal();
        new EE().cal();
    }

}

class AA {
//    public final double TAX_RATE = 1;
    public final double TAX_RATE2;
    public final double TAX_RATE3;
    //（1）定义时
    public final double TAX_RATE = 0.01;

    //（2）构造器中
    public AA() {
        TAX_RATE2 = 0.02;
    }

    //（3）代码块中
    {
        TAX_RATE3 = 0.03;
    }
}

class BB {
    //2.final修饰的属性是静态的，则初始化的位置只能是：
    //（1）定义时 （2）在静态代码块，不能再构造器中赋值

    public static final double TAX_RATE = 1;
    public static final double TAX_RATE2;
    //public final double TAX_RATE3;

    public BB() {
//        TAX_RATE3 = 2;
    }

    static {
        TAX_RATE2 = 3;
    }
}

//3.final 类不能继承和被继承，但是可以实例化对象
final class CC{ }

//4.如果类不是final类，但是含有final方法，则该方法虽然不能重写，但是可以被继承
//即，仍然遵守继承的机制
class DD{
    public final void cal(){
        System.out.println("cal()方法");

    }
}

class EE extends DD{

}
