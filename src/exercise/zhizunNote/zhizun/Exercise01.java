package exercise.zhizunNote.zhizun;

public class Exercise01 {
    public static void main(String[] args) {
        //1.编写一函数实现百分制转五级记分的等级，函数只能返回:A、B、C、D、E五种情况。
        //函数原型： char test(int score)
        //请使用java语言编写该函数，并在函数中返回结果值。
        E01 e11 = new E01();
        System.out.println("成绩为:" + e11.test(50));

        //2.编写一个函数，根据参数的不同数字（1~7），返回不同的星期几的字符串（“星期一”~“星期日”）
        //函数原型： String test(int n)
        //请使用java语言编写该函数，并在函数中返回结果值。
        E01 e12 = new E01();
        System.out.println("今天:" + e12.test2(1));

        //3.已知有三个整数，编写函数求它们中的最大值
        //函数原型： int test(int a,int b,int c)
        //请使用java语言编写该函数，并在函数中返回结果值。
        E01 e13 = new E01();
        System.out.println("最大值为:" + e13.test3(10, 20, 30));
    }
}

class E01 {
    char test(int score) {
        char ret;
        int rank = score / 10;
        switch (rank) {
            case 10:
            case 9:
                ret = 'A';
                break;

            case 8:
                ret = 'B';
                break;

            case 7:
                ret = 'C';
                break;

            case 6:
                ret = 'D';
                break;

            default:
                ret = 'E';
                break;
        }
        return ret;
    }

    String test2(int n) {
        String ret1 = "";
        switch (n) {
            case 1:
                ret1 = "星期一";
                break;

            case 2:
                ret1 = "星期二";
                break;

            case 3:
                ret1 = "星期三";
                break;

            case 4:
                ret1 = "星期四";
                break;

            case 5:
                ret1 = "星期五";
                break;

            case 6:
                ret1 = "星期六";
                break;

            default:
                ret1 = "星期日";
                break;

        }
        return ret1;
    }

    int test3(int a, int b, int c) {
        int max;
        int max1;
        int max2;
        //int max = a;
//        if(max<b){
//            max = b;
//        }
//        if(max<c){
//            max = c;
//        }
//          return max;
        if (a < b) {
            if (b < c) {
                max = c;
            } else {
                max = b;
            }
        } else {
            if (a < c) {
                max = c;
            } else {
                max = a;
            }
        }
        return max;
    }


//        if (a > b) {
//            max1 = a;
//        }else{
//            max1 = b;
//        }
//        if(max1>c){
//            max2 = max1;
//        }else{
//            max2 = c;
//        }
//        return max2;
}

