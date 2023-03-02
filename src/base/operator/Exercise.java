package base.operator;

public class Exercise {
    public static void main(String[] args) {
        //原码、反码、补码
        System.out.println(~-2);//1
        //原码10000000 00000000 00000000 00000010
        //反码11111111 11111111 11111111 11111101
        //补码11111111 11111111 11111111 11111110
        //运算为00000000 00000000 00000000 00000001
        //结果为1
        System.out.println(~2);//-3
        //原码00000000 00000000 00000000 00000010
        //补码00000000 00000000 00000000 00000010
        //运算为11111111 11111111 11111111 11111101
        //运算后反码11111111 11111111 11111111 11111110
        //运算后原码10000000 00000000 00000000 00000011
        //结果为-3
        System.out.println(2|3);//3
        System.out.println(2^3);//1

        //位运算
        int a = 3>>2;
        int b = 3>>>2;
        int c = 1>>2; //1/2/2=0
        int d = 1<<2; //1*2*2=4
        int e = -1<<2;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("e="+e);

        //练习
        int i = 66;
        System.out.println(i+++i);
        int j = 66;
        System.out.println(++j+j);

        //int num1 = (int)"18";错 应该是Integer.parseInt(18);
        //int num2 = 18.0;错 double=>int
        double num3 = 3d;
        double num4 = 8;
        //int i = 48; char ch = i + 1;错 int=>char
        //byte bb = 19; short s = bb + 2;//错 int=>short

        //将String转换成double类型
        String str = "18.8";
        double d1 = Double.parseDouble(str);
        System.out.println(d1);
        
        //将char类型转换成String
//        char c1 = '韩';
//        String str2 = c1 + "";
//        System.out.println(str2);
    }
}
