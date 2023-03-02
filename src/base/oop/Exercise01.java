package base.oop;

public class Exercise01 {
    public static void main(String[] args) {
        //练习1(查找最大值)
        double[] arr = null;
        A01 a01 = new A01();
        Double res = a01.max(arr);
//        System.out.println(a01.max(arr));
        if (res != null) {
            System.out.println("arr的最大值" + res);
        } else {
            System.out.println("arr的输入有误");
        }

        //练习2(查找对应值的索引)
        String[] strs = {"jack","tom","jenny"};
        A02 a02 = new A02();
        int Index = a02.find("tom",strs);
        System.out.println("查找的索引是"+Index);


    }
}

class A01 {
    public Double max(double[] arr) {
        double max = 0;
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
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
    public int find(String findStr,String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            if(findStr.equals(strs[i])){
                return i;
            }
        }
        return -1;

    }
}
