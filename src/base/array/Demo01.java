package base.array;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        double sum = 0;
        double[] num = new double[6];
        num[0] = 3;
        num[1] = 5;
        num[2] = 1;
        num[3] = 3.4;
        num[4] = 2;
        num[5] = 50;
        System.out.println(num[1]);
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println(sum);

        double hen1 = 3;
        double hen2 = 5;
        double hen3 = 1;
        double hen4 = 3.4;
        double hen5 = 2;
        double hen6 = 50;
        double totalWeight = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;
        double avgWeight = totalWeight / 6;
        System.out.println(totalWeight + "," + avgWeight );

        //静态初始化
        double[] hens = {3, 5, 1, 3.4, 2, 50};
        double totalWeight1 = 0;
        for (int i = 0; i < 6; i++) {
            totalWeight1 += hens[i];

        }
        System.out.println("总重量" + totalWeight1 + "平均为" + totalWeight1 / 6);

        //动态初始化
        double score[] = new double[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素的值");
            score[i] = scanner.nextDouble();
        }
        for (int i = 0; i < score.length; i++) {
            System.out.println("第" + (i+1) + "个元素的值" + score[i]);
        }
    }
}
