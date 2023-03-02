package exercise.train;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Demo02 {
    public static void main(String[] args) {
        Student s1 = new Student("tao", "21120542", '男', 18);
        Student s2 = new Student("tao", "21120542", '男', 18);
        s1.showAge();
        s1.showName();
        s1.showNo();
        s1.showSex();
        s1.setAge(20);
        s1.showAge();


    }
}

class Student {
    public String name;
    public String no;
    public char sex;
    public int age;

    public Student(String name, String no, char sex, int age) {
        this.name = name;
        this.no = no;
        this.sex = sex;
        this.age = age;
    }

    public void showNo() {
        System.out.println(no);
    }

    public void showName() {
        System.out.println(name);
    }

    public void showSex() {
        System.out.println(sex);
    }

    public void showAge() {
        System.out.println(age);
    }

    public void setAge(int age) {
        this.age = age;
    }
}
