package base.object.poly.polyArray;

public class Test {
    public static void main(String[] args) {
        //没有用多态数组的案例
        Person p = new Person("人类", 100);
        Student stu1 = new Student("小明", 15, 100);
        Student stu2 = new Student("小红", 14, 60);
        Teacher t1 = new Teacher("大明", 30, 20000);
        Teacher t2 = new Teacher("大红", 28, 30000);

        System.out.println("====没有用多态数组的案例====");
        System.out.println(p.say());
        System.out.println(stu1.say());
        stu1.study();
        System.out.println(stu2.say());
        stu2.study();
        System.out.println(t1.say());
        t1.teach();
        System.out.println(t2.say());
        t2.teach();

    }
}
