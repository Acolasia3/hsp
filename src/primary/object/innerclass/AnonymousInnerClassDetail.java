package primary.object.innerclass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.fi();

    }
}

class Outer05 {
    private int n1 = 99;

    public void fi() {
        //1.不能给局部内部类添加权限修饰符
        //2.作用域：仅仅在定义它的方法或代码块中

        Person p = new Person() {
            private int n1 = 88;

            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi方法");
                //3.可以直接访问外部类的所有成员，包含私有的
                //4.如果外部类和匿名内部类的成员重名是，匿名内部类访问的话，
                //5.默认遵循就近原则，如果想访问外部类的成员，则可以使用（外部类名.this.成员）去访问
                System.out.println("匿名内部类重写了hi方法 n1=" + n1 + "  Outer05.this.n1=" + Outer05.this.n1);
            }
        };
        p.hi();//动态绑定

        //也可以直接调用，匿名内部类本身也是返回对象
        new Person() {
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了 hi方法...");
            }

            //带参数
            @Override
            public void ok(String name) {
                super.ok(name);
            }
        }.ok("jack");
    }
}

class Person {
    public void hi() {
        System.out.println("Person hi()");
    }

    public void ok(String name) {
        System.out.println(name);
    }
}

