package exercise.train;

import java.util.Scanner;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Demo01 {
    //    public static void main(String[] args) {
//        System.out.println(method());
//    }
//    public static int method(){
//        System.out.println("请输入天数");
//        Scanner scanner = new Scanner(System.in);
//        int day = scanner.nextInt();
//        int money = 0;
//        for (int i = 0; i < day; i++) {
//             money += Math.pow(2,i);
//        }
//      return money;
//    }

    public static void main(String[] args) {
        int money = 0;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
             money += Math.pow(2, i );
        }
        System.out.println("乞丐干10天收入" + money);
    }

}
