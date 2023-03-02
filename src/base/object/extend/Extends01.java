package base.object.extend;

public class Extends01 {
    public static void main(String[] args) {//最初的演示，没有使用继承的案例
        Pupil pupil = new Pupil();
        pupil.name="小明";
        pupil.age = 10;
        pupil.setScore(100);

        pupil.testing();
        pupil.showInfo();

        System.out.println("===============================");
        Graduate graduate = new Graduate();
        graduate.name = "大明";
        graduate.age = 20;
        graduate.setScore(60);

        graduate.testing();
        graduate.showInfo();
    }
}
