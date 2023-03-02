package primary.exception_;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class TryCatchDetail02 {
    //4.如果try代码块有可能有多个异常
    //5.可以使用多个catch分别捕获不同的异常，相应处理
    //6.要求子类异常写在前面，父类异常写在后面
    //7.可以使用有个catch语句，但异常发生只会匹配一个
    //7.可以进行try-finally配合使用，这种用法相当于没有捕获异常，
    //  因此程序会直接崩掉，不管是否发生异常，都必须执行某个业务逻辑
    public static void main(String[] args) {
//        try {
//            Person person = new Person();
//            person = null;
//            System.out.println(person.getName());//NullPointerException
//            int n1 = 10;
//            int n2 =0;
//            int res = n1 /n2;//ArithmeticException
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        } catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }

        System.out.println("=======================");
        try {
            int n1 = 10;
            int n2 = 0;
            System.out.println(n1/n2);
        } finally {
            System.out.println("执行finally");
        }//没有进行捕捉，出现异常下面不在执行
        System.out.println("程序继续");
    }
}

class Person {
    private String name = "jack";

    public String getName() {
        return name;
    }
}