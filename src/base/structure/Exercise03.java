package base.structure;

public class Exercise03 {
    public static void main(String[] args) {
        //当大于50000需要收5%的费用,小于50000收1000,能走过几个路口
        int i = 100000;
        int counter = 0;
        while (i >= 0) {
            if (i > 50000) {
                i *= 0.95;
            } else if (i >= 1000) {
                i -= 1000;
            } else {
                System.out.println("退出");
                break;
            }
            counter++;
            System.out.println("经过"+counter+"剩下"+i);
        }

            System.out.println();

            int a = 2000;
            if (a % 4 == 0 && a / 400 != 0) {
                System.out.println("闰年");
            } else {
                System.out.println("不是闰年");
            }


            //水仙花
            for (int sum = 1; sum < 1000; sum++) {
                int ge = sum % 10;
                int shi = sum / 10 % 10;
                int bai = sum / 100;
                if (sum == Math.pow(ge, 3)
                        + Math.pow(shi, 3) + Math.pow(bai, 3)) {
                    System.out.println(sum);
                }
            }


        //1-100之间的不能被5整除的数,每5个一行
            int counter1 = 0;
            for (int j = 1; j <= 100; j++) {
                if (j % 5 != 0) {
                    counter1++;
                    System.out.print(j + " ");

                    if (counter1 % 5 == 0) {
                        System.out.println();
                    }
                }
            }



        //输出a-z,A-Z
        for (char j = 'a'; j <= 'z'; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (char j = 'A'; j <= 'Z'; j++) {
            System.out.print(j + " ");
        }

       // 1-1/2+1/3-1/4.....-1/100的和
        double sum = 0;
        for (int j = 1; j <= 100; j++) {
            if (j % 2 != 0) {
                sum += 1.0 / j;
            } else {
                sum -= 1.0 / j;
            }
        }
        System.out.println();
        System.out.println(sum);


        //1+(1+2)+(1+2+3)+...+(1+2+...+100)的和
        int num = 0;
        int sum1 = 0;
        for (int j = 1; j <=100 ; j++) {
            num+=j;
            sum1+=num;
        }
        System.out.println(num);
        System.out.println(sum1);

        int sum2 = 0;
        for (int j = 1; j <=100 ; j++) {
            for (int k = 1; k <=j ; k++) {
                sum2+=k;
            }
        }
        System.out.println(sum2);
    }
}