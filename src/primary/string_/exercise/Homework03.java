package primary.string_.exercise;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        String name = "Han shun Ping";
        printName(name);

        String str = "Han shun Ping";

//        char[] c = str.toCharArray();
        String[] s = str.split(" ");
        String v = s[2] + "," + s[0] + " " + "." + s[1].toLowerCase().charAt(0);
        System.out.println(v);
    }

    public static void printName(String str) {
        if (str == null) {
            System.out.println("字符串不能为空");
            return;
        }
        String[] names = str.split(" ");
        if (names.length != 3) {
            System.out.println("输入的字符串格式不对");
            return;
        }
        String format = String.format("%s,%s .%c", names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println(format);


    }
}
