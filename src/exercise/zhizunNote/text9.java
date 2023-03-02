package exercise.zhizunNote;

public class text9 {
    //成员常量
    final int MAX = 100;

    public static void main(String[] args) {
        //局部常量
        final int MIN = 0;
        text9 t = new text9();
        Son son = new Son();
        son.print();

        Father father = son;
        father.print();

        Bike bike = new Bike();
        //自动转换
        Che che = bike;
        //强制转换
        Bike b1 = (Bike) che;

    }
}

class Father {
    void print() {
        System.out.println("我在父类中");
    }
}

class Son extends Father {
    void test() {
    }

    void print() {
        super.print();
        System.out.println("我在子类中");
    }
}

abstract class Che {
    abstract void roll();
}

class Bike extends Che {
    String wheel1="轮子";
    String wheel2;

    void ring() {
        System.out.println("响铃");
    }

    void roll() {
        System.out.println("下坡自动,上坡脚动");
    }
}

class Car extends Che {
    String wheel1;
    String wheel2;
    String wheel3;
    String wheel4;

    void whistle() {
        System.out.println("鸣笛");
    }

    void roll() {
        System.out.println("上下坡自动行走");
    }
}

