package exercise.zhizunNote;

public class text {
    public static void main(String[] args) {
        for (int i = 50; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        int counter = 0;
        for (float length = 3000; length >= 5; ) {
            length /= 2;
            counter++;
            System.out.println(counter + ":" + length);
        }

        System.out.println("3000米绳子，每次减去一半，" + counter + "次后少于5次");

        for (char c = 'α'; c <= 'ω'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();

        char[] arr = new char[25];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) ('α' + i);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "行");

            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int row = 1; row < 10; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + "*" + row + "=" + col * row + "\t");
            }
            System.out.println();
        }

        for (int num = 100; num < 1000; num++) {
            int ge = num % 10;
            int shi = num / 10 % 10;
            int bai = num / 100;
            if (Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3) == num) {
                System.out.println(num);
            }
        }
        System.out.println("====================");
            for (int ge = 0; ge < 10; ge++) {
                for (int shi = 0; shi < 10; shi++) {
                    for (int bai = 1; bai < 10; bai++) {
                        if (Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3) == bai * 100 + shi * 10 + ge) {
                            System.out.println("" + bai + shi + ge);
                        }
                    }
                }
            }


        //写出1乘到100的总和
        int sum = 0;
        for (int n = 1; n <= 100; n++) {
            sum += n;
        }
        System.out.println(sum);


    }
}
