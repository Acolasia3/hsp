package primary.object.exercise;

/**
 * @author 彭桂涛
 * @version 1.0
 */

/*
题目:
    1.创建一个Color枚举类，有三个属性redValue，greenValue，blueValue
    2.有RED,BLUE,BLACK,YELLOW,GREEN这五个枚举值、对象
    3.给枚举值赋值：red：255,0,0  blue：0,0,255  green：0,255,0
    4.定义接口，里面方法show，要求Color实现接口
    5.show方法中显示三属性值
    6.将枚举对象在switch语句中匹配使用
 */
public class Exercise08 {
    public static void main(String[] args) {
        Color color = Color.BLACK;
        color.show();

        switch(color){
            case YELLOW:
                System.out.println("匹配到黄色");
                break;
            case BLACK:
                System.out.println("匹配到黑色");
                break;
            case GREEN:
                System.out.println("匹配到绿色");
                break;
            case BLUE:
                System.out.println("匹配到蓝色");
                break;
            case RED:
                System.out.println("匹配到红色");
                break;
            default:
                System.out.println("没有匹配到");
        }
    }
}

enum Color implements IA {
    RED(255,0,0),BLUE(0,0,255),
    BLACK(0,0,0),YELLOW(255,255,0),
    GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性值=("+redValue+","+greenValue+","+blueValue+")");
    }
}

interface IA {
    void show();
}

