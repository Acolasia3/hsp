package primary.string_.exercise;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
     /*   String str = "abcdef";
        char str2 = ' ';
        for (int i = str.length() - 1; i >= 0; i--) {
            if (i == 0) {
                str2 = str.charAt(str.length() - 1);
            } else if (i == str.length() - 1) {
                str2 = str.charAt(0);
            } else {
                str2 = str.charAt(i);
            }
            System.out.print(str2);
        }
*/
        String str = "abcdef";
        System.out.println("====交换前====");
        System.out.print(str);
        System.out.println();
        try {
            str = reverse(str, 1, 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("====交换后====");
        System.out.print(str);
    }


    public static String reverse(String str, int start, int end) {
        //转成字符数组
        char[] c = str.toCharArray();
        char temp;
        //设置异常
        if (!(str != null && start < end && start > 0 && end < str.length())) {
            throw new RuntimeException("参数不正确");
        }
        for (int i = start, j = end; i < j; i++, j--) {
            temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }
        return new String(c);
    }
}