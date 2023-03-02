package primary.string_.method;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class ArraysMethod01 {
    public static void main(String[] args) {
        //1.toString排序方法
        Integer[] integers = {1, 200, 90};
        //显示数组信息
        System.out.println(Arrays.toString(integers));

        //2.sort方法
        //(1)可以直接使用冒泡排序，也可以直接使用Arrays提供的sort方法排序
        //(2)因为数组是引用类型，所以通过sort排序后，会直接影响到实参arr
        //(3)sort是重载的，也可以通过传入一个接口 Comparator 实现定制排序
        //(4)调用定制排序时，传入两个参数:
        //   1.排序数组arr 2.实现了Comparator接口的匿名内部类，要求实现comparable方法

        //Arrays.sort(arr)//默认方法
        Integer arr[] = {1, 9, 3, 4, 5};
        Arrays.sort(arr);
        System.out.println("===默认的sort方法排序后===");
        System.out.println(Arrays.toString(arr));

        //定制排序
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println("===定制的方法排序后===");
        System.out.println(Arrays.toString(arr));
    }
}
