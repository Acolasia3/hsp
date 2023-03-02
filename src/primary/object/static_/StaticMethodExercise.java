package primary.object.static_;

public class StaticMethodExercise {
    public static void main(String[] args) {
        System.out.println("total的值是："+Person.getTotalPerson());
        Person p1 = new Person();
        System.out.println("total的值是："+Person.getTotalPerson());
    }
}
class Person{
    private int id;
    private static int total = 0;

    public static int getTotalPerson(){
//        id++;//错误，注销   静态方法不能调用静态变量
        return total;
    }

    public Person() {
        total++;
        id = total;

    }
}