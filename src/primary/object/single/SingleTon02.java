package primary.object.single;

public class SingleTon02 {
    public static void main(String[] args) {
        System.out.println(Cat.n1);
        Cat instance = Cat.getInstance();//调用getInstance()方法
        System.out.println(instance);
        //再次调用 两个对象指向一个地址
        Cat instance2 = Cat.getInstance();//构造器只创建一次
        System.out.println(instance2);
    }
}

class Cat {
    private String name;
    //调用属性，构造器没有加载,因为没有给类运行类型
    public static int n1 = 999;
    private static Cat cat;//默认为null

    //步骤【单例模式-懒汉式】
    //1.构造器私有化
    //2.定义一个static静态属性对象
    //3.提供一个public的static方法，可以返回一个Cat对象
    //4.懒汉式只有当用户使用getInstance方法时，才返回cat对象，后面再次调用时，
    //  会返回上次创建的cat对象从而保证单例

    private Cat(String name) {
        this.name = name;
        System.out.println("构造器被调用");
    }

    public static Cat getInstance() {
        if (cat == null) {
            cat = new Cat("小可爱");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}