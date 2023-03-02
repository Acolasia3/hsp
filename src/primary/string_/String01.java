package primary.string_;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class String01 {
    public static void main(String01[] args) {
        //1.String 对象用于保存字符串，也就是一组字符序列
        //2.字符串常量对象是用双引号括起来的字符序列，比如 "你好"
        //3.字符串的字符使用Unicode字符编码，一个字符（不区分字母与汉字）占两个字符
        //4.String类较常用构造器
        //  String s1 = new String();
        //  String s2 = new String(String original);
        //  String s3 = new String(char[] a);
        //  String s4 = new String(char[] a,int startIndex,int count);
        //  String s5 = new String(byte[] b);
        //5.String实现 Serializable 接口，说明String可以串行化，可以进行网络传输
        //6.String实现 Comparable 接口，说明String对象可以相互比较
        //7.String是一个final类，不能被继承
        //8.String有属性private final char value[];用于存放字符串内容
        //9.一定要注意 value是一个final类型，地址不可以被修改，
        //  即value不能指向新的地址，但是单个字符内容可以变化
        final char[] value = {'a', 'b', 'c'};
        char[] value2 = {'a', 'b', 'c'};
        value[0] = 'd';//此时常量池有abc和dbc两个值
        //value = value2;
    }
}
