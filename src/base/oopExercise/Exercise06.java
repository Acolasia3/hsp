package base.oopExercise;

public class Exercise06 {
    public static void main(String[] args) {
        //练习7.方法调用
        new T().count1();//匿名对象(只能调用一次)
        T t = new T();
        t.count2();
        t.count2();
    }
}

class T {
    int count = 9;//属性

    public void count1() {
        count = 10;//还是属性,因为前面没加基本数据类型所以不是局部变量
        System.out.println("count1:" + count);
    }

    public void count2() {
        System.out.println("count2:" + count++);
    }

}
