package base.operator;

public class Demo04 {
    public static void main(String[] args) {
        //三元运算符
        //练习1
        int a = 10;
        int b = 99;
        int result = a < b ? a++ : b++;
        System.out.println("result=" + result);
        System.out.println("a="+a);
        System.out.println("b="+b);

        //练习2
        int c = 10;
        int d = 99;
        int f = c < d ? (int)1.1 : (int)3.4;//需要强转
        double n = c > d ? c : d+3;
        System.out.println(n);
        System.out.println(f);

        //练习3
        int n1 = 100;
        int n2 = 50;
        int n3 = 20;

        int max1 = n1 > n2 ? n1 : n2;
        int max2 = max1 > n3 ? max1 : n3;
        System.out.println("最大数="+max2);

        int max = (n1 > n2 ? n1 : n2) > n3 ?
                (n1 > n2 ? n1 : n2) : n3;

        int min1 = n1<n2?n1:n2;
        int min2 = min1<n3?min1:n3;
        System.out.println(min2);

        int min = (n1<n2?n1:n2)<n3?(n1<n2?n1:n2):n3;
        System.out.println(min);
    }
}
