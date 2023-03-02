package exercise.zhizunNote.zhizun;

public class Exercise02 {
    public static void main(String[] args) {
        //1.已知Fiebonacci数列中 f1= 1,f2 =1, fn = fn-1 + fn-2,请编写一个函数计算fn，并返回fn的值
        //函数原型： long test(int n)
        //请使用java语言编写该函数，并在函数中返回结果值。
        E02 e21 = new E02();
        System.out.println(e21.test(7));

        //2.编写一函数，统计传入的参数中元音字母的个数，并返回个数
        //函数原型： int test(String str)
        //请使用java语言编写该函数，并在函数中返回结果值。
        E02 e22 = new E02();
        System.out.println(e22.test2("aoyad"));

        //3.家庭基本电价0.5元/度，超过90度小于150度部分0.65,150 度以上部分0.75元/度
        //请编写函数，根据输入参数中的用电量计算电费，并返回电费
        //函数原型： float test(int mount)
        //请使用java语言编写该函数，并在函数中返回结果值。
        E02 e23 = new E02();
        System.out.println(e23.test3(200));
    }
}

class E02 {
    long test(int n) {
       int ret = -1;
       if(n==1||n==2){
           return 1;
       }
       if(n>=3){
           return test(n-1)+test(n-2);
       }
       return ret;
    }

    int test2(String str) {
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char zm = str.charAt(i);
            if(zm=='a'||zm=='o'||zm=='e'||zm=='i'||zm=='u'){
                index++;
            }
        }
        return index;
    }

    float test3(int mount) {
        float sum = 0;
        if (mount > 150) {
            sum += (mount - 150) * 0.75f;
            mount = 150;
        }
        if (mount > 90) {
            sum += (mount - 90) * 0.65f;
            mount = 90;
        }
        sum += mount * 0.5f;

        return sum;
    }
}
