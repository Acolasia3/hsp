package base.object.poly.ployObject;

public class Test {
    //多态的要点:
    //(1)一个对象的编译类型和运行类型可以不一致
    //(2)编译类型在定义对象时,就确定了,不能改变
    //(3)运行类型可以变化
    //(4)编译类型看=左边,运行类型看=右边
    public static void main(String[] args) {
        //编译类型是Animal,运行类型是Dog
        Animal animal = new Dog();
        //因为运行时,执行到该行时,animal的运行类型是Dog,所以cry就是Dog的cry
        animal.cry();
        System.out.println("=================");

        animal = new Cat();
        animal.cry();
    }
}
