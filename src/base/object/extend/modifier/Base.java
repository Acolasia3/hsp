package base.object.extend.modifier;

public class Base {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base() {
        System.out.println("Base()....");
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

    public static void main(String[] args) {
        Base b = new Base();
        b.test100();
    }
}
