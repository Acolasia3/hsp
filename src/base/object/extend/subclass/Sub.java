package base.object.extend.subclass;

public class Sub extends Base {
    public Sub() {
        //super();默认调用父类的无参构造器
//        super("tao");//调用父类的有参构造器
        System.out.println("子类构造器Sub().....");
    }

    public void sayOk() {
        //非私有的属性和方法可以直接访问
        //私有属性需要父类提供公共方法去访问
        System.out.println(n1 + " " + n2 + " " + n3 + " ");
        System.out.println("n4=" + getN4());
        test100();
        test200();
        test300();
        callTest400();
    }
}
