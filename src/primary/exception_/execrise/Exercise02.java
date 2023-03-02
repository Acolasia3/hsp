package primary.exception_.execrise;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Exercise02 {
    public static void main(String[] args) {
       //args.length = 0;
        if(args[4].equals("hsp")){ //ArrayIndexOutOfBoundsException异常,可能发生空指针异常
            System.out.println("A");
        }else{
            System.out.println("B");
        }
        Object o = args[2];//String->Object向上转型
        //ClassCastException异常
        Integer i = (Integer)o;//String->Integer 错误
    }
}
