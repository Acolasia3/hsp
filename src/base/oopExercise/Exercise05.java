package base.oopExercise;

public class Exercise05 {
    public static void main(String[] args) {
        //7.构造器的使用
        A05 a05 = new A05("tom", 19);
        System.out.println(a05.name());
        System.out.println(a05.age());
    }
}

class A05 {
    String name;
    int age;

    public A05(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() {
        return this.name;
    }

    public int age() {
        return this.age;
    }

}