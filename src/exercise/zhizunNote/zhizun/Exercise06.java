package exercise.zhizunNote.zhizun;

public class Exercise06 {
    public static void main(String[] args) {
        //1.请编写一函数，返回字符串的颠倒（反转）后字符串。
        //函数原型： String test(String str)
        //请使用java语言编写该函数，并在函数中返回结果值
        E06 e61 = new E06();
        String str = "123";
        System.out.println(e61.test(str));

        //2.银行卡号验证方法如下，请编写一函数，实现验证： 从卡号最后一位数字开始，
        //逆向将奇数位(1、3、5等等)相加。 从卡号最后一位数字开始，逆向将偶数位数字，
        //先乘以2（如果乘积为两位数，则将其减去9），再求和.将奇数位总和加上偶数位总和得到 sum。
        //如果sum是10的倍数，则卡号正确，返回true，否则返回false
        //函数原型： boolean test(String cardNo)
        //请使用java语言编写该函数，并在函数中返回结果值。
        E06 e62 = new E06();
        String cardNo = "040402";
        System.out.println(e62.test2(cardNo));
    }
}

class E06 {
    String test(String str) {
        String ret = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char a = str.charAt(i);
            ret += a;
        }
        return ret;
    }

    boolean test2(String cardNo) {
        //2.银行卡号验证方法如下，请编写一函数，实现验证： 从卡号最后一位数字开始，
        //逆向将奇数位(1、3、5等等)相加。 从卡号最后一位数字开始，逆向将偶数位数字，
        //先乘以2（如果乘积为两位数，则将其减去9），再求和.将奇数位总和加上偶数位总和得到 sum。
        //如果sum是10的倍数，则卡号正确，返回true，否则返回false
        //函数原型： boolean test(String cardNo)
        String ret = "";
        char[] arr = cardNo.toCharArray();//将字符串转成字符串数组
        int[] num = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            num[i] += arr[i]-'0';//int数组转成char数组 '0'=48
        }

        int Odd = 0;//奇数
        int Even = 0;//偶数
        int Cheng = 0;
        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 0) {
                Odd += num[i];
            } else {
                Cheng = num[i] * 2;
                if (Cheng >= 10 && Cheng <= 99) {
                    Even += (Cheng - 9);
                } else if (num[i] * 2 < 10) {
                    Even += Cheng;
                }
            }
        }
        int sum = Odd + Even;

        return sum % 10 == 0;


//        int sum = 0;
//        //奇数
//        for (int i = cardNo.length() - 1; i >= 0; i -= 2) {
//            char c = cardNo.charAt(i);
//            sum += c - '0';
//        }
//        //偶数
//        for (int i = cardNo.length() - 2; i >= 0; i -= 2) {
//            char c = cardNo.charAt(i);
//            int temp = 2 * (c - '0');
//            if (temp > 9) {
//                temp -= 9;
//            }
//            sum += temp;
//        }
//        return sum % 10 == 0;
    }
}

