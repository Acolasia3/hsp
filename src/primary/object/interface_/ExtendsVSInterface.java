package primary.object.interface_;

public class ExtendsVSInterface {
    public static void main(String[] args) {
        LittleMonkey wukong = new LittleMonkey("悟空");
        //继承
        wukong.climbing();
        //接口
        wukong.swimming();
        wukong.Flying();

        //继承Vs接口:  1.当子类继承了父类，就自动拥有父类的功能。
        //            2.如果子类需要扩展功能，可以通过实现接口的方式扩展
        //            3.实现接口是对java单继承机制的一种补充

        //继承的价值：解决代码的复用性和可维护性
        //接口的价值：设计好各种规范（方法），让其他类去实现这些方法，即更加灵活。接口可以增强代码的扩展性
        //继承 和 接口 相当于天赋与努力
    }
}

class Monkey{
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing(){
        System.out.println(name+"天生会爬树");
    }

    public String getName() {
        return name;
    }
}

//接口
interface Fish{
    void swimming();
}

interface Bird{
    void Flying();
}

//继承
class LittleMonkey extends Monkey implements Fish,Bird{
    @Override
    public void swimming() {
        System.out.println(getName()+"通过学习可以像鱼儿一样游泳");
    }

    @Override
    public void Flying() {
        System.out.println(getName()+"通过学习可以像小鸟一样飞翔");
    }

    public LittleMonkey(String name) {
        super(name);
    }
}
