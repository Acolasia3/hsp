package primary.exception_.execrise;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Exercise03 {
    public static void main(String[] args) {
        try{
            fun();//抛出异常之后try后面的就不执行了
            System.out.println("A");
        }catch(Exception e){
            System.out.println("C");
        }
        System.out.println("D");
    }

    static void fun(){
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("B");
        }
    }
}
