package base.object.extend.super_;

public class Exercise {
    public static void main(String[] args) {
        System.out.println("============第一个对象===========");
        Sub sub = new Sub();
        System.out.println("============第二个对象===========");
        Sub sub2 = new Sub("jack");
        System.out.println("===========第三个对象============");
        Sub sub3 = new Sub("tao",18);
        System.out.println("======调用父类的私有属性==============");
        sub.sayOk();
    }
}
