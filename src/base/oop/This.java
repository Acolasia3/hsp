package base.oop;

public class This {
    //this的使用
    //this那个对象调用就代表那个对象
    public static void main(String[] args) {
        hsp h = new hsp("tom", 18);
        System.out.println("main" + h.hashCode());
        h.p();

        System.out.println("===============");

        hsp h2 = new hsp("jenny", 20);
        System.out.println("main" + h2.hashCode());
        h2.p();
    }
}

class hsp {
    String name;
    int age;

    public hsp(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("构造方法" + this.hashCode());
    }

    public void p() {
        System.out.println("成员方法" + this.hashCode());
    }

}

