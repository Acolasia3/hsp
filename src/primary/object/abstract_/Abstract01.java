package primary.object.abstract_;

public class Abstract01 {

}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    //这里的eat方法实现，其实没有什么意义
    //即：父类方法不确定性的问题
    //考虑将该方法设计为抽象方法
    //所谓抽象方法就是没有实现的方法
    //所谓没有实现就是指，没有方法体
    //当一个类中存在抽象方法时，需要将该类声明为abstract类
    //一般来说，抽象类会被继承，由子类实现抽象方法
    public abstract void eat();
}