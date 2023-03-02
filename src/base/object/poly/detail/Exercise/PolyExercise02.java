package base.object.poly.detail.Exercise;

public class PolyExercise02 {
    public static void main(String[] args) {
        //属性看编译类型,方法看运行类型
        Sub s = new Sub();
        System.out.println(s.count);//20
        s.display();//20
        Base b = s;
        System.out.println(b == s);//true    指向同一个地址
        System.out.println(b.count);//10   属性没有重写之说，看编译类型
        b.display();//20  看运行类型,运行类型时Sub
    }
}
