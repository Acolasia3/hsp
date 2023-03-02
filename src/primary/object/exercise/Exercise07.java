package primary.object.exercise;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Exercise07 {
    public static void main(String[] args) {
        //方法一使用构造器
        Car02 c2 = new Car02(10);
        //方法二使用参数调用
        c2.getAir().flow(50);
        c2.getAir().flow(-10);

    }
}

class Car02 {
    //用成员内部类
    public double temperature;

    public Car02(double temperature) {
        this.temperature = temperature;
    }

    class Air {
        public void flow(double temperature) {
            if (temperature > 40) {
                System.out.println("开启冷气模式");
            } else if (temperature < 0) {
                System.out.println("开启暖气模式");
            } else {
                System.out.println("关掉空调");
            }
        }
    }

    public Air getAir() {
        return new Air();
    }
}
/*
使用普通方法
class Car03 {
    public double temperature;

    public Car03(double temperature) {
        this.temperature = temperature;
    }

    public static void main(String[] args) {
        Air air = new Air();
        air.flow(100);
    }
}

class Air {
    public void flow(double temperature) {
        if (temperature > 40) {
            System.out.println("开启冷气模式");
        } else if (temperature < 0) {
            System.out.println("开启暖气模式");
        } else {
            System.out.println("关掉空调");
        }
    }
}
 */

