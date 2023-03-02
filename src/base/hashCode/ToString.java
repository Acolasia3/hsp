package base.hashCode;

public class ToString {
    public static void main(String[] args) {
        /*
        Object的toString()源码
        1.getClass().getName()是类的全类名
        2.Integer.toHexString(hashCode()) 将对象的hashCode值转成16进制字符串
        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
        */

        Person person = new Person("tao",18);
                            //十六进制的hashcode         十进制的hashcode
        System.out.println(person.toString() + "   hashCode=" + person.hashCode());
        System.out.println("==当直接输出一个对象时，toString方法会被默认的调用==");
        System.out.println(person);
        System.out.println("类名：" + Person.class.getName());
    }


}

class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
