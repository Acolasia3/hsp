package primary.object.exercise;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Exercise04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new ICalculate() {//匿名内部类
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        }, 10, 8);
        System.out.println(cellphone.getClass());
       /*
        new ICalculate() {//匿名内部类
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        }同时也是一个对象
        */
    }
}

interface ICalculate {
    //work方法是完成计算，没有具体要求，所以自己设计
    double work(double n1, double n2);
}

class Cellphone {
    public void testWork(ICalculate iCalculate, double n1, double n2) {
        double result = iCalculate.work(n1, n2);//动态绑定
        System.out.println("计算后的结果是=" + result);
    }
}