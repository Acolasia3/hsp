package primary.wrapper;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class WrapperMethod {
    public static void main(String[] args) {
        //包装类（Integer)->String
        Integer i = 100;//自动装箱
        //方式1：
        String str1 = i + "  ";
        //方式2：
        String str2 = i.toString();
        //方式3：
        String str3 = String.valueOf(i);

        //String->包装类（Integer）
        String str4 = "12345";
        //方式1：
        Integer i2 = Integer.parseInt(str4);//使用到自动装箱
        //方式2：
        Integer i3 = new Integer(str4);//构造器

        System.out.println(Integer.MIN_VALUE);//返回值最小值
        System.out.println(Integer.MAX_VALUE);//返回值最大值

        System.out.println(Character.isDigit('a'));//判断是不是数字
        System.out.println(Character.isLetter('a'));//判断是不是字母
        System.out.println(Character.isUpperCase('a'));//判断是不是大写
        System.out.println(Character.isLowerCase('a'));//判断是不是小写

        System.out.println(Character.isWhitespace('a'));//判断是不是空格
        System.out.println(Character.toUpperCase('a'));//转成大写
        System.out.println(Character.toLowerCase('a'));//转成小写
    }
}
