package primary.object.innerclass.exercise;

public class InnerExercise {
}

class Test {
    public Test() {
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        System.out.println(s2.a);
    }

    class Inner {
        public int a = 5;
    }

    public static void main(String[] args) {
        Test t = new Test();
        Test.Inner r = t.new Inner();//5
        System.out.println(r.a);//5
    }
}