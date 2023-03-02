import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Encoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码
        String data = "a我b";
        byte[] bytes = data.getBytes();
        byte[] bytes2 = data.getBytes("GBK");
        System.out.println(Arrays.toString(bytes));

        //解码
        String s1 = new String(bytes);
        System.out.println(s1);

        String s2 = new String(bytes2,"GBK");
        System.out.println(s2);
    }
}
