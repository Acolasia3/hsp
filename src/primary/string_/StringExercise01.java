package primary.string_;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class StringExercise01 {
    public static void main(String[] args) {
        String a = "hsp";//指向常量池
        String b = new String("hsp");//指向堆
        System.out.println(a.equals(b));//字符串内容相同
        System.out.println(a == b);//地址不同
        //b.intern()方法最终返回的是常量池的地址（对象）
        System.out.println(a == b.intern());//所以b.intern()的地址是常量池的hsp
        System.out.println(b == b.intern());//b指向堆,而b.intern()的地址是常量池的hsp

        System.out.println("=======");

        String s1 = "hsp";
        String s2 = "java";
        String s4 = "java";
        String s3 = new String("java");
        System.out.println(s2 == s3);//地址不同
        System.out.println(s2 == s4);
        System.out.println(s2.equals(s3));
        System.out.println(s1 == s2);
    }
}
