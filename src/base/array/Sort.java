package base.array;

import java.util.Arrays;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        Integer[] arr = {5,2,0};
        Arrays.sort(arr);
        for (Integer i : arr) {
            System.out.println(i);
        }

        Arrays.sort(arr,Collections.reverseOrder());
        for (Integer i : arr) {
            System.out.println(i);
        }
    }
}
