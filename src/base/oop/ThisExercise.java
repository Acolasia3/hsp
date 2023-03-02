package base.oop;

public class ThisExercise {
    public static void main(String[] args) {
        Test t1 = new Test("tom",18);
        Test t2 = new Test("jenny",20);
        System.out.println("t1和t2比较的结果为"+t1.compareTo(t2));
        //t1.compareTo代表t1去调用compareTo方法,即当前对象就是p1 this.name = p1;
        //t2是compareTo的形式参数
    }
}

class Test {
    String name;
    int age;

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(Test t) {
        return this.name.equals(t.name) && this.age == t.age;
    }
}
