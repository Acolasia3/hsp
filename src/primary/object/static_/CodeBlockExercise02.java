package primary.object.static_;

public class CodeBlockExercise02 {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
    }
}

class Test1 {
    Sample sam1 = new Sample("sam1成员初始化");//3
    static Sample sam = new Sample("静态成员sam初始化");//1

    static {
        System.out.println("static块执行");//2
        if (sam == null) {
            System.out.println("sam is null");
        }
    }

    Test1() {
        System.out.println("Test默认构造函数被调用");//4
    }
}

class Sample {
    Sample(String s) {
        System.out.println(s);
    }

    Sample() {
        System.out.println("Sample默认构造器被调用");
    }
}
