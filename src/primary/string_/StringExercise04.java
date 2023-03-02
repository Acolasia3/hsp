package primary.string_;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class StringExercise04 {
    public static void main(String[] args) {
        String s1 = "hsp";
        String s2 = "java";
        String s3 = "hspjava";
        String s4 = (s1+s2).intern();
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
    }
}
