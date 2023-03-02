package base.oopExercise;

public class Exercise10 {
    public static void main(String[] args) {
        //练习11
        Circle1 c = new Circle1();
        PassObject p = new PassObject();
        p.printAreas(c, 5);
    }
}

class Circle1 {
    double r;

    public double findArea() {
        return Math.PI * r * r;
    }

    //***修改对象的半径值
    public void SetR(double r) {
        this.r = r;
    }
}

class PassObject {
    public void printAreas(Circle1 c, int times) {
        System.out.println("Radius" + "\t" + "Area");
        for (int i = 1; i <= times; i++) {
            c.SetR(i);
            //c.r = i; 修改对象的半径值
            System.out.println((double) i + " \t" + c.findArea());
        }
    }
}
