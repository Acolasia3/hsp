package exercise.hsp;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //空心金字塔
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == i * 2 - 1 || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }


        int sum = 100000;
//        while(sum>=50000){
//            sum-=sum*0.05;
//        }
        int index = 0;
        for (int i = 1; ; i++) {
            if (sum >= 50000) {
                sum -= sum * 0.05;
                index = i;
            }
            if (sum >= 1000 & sum < 50000) {
                sum -= 1000;
                index = i;

            }
            if (sum < 1000) {
                System.out.println("经过" + index + "路口" + "剩下" + sum);
                System.out.println("退出");
                break;

            }

            System.out.println("经过" + index + "路口" + "剩下" + sum);

        }
//        System.out.println("经过"+index+"路口"+"剩下"+sum);

        int year = 2000;
        if (year % 4 == 0 && year % 400 != 0) {
            System.out.println("闰年");
        } else {
            System.out.println("不是闰年");
        }


        int num = 153;
        if (num >= 100 && num < 1000) {
            int bai = num / 100;
            int shi = num / 10 % 10;
            int ge = num % 10 % 10;
            if (Math.pow(bai, 3) + Math.pow(shi, 3) + ge * ge * ge == num) {
                System.out.println("正确");
            } else {
                System.out.println("失败");
            }
        }

        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 != 0) {
                count++;
                System.out.print(i + " ");
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }

        Scanner scanner = new Scanner(System.in);
        int chance = 3;
        for (int i = 1; i <= chance; i++) {
            System.out.println("请输入用户名");
            String name = scanner.next();
            System.out.println("请输入密码");
            int pwd = scanner.nextInt();
            if (name == "丁真" && pwd == 666) {
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("你还有" + (chance - i) + "次机会");
            }

        }
/*
        String name = "丁真";
        String passNum = "666";
        int chance = 3;
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名");
            name = scanner.next();
            System.out.println("请输入密码");
            passNum = scanner.next();

            if ("丁真".equals(name) && "666".equals(passNum)) {
                System.out.println("登入成功");
                break;
            }
            chance--;
            System.out.println("你还有" + chance + "次登录机会");
        }
 */

    }
}
