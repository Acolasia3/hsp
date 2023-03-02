package exercise.zhizunNote;

public class text10 {
    class ABC {
        void print() {
            System.out.println("我在ABC");
        }
    }

    String name;

    void print() {
        ABC abc = new ABC();
        abc.print();
    }

    public static void main(String[] args) {
        text10 t = new text10();
        t.name = "aaaaaa";
        t.print();


        ABC abc = t.new ABC();

        class DDD {
            String a = "aaa";
        }
        DDD d = new DDD();
        System.out.println(d.a);

        Triangle triangle = new Triangle();
        System.out.println(triangle.aaa);

        System.out.println("==================");

        t.print(new Triangle());

        t.print(new Shape() {
            int length = 10;
            int width = 5;

            float area() {
                return length * width;
            }
        });

    }

    void print(Shape s) {
        s.aaa = 10.0f;
        System.out.println("形状面积" + s.area());
    }
}

abstract class Shape {
    float aaa = 0.0f;

    abstract float area();
}

class Triangle extends Shape {
    float area() {
        return 100.0f;
    }
}
