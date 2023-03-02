package base.object.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        //封装(保护数据)
        //1.将属性私有化
        //2.提供set方法
        //3.提供get方法
        Person person = new Person();
        person.name = "jack";
        //person.age = 10;私有化不可以调用
        person.setAge(1000);//修改参数
        System.out.println(person.name);
        System.out.println(person.getAge());//获取参数

        person.setAge(1000);
        person.setName("jack");
        person.setSalary(30000);
        System.out.println(person.getName()+" "+person.getAge()+" "+ person.getSalary());

        Person tao = new Person("tao", 2000, 30000);
        System.out.println(tao.info());
    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    public Person() {

    }

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //在写构造器的时候仍然可以保护数据
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字长度不对,应该在(2-6)字符,默认名字");
            this.name = "无名人";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("你给你年龄不对需要在(1-120),给你默认18岁");
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "名字=" + name + " 年龄=" + age + " 薪水=" + salary;
    }
}