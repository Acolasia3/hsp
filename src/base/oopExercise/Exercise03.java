package base.oopExercise;

public class Exercise03 {
    public static void main(String[] args) {
        //练习4.旧数组复制给新数组
        A03 a03 = new A03();
        int[] arr = {3, 4, 5};
        int[] arrNew = a03.copyArray(arr);
        System.out.println("===新数组===");
        for (int i : arrNew) {
            System.out.print(i);
        }
        System.out.println();
//        for (int i = 0; i < arrNew.length; i++) {
//            System.out.print(arrNew[i]+" ");
//        }

        //练习5.求周长和面积
        Circle circle = new Circle(5);
        System.out.println("周长:" + circle.len());
        System.out.println("面积:" + circle.area());

    }
}

class A03 {
    public int[] copyArray(int[] arr) {
        int[] arrNew = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        return arrNew;
    }
}

class Circle {
    int r;

    public Circle(int r) {
        this.r = r;
    }

    public double len() {
        return Math.PI * 2 * this.r;
    }

    public double area() {
        return Math.PI * this.r * this.r;
    }
}
