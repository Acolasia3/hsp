package primary.string_.stringbuilder;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class StringBuilder01 {
    public static void main(String[] args) {
        //1.StringBuilder继承 AbstractStringBuilder 类
        //2.实现了Serializable，说明StringBuilder对象可以串行化（对象可以网络传输，可以保存在文件）
        //3.StringBuilder 是final类，不能被继承
        //4.StringBuilder 对象字符序列仍然是存放在其父类 AbstractStringBuilder的char[] value中，因此字符序列是在堆中
        //5.StringBuilder 的方法，没有做互斥(同步)的处理，即没有synchronized关键字，因此在单线程的情况下使用StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
        String s = new String();


        //String、StringBuffer和StringBuilder的区别
        /*
            String:不可变字符序列，效率低，但复用性高
            StringBuffer:可变字符序列，效率高（增删），线程安全
            StringBuilder：可变字符序列，效率最高，线程不安全
         */
    }
}
