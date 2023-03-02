package exercise.leetcode.primary;

public class Topic01 {
    public static void main(String[] args) {
        int[] num1 = {2,4,3};
        int[] num2 = {5,6,4};
        int[] a = value(num1,num2);
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static int[] value(int[] num1 , int[] num2){
        int[] num3 = new int[num1.length];
        for (int i = num1.length-1; i >= 0 ; i--) {
            System.out.println(num1[i]);
        }
        for (int i = num2.length-1; i >= 0 ; i--) {
            System.out.println(num2[i]);
        }
        return num3;
    }
}
