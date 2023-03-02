package base.array;

public class Demo08 {
    public static void main(String[] args) {
        //二维数组
        int[][] arr = {{0, 1}, {0, 10}, {0, 100}};
        arr[1][1] = 8;
        for (int i = 0; i < arr.length; i++) {
            //arr[i]表示二维数组的第i+1元素
            //arr[i].length表示每个一维数组的长度
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("===================");

        //二维数组的动态初始化
        int[][] arr1 = new int[3][];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = new int[i + 1];//每一行能装多少个元素
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = i + 1;
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        //二维数组的静态初始化
        int[][] arr2 = {{1},{1,2},{1,2,3}};
    }
}
