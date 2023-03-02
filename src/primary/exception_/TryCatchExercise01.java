package primary.exception_;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class TryCatchExercise01 {
    //1.如果没有出现异常，则执行try块中所有语句，不执行catch块中语句，
    //  如果有finally，最后还需要执行finally里面的语句
    //2.如果出现异常，则try块中异常发生后，try块剩下的语句不再执行，
    //  将执行catch块中的语句，如果有finally，最后还需要执行finally里面的语句
    public static void main(String[] args) {
        System.out.println(method());
    }

    public static int method(){
        try{
            String[] names = new String[3];
            if(names[1].equals("tom")){//空指针异常
                System.out.println(names[1]);
            }else{
                names[3] = "hsp";
            }
            return 1;
        }catch(ArrayIndexOutOfBoundsException e){
            return 2;
        }catch(NullPointerException e){
            return 3;
        }finally{
            return 4; //finally的值覆盖了catch
        }
    }
}
