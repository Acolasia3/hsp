package primary.exception_.throws_;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 180;
        if(!(age >= 18 && age<=120)){
            throw new AgeException("年龄不在18-120之间");
        }
        System.out.println("你的年龄范围正确");
    }
}

//1.一般情况下，我们自定义异常是继承RuntimeException
//2.即把自定义异常做成 运行时异常，好处是我们可以使用默认的处理机制
class AgeException extends RuntimeException{
    public AgeException(String message){
        super(message);
    }
}