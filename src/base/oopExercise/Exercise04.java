package base.oopExercise;

public class Exercise04 {
    public static void main(String[] args) {
        //练习6.加减乘除的调用
        Calc calc = new Calc(2, 10);
        System.out.println(calc.add());
        System.out.println(calc.minus());
        System.out.println(calc.mul());

        Double divRes = calc.div();
        if (divRes != null) {
            System.out.println("除" + calc.div());
        }
    }
}

class Calc {
    double num1;//全局变量
    double num2;

    //成员方法
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    //构造器
    public Calc(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //和
    public double add() {
        return num1 + num2;
    }

    //差
    public double minus() {
        return num1 - num2;
    }

    //乘
    public double mul() {
        return num1 * num2;
    }

    //除
    public Double div() {
        if (num2 == 0) {
            System.out.println("null不能为0");
            return null;
        } else {
            return num1 / num2;
        }
    }
}