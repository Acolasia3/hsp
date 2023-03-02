package primary.wrapper;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class WrapperExercise02 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);

        Integer m = 1;//底层 Integer.valueOf(1)
        Integer n = 1;//底层 Integer.valueOf(1)
        System.out.println(m == n);
        //所以这里主要是看范围-128 ~ 127 如果是就直接返回

        //1.如果i在IntegerCache.low(-128)~IntegerCache.high(127),就直接从数组返回
        //2.如果不在-128~127，就直接new Integer(i)
        /*
         public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
    }
         */
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);
    }
}
