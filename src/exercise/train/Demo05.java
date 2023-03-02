package exercise.train;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Demo05 {
    public static void main(String[] args) {
        A a = new A();
        int ret = a.m(20);
        if(ret != -1){
            System.out.println(a.m(20));
        }
    }
}
class A{
    public int m(int n){
        if(n>=1){
            if(n==0&&n==1){
                return 1;
            }
        }else{
            return m(n-1)+m(n-2);

        }
       return -1;

    }
}
