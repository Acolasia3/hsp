package primary.string_;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class StringMethod02 {
    public static void main(String[] args) {
        //1.toUpperCase转成大写
        String s1 = "heLLo";
        System.out.println(s1.toUpperCase());

        //2.toLowerCase转成小写
        System.out.println(s1.toLowerCase());

        //3.concat拼接字符串
        String s2 = "宝玉";
        s2 = s2.concat("林黛玉").concat("薛宝钗").concat("一起");
        System.out.println(s2);

        //4.replace 替换字符串的字符
        String s3 = "宝玉 林黛玉 林黛玉 林黛玉";
        //将林黛玉替换成薛宝钗，对原本的s3的值没有影响
        String s4 = s3.replace("林黛玉","薛宝钗");
        System.out.println(s3);
        System.out.println(s4);

        //5.spilt 分割字符串，对于某些分割字符，我们需要转义比如| \\等
        String poem = "锄禾日当午,汗滴禾下土,谁知盘中餐,粒粒皆辛苦";
        //以,为标准对poem进行分割，返回以一个数组
        String[] spilt = poem.split(",");
        System.out.println("==这是一首诗==");
        for (int i = 0; i < spilt.length; i++) {
            System.out.println(spilt[i]);
        }
        poem = "E\\aaa\\bbb";
        spilt = poem.split("\\\\");//转义符\
        System.out.println("===分割后的内容===");
        for (int i = 0; i < spilt.length; i++) {
            System.out.println(spilt[i]);
        }
        System.out.println("===转成字符数组===");
        //6.toCharArray 转换成字符数组
        s1 = "happy";
        char[] chs = s1.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }

        //7.compareTo 比较两个字符串
        String a = "jcck";
        String b = "jackd";
        //c-a所以等于2，如果两个值都相等是则返回0
        //如果两个值长度不相同时，a的长度-b的长度
        System.out.println(a.compareTo(b));

        //8.format 格式字符串
        /*
        占位符：%s字符串 %d整型 %c字符 %.2f浮点型(保留小数点前两位)
          */
        String name = "hsp";
        int age =20;
        double score = 98.3/3;
        char gender = '男';
        String info =
                "我的姓名是"+name +"年龄是"+age+",成绩是"+score+"性别是"+gender+"希望大家喜欢我";
        System.out.println(info);

        String formatStr =
                "我的姓名%s 年龄是%d 成绩是%.2f 性别是%c 希望大家喜欢我";
        String info2 = String.format(formatStr,name,age,score,gender);
        System.out.println(info2);

    }
}
