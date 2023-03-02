package primary.object.enum_anno.annotation;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Override_ {
    public static void main(String[] args) {
        //@interface 不是interface，它表示一个注解类，
        //是jdk5.0之后加入的
        /*
        @Target(ElementType.METHOD)
        @Retention(RetentionPolicy.SOURCE)
        public @interface Override {
        }
         */

        //@Target是修饰注解的注解，称为元注解


    }
}
class Father{
    public void fly(){
        System.out.println("Father fly");
    }
}
class Son extends Father{
    //1.@Override 注解放在fly方法上，表示子类的fly方法时重写了父类的fly
    //2.这里如果没有写@Override还是重写了父类fly
    //3.如果你写了@Override注解，编译器就会去检查该方法是否真的重写了父类的
    //  方法，如果的确重写了，则编译通过，如果没有构成重写，则编译错误
    //4.@Override只能修饰方法，不能修饰其他类，包，属性等

    @Override
    public void fly() {
        System.out.println("Son fly");
    }
}