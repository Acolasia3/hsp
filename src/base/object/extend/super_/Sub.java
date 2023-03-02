package base.object.extend.super_;

public class Sub extends Base {
    public Sub(){
        //super();默认调用父类无参构造器
        //当父类没有构造器时需用super调用
        //super必须要写在第一行,并且只能写在构造器里
        super("hsp",20);
        System.out.println("子类无参Sub().....");
    }

    public Sub(String name){
        super("tom",30);
        System.out.println("子类Sub2(String name)");
    }

    public Sub(String name,int age){
        super();
        //如果要调用父类的无参构造器,写super();或者什么都不写
        System.out.println("子类Sub3(String name,int age)");
    }
    public void sayOk(){
        //非私有的属性和方法可以直接访问
        System.out.println(n1+" "+n2+" "+n3+" ");
        System.out.println("n4=" + getN4());
        test100();
        test200();
        test300();
        callTest400();
    }
}
