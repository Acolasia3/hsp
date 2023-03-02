package primary.object.interface_;

public interface AInterface {
    //写属性
    public int n1 =100;
    //写方法
    //在接口类中所有的方法默认都是抽象方法，可以省略abstract关键字
    public void hi();

    //但在jdk8后，接口可以有实现 默认方法 和 静态方法，需要使用default关键字
    default public void ok(){
        System.out.println("ok");
    }
    public static void cry(){
        System.out.println("cry");
    }
}
