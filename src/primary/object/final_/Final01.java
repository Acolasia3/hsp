package primary.object.final_;

public class Final01 {
    public static void main(String[] args) {
        E e = new E();
        //e.TAX_RATE=0.08;
        F f = new F();
        f.cry();
    }
}

//1.当不希望类被继承是，可以用final修饰
final class A{

}
//class B extends A {}

class C{
    //2.当不希望父类的某个方法被子类重写（override）时，可以用final关键字修饰
    public final void hi(){
    }
}

class D extends C{
//    @Override
//    public void hi() {
//        System.out.println("重写了C类的hi方法");
//    }
}

//3.当不希望类的某个属性被值修改，可以用final修饰
class E{
    public final double TAX_RATE = 0.08;
}

//4.当不希望某个局部变量被修改，可以使用final修饰
class F{
    public void cry(){
        //NUM称为局部常量
        final double NUM = 0.01;
        //NUM = 0.02;
        System.out.println(NUM);
    }
}