package primary.string_.bignum;

import java.math.BigInteger;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class BigInteger_ {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("1000000000000000000000000000000000000");
        BigInteger bigInteger2 = new BigInteger("100");
        System.out.println(bigInteger);

        //加减乘除
        //加
        BigInteger add = bigInteger.add(bigInteger2);
        System.out.println(add);
        //减
        BigInteger sub = bigInteger.subtract(bigInteger2);
        System.out.println(sub);
        //乘
        BigInteger mul = bigInteger.multiply(bigInteger2);
        System.out.println(mul);
        //除
        System.out.println(bigInteger.divide(bigInteger2));
    }
}
