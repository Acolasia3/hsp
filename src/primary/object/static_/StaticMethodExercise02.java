package primary.object.static_;

public class StaticMethodExercise02 {
    public static void main(String[] args) {
        TestPerson.setTotalPerson(3);
        new TestPerson();
        System.out.println(TestPerson.total());//执行构造器，最后total的值是4
    }
}

class TestPerson {
    private int id;
    private static int total = 0;

    public static void setTotalPerson(int total) {
        //this.total = total; 错误，因为在static方法中，不可以使用this关键字
        TestPerson.total = total;
    }

    public TestPerson() {
        total++;
        id = total;
    }

    public static int total() {
        return total;
    }
}