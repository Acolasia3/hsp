package base.structure;

public class For {
    public static void main(String[] args) {
        //for四要素：1.初始值 2.循环体 3.循环条件 4.循环变量迭代
        //for(变量初始化;循环条件;循环变量迭代)
        //循环操作(可以多条语句)
        int i = 0;
        for (; i <= 10; ) {
            i++;
        }
        System.out.println(i);

        for (int j = 0; j <= 10; j++) {
            System.out.println(j);
        }

        int counter = 0;
        int sum = 0;
        int start = 10;
        int end = 200;
        int t =5;
        for (int j = start; j <= end; j++) {
            if(j%t==0){
                counter++;
                sum+=j;
            }
        }
        System.out.println();
        System.out.println(counter);
        System.out.println(sum);

        for (int j = 0; j <=5; j++) {
            System.out.println(j+"+"+(5-j)+"="+5);
        }

        int n =10;
        for (int j = 0; j <=n; j++) {
            System.out.println(j+"+"+(n-j)+"="+n);
        }
    }
}
