package base.structure;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println();

        int j = 40;
        while (j <= 200) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
            j++;
        }
        System.out.println();

        int a = 1;
        do {
            System.out.println(a);
            a++;
        } while (a <= 100);
        System.out.println(a);

        int b = 1;
        int sum = 0;
        do {
            sum+=b;
            b++;
        } while (b <= 100);
        System.out.println(sum);

        int c = 1;
        do{
            if(c%5==0 && c%3!=0){
                System.out.println(c);
            }
            c++;
        }while(c<=200);//循环条件

        for (int k = 1; k <= 200; k++) {
            if(k%5==0) {
                System.out.print(k + "\t");
                if(k%15==0){
                    System.out.println();
                }
            }
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        char answer = ' ';
        do{
            System.out.println("五连鞭");
            System.out.println("还钱吗?y/n");
            answer = scanner.next().charAt(0);

            if(answer != 'y'){
                System.out.println("输入错误");
            }

        }while(answer != 'y');//如果answer不等于y就继续执行
        System.out.println("退出程序");
    }
}
