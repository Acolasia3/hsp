package base.operator;

public class Demo01 {
    //算术运算符
    public static void main(String[] args) {
        //练习
        int i = 10;
        int j = i++;//j=i,i=i+1
        System.out.println(j);

        int n = 10;
        int m = ++n;//n=n+1,m=n
        System.out.println(m);

        int days = 59;
        int weeks = days/7;
        int day1 = days % 7;
        System.out.println(weeks);
        System.out.println(day1);

        double hua = 120;
        double s1 = (double)5 / 9 * (hua-100);
        System.out.println(s1);



    }
}
