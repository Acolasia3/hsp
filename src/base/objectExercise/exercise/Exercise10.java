package base.objectExercise.exercise;

public class Exercise10 {
    //练习10
    //(1)练习：什么是多态,多态具体体现有哪些?
    /*
    多态:方法或对象具有多种形态,是OOP的第三大特征,是建立在封装和继承基础之上。
    多态具体体现在：
    1.方法多态
    （1）重载体现多态（2）重写体现多态
    2.对象多态
    (1)对象的编译类型和运行类型可以不一致,编译类型在定义后,就无法改变
    (2)对象的运行类型时可以变化的,可以通过对象名.getClass()来查看运行类型
    (3)编译类型看定义时=号的左边,运行类型看=号右边
     */

    //(2)练习:java的动态绑定机制是什么?
    /*
    1.当调用对象的方法时,该方法会和对象的内存地址/运行类型绑定
    2.当调用对象的属性时,没有动态绑定机制,哪里声明,哪里使用
     */

    //举例说明
    public static void main(String[] args) {
        AAA obj = new BBB();
        AAA b1 = obj;
        System.out.println("obj的运行类型"+obj.getClass());
        obj = new CCC();
        System.out.println("obj的运行类型"+obj.getClass());
        obj = b1;
        System.out.println("obj的运行类型"+obj.getClass());

    }
}
class AAA{}
class BBB extends AAA{}
class CCC extends BBB{}