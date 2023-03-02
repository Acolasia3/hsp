package base.operator;

public class Demo02 {
    public static void main(String[] args) {
        //逻辑运算符
        //练习1
        int x = 5;
        int y = 5;
        if (x++ == 6 & ++y == 6) {
            //false   true
            x = 11;
        }
        System.out.println("x=" + x + ",y=" + y);

        int a = 5;
        int b = 5;
        if (a++ == 5 && ++b == 5) {//短路与
            a = 11;
        }
        System.out.println("a=" + a + ",b=" + b);

        int c = 5;
        int d = 5;
        if (c++ == 6 | ++d == 6) {
            c = 11;
        }
        System.out.println("c=" + c + ",d=" + d);

        int n = 5;
        int m = 5;
        if (n++ == 5 || ++m == 5) {//短路或
            n = 11;
        }
        System.out.println("n=" + n + ",m=" + m);

        //练习2
        boolean i = true;
        boolean j = false;
        short z = 42;
        if ((z++ == 42) && (j = true))
            z++;
        if ((i = false) || (++z == 45))
            z++;
        System.out.println("z=" + z);//46

    }
}
