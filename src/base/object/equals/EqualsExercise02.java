package base.object.equals;

public class EqualsExercise02 {
}
class Student{
    public String name;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "hsp";
        Student s2 = new Student();
        s2.name = "hsp";
        System.out.println(s1 == s2);//F，地址不同
        System.out.println(s1.name.equals(s2.name));//T，字符串值相同
        System.out.println(s1.equals(s2));//F，地址不同

        String s3 = new String("tao");
        String s4 = new String("tao");
        System.out.println(s3.equals(s4));//T，字符串值相同
        System.out.println(s3 == s4);//F，地址不用
    }
}