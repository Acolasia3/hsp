package primary.object.final_;

public class FinalDetail02 {
    public static void main(String[] args) {
        //5.final不能修饰构造器
        //6.包装类(Integer,Double,Float,Boolean)和String是final类，不能被继承
        System.out.println(BBB.num);

    }
}

final class AAA {
    //7.如果一个类已经final类，就没有必要再将方法修饰成final方法
    public final void cry() {
    }
}

class BBB {
    //8.final和static往往搭配使用，效率更高，不会导致类加载
    //(同时出现时会产生constantValue属性，在类加载的准备阶段
    // 虚拟机 便会根据ConstantValue为常量设置相应的值
    // 只有基本数据类型和String类才不会加载)
    public final static int[] num = {1,2};

    static {
        System.out.println("BBB静态代码块被执行");
    }
}
