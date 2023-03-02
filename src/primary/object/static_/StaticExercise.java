package primary.object.static_;

import java.util.Scanner;

public class StaticExercise {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("第" + ++num + "个学生请捐款~~");
        Scanner sc1 = new Scanner(System.in);
        int a1 = sc1.nextInt();
        Student student1 = new Student("小明");
        student1.stuname();
        Student.fee += a1;

        System.out.println("第" + ++num + "个学生请捐款~~");
        Scanner sc2 = new Scanner(System.in);
        int a2 = sc2.nextInt();
        Student student2 = new Student("小红");
        student2.stuname();
        Student.fee += a2;
        System.out.println(num+"个学生一共凑集" + Student.fee + "元");
    }
}

class Student {
    String name;
    static double fee;

    public Student(String name) {
        this.name = name;
    }

    public void stuname() {
        System.out.println("名字：" + name);
    }


}