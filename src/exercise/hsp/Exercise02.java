package exercise.hsp;

public class Exercise02 {
    public static void main(String[] args) {
        X x = new X();
        int day = -1;
        int ret = x.demo(day);
        if (ret != -1) {
            System.out.println("第" + day + "天有" + ret + "桃子");
        }
    }
}

class X {
    public int demo(int day) {
        if (day == 10) {
            return 1;
        } else if (day > 0 && day < 10) {
            return (1 + demo(day + 1)) * 2;
        } else {
            System.out.println("输入的天数要在1-10之间");
            return -1;
        }
    }
}