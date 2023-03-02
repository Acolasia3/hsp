package base.objectExercise.exercise;

public class Exercise01 {
    public static void main(String[] args) {
        //oop练习1.定义一个Person类{name,age,job},初始化Person对象数组,
        //有3个person对象,并按照age从大到小排序
        Person[] person = new Person[3];
        person[0] = new Person("钦", 20, "学生");
        person[1] = new Person("涛", 22, "经理");
        person[2] = new Person("诚", 24, "老板");

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }

        Person temp = null;
        for (int i = 0; i < person.length-1; i++) {
            for (int j = 0; j < person.length-i-1 ;j++) {
                if(person[j].getAge() < person[j+1].getAge()){
                    temp = person[j];
                    person[j] = person[j+1];
                    person[j+1] = temp;
                }
            }
        }

        System.out.println("==================排序之后================");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person() {
    }

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}