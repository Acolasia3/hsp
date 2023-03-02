package base.object.poly.detail;

public class PolyDetail03 {
    public static void main(String[] args) {
        //instanceOf用于判断对象的运行类型是否为某个类型或者某个类型的子类型
        BB bb = new BB();
        System.out.println(bb instanceof BB);//bb和BB是同一个类型
        System.out.println(bb instanceof AA);//bb是AA的子类型

        //aa编译类型AA,运行类型是BB
        AA aa = new BB();
        System.out.println(aa instanceof BB);
        System.out.println(aa instanceof AA);

        Object obj = new Object();
        System.out.println(obj instanceof AA);//false   obj是AA的父类型
        System.out.println(aa instanceof Object);//true
        String str = "hello";
        System.out.println(str instanceof Object);
        //System.out.println(str instanceof AA); 报错
    }
}

class AA {
}

class BB extends AA {
}