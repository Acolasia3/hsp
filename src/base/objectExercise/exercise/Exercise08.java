package base.objectExercise.exercise;

public class Exercise08 {
    public static void main(String[] args) {
        //向上转型:父类的引用指向子类对象
        Personly p = new Student();
        p.run();
        p.eat();


        //向下转型:把指向子类对象的父类引用,转成指向子类对象的子类引用
        Student s = (Student)p;
        s.study();
        s.run();
        s.eat();
    }
}

class Personly {
    public void run() {
        System.out.println("personly run");
    }

    public void eat() {
        System.out.println("person eat");
    }
}

class Student extends Personly {
    @Override
    public void run() {
        System.out.println("student run");
    }

    public void study() {
        System.out.println("student study..");
    }
}