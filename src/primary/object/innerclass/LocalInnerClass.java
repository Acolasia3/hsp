package primary.object.innerclass;

public class LocalInnerClass {
    //(1)局部内部类-->细节
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
        System.out.println("Outer02的hashcode=" + outer02);
    }
}

class Outer02 {
    private int n1 = 100;

    private void n2() {
        System.out.println("外部类Outer02的n2方法");
    }

    public void m1() {
        //1.局部内部类是定义在外部类的局部位置，通常在方法中
        //3.不能添加访问修饰符，但是可以使用final修饰
        //4.作用域：仅仅只能定义在它的方法或代码块中
        class Inner02 {
            private int n1 = 800;

            //2.可以直接访问外部类的所有成员，包含私有的
            public void f1() {//局部内部类本质还是一个类
                //5.局部内部类可以直接访问外部类的成员，比如n1和n2
                //8.如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员需要
                //  使用 (外部类名.this.成员)去访问
                //  Outer02.this 本质就是外部类的对象，即哪个对象调用了n1，Outer02.this就是哪个对象
                System.out.println("n1=" + n1 + " 外部类的n1=" + Outer02.this.n1);
                System.out.println("Outer02.this的hashcode=" + Outer02.this);
                n2();
            }
        }
        //6.外部类在方法中，可以创建inner02对象，在调用方法
        //7.外部类不能直接访问局部内部类
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
}
