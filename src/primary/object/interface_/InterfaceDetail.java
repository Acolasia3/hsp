package primary.object.interface_;

public class InterfaceDetail {
    //1.接口不能被实例化，不能创建接口对象
    //2.接口中所有的方法默认都是public，接口中的抽象方法不用abstract修饰
    //3.一个普通类实现接口，就必须将该接口的所有方法实现
    //4.抽象类去实现接口时，可以不用实现接口的方法
    //5.一个类同时可以实现继承多个接口，只需在接口中间用逗号隔开
    //6.接口中的属性，只能是final的，而且是public static final 修饰符
    //  int a = 1;实际上是public static final int a = 1;
    //7.接口中属性的访问形式：接口名.属性名
    //8.接口不能继承其他的类，但是可以继承多个别的接口
    //9.接口类的修饰符只能是public和default，这点和类的修饰符是一样的

}

interface IA {
    int n1 = 10;
}

interface IB extends IA{

}

