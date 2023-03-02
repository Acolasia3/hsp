package base.oop.digui;

public class RecursionExercise {
    //猴子吃桃
    public static void main(String[] args) {
        T1 t = new T1();
        int day = 1;
        int peachNum = t.peach(day);
        if (peachNum != -1) {
            System.out.println("第" + day + "天 桃子数" + peachNum);
        }
    }
}

class T1 {
    public int peach(int day) {
        if (day == 10) {
            return 1;
        } else if (day >= 1 && day < 10) {
            return (peach(day + 1) + 1) * 2;
        } else {
            return -1;
        }
    }
}
