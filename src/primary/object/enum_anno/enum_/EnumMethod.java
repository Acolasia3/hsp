package primary.object.enum_anno.enum_;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class EnumMethod {
    public static void main(String[] args) {
        //使用Season3 枚举类，演示各种方法
        Season3 autumn = Season3.AUTUMN;
        //(1)输出枚举对象的名字name
        System.out.println(autumn.name());
        System.out.println(autumn);

        //(2)ordinal()输出的是该枚举对象的次序/编号，从0开始编号
        System.out.println(autumn.ordinal());

        //从反编译可以看出values方法，返回Season2[]
        //含有定义的所有枚举对象
        Season3[] values = Season3.values();
        for (Season3 i : values) {
            System.out.println(i);
        }

        int[] num = {1,2,3};
        System.out.println("========普通for循环===========");
        for (int i = 0; i < num.length; i++) {
            System.out.println("i="+num[i]);
        }
        System.out.println("========增强for循环=========");
        for (int i : num) {
            System.out.println("i="+i);
        }

        //valueOf:将字符换成枚举对象，要求字符串必须为已有的常量名，否则报异常
        //执行流程
        //1.根据你输入的"AUTUMN"到Season2的枚举对象去查找
        //2.如果找到了，就返回，如果没有找到，就报错
        Season3 autumn1 = Season3.valueOf("AUTUMN");
        System.out.println("autumn1="+autumn1);

        //compareTo:比较两个枚举常量，比较的就是编号Season3.AUTUMN 和 Season3.SUMMER枚举对象的编号
        //就是Season3.AUTUMN的编号减去Season3.SUMMER
        System.out.println(Season3.AUTUMN.compareTo(Season3.SUMMER));//3-2=1
        /*
         public final int compareTo(E o) {
        Enum<?> other = (Enum<?>)o;
        Enum<E> self = this;
        if (self.getClass() != other.getClass() && // optimization
            self.getDeclaringClass() != other.getDeclaringClass())
            throw new ClassCastException();
        return self.ordinal - other.ordinal;
    }
         */
    }
}
