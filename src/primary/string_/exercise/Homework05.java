package primary.string_.exercise;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Homework05 {
    public static void main(String[] args) {
        String s1 = "hsp";
        Animal a = new Animal(s1);
        Animal b = new Animal(s1);
        System.out.println(a==b);
        System.out.println(a.equals(b));//没有重写对象(要重写String或Integer)，本质还是调用的Object对象
        System.out.println(a.name == b.name);

        String s2 = new String("hsp");
        String s3 = "hsp";
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        String t1 = "hello"+s1;
        String t2 = "hellohsp";
        //t1.intern()返回常量池的地址
        System.out.println(t1.intern() == t2);
    }
}
class Animal{
    String name;
    public Animal(String name){
        this.name = name;
    }
}
