package base.array;

public class Demo03 {
    public static void main(String[] args) {
        //基本数据类型赋值,赋值方式为值传递(不影响原变量)
        int n1 = 10;
        int n2 = n1;
        n2 = 80;
        System.out.println(n1);//10
        System.out.println(n2);//80

        //数组在默认情况下是引用传递,赋的值是地址,赋值方式为引用赋值(影响原变量)
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;
        arr2[0] = 10;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");//10,2,3
        }
        System.out.println();

        //数组拷贝
        int[] arr = {1, 2, 3};
        int[] arrNew = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];

        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        arr = arrNew;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
