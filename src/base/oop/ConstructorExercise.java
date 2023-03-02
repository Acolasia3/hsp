package base.oop;

public class ConstructorExercise {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat2 = new Cat("小红",30);
        System.out.println(cat.name+","+cat.age);
        System.out.println(cat2.name+","+cat2.age);

    }
}
class Cat{
    String name;
    int age;
    
    public Cat(){
       age = 18;
    }
    public Cat(String pName,int pAge){
        name = pName;
        age = pAge;
    }
}
