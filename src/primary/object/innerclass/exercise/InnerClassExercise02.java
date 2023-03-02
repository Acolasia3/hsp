package primary.object.innerclass.exercise;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();

        //1.传递的是实现了Bell接口的匿名内部类 InnerClassExercise02$1
        //2.重写了ring
        //3.本质上是：
        // Bell bell = new Bell(){
        //     @Override
        //     public void ring() {
        //          System.out.println("懒猪起床了");
        //    }
        //};
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });

        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }

//    public static void a1(Bell bell) {
//        bell.ring();
//    }
}

interface Bell {
    void ring();
}

class Cellphone {
    public void alarmClock(Bell bell) {//形参是Bell接口类型
        bell.ring();//动态绑定
    }
}