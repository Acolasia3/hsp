package base.array;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        //数组缩减
        Scanner scanner = new Scanner(System.in);
        int[] arr5 = {1, 2, 3, 4, 5};
        do {
            int[] arrNew2 = new int[arr5.length - 1];
            for (int i = 0; i < arrNew2.length; i++) {
                arrNew2[i] = arr5[i];
            }

            arr5 = arrNew2;

            for (int i = 0; i < arr5.length; i++) {
                System.out.print(arr5[i] + " ");
            }
            System.out.println();
            
            System.out.println("是否继续缩减y/n");
            char key = scanner.next().charAt(0);
            if (key == 'n'||key=='y') {
                break;
            }

            if (arrNew2.length < 2) {
                System.out.println("数组为最后一个不能再删除");
                break;
            }
        } while (true);
        System.out.println("你退出了添加");
    }
}
