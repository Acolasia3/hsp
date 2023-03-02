package primary.string_;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class StringExercise02 {
    public static void main(String[] args) {
        Person p1= new Person();
        p1.name = "hsp";
        Person p2= new Person();
        p2.name = "hsp";
        System.out.println(p1.name.equals(p2.name));//字符串内容一样
        System.out.println(p1.name == p2.name);//不同堆但指向同一个常量池
        System.out.println(p1.name == "hsp");

        String s1 = new String();
        String s2 = new String();
        System.out.println(s1 == s2);
    }
}
class Person{
    public String name;
}