package base.object.extend.subclass;

public class Base {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    //ctrl+H 可以查看继承关系
    public Base() {
        this("tao");//调用Base的有参构造
        System.out.println("父类无参构造器Base()....");
    }

    public Base(String name){
        System.out.println("父类有参构造器");
    }

    //给父类提供一个public方法
    public int getN4() {
        return n4;
    }

    public Base(int n4) {
        this.n4 = n4;
    }

    public void test100() {
        System.out.println("test100");
    }

    protected void test200() {
        System.out.println("test200");
    }

    void test300() {
        System.out.println("test300");
    }

    private void test400() {
        System.out.println("test400");
    }

    public void callTest400() {
        test400();
    }
}
