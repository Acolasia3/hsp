package exercise.zhizunNote;

public class text7 {

    String ttt = "qqq";

    public static void main(String[] args) {
        Student student = new Student("21120542");
        System.out.println(student.studentId);

        student = new Student("21120588");
        System.out.println(student.studentId);

        student = new Student("21120577", "张大", '男', "2000-5-5", 1.8f, 110);
        System.out.println(student.studentId);
        student.say();

        student.setName("张二");
        student.say();
    }
}

class Student {
    //成员变量
    public String studentId;
    String name;
    protected char sex;
    private String birthday;
    float height;
    int weight;

    //静态方法
    public static void test() {

    }

    //构造方法
    public Student() {

    }

    //有参构造
    public Student(String studentId) {
        this.studentId = studentId;
    }

    public Student(String studentId, String name, char sex, String birthday, float height, int weight) {
        this.studentId = studentId;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    //成员方法
    public void say() {
        System.out.println("我叫" + name + ",我是" + sex + "生，我的生日：" + birthday);
    }

    //获取成员变量的值
    public String getStudentId() {
        return studentId;
    }

    //修改成员变量的值
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

