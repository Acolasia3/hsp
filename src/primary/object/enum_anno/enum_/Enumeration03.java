package primary.object.enum_anno.enum_;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Enumeration03 {
    public static void main(String[] args) {
        //如果使用enumerate关键字来实现枚举类
        //1.使用关键字enum替代class
        //2.public final static Season3 SPRING = new Season3("春天", "温暖")
        //  直接使用SPRING("春天","温暖")  常量名（实参列表）
        //3.如果有多个常量（对象），使用，号间隔即可
        //4.如果使用enum来实现枚举，要去将定义常量对象，写在最前面
        //5.当我们使用enum关键字开发一个枚举类时，会默认继承Enum类，而且是一个final类
        //6.传统的public final static Season3 SPRING = new Season3("春天", "温暖")
        //  简化成了 SPRING("春天", "温暖")
        //7.如果我们使用的是无参构造器，创建常量对象，则可以省略()

        System.out.println(Season3.AUTUMN);

    }
}

enum Season3 {
    //定义了四个固定对象
//    public final static Season3 SPRING = new Season3("春天", "温暖");
//    public final static Season3 WINTER = new Season3("冬天", "寒冷");
//    public final static Season3 SUMMER = new Season3("夏天", "炎热");
//    public final static Season3 AUTUMN = new Season3("秋天", "凉爽");
    SPRING("春天", "温暖"),
    WINTER("冬天", "寒冷"),
    SUMMER("夏天", "炎热"),
    AUTUMN("秋天", "凉爽"),
    WHAT;

    private String name;
    private String desc;

    Season3() {
    }

    Season3(String name, String desc) {
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