package base.objectExercise.exercise;

public class Exercise03 {
    //练习3
    public static void main(String[] args) {
        Staff s1 = new Employee("小明", 300, 30, 1.0);
        Staff s2 = new Manager("大明", 1000, 300, 1.2);
        System.out.println(s1.Salary());
        System.out.println(s2.Salary());
    }
}

class Staff {
    private String name;
    private double salary;
    private int workDay;
    private double grade;

    public String Salary() {
        return "名字:" + name + " 工资:" + getSalary() * getWorkDay() * getGrade();
    }

    public Staff(String name, double salary, int workDay, double grade) {
        this.name = name;
        this.salary = salary;
        this.workDay = workDay;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}

class Employee extends Staff {
    public Employee(String name, double salary, int workDay, double grade) {
        super(name, salary, workDay, grade);
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

}

class Manager extends Staff {
    public Manager(String name, double salary, int workDay, double grade) {
        super(name, salary, workDay, grade);
    }

    @Override
    public String Salary() {
        double salary = 1000.0 + getSalary() * getWorkDay() * getGrade();
        return "名字:" + getName() + " 工资:" + salary;
    }
}

