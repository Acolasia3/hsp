package primary.string_.stringbuffer;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class StringBufferExercise02 {
    public static void main(String[] args) {
        String price = "12123123456.789";
        StringBuffer s = new StringBuffer(price);

        for (int i = s.lastIndexOf(".") - 3; i > 0; i -= 3) {
            s.insert(i, ",");
        }
        System.out.println(s);
    }
}
