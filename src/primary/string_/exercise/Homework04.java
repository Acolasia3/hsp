package primary.string_.exercise;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        String str = "Tao18";
//        Judge(str);
        CountStr(str);
    }

  /*  public static void Judge(String str) {
        char[] chars = str.toCharArray();//转成字符数组
        int Z = 0;
        int z = 0;
        int num = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                num++;
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                z++;
            } else if (chars[i] > 'A' && chars[i] <= 'Z') {
                Z++;
            }
        }
        System.out.println("大写字母有" + Z + "个 小写字母有" + z + "个 数字有" + num + "个");
    }*/

    public static void CountStr(String str) {
        if (str == null) {
            System.out.println("输入不能为null");
            return;
        }
        int strLen = str.length();//得到字符串长度
        int num = 0;
        int z = 0;
        int Z = 0;
        int other = 0;
        for (int i = 0; i < strLen; i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                num++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                z++;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                Z++;
            } else {
                other++;
            }
        }
        System.out.println("大写字母有" + Z + "个 小写字母有" + z + "个 数字有" + num + "个 其他字符" + other);

    }
}
