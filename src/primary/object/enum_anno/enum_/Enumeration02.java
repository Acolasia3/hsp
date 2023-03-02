package primary.object.enum_anno.enum_;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Enumeration02 {
    public static void main(String[] args) {
        //1.将构造器私有化，目的防止，直接new
        //2.去掉setXXX方法，防止属性被修改
        //3.在Season内容，直接创建固定的对象
        //4.优化，可以加入final修饰符
        System.out.println(Season2.AUTUMN);
    }
}

//演示定义枚举实现
class Season2 {
    private String name;
    private String desc;//描述

    //定义了四个固定对象
    public final static Season2 SPRING = new Season2("春天", "温暖");
    public final static Season2 WINTER = new Season2("冬天", "寒冷");
    public final static Season2 SUMMER = new Season2("夏天", "炎热");
    public final static Season2 AUTUMN = new Season2("秋天", "凉爽");

    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}