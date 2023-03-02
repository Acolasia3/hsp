package primary.object.interface_.exercise;

public class Exercise02 {
    public static void main(String[] args) {
        new C().pX();
    }
}

interface A {
    int x = 0;
}

class B {
    int x = 1;
}

class C extends B implements A {
    public void pX() {
        //System.out.println(x);//错误，指向不明确
        //可以明确的指定x
        //访问接口的x就使用 A.x
        //访问父类的x就使用 new B().x;
        System.out.println(A.x);
        System.out.println(new B().x);
    }
}
