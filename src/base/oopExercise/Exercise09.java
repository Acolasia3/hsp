package base.oopExercise;

public class Exercise09 {

}

class Employee {
    //练习10构造器的复用
    String name;
    char gender;
    int age;
    String position;
    double salary;

    public Employee(String position, double salary) {
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Employee(String name, char gender, int age, String position, double salary) {
        this(name,gender,age);//构造器的复用  this()只能写在首行
        this.position = position;
        this.salary = salary;
    }
}
