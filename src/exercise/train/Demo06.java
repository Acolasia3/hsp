package exercise.train;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Demo06 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 100);
            arr[i] = num;
        }

        for (int j = 0; j < arr.length - 1; j++) {
            for (int k = 0; k < arr.length - 1 - j; k++) {
                if (arr[k] > arr[k + 1]) {
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
