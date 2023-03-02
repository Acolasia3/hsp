package base.objectExercise.exercise;

public class Exercise06 {
    public static void main(String[] args) {
        //练习6.通过构造器反推出属性
        LabeledPoint black = new LabeledPoint("Black", 100, 200);
    }
}
class Point{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
class LabeledPoint extends Point{
    private String label;
    public LabeledPoint(String label,double x, double y) {
        super(x, y);
        this.label = label;
    }
}