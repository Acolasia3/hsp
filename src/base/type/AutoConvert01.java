package base.type;

public class AutoConvert01 {
    public static void main(String[] args) {
        //1.有很多种类型的数据混合运算时，
        //系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算
        //float a =1.1;错误 1.1 => 结果类型是double

        //2.当我们把精度（容量）大的数据类型赋值给精度（容量）小的数据类型时，
        //就会报错，反之就会进行自动类型转换
        //int n2 = 1.1;错误  double-->int

        //3.(byte,short)和char之间不会相互自动转换
        //byte b1 = 10;
        //char a1 = b1; 错误，byte不能自动转成char

        //4.byte,short,char他们三者可以计算，在计算是首先转换为int类型
        byte a = 1;
        short b= 2;
        //short c1 = a1 + b1;错，a+b转成int
        int c = a + b;

        byte d = 1;
        byte d1 = 1;
        //byte d2 = d + d1;错，d+d1也转成int

        //5.boolean 不参与类型的自动转换

        //6.自动提升原则：表达式结果的类型自动提升为操作数中最大的类型
        int num = 1;
        double num1 = 2;
        //float num2 = num + num1;错，double是最大的类型   double不能转换成float




    }
}
