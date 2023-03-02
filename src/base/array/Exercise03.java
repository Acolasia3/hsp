package base.array;

public class Exercise03 {
    public static void main(String[] args) {
        //5.作业
        //冒泡排序(从小到大)
        int[] arr = {20, -1, 89, 2, 890, 7};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {//5次比较到1次
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j+ 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        System.out.println();
    }
}
