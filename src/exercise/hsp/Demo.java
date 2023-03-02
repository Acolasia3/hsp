package exercise.hsp;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalSum = 0;
        int stuNum = 5;
        double avg = 0;
        int classNum = 3;
        int passNum = 0;
        System.out.println("请输入分数");
        for (int i = 1; i <= classNum; i++) {
            //可以清除上一个班级的总分不计算在内
            double sum =0;
            for (int j = 1; j <= stuNum; j++) {
                System.out.println("第" + i + "班" + "第" + j + "个学生的成绩");
                double score = scanner.nextDouble();
                if (score >= 60) {
                    passNum++;
                }
                sum += score;
                avg = sum / stuNum;

            }
            System.out.println("第" + i + "班的总分" + sum);
            System.out.println("第" + i + "班的平均分" + avg);
            totalSum += sum;
        }
        System.out.println("====三个班的情况如下====");
        System.out.println("三个班的总分" + totalSum);
        System.out.println("三个班的平均分" + avg);
        System.out.println("三个班的及格人数" + passNum);


    }
}
