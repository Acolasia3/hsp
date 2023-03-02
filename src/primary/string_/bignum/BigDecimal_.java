package primary.string_.bignum;

import java.math.BigDecimal;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class BigDecimal_ {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("1234567.890000000000000000000000");
        BigDecimal bigDecimal2 = new BigDecimal("3.1");
        System.out.println(bigDecimal);

        //加减乘除和BigInteger一样
        //System.out.println(bigDecimal.divide(bigDecimal2));//算术异常

        //在调用divide方法时，指定精度即可，BIGDecimal.ROUND_CEILING
        //如果有无限循环小数，就会保留分子的精度
        System.out.println(bigDecimal.divide(bigDecimal2,BigDecimal.ROUND_CEILING));
    }
}
