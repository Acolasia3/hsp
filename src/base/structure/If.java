package base.structure;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int score = Scanner.nextInt();

        if(10<score && score<20) {
            System.out.println("score="+score);
            }else{
            System.out.println("继续..");
        }
*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入性别");
        char gender = scanner.next().charAt(0);
        System.out.println("请输入分数");
        double score = scanner.nextDouble();

        if(score >= 8){
            System.out.println("进入决赛");
        }else{
            System.out.println("淘汰");
        }

//        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份");
        char month = scanner.next().charAt(0);
        if (month >= 4 && month <= 10) {
            System.out.println("年龄");
            int age = scanner.nextInt();
            if (age >= 18 && age <= 60) {
                System.out.println("成人收费60");
            } else if (age < 18) {
                System.out.println("儿童收费30");
            } else {
                System.out.println("老人收费20");
            }
        } else {
            System.out.println("年龄");
            int age = scanner.nextInt();
            if (age >= 18 && age <= 60) {
                System.out.println("成人收费60");
            } else {
                System.out.println("其他收费30");
            }
        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入字母");
//        char a = scanner.next().charAt(0);
//        switch (a) {
//            case 'a':
//                System.out.println("A");
//                break;
//            case 'b':
//                System.out.println("B");
//                break;
//            case 'c':
//                System.out.println("C");
//                break;
//            case 'd':
//                System.out.println("D");
//                break;
//            case 'e':
//                System.out.println("E");
//                break;
//            default:
//                System.out.println("other");
//                break;
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入成绩");
//        int score = scanner.nextInt();
//        switch ((int)score%60) {
//            case 0:
//                System.out.println("不合格");
//                break;
//            case 1:
//                System.out.println("合格");
//                break;
//
//        }

        int num = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 9 == 0) {
                System.out.println("i="+i);
                num++;
                sum+=i;
            }
        }
        System.out.println(num);
        System.out.println(sum);



    }
}
