package base.object.poly.detail.Exercise;

public class PolyExercise01 {
    public static void main(String[] args) {
        double d = 13.4;
        long l = (long)d;
        System.out.println(l);//13
        int in = 5;
        //boolean b = (boolean)in;报错,int->boolean
        Object obj = "Hello";
        String objStr = (String)obj;//向下转型
        System.out.println(objStr);//Hello

        Object objPri = new Integer(5);//向上转型
        //报错ClassCastException,指向Integer的父类引用,转成String
        String str = (String)objPri;
        Integer str1 = (Integer)objPri;//向下转型
    }
}
