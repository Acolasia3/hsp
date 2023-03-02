package primary.string_.method;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class System_ {
    public static void main(String[] args) {
        //1.exit退出当前程序
        System.out.println("1");
        //System.exit(0);
        System.out.println("2");

        //2.arraycopy复制数组元素，一般使用Array.copyOf
        int[] src = {1, 2, 3};
        int[] d = new int[3];
        System.arraycopy(src, 0, d, 0, 3);
        //System.arraycopy(src, 0, dest, 0, src.length);
        System.out.println("dest="+ Arrays.toString(d));

        //3.currentTimeMillis返回当前时间距离1970-1-1的毫秒数
        System.out.println(System.currentTimeMillis());

        //4.SimpleDateFormat更改时间格式
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//修改日期格式
        date = new Date();
        System.out.println(sdf.format(date));


    }
}
