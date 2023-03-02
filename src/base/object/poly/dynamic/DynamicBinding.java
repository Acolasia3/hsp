package base.object.poly.dynamic;

public class DynamicBinding {
    public static void main(String[] args) {
        //动态绑定机制
        //(1)当调用对象方法时,该方法会和该对象的 内存地址/运行类型 绑定
        //(2)当调用对象属性时,没有动态绑定机制,哪里声明,哪里使用
        A a = new B();//向上转型
        System.out.println(a.sum());//40->30
        System.out.println(a.sum1());//30->20
    }
}

class A {
    public int i = 10;

    public int sum() {
        return getI() + 10;//因为方法有动态绑定,先调用运行类型B类的getI()的值,所以20+10;
    }

    public int sum1() {//因为属性没有动态绑定,所以直接在A返回 10+10;
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class B extends A {
    public int i = 20;

//    public int sum() {
//        return i + 20;
//    }

    public int getI() {
        return i;
    }

//    public int sum1() {
//        return i + 10;
//    }
}