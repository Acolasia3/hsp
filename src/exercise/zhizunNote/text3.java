package exercise.zhizunNote;

public class text3 {
    //缺省成员方法(成员方法描述对象所具有的功能或操作，反映对象的行为，是具有某种相对独立功能的程序模块。
    // 故可增强程序结构的清晰度，提高编程效率。)
    void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
    }

    void printArrayDesc(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
    }

    int max(int[] a) {
        int ret = a[0];
        for (int i = 1; i < a.length; i++) {
            if (ret < a[i]) {
                ret = a[i];
            }
        }
        return ret;
    }

    int min(int[] d) {
        int ret = d[0];
        for (int i = 1; i < d.length; i++) {
            if (ret > d[i]) {
                ret = d[i];
            }
        }
        return ret;
    }

    float average(int[] d) {
        float sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
        }
        return sum / d.length;
    }

    float gameScore(int[] d) {
        float sum = 0;
        int max = d[0];
        int min = d[0];
        for (int i = 0; i < d.length; i++) {
            if (max < d[i]){
                max = d[i];
            }
            if (min > d[i]){
                min = d[i];
            }
            sum += d[i];
        }
        return (sum - max - min) / (d.length - 2);

    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(a.length);
        text3 soft = new text3();
        soft.printArray(a);
        soft.printArrayDesc(a);
        int[] grade = new int[8];
        grade[0] = 98;
        grade[1] = 68;
        grade[2] = 77;
        grade[3] = 79;
        grade[4] = 65;
        grade[5] = 87;
        grade[6] = 55;
        grade[7] = 93;
        System.out.println(soft.max(grade));
        System.out.println(soft.min(grade));
        System.out.println(soft.average(grade));
        System.out.println(soft.gameScore(grade));

        demo001 demo = new demo001();
        System.out.println(demo.test(160));
        System.out.println(demo.test1("a"));

    }
}

class demo001 {
    float test(int n) {
        float value = 0;
        if (n >= 150) {
            value += (n - 150) * 0.75f;
        }
        if (n >= 90) {
            value += (n - 90) * 0.65f;
        } else {
            value += n * 0.5f;
        }
        return value;
    }


    int test1(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (a == 'a' || a == 'o' || a == 'i' || a == 'u' || a == 'e') {
                sum++;
            }
        }
        return sum;
    }
}