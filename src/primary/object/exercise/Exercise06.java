package primary.object.exercise;


/**
 * @author 彭桂涛
 * @version 1.0
 */

//题目：
    /*
    1.有一个交通工具接口类Vehicles，有work接口
    2.Horse类和Boat类分别实现Vehicles
    3.创建交通工具工厂类，有两个方法分别获得交通工具Horse和Boat
    4.有Person类，有name和Vehicles属性，在构造器中为两个属性赋值
    5.实例化Person对象"唐僧"，要求一般情况下用Horse作为交通工具，遇到大河时用Boat作为交通工具
    6.增加一种情况，使用飞机过火焰山
     */
public class Exercise06 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧", new Horse());
        tang.PassRiver();
        tang.Common();
        tang.PassRiver();
        tang.PassFireHill();
    }
}

interface Vehicles {
    void work();
}

class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("一般情况用马");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("过河用船");
    }
}

class Plane implements Vehicles {
    @Override
    public void work() {
        System.out.println("使用飞机过火焰山");
    }
}

class Person {
    public String name;
    public Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void PassRiver() {
        if (!(vehicles instanceof Boat)) {
            vehicles = Vf.getBoat();
        }
        vehicles.work();
    }

    public void Common() {
        //防止始终传入的都是马儿使用instanceof
        if (!(vehicles instanceof Horse)) {//为了不浪费构造器创建的马，采用运算符判断  获取一匹马
            //这里使用多态的向上转型
            vehicles = Vf.getHorse();
        }
        //这里体现使用接口调用
        vehicles.work();
    }

    public void PassFireHill() {
        if (!(vehicles instanceof Plane)) {
            vehicles = Vf.getPlane();
        }
        vehicles.work();
    }
}

class Vf {//交通工具工厂类
    private static Horse horse = new Horse();//饿汉式 让唐僧一直使用一只马

    private Vf() {
    }//防止创建对象

    public static Horse getHorse() {//制造马儿
        return horse;
    }

    public static Boat getBoat() {//制造船
        return new Boat();
    }

    public static Plane getPlane() {
        return new Plane();
    }
}
