package base.oopExercise;

public class Exercise08 {
    public static void main(String[] args) {
        //练习9
        D d1 = new D();
        D d2 = d1;
        d2.m();
        System.out.println(d1.i);
        System.out.println(d2.i);
    }
}

class D {
    int i = 100;

    public void m() {
        int j = i++;//局部变量(存放在栈中)
        System.out.println("i:" + i);
        System.out.println("j:" + j);
    }
}
