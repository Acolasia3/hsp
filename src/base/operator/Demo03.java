package base.operator;

public class Demo03 {
    public static void main(String[] args) {
        //复合赋值运算符会进行类型转换
        byte b = 3;
        b += 2;//等价于b=(byte)b+2,有一个类型转换
        //b = b + 2;
        //b++;  //b=(byte)b+1
        System.out.println(b);

    }
}
