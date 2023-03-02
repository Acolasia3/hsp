package exercise.zhizunNote.zhizun;

public class Exercise05 {
    public static void main(String[] args) {
        //1.有一个二维数组，请编写一函数计算二维数组第0行的最大值，并返回结果。
        //函数原型： long test(long[][] data)
        //请使用java语言编写该函数，并在函数中返回结果值。
        E05 e51 = new E05();
        long[][] data = {{1,3,5},{2,4,6}};
        System.out.println("第一行的最大值:"+e51.test(data));

        //2.有一个二维数组，请编写函数求它的第2列（列下标为2）的最小值，并返回结果。
        //函数原型： long test(long[][] data)
        //请使用java语言编写该函数，并在函数中返回结果值。
        E05 e52 = new E05();
        long[][] data1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("第二列的最小值:"+e52.test2(data1));

        //3.编写一函数，计算二维数组的所有元素之和，并返回结果。
        //函数原型： long test(long[][] data)
        //请使用java语言编写该函数，并在函数中返回结果值。
        E05 e53 = new E05();
        long[][] data2 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("二维数组总和:"+e53.test3(data2));
    }
}
class E05{
    long test(long[][] data){
        long max = data[0][0];
        for (int i = 1; i < data[0].length; i++) {
            if(max < data[0][i]){
                max =data[0][i];
            }
        }
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[i].length; j++) {
//                if(max < data[i][j]){
//                    max = data[i][j];
//                }
//            }
//        }
        return max;
    }

    long test2(long[][] data1) {
        long min = data1[0][2];
        for (int i = 1; i < data1.length; i++) {
            if (min > data1[i][2]) {
                min = data1[i][2];
            }
        }
        return min;
    }

    long test3(long[][] data2){
        int sum = 0;
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[i].length; j++) {
                sum += data2[i][j];
            }
        }
        return sum;
    }
}
