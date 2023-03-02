package primary.object.innerclass;

public class AnonymousInnerClass {
    //(2)匿名内部类
    //1.本质还是类
    //2.内部类
    //3.该类没有名字
    //4.同时还是一个对象
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 {//外部类
    private int n1 = 10;

    public void method() {
        //    演示基于 接口 的匿名内部类
        //1.需求：想使用IA接口，并创建对象
        //2.传统方式，是写一个类，实现该接口，并创建对象
        //3.需求：Tiger类只使用一次，后面不用在使用
        //4.可以使用匿名内部类来简化开发
        //5.tiger的编译类型是 IA
        //6.tiger的运行类型是这个 匿名内部类 Outer04$1
        //7.jdk底层创建了匿名内部类 Outer04$01,立马就创建了 Outer04$1实例，
        //  并且把地址返回给tiger，就销毁了

        /*
        JAVA底层：
        class XXXXX implements IA{
           @Override
            public void cry() {
                System.out.println("老虎嗷嗷叫");
            }
         */

        IA tiger = new IA() {//匿名内部类
            @Override
            public void cry() {
                System.out.println("老虎嗷嗷叫");
            }
        };
        tiger.cry();//调用方法
        //IA tiger = new IA()的运行类型是 Outer04$1,编译类型还是IA
        System.out.println("tiger的运行类型=" + tiger.getClass());


        //演示基于 类 的匿名内部类
        //1. father 编译类型 Father
        //2. father 运行类型 Outer04$2
        //3. 底层会创建匿名内部类
/*
        public Outer04$2 extend Father{
            @Override
            public void cry() {
                System.out.println("小狗汪汪叫");
            }
        }
*/
        //4. 同时也直接返回了匿名内部类 Outer04$2对象
        //5. 注意("jack")参数列表会传递给 构造器
        Father father = new Father("jack") {//不加大括号就是普通的对象调用，加了就是匿名匿名内部类
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        father.test();
//        @Override
//        public void test() {
//            System.out.println("匿名内部类重写了test方法");
//        }
    }
}

interface IA {
    void cry();
}

//class Tiger implements IA{
//    @Override
//    public void cry() {
//        System.out.println("老虎嗷嗷叫");
//    }
//}

class Father {
    public Father(String name) {
        System.out.println("接收name=" + name);
    }

    public void test() {

    }
}