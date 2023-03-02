package primary.string_.method;

import java.util.Arrays;
import java.util.List;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class ArraysMethod03 {
    public static void main(String[] args) {
        //3.binarySearch 通过二分搜索法进行查找，要求必须排好
        Integer[] arr = {1,10,20,30};
        //(1)使用binarySearch 二叉查找
        //(2)要求该数组是有序的，如果该数组是无序的，不能使用binarySearch
        //(3)如果数组中不存在该元素，就返回-(对应下标+1) 如-(1+1)
        int index = Arrays.binarySearch(arr,5);
        System.out.println("index="+index);


        //4.copyOf数组元素的复制
        //(1)从arr数组中，拷贝arr.length个元素传到newArr数组中
        //(2)如果拷贝的长度 > arr.length 就在新数组的后面增加null
        //(3)如果拷贝长度<0 就抛出异常NegativeArraySizeException
        //(4)该方法的底层使用的是System.arraycopy()
        Integer[] newArr = Arrays.copyOf(arr,arr.length+1);
        System.out.println(Arrays.toString(newArr));

        //5.fill数组元素的填充
        Integer[] num = new Integer[]{5,10,40};
        //使用99替换数组的各个元素
        Arrays.fill(num,99);
        System.out.println(Arrays.toString(num));

        //6.equals比较两个数组元素内容是否完全一致
        Integer[] arr2 = {1,10,20,30};
        //判断两个数组的元素是否一样，则方法返回true，否则反之
        boolean equals = Arrays.equals(arr,arr2);
        System.out.println("equals=" + equals);

        //7.asList 将一组值，转换成list
        //(1)asList方法，会将(2,3,4,5,6,1) 数据 (转成一个List集合)
        //(2)返回的asList编译类型List（接口）
        //(3)asList运行类型java.util.ArrayList$ArrayList,是Array类的静态内部类
        //   源码：private static class ArrayList<E> extends AbstractList<E>
        //           implements RandomAccess, java.io.Serializable
        List<Integer> asList = Arrays.asList(2,3,4,5);
        System.out.println("asList="+asList);
        System.out.println("asList的运行类型"+asList.getClass());
    }
}
