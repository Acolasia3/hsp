package exercise.zhizunNote;

public class text8 {
    int i;
    static int j;

    public static void main(String[] args) {
        text8.j = 100;
        text8 soft = new text8();
        soft.i = 100;

        Circle circle = new Circle(100.0);
        circle.disp();//普通方法用对象调用
        Circle.printHello();//静态方法用类调用
    }
}

class Circle {
    private double radius;

    public static void printHello() {
        System.out.println("Hello");
    }
    //无参构造
    public Circle() {
        super();
        radius = 0.0;
    }
    //有参构造
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;

    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;

    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    //成员方法
    public void disp() {
        System.out.println(getPerimeter());
        System.out.println(getArea());
    }
}
