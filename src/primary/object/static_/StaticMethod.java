package primary.object.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu tom = new Stu("tom");
        tom.payFee(100);
        Stu mary = new Stu("mary");
//        mary.payFee(300);
        Stu.payFee(300);

        //可以直接通过类名调用静态方法
        Stu.show();
    }
}

class Stu {
    private String name;

    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    //1.当方法是用来static修饰后，该方法就是静态方法
    //2.静态方法就可以访问静态变量/属性
    public static void payFee(double fee) {
        Stu.fee += fee;
    }

    public static void show() {
        System.out.println("总学费有" + Stu.fee);

    }
}
