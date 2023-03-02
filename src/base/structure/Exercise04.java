package base.structure;

public class Exercise04 {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        int start = 20;
        int end = 1000;
        int t = 5;
        for (int i = start; i <= end; i++) {
            if (i % t == 0) {
                System.out.println("i=" + i);
                num++;
                sum += i;
            }
        }
        System.out.println(num);
        System.out.println(sum);

        for (int i = 1; i <= 100; i++) {
            if (i % 9 == 0) {
                System.out.println("i=" + i);
                num++;
                sum += i;

            }
        }
        System.out.println(num);
        System.out.println(sum);
//
//        int i = 0;
//        int sum = 0;
//        do{
//            i++;
//            System.out.println(i);
//            sum+=i;
//
//        }while (i<200);
//        System.out.println(sum);
//
//        int i = 1;
//        int count = 0;
//        do {
//            if (i % 5 == 0 && i % 3 != 0) {
//                System.out.println("i=" + i);
//                count++;
//            }
//            i++;
//        } while (i <= 200);
//        System.out.println("count=" + count);


        for (int i = 1; i < 200; i++) {
            if (i % 5 == 0) {
                System.out.print(i + "\t");
            }
            if (i % 15 == 0) {
                System.out.println();
            }
        }
    }
}

