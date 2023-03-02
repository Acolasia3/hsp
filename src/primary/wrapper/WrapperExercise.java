package primary.wrapper;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class WrapperExercise {
    public static void main(String[] args) {
        Double d = 100d;
        Float f = 1.5f;

        //三元运算符是一个整体，他的最大的类型是double
        Object obj1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(obj1);//三元运算符看成一个整体，最大精度为double

        Object obj2;
        if (true) {
            obj2 = new Integer(1);
        } else {
            obj2 = new Double(2.0);
        }
        System.out.println(obj2);
    }
}
