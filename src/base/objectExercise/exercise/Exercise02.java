package base.objectExercise.exercise;

public class Exercise02 {
    public static void main(String[] args) {
        //练习2.用oop编写三个职工内容
        Teacher[] t = new Teacher[3];
        t[0] = new Professor("钦", 60, "教授", 30000, 1.3);
        t[1] = new ViceProfessor("涛", 50, "副教授", 20000, 1.2);
        t[2] = new Lecturer("诚", 40, "讲师", 8000, 1.1);
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }
 /*       Teacher teacher1 = new Professor("钦", 60, "教授", 30000, 1.3);
        Teacher teacher2 = new ViceProfessor("涛", 50, "副教授", 20000, 1.2);
        Teacher teacher3 = new Lecturer("诚", 40, "讲师",8000, 1.1);
        System.out.println(teacher1.introduce());
        System.out.println(teacher2.introduce());
        System.out.println(teacher3.introduce());*/
    }

}

class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;
    private double grade;

    public String introduce() {
        return "名字:" + name + " 年龄" + age + " 职称:" + post + " 工资" + salary + " 工资级别" + grade;
    }

    public Teacher(String name, int age, String post, double salary, double grade) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                ", grade=" + grade +
                '}';
    }
}

class Professor extends Teacher {
    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public String introduce() {
        return super.introduce();
    }
}


class ViceProfessor extends Teacher {
    public ViceProfessor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);

    }

    @Override
    public String introduce() {
        return super.introduce();
    }
}

class Lecturer extends Teacher {
    public Lecturer(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public String introduce() {
        return super.introduce();
    }
}
