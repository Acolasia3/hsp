package base.type;

public class Exercises {
    public static void main(String[] args) {
        short s = 12;
        //s = s-9;//错，int->short

        byte b = 10;
        //b = b +10;错，int->byte
        b = (byte)(b+10);//强转,20   b+=10;
        System.out.println(b);

        char c = 'a';
        int i = 16;
        float d =.314F;
        double result = c + i + d;//float->double
        System.out.println(result);//113.314

        byte n = 10;
        short m = 20;
        //short l = n + m;错，int->short

    }
}
