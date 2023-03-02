package base.object.extend.improve_;

public class Student {
    //父类Student
    //继承(提高代码的复用性,代码的扩展性和维护性提高了)
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void info() {
        System.out.println("学生:" + name + "  \t年龄:" + age + "\t成绩:" + score);
    }
}
