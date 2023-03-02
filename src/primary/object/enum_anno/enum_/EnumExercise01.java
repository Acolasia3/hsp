package primary.object.enum_anno.enum_;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class EnumExercise01 {
    public static void main(String[] args) {
        Gender boy = Gender.BOY;
        Gender boy2 = Gender.BOY;
        System.out.println(boy);//BOY 本质就是调用Gender的父类Enum的toString方法   //boy.toString()
        System.out.println(boy2 == boy);//T
        /*
        //父类Enum的toString方法，如果子类有重写toString就调用子类的
        public String toString() {
                return name;
            }
         */
    }
}

enum Gender {
    BOY, GIRL;//这里其实就是调用Gender类的无参构造器

}
