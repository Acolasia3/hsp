package base.array;

public class Exercise02 {
    public static void main(String[] args) {
        //4.作业
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("===倒序===");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + "\t");
        }
        System.out.println("================");

        //平均值、最大值和最大值的下标
        double sum = arr[0];
        int index = 0;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println(sum / arr.length);
        System.out.println(max + "," + index);

        //查找
        int index1 = -1;
        int findNum = 8;
        for (int i = 0; i < arr.length; i++) {
            if (findNum == arr[i]) {
                System.out.println("找到8了");
                index = 1;
                break;
            }
        }
        if (index1 == -1) {
            System.out.println("没有找到数" + findNum);
        }
    }
}
