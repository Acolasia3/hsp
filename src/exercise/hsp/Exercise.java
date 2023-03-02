package exercise.hsp;

public class Exercise {
    public static void main(String[] args) {
        T t = new T();
        int n = 7;
        int ret = t.test(n);
        if (ret != -1) {
            System.out.println(ret);
        }else{
            System.out.println("要求输入的大于0的整数");
        }
    }
}

class T {
    public int test(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return test(n - 1) + test(n - 2);
            }
        }else{
            System.out.println("输入错误");
        }
        return -1;
    }
}
