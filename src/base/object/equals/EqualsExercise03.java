package base.object.equals;

public class EqualsExercise03 {
    public static void main(String[] args) {
        int a = 65;
        float b = 65.0f;
        System.out.println(a == b);//t

        char c = 'A';
        char d = 12;
        char e = '1';
        System.out.println(c == a);//t
        System.out.println(d == 12);//t
        System.out.println(e == 49);//t

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1 == str2);//f
        System.out.println(str1.equals(str2));//t
        //System.out.println("hello" == new java.sql.Date());编译错误
    }
}
