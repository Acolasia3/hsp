package primary.object.static_;

public class CodeBlockExercise01 {
    public static void main(String[] args) {
        System.out.println("total="+P.total);//100
        System.out.println("total="+P.total);//100
    }
}

class P{
    public static int total;//默认0

    static {//静态代码块只加载一次
        total = 100;//把前面属性覆盖
        System.out.println("in static block");//和类一起加载所以第一个打印
    }
}