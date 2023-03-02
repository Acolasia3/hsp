package base.oopExercise;

public class Exercise01 {
    public static void main(String[] args) {
        //练习1.得出最大值
        A01 a01 = new A01();
        double[] arr = null;
        //包装数据
        Double res = a01.max(arr);
        if (res != null) {
            System.out.println("arr的最大值为" + res);
        } else {
            System.out.println("arr输入有误,数组不能为null或者{}");
        }

        //练习2.查找元素
        A02 a02 = new A02();
        String[] str = {"10","20","30"};
        int index = a02.test("30",str);
        System.out.println("找到元素,下标为" + index);

    }
}

class A01 {
    public Double max(double[] arr) {
        if (arr != null && arr.length > 0) {
            double max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;
        } else {
            return null;
        }
    }
}

class A02 {
    public int test(String find,String[] str) {
        for (int i = 0; i < str.length; i++) {
            if (find.equals(str[i])) {
                return i;
            }
        }
    return -1;
    }
}
