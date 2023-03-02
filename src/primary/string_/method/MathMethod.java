package primary.string_.method;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class MathMethod {
    public static void main(String[] args) {
        //1.abs绝对值
        int abs = Math.abs(-9);
        System.out.println(abs);
        //2.pow求幂
        double pow = Math.pow(2, 4);
        System.out.println(pow);
        //3.ceil 向上取整，返回>=该参数的最小整数
        double ceil = Math.ceil(-3.0001);
        System.out.println(ceil);
        //4.floor向下取整，返回<=该参数的最大整数
        double floor = Math.floor(-4.999);
        System.out.println(floor);
        //5.round四舍五入 Math.floor(该参数+0.5）
        long round = Math.round(-5.001);
        System.out.println(round);
        //6.sqrt求开方
        double sqrt = Math.sqrt(9.0);
        System.out.println(sqrt);

        //7.random求随机数
        //得到一个2-7的整数
        //公式为 (int)(a) <= x <= (int)(a+Math.random()*(b-a+1))
        int num = (int) (Math.ceil(Math.random() * 5) + 2);
        System.out.println(num);

        for (int i = 0; i < 10; i++) {
            int value = (int) (Math.random() * 6 + 2);
            System.out.println(value);
        }
    }
}
