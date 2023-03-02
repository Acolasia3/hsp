package primary.object.static_;

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        /*
            静态>普通
            静态代码块和静态成员一样，看谁写在前面
            普通代码块和普通成员一样，看谁写在前面
        */
        B2 b2 = new B2();
        //1.静态代码块和类一起加载的，优先于普通代码块和构造器
        //2.然后执行子类的构造器，运行隐藏的super()，到父类先执行普通代码块，再执行构造器，子类同理
    }
}

class A2 {
    private static int n1 = getVal01();

    static {
        System.out.println("A02的一个静态代码块");//2
    }

    {
        System.out.println("A02的一个普通代码块");//5
    }

    public int n3 = getVal02();

    public static int getVal01() {
        System.out.println("getVal01");//1
        return 10;
    }

    public int getVal02() {
        System.out.println("getVal02");//6
        return 10;
    }

    public A2() {
        //super()
        System.out.println("A2的一个构造器");//7
    }
}

class B2 extends A2 {
    private static int n1 = getVal03();

    static {
        System.out.println("B02的一个静态代码块");//4
    }

    {
        System.out.println("B02的一个普通代码块");//8
    }

    public int n5 = getVal04();

    public static int getVal03() {
        System.out.println("getVal03");//3
        return 10;
    }

    public int getVal04() {
        System.out.println("getVal04");//9
        return 10;
    }

    public B2() {
        //super()
        System.out.println("B2的一个构造器");//10
    }
}

class C2 {
    public int n1 = 100;
    private static int n2 = 200;

    private void m1() {

    }

    private static void m2() {

    }

    static {
        //静态代码块只能调用静态成员
        //System.out.println(n1);  错误
        System.out.println(n2);
        //m1(); 错误
        m2();

    }

    {
        //普通代码块可以使用任意成员
        System.out.println(n1);
        System.out.println(n2);
        m1();
        m2();
    }
}