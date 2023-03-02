package base.structure;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println((int) (Math.random() * 100) + 1);
            if (Math.random() == 97) {//等于97跳出语句
                break;
            }
        }

        label1:
        for (int i = 0; i < 4; i++) {//外层for    0*1~10 1*1~10  执行20次
            label2:
            for (int j = 0; j <= 10; j++) {//内层for
                if (i == 2) {
                    break label1;//等价于break label2
                }
                System.out.println("i=" + i);
                System.out.println("j=" + j);
            }
        }

//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum += i;
//            if (sum > 20) {
//                System.out.println(sum);
//                break;
//            }

//        int sum = 0;
//        int i = 1;
//        for (; i <= 100; i++) {
//            sum += i;
//            if (sum > 20) {
//                break;
//            }
//        }
//        System.out.println(sum);

        int sum = 0;
        int n = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (sum > 20) {
                n = i;
                break;
            }
        }
        System.out.println(sum);

        //练习
        Scanner scanner = new Scanner(System.in);
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
            if (chance > 0) {
                System.out.println("你还有" + chance + "次登录机会");
            } else {
                System.out.println("登录失败");
            }
        }
    }
}