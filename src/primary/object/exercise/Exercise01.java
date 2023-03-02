package primary.object.exercise;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Exercise01 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(100);
        System.out.println(c1);
        System.out.println(c2);
    }
}

class Car {
    double price = 10;
    static String color = "white";//静态属性只加载一次，不能改变

    public String toString() {
        return price + "\t" + color;
    }

    public Car() {
        this.price = price;
        this.color = color;
    }

    public Car(double price) {
        this.price = price;
    }
}
