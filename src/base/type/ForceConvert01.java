package base.type;

public class ForceConvert01 {
    public static void main(String[] args) {
        //1.强转符号只针对于最近的操作数有效，往往会使用效括号提升优先级
        //int x = (int)10*1.5;//错，double->int
        int x = (int) (10 * 1.5);
        System.out.println(x);//15

        //2.char类型可以保存int的常量值，但不能保存int的变量值，需要强转
        int m = 100;
        char n = 100;
        int a1 = (char) m;
        char a2 = (char) m;
        char a3 = (char) n;
        System.out.println(a1);
        System.out.println(a2);//100对应的字符 d
        System.out.println(a3);

        String a = "1" + 2;//字符串拼接
        System.out.println(a);
        String b = "abc" + "def";
        System.out.println(b);
        String s = new String(b);
        if (b == s) {
            System.out.println("a");//不输出
        }
        if (b.equals(s)) {
            System.out.println("b");
        }
        char p = '3';
        int q = (int) p;
        System.out.println(q);

        System.out.println(11011111 | 11011110);


    }
}
