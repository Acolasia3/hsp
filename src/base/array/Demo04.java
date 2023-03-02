package base.array;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        //翻转
        //方法一
        int[] arr = {11, 22, 33, 44, 55, 66};
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //方法二
        int[] arr1 = {11, 22, 33, 44, 55, 66};
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[arr1.length - 1 - i];
        }
        //让arr1指向arr2数据空间，此时arr1原来的数据空间就没有任何变量引用，被当做垃圾销毁
        arr1 = arr2;
        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i]+" ");
            System.out.print(arr2[i] + " ");
        }
        System.out.println();


        //数组添加
        int[] arr3 = {1, 2, 3};
        int[] arrNew = new int[arr3.length + 1];
        for (int i = 0; i < arr3.length; i++) {
            arrNew[i] = arr3[i];
        }
        arrNew[arrNew.length - 1] = 4;
        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arrNew[i] + " ");
        }
        System.out.println();

        System.out.println("======================");
        //通过扫描器添加元素
        Scanner scanner = new Scanner(System.in);
        int[] arr4 = {1, 2, 3};
        do {
            int[] arrNew1 = new int[arr4.length + 1];
            for (int i = 0; i < arr4.length; i++) {
                arrNew1[i] = arr4[i];
            }
            System.out.println("请输入你要添加的元素");
            int addNum = scanner.nextInt();
            //把addNum赋给arrNew最后一个元素
            arrNew1[arrNew1.length - 1] = addNum;
            arr4 = arrNew1;
            for (int i = 0; i < arr4.length; i++) {
                System.out.print(arr4[i] + " ");
            }
            System.out.println();
            System.out.println("是否退出添加y/n");
            char key = scanner.next().charAt(0);
            if (key == 'y' || key == 'n') {
                break;
            }
        } while (true);
        System.out.println("你退出了添加");
    }
}
