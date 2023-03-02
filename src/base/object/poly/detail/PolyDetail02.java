package base.object.poly.detail;

public class PolyDetail02 {
    public static void main(String[] args) {
        //属性没有重写之说,属性的值在(编译类型)
        Base base = new Sub();//向上转型
        System.out.println(base.count);//看编译类型
        Sub sub = new Sub();
        System.out.println(sub.count);

    }
}

class Base {
    int count = 10;//属性
}

class Sub extends Base {
    int count = 20;//属性
}
