package primary.string_;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class String02 {
    public static void main(String[] args) {
        //创建String对象的两种方式
        //方式一：直接赋值 String s = "hsp";
        //方式二：调用构造器 String s2 = new String("hsp");

        //练习
        String a = "abc";
        String b = "abc";
        //这两个指向的地址是一样的
        System.out.println(a.equals(b));
        System.out.println(a==b);


    }
}
