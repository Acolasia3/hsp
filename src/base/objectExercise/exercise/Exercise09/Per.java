package base.objectExercise.exercise.Exercise09;

public class Per {
    private String name;
    private int age;
    private char sex;

    public Per(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String play(){
        return name + "爱玩";
    }

    public String basicInfo(){
        return "姓名: "+name+"\n年龄: "+age+"\n性别: "+sex;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
