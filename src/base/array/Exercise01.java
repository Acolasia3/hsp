package base.array;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        //1.作业
        String[] str1 = {"a", "b"};
        String[] str2 = new String[]{"a", "b"};//一维数组
        //String[] str1 =new String{"a","b"}; error
        //String[] str2 = new String[3]{"a","b"}; error

        //2.作业
        String f = "blue";
        boolean[] bar = new boolean[2];//没有初始化值
        //bar[0]=true;
        if (bar[0]) {//false
            f = "green";
        }
        System.out.println(f);

        //3.作业(难点)
        Scanner scanner = new Scanner(System.in);

        //定位
        int[] arr = {10, 12, 45, 90};
        int index = -1;
        System.out.println("请输入插入数字");
        int num = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (num <= arr[i]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            index = arr.length;
        }

        //扩容
        int[] arrNew = new int[arr.length + 1];
        for (int i = 0, j = 0; i < arrNew.length; i++) {
            if (i != index) {
                arrNew[i] = arr[j];
                j++;
            } else {
                arrNew[i] = num;
            }
        }
        arr = arrNew;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
