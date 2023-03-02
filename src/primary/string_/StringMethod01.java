package primary.string_;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class StringMethod01 {
    public static void main(String[] args) {
        //1.equalsIgnoreCase 忽略大小写的判断内容是否相等
        String s1 = "hsp";
        if("Hsp".equalsIgnoreCase(s1)){
            System.out.println("Success");
        }else{
            System.out.println("Failure");
        }

        //2.indexOf获取字符在字符串中第一次出现的索引
        String s2 = "pgt";
        int index = s2.indexOf('g');
        System.out.println(index);

        //3.lastIndexOf获取字符在字符串中最后一次出现的索引
        String s3 = "abcbc";
        int index2 = s3.lastIndexOf('c');
        System.out.println(index2);

        //4.substring 截取指定范围的字符串
        String s4 = "hello-word";
        System.out.println(s4.substring(6));//第六个索引开始取
        System.out.println(s4.substring(0,5));//左闭右开，取[0,5)的元素
        System.out.println(s4.substring(2,5));
    }
}
