package primary.string_.stringbuffer;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class StringAndStringBuffer {
    public static void main(String[] args) {
        //String -> StringBuffer
        String str = "hello";
        //方式1：使用构造器
        //注意返回的才是StringBuffer对象，对str本身没有影响
        StringBuffer stringBuffer = new StringBuffer(str);

        //方式2：使用的是append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);


        //StringBuffer -> String
        StringBuffer stringBuffer2 = new StringBuffer("hsp");
        //方式1：使用StringBuffer提供的toString方法
        String s = stringBuffer2.toString();

        //方式2：使用构造器
        String s1 = new String(stringBuffer2);
    }
}
