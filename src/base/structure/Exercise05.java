package base.structure;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalScore = 0;
        int passNum = 0;
        System.out.println("请输入成绩");
        for (int i = 1; i <= 3; i++) {
            double sum = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.println("请输入第" + i + "班的第" + j + "个学生的成绩");
                double score = scanner.nextDouble();
                if (score >= 60) {
                    passNum++;
                }
                System.out.println("成绩为" + score);
                sum += score;
            }
            totalScore += sum;
            System.out.println("sum=" + sum + " 平均分=" + (sum / 5));
        }
        System.out.println("三个班总分为=" + totalScore + "平均分为=" + totalScore / 15);
        System.out.println("及格人数=" + passNum);

    }
}

