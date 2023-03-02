package exercise.zhizunNote;

public class text2 {
    long rankN(int n) {
        long ret = 1;
        for (int i = 1; i <= n; i++) {
            ret *= i;
        }
        return ret;
    }

    long rankN1(int n) {
        if (n == 1){
            return 1;
        }
        return n * rankN1(n - 1);
    }

    long sum(int n) {
        if (n == 1){
            return 1;
        }
        return n + sum(n - 1);
    }

    long fibonacci(int n) {
        if (n == 1 || n == 2)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    double total(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= 1.0 / i;
            } else {
                sum += 1.0 / i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int a0, a1, a2, a3;
        int[] a;
        float[] b;
        char[] c;
        boolean[] d;
        a = new int[5];
        b = new float[6];
        c = new char[7];
        d = new boolean[8];

        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 4;
        System.out.println(a[0]);
        System.out.println(a[4]);

        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
        text2 num = new text2();
        System.out.println(num.rankN(8));
        System.out.println(num.rankN1(8));
        System.out.println(num.sum(8));
        System.out.println(num.fibonacci(5));

        //斐波那契
        int f1 = 1, f2 = 1;
        System.out.print(f1 + "," + f2 + ",");
        for (int n = 3; n < 10; n++) {
            int f3 = f1 + f2;
            if(n<9){
                System.out.print(f3+ ",");
            }
            if(n==9){
                System.out.print(f3 );
            }
            f1 = f2;
            f2 = f3;
        }
        System.out.println();

        System.out.println(num.fibonacci(7));
        System.out.println(num.total(100));

    }

}
