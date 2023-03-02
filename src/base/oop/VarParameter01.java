package base.oop;

public class VarParameter01 {
    //可变参数(方法名相同,功能相同,参数个数不同)
    //实参可为数组
    public static void main(String[] args) {
        Method method = new Method();
        System.out.println(method.sum(10, 20,30,40,50));
    }
}

class Method {
    //1.int... 表示接受的是可变参数,类型时int,既可以接受多个int(0-多)
    //2.使用可变参数时,可以当做数组来使用即nums可以当做数组
    //3.可变参数可以和普通参数放在一起,但是可变参数必须放在最后
    //一个形参只能有一个可变参数
    public int sum(int... nums) {
        System.out.println("接收的参数个数="+nums.length);
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            ret += nums[i];
        }
        return ret;
    }
}
