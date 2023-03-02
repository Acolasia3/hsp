package base.object.equals;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("jack", 10, '男');
        Person person2 = new Person("jack", 10, '男');
        //先判断两个Person对象的地址是否相同，再判断内容是否相等
        System.out.println(person1.equals(person2));
        //判断两个Person对象的各个属性值都一样，则返回true，反之false
    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    //判断如果比较的两个对象是同一个对象，则直接返回对象
  /*  public boolean equals(Object obj) {//传进来的是person2
        if (this == obj) {
            return true;
        }

        if (obj instanceof Person) {
            //进行向下转型，因为需要得到obj的各个属性
            Person p = (Person) obj;
            //      person1.equals(person2)
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }
*/

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}