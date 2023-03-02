package base.oop;

public class OverLoadExercise {
    //重载(方法名相同,形参不同)
    public static void main(String[] args) {
        //练习1
        Methods methods = new Methods();
        methods.m(10);
        methods.m(10,20);
        methods.m("为坦克大战而战");
    }
}

class Methods{
    public void m(int n) {
        System.out.println((n*n));
    }
    public void m(int n1,int n2){
        System.out.println(n1*n2);
    }
    public void m(String n3){
        System.out.println(n3);
    }

}
