package base.oop;

public class Constructor {
    //构造器：完成对象的初始化
    //javap指令可以反编译
    //不定义构造器会默认一个构造器
    public static void main(String[] args) {
        L l = new L("hsp",80);
        L l1 = new L("tom");
        System.out.println("l的信息如下");
        System.out.println(l.name);
        System.out.println(l.age);
        System.out.println(l1.name);
    }
}
class L{
    String name;
    int age;

    public L(String pName,int pAge){
        System.out.println("l构造器被调用");
        name = pName;
        age = pAge;
    }

    //构造器重载
    public L(String pName){
        System.out.println("l1构造器被调用");
        name = pName;
    }
}
class Dog{

}
