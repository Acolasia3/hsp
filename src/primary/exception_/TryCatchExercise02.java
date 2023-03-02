package primary.exception_;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class TryCatchExercise02 {
    public static void main(String[] args) {
        System.out.println(method());
    }

    public static int method() {
        int i = 1;
        try {
            i++;
            String[] names = new String[3];
            if (names[1].equals("tom")) {//空指针异常
                System.out.println(names[1]);
            } else {
                names[3] = "hsp";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return ++i;//i=3 --> 保存临时变量temp=3
        } finally {//捕获异常后会先执行完finally才输入异常结果
            ++i;
            System.out.println("i=" + i);
        }
    }
}

