package primary.wrapper;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Wrapper01 {
   /*
   byte -> Byte
   short -> Short
   int -> Integer
   long -> Long
   float -> Float
   double -> Double
   父类都为Number

   boolean -> Boolean
   char -> Character
    */

    //jdk5之后，就有自动装箱和拆箱
    //装箱：基本数据类型->包装类，否则为拆箱

    public static void main(String[] args) {
        //手动装箱
        int n1 =100;
        //int -> Integer
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        //手动拆箱
        //Integer -> int
        int i = integer.intValue();

        //jdk5之后，就可以自动装箱和自动拆箱
        int n2 = 200;
        //自动装箱
        Integer integer2 = n2;//底层使用的是 Integer.valueOf(n2)


        //手动拆箱
        int n3 = integer2;//底层使用的是 intValue()方法


    }
}
