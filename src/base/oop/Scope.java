package base.oop;

public class Scope {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.say();//访问遵循就近原则

        T t = new T();
        //全局变量/属性可以在其他类的方法使用
        t.test();//第一种跨类访问对象属性的方式

        t.test2(p1);//第二种跨类访问对象属性的方式
    }
}

class Person1 {
    //全局变量
    String name = "jack";

    //1.属性和局部变量可以重名,访问同时遵循就近原则
    //2.同一个成员方法不可以有两个相同的局部变量名
    //3.只能在本类的方法使用
    public void say() {
        //局部变量
        String name = "king";
        System.out.println(name);
    }

    public void hi() {
        String address = "北京";
        String name = "五环";
//        String name = "广东";

    }
}

class T {
    public void test() {
        Person1 p1 = new Person1();
        System.out.println(p1.name);
    }

    public void test2(Person1 p) {
        System.out.println(p.name);
    }
}
