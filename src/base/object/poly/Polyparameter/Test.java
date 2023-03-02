package base.object.poly.Polyparameter;

public class Test {
    public static void main(String[] args) {
        //多态参数：方法定义的形参类型为父类类型，实参类型允许为子类类型
        Worker smith = new Worker("smith", 5000);
        Manager jame = new Manager("jame", 10000, 15000);
        Test t = new Test();
        t.showEmployee(smith);
        t.testWork(smith);
        t.showEmployee(jame);
        t.testWork(jame);
    }

    public void showEmployee(Employee e) {
        System.out.println(e.getAnnual());
    }

    //子类特有的方法不可以在父类中直接调用，需要向下转型
    public void testWork(Employee e){
        if(e instanceof Worker){
            ((Worker)e).work();
        }else if(e instanceof Manager){
            ((Manager)e).manger();
        }
    }
}
