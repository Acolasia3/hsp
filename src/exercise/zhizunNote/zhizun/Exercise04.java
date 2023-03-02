package exercise.zhizunNote.zhizun;

public class Exercise04 {
    public static void main(String[] args) {
        //1.请编写函数，对整数数组中的数进行降序排序（冒泡排序或者选择排序）。
        //函数原型： int[] test(int[] data)
        //请使用java语言编写该函数，并在函数中返回结果值。
        E04 e41 = new E04();
        int[] data = {5, 6, 7, 8};
        int[] a = e41.test(data);
        System.out.println(a);//相当于哈希值的十六进制
        //增强for
        for (int i : a) {//a.for
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("==============");
        //for
//        for (int i = data.length-1; i >= 0; i--) {
//            System.out.print(data[i]+" ");
//        }
//        System.out.println();

        //2.整数数组data中的元素已按升序排好序了，请查找指定元素a所在的位置，返回a的下标。
        //如果在数组中没有找到a，返回-1
        //函数原型： int test(int[] data, int a)
        //请使用java语言编写该函数，并在函数中返回结果值。
        E04 e42 = new E04();
        int[] data1 = {10, 20, 30};
        System.out.println("找到下标为"+e42.test2(data1, 30));

        //3.两个数组的元素个数相同，请编程实现两个数组的相加，将结果返回。
        //函数原型： int[] test(int[] x,int[] y)
        //请使用java语言编写该函数，并在函数中返回结果值。
        int[] x = {1, 2};
        int[] y = {1, 2};
        E04 aa = new E04();
        int[] bb = aa.test3(x, y);
        for (int i : bb) {//b.for
            System.out.print(i+" ");
        }
    }
}

class E04 {
    int[] test(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] < data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        return data;
    }


    int test2(int[] data1, int find) {
        int index = -1;
        for (int i = 0; i < data1.length; i++) {
            if (find == data1[i]) {
                index = i;
            }
        }
        return index;
    }


    int[] test3(int[] x, int[] y) {
        for (int i = 0; i < x.length; i++) {
            x[i] += y[i];
        }
        return x;
    }
}
