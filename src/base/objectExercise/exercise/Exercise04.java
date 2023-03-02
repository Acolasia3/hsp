package base.objectExercise.exercise;

public class Exercise04 {
    //练习4
    public static void main(String[] args) {
        Worker p1 = new Worker("工人",20000);
        Personal p2 = new Peasant("农民",25000);
        Personal p3 = new Teach("教师",50000,30,200);
        Personal p4 = new Scientist("科学家",100000,10000);
        Personal p5 = new Waiter("服务员",18000);
        System.out.println(p1.Salary());
        System.out.println(p2.Salary());
        System.out.println(p3.Salary());
        System.out.println(p4.Salary());
        System.out.println(p5.Salary());
    }
}

class Personal {
    private String grade;
    private double salary;

    public Personal(String grade, double salary) {
        this.grade = grade;
        this.salary = salary;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String Salary() {
        return "职位:" + grade + " 全年总工资:" + salary;
    }
}

class Worker extends Personal {
    public Worker(String grade, double salary) {
        super(grade, salary);
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }
}

class Peasant extends Personal {
    public Peasant(String grade, double salary) {
        super(grade, salary);
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }
}

class Teach extends Personal {
    private int day;
    private double money;

    public Teach(String grade, double salary, int day, double money) {
        super(grade, salary);
        this.day = day;
        this.money = money;
    }

    @Override
    public String Salary() {
        double salary = getSalary()+day*money;
        return  "职位:" + getGrade()+ " 全年总工资:" + salary;
    }
}

class Scientist extends Personal {
    private double bonus = 1000;

    public Scientist(String grade, double salary, double bonus) {
        super(grade, salary);
        this.bonus = bonus;
    }

    @Override
    public String Salary() {
        double salary = bonus+getSalary();
        return "职位:" + getGrade()+ " 全年总工资:" + salary;
    }
}

class Waiter extends Personal {
    public Waiter(String grade, double salary) {
        super(grade, salary);
    }

    @Override
    public String Salary() {
        return super.Salary();
    }
}