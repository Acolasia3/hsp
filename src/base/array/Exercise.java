package base.array;

public class Exercise {
    public static void main(String[] args) {
        //1.二维数组总和
        int sum = 0;
        int[][] arr = {{4, 6}, {1, 4, 5, 7}, {-2}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);

        //2.杨辉三角
        int[][] yangHui = new int[10][];
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];//第i行对应有i+1个元素


            for (int j = 0; j < yangHui[i].length; j++) {
                if (j == 0 || j == yangHui[i].length - 1) {
                    yangHui[i][j] = 1;
                } else {
                    yangHui[i][j] = yangHui[i - 1][j] + yangHui[i-1][j - 1];
                }
            }
        }

        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
