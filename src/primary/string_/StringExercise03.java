package primary.string_;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class StringExercise03 {
    public static void main(String[] args) {
        //1.String是一个final类，代表不可变的字符序列
        //2.字符串是不可变的。一个字符串对象一旦被分配，其内容是不可变
        String s1 = "hello";
        s1 = "haha";
        //创建了两个对象，从原本指向hello，变成指向haha
        System.out.println(s1);

        String s2 = "hello"+"abc";
        //创建了一个对象
        System.out.println(s2);

        String s3 = "hello";
        String s4 = "abc";
        String s5 = s3 +s4;
        String s6 = "helloabc";
        String s7 = "hello"+"abc";
        System.out.println(s5 == s6);
        System.out.println(s6 == s7);
//    StringBuilder
        System.out.println(s5);
        //创建三个对象
        //1.先创建一个StringBuilder sb = new StringBuilder();
        //2.执行 sb.append("hello");
        //3.再执行 sb.append("abc");
        //4.String c = sb.toString();
        //  s5指向堆中的对象(String) value[] -> 池中"helloabc"
    }
}
