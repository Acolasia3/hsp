package exercise.train;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Circle c1 = new Circle(100);
        Circle c2 = new Circle(200);
        System.out.println( c1.area());
        System.out.println(  c1.perimeter());
        System.out.println("========");
        System.out.println(c2.area());
        System.out.println( c2.perimeter());

    }
}

class Circle{
    public double radius;
    public final double PI =3.14;

    public Circle(double radius) {
        this.radius = radius;

    }
    public double area(){
        return PI*radius*radius;
    }
    public double perimeter(){
        return PI*2*radius;
    }
}
