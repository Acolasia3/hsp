package base.oopExercise;

public class Exercise12 {
    public static void main(String[] args) {
        System.out.println(method(Exercise12.method(10.0,20.0),10));
    }
    public static double method(double d1,double d2){
        return d1+d2;
    }
}
