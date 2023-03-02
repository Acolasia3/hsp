package base.structure;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        //综合
        //先写1个班5个学生
        //3个班5个学生的平均分、总分、及格人数
        Scanner scanner = new Scanner(System.in);
        double totalScore = 0;
        int passNum = 0;
        //int classNum = 3;
        //int stuNum = 5;
        for (int j = 1; j <= 3; j++) {
            double sum = 0;
            for (int i = 1; i <= 5; i++) {
                System.out.println("请输入第" + j + "班" + i + "个学生的成绩");
                double score = scanner.nextDouble();
                sum += score;
                System.out.println("成绩为" + score);
                if (score >= 60) {
                    passNum++;
                }
            }
            System.out.println("sum=" + sum + "的平均分=" + (sum / 5));
            totalScore += sum;
        }
        System.out.println("总分是" + totalScore + " 3个班平均分为" + totalScore / (3 * 5));
        System.out.println("及格人数为" + passNum);
    }
}
