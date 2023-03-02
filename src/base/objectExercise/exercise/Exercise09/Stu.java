package base.objectExercise.exercise.Exercise09;

public class Stu extends Per {
    private String stu_id;

    public Stu(String name, int age, char sex, String stu_id) {
        super(name, age, sex);
        this.stu_id = stu_id;
    }

   public void study() {
        System.out.println(getName() + "承诺,我会好好学习");
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }

    public void playInfo() {
        System.out.println("学生的信息");
        System.out.println(basicInfo());
        System.out.println("学号: " + stu_id);
        study();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Stu{" +
                "stu_id='" + stu_id + '\'' +
                ',' + super.toString();
    }
}
