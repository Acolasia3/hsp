package primary.object.enum_anno.annotation;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Deprecated_ {

}

/*
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
public @interface Deprecated {
}
 */

//1.@Deprecated 修饰元素，表示该元素已经过时
//2.即不在推荐使用，但是仍然可以使用
//3.可以修饰方法，类，字段，包，参数等
@Deprecated
class A{
    @Deprecated
    public int n1;
}