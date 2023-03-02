package base.oop;

public class Member02 {
    public static void main(String[] args) {
        //拷贝p对象到p2(在不同的地址)
        Person p = new Person();
        p.name = "peng";
        p.age = 19;
        Tools tool = new Tools();
        Person p2 = tool.codePerson(p);

        System.out.println(p.age + "," + p.name);
        System.out.println(p2.age + "," + p2.name);
    }
}

class Person {
    String name;
    int age;
}

class Tools {
    public Person codePerson(Person p) {
        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;
        p2.name = "chen";
        return p2;
    }
}
