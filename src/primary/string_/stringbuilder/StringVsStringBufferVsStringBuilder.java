package primary.string_.stringbuilder;

/**
 * @author 彭桂涛
 * @version 1.0
 */

public class StringVsStringBufferVsStringBuilder {
    public static void main(String[] args) {
        long startTime = 0L;
        long endTime = 0L;

        String text = "";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {//String 拼接 20000
                text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间：" + (endTime - startTime));


        StringBuffer buffer = new StringBuffer("");
        startTime = System.currentTimeMillis();//记录当前时间
        for (int i = 0; i < 20000; i++) {//StringBuffer 拼接 20000次
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间：" + (endTime - startTime));


        StringBuilder builder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {//StringBuilder 拼接 20000次
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间：" + (endTime - startTime));
    }
}

