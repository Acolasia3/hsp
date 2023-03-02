package base.oop;

public class Recursion01 {
    public static void main(String[] args) {
        //递归调用
        Ret ret = new Ret();
        ret.test(4);
        System.out.println();
        ret.test1(4);

        //阶乘的使用
        factorial f = new factorial();
        System.out.println(f.factorial(5));

    }
}

class Ret {
    public void test(int n) {
        if (n > 2) {
            test(n - 1);
        }
        System.out.print(n);
    }


    public void test1(int n) {
        if (n > 2) {
            test1(n - 1);
        } else {
            System.out.println(n);
        }
    }
}

class factorial {
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
}



