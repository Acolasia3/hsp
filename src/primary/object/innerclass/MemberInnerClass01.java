package primary.object.innerclass;

public class MemberInnerClass01 {
    //(3)成员内部类
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();
        System.out.println("==================");

        //外部其他类，使用成员内部类的二种方式
        //方式一：outer08.new Inner08();相当于把new Inner08()当做是outer08成员
        Outer08.Inner08 inner08 = outer08.new Inner08();
        inner08.say();
        System.out.println("==================");

        //方式二：在外部类中，编写一个方法，可以返回 Inner08 对象
        Outer08.Inner08 inner08Instance = outer08.getInner08Instance();
        inner08Instance.say();
    }
}

class Outer08 {
    private int n1 = 20;
    public String name = "张三";

    private void hi() {
        System.out.println("hi()方法");
    }

    //1.成员内部类是定义在成员位置上
    //2.可以添加public、protected、default、private修饰符
    //3.作用域：和外部类的其他成员一样，为整个类体
    class Inner08 {//成员内部类
        private double sal = 99;
        private int n1 = 10;

        public void say() {
            //5.可以直接访问外部类的所有成员，包含私有的
            //6.如果成员内部类的成员和外部类的成员重名，会遵守就近原则
            System.out.println("n1=" + n1 + " name" + name);
            System.out.println("Outer08.this.n1=" + Outer08.this.n1);
            hi();
        }
    }

    //4.方法返回一个Inner08实例
    public Inner08 getInner08Instance() {
        return new Inner08();
    }

    public void t1() {
        //创建成员内部类的对象，然后使用相关的成员
        Inner08 inner08 = new Inner08();
        inner08.say();
        System.out.println(inner08.sal);
    }
}