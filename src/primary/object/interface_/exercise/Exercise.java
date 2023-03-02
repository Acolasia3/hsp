package primary.object.interface_.exercise;

public class Exercise {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb.a);//10
        System.out.println(AA.a);//10
        System.out.println(BB.a);//10
    }
}

interface AA{
    int a = 10;
}
class BB implements AA{
    
}
