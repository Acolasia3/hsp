package primary.string_.stringbuffer;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        //1. StringBuffer 的直接父类是 AbstractStringBuilder
        //2. StringBuffer 实现了 Serializable，即StringBuffer的对象可以串行化
        //3. 在父类中 AbstractStringBuilder 有属性 char[] value,不是final
        //   该value 数组存放字符串内容，因此存放在堆中的
        //4. StringBuffer 是一个final类，不能被继承
        //5. 因为StringBuffer字符内容是存在 char[] value,所以变化（增加/减少）
        //   不用每次都更换地址（即不用每次创建对象），所以 效率高于String
    }

    //String和StringBuffer对比
    /*
    String保存的是（字符串常量），里面的值不可以更改，每次String类的更新实际上就是更改地址，效率较低
    String值保存在private final char value[];
     */

    /*
    StringBuffer保存的是（字符串变量），里面的值可以更改，每次StringBuffer的更新实际上可以更新内容，
    不用每次更新地址，效率较高，存放在char[] value 堆中
     */
}
