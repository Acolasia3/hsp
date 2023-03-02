package primary.object.static_;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        /*
        静态>普通
        静态代码块和静态成员一样，看谁写在前面
        普通代码块和普通成员一样，看谁写在前面
        */
        //1.getN1被调用  2.静态代码块 3.getN2被调用 4.普通代码块 5.构造器被调用
        //静态代码块 > 普通代码块 > 构造器
     }
}

class AAA{
    private int n2 = getN2();

    private static int n1 = getN1();

    static{
        System.out.println("AAA静态代码块");
    }

    {
        System.out.println("AAA普通代码块");
    }

    public static int getN1(){
        System.out.println("getN1被调用");
        return 100;
    }

    public int getN2(){
        System.out.println("getN2被调用");
        return 100;
    }

    public AAA() {
        System.out.println("AAA构造器被调用");
    }
}