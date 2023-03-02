package base.objectExercise.exercise.Exercise09;

public class Tc extends Per {
    private int work_age;

    public Tc(String name, int age, char sex, int work_age) {
        super(name, age, sex);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void teach() {
        System.out.println(getName()+"承诺,我会认真教学");
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }

    public void workInfo() {
        System.out.println("老师的信息");
        System.out.println(super.basicInfo());
        System.out.println("工龄: " + work_age);
        teach();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Tc{" +
                "work_age=" + work_age + "," + super.toString();
    }
}
