package primary.object.final_;

public class FinalExercise {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle.calArea());
    }
}

//第一题
class Circle {
    private double radius;
    private final double PI = 3.14;

    //构造器
    public Circle(double radius) {
        this.radius = radius;
        //PI =3.14;
    }

    {
        //PI =3.14;
    }

    public double calArea() {
        return PI * radius * radius;
    }
}

//第二题
class Something {
    public int addOne(final int x) {
        //++x; 加上final后不能再修改
        return x + 1;
    }
}
