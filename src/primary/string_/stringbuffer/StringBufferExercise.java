package primary.string_.stringbuffer;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class StringBufferExercise {
    public static void main(String[] args) {
        String str = null;
        StringBuffer s = new StringBuffer();
        s.append(str);//底层调用的是AbstractStringBuffer的appendNull
        System.out.println(s.length());//4
        System.out.println(s);//null

        //str是为null，所以报空指针异常
        StringBuffer s1 = new StringBuffer(str);//底层super(str.length()+16)
        System.out.println(s1);
    }
}
