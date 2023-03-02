package base.oop.digui;

import java.util.Scanner;

public class Fibonacci {
    //斐波那契  递归
//    @SuppressWarnings("{all}")
    public static void main(String[] args) {
        fib f1 = new fib();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入返回值大于1的值");
        int num = scanner.nextInt();
        int ret = f1.test(num);
        if (ret != -1) {
            System.out.println(f1.test(num));
        }else{
            System.out.println("输出的值错误");
        }
    }
}

class fib {
    // F(n)=F(n - 1)+F(n - 2) （n ≥ 2，n ∈ N*）
    public int test(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return test(n - 1) + test(n - 2);
            }
        }
        return -1;
    }
}

