package base.object.poly.detail;

public class PolyDetail {
    public static void main(String[] args) {
        //向上转型:父类的引用指向了子类的对象
        //父类类型 引用名 = new 子类类型();
        Animal animal = new Cat();
        //Object object = new cat();也可以

        //向上转型调用方法的规则如下:
        //(1)可以调用父类中的所有成员(需遵守访问权限),但是不能调用子类的特有的成员
        //(2)因为在编译阶段,能调用哪些成员,是由编译类型来决定的
        //animal.catMouse();错误
        //(3)最终运行效果看子类(运行类型)的具体实现,即调用方法时,按照从子类(运行类型)开始
        //查找方法,然后调用,规则我前面我们讲的方法调用规则一致
        animal.eat();
        animal.sleep();
        animal.run();
        animal.show();

        //向下转型:把原本指向子类对象的父类引用,转成子类类型
        //(1)子类类型 引用名 = (子类类型) 父类引用
        //编译类型是Cat,运行类型也是Cat
        Cat cat = (Cat) animal;   //相当于强制转换

        cat.catchMouth();  //调用子类特有的方法
        cat.run();

        //(2)要求父类的引用必须指向的是当前目标类型的对象
        //Dog dog = (Dog)animal;  不可以,Cat->Dog
        //(3)可以调用子类类型中所有的成员
        //(4)只能强转父类的引用，不能强转父类的对象
    }
}
class Animal2 {
    String name = "动物";
    int age = 10;
    public void sleep(){
        System.out.println("睡");
    }
    public void run(){
        System.out.println("跑");
    }
    public void eat(){
        System.out.println("吃");
    }
    public void show(){
        System.out.println("你好");
    }
}

class Cat2 extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouth(){
        System.out.println("猫抓老鼠");
    }
}