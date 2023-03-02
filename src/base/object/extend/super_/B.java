package base.object.extend.super_;

public class B extends A {
    //1.访问父类的属性,但不能访问私有属性  super.属性;
    public void hi() {
        System.out.println(super.n1 + "," + super.n2 + "," + super.n3);
    }

    //2.访问父类的方法,但不能访问私有方法  super.方法名();
    public void ok() {
        super.test100();
        super.test200();
        super.test300();
        //super.test400();
    }

    public void cal() {
        System.out.println("B类的cal方法");
    }

    public void test() {
        System.out.println("B类的test()");
        //3.找方法(cal(),this.cal())时,顺序是:
        //(1)先找本类,如果有,则调用
        //(2)如果没有,则找父类(如果有,并可以调用,则调用)
        //(3)如果父类没有,则继续找父类,整个规则,就是一样的,直到Object类
        cal();
        //this.cal();
        System.out.println(this.n1);

        //4.找super().cal()的方法时,顺序是:
        //是直接查找父类,其他规则一样
        super.cal();
        System.out.println(super.n1);

    }
}
