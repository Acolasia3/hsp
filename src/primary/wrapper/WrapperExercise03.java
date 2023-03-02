package primary.wrapper;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class WrapperExercise03 {
    public static void main(String[] args) {
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2);

        Integer i3 = new Integer(128);
        Integer i4 = new Integer(128);
        System.out.println(i3 == i4);

        Integer i5 = 127;//底层Integer.valueOf(127)
        Integer i6 = 127;
        System.out.println(i5 == i6);

        Integer i7 = 128;
        Integer i8 = 128;
        System.out.println(i7 == i8);

        Integer i9 = 127;//底层Integer.valueOf(127)
        Integer i10 = new Integer(127);
        System.out.println(i9 == i10);//地址不相同

        Integer i11 = 127;//引用类型
        int i12 = 127;//基本类型
        System.out.println(i11 == i12);//只要有基本数据类型时，判断的是值是否相同

        Integer i13 =128;
        int i14 = 128;
        System.out.println(i13 == i14);//只要有基本数据类型时，判断的是值是否相同

    }
}
