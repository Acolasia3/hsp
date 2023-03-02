package primary.exception_;


/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Exception01 {
    //分为Error和Exception两大类
    //Error是没办法解决的，栈溢出，内存不足等
    //Exception又分为两类有编译异常和运行异常
    //运行异常常见有：空指针（NullPointerException）、算术异常（ArithmeticException)、
    //类转换异常(ClassCastException)、数组下标越界(ArrayIndexOutOfBoundsException)、
    //数字格式异常(NumberFormatException)
    //编译异常有：SQLException（数据库查询异常）、IOException（操作文件异常）、
    //ClassNotFoundException（加载类，该类不存在时异常）
    public static void main(String[] args) {
        int num1 =10;
        int num2 =0;
        //捕获异常快捷键ctrl+alt+t
        try {
            int a = num1/num2;
        } catch (java.lang.Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
