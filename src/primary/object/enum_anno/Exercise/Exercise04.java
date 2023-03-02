package primary.object.enum_anno.Exercise;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Exercise04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
//        calc calc = new calc();
        new calc().work(cellphone);//匿名对象
    }
}

class Cellphone implements Method {
    @Override
    public void work() {
        System.out.println("计算机开始运算");
    }
}

interface Method {
    void work();
}

class calc {
    public void work(Method method) {
        //通过接口来调用方法
        method.work();
    }
}