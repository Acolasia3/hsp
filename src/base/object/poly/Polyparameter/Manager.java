package base.object.poly.Polyparameter;

public class Manager extends Employee {
    private double bonus;//奖金

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }

    //子类特有的方法不可以在父类中直接调用，需要向下转型
    public void manger() {
        System.out.println("经理" + getName() + "在工作");
    }

}