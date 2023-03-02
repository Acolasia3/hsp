package exercise.zhizunNote.zhizun;

public class Exercise03 {
    public static void main(String[] args) {
        //1.某同学参加了多门课程的考试，成绩放在整数数组中，请编写函数计算课程的平均分，并返回结果
        //函数原型： float test(int[] score)
        //请使用java语言编写该函数，并在函数中返回结果值。
        E03 e31 = new E03();
        int[] score = {90,60,90};
        System.out.println("平均值"+e31.test(score));

        //2.请编程将整数数组中的数组元素的顺序颠倒过来，并返回顺序颠倒到的数组
        //函数原型： int[] test(int[] data)
        //请使用java语言编写该函数，并在函数中返回结果值。
        E03 e32 = new E03();
        int[] data = {4,3,2,1};
        int[] a = e32.test2(data);
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

class E03 {
    float test(int[] score) {
        float sum = 0;
        float avg = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        return avg = sum / score.length;
    }

    int[] test2(int[] data) {
        //第一种方法
//        for (int i = 0; i < data.length / 2; i++) {
//            int temp = data[i];
//            data[i] = data[data.length - 1 - i];
//            data[data.length - 1 - i] = temp;
//        }
//        return data;

//        第二种方法
        int[] arrNew = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            arrNew[i] = data[data.length-1-i];
        }
        data = arrNew;
        return data;

    }
}
