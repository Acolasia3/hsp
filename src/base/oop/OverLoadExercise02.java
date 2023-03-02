package base.oop;

public class OverLoadExercise02 {
    public static void main(String[] args) {
        C C = new C();
        System.out.println(C.max(10, 20));
        System.out.println(C.max(10.0, 20.0));
        System.out.println(C.max(10, 20, 30));
    }
}

class C {
    public int max(int n1, int n2) {
//        int max = 0;
//        if (max <= n1) {
//            max = n1;
//        }
//        if (max <= n2) {
//            max = n2;
//        }
//        return max;
        return n1 > n2 ? n1 : n2;
    }

    public double max(double n1, double n2) {
//        double max = 0;
//        if (max <= n1) {
//            max = n1;
//        }
//        if (max <= n2) {
//            max = n2;
//        }
//        return max;
        return n1 > n2 ? n1 : n2;
    }

    public double max(double n1, double n2, double n3) {
        double max1 = n1 > n2 ? n1 : n2;
        return max1 > n3 ? max1 : n3;

//        double max = 0;
//        if (max <= n1) {
//            max = n1;
//        }
//        if (max <= n2) {
//            max = n2;
//        }
//        if (max <= n3) {
//            max = n3;
//        }
//        return max;

    }

}
