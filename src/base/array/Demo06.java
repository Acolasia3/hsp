package base.array;

public class Demo06 {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr = {10, 2, 4, 3};
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {//3次比较:3次-2次-1次
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


        //遍历数组
        for (int j = 0; j < 4; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
