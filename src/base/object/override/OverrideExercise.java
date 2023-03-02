package base.object.override;

public class OverrideExercise {
    public static void main(String[] args) {
        Person jack = new Person("jack",10);
        System.out.println(jack.say());
        Student student = new Student("jack",10,21120542,100);
        System.out.println(student.say());
    }
}
