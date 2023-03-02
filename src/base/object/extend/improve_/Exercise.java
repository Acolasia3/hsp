package base.object.extend.improve_;

public class Exercise {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name="小红";
        pupil.age = 8;
        pupil.setScore(90);

        pupil.testing();
        pupil.info();

        System.out.println("=============================");
        Graduate graduate = new Graduate();
        graduate.name ="大红";
        graduate.age = 22;
        graduate.setScore(70);

        graduate.testing();
        graduate.info();

    }
}
