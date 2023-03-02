package primary.object.abstract_;

public class AbstractExercise {
    public static void main(String[] args) {
        CommonEmployee e = new CommonEmployee("涛总", "666", 100000);
        Manager m = new Manager("小彭", "333", 5000, 10000);
        System.out.println(e.work());
        System.out.println(e);

        System.out.println(m.work());
        System.out.println(m);

    }
}

abstract class Employee {
    public String name;
    public String id;
    public double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract String work();

}

class CommonEmployee extends Employee {
    @Override
    public String work() {
        return "经理:" + name + " 工作中";
    }

    public CommonEmployee(String name, String id, double salary) {
        super(name, id, salary);

    }

    @Override
    public String toString() {
        return "CommonEmployee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Manager extends Employee {
    private double bonus;

    @Override
    public String work() {
        return "管理员工:" + name + " 工作中";
    }

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;

    }
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}