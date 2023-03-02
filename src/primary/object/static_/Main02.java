package primary.object.static_;

public class Main02 {
    //静态的变量/属性
    private static String name= "hsp";

    //非静态的变量/属性
    private int n1 = 10000;

    //静态方法
    public static void hi(){
        System.out.println("Main的hi方法");
    }

    //非静态方法
    public void cry(){
        System.out.println("Main的cry方法");
    }

    public static void main(String[] args) {
        //1.静态方法main可以访问本类的静态成员
        System.out.println("name="+name);
        hi();

        //2.静态方法main不可以访问本类的非静态成员
        //System.out.println("n1="+n1); 错误
        //cry();

        //3.静态方法main要访问本类的非静态成员，需要先创建对象，在调用
        Main02 main02 = new Main02();
        System.out.println("n1="+main02.n1);
        main02.cry();
    }
}
