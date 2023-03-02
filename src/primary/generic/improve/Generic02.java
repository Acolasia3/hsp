package primary.generic.improve;

import java.util.ArrayList;

public class Generic02 {
    public static void main(String[] args) {
        //使用泛型
        //1.当我们使用ArrayList<Dog>时，表示存放到ArrayList的元素集合是Dog类型
        //2.如果编译器发现添加的类型，不满足需求就报错
        //3.在遍历是，可以直接去Dog类型
            ArrayList<Dog> arrayList = new ArrayList<Dog>();
            arrayList.add(new Dog("旺财", 10));
            arrayList.add(new Dog("发财", 1));
            arrayList.add(new Dog("小黄", 5));

            //假如我们的程序员，不小心，添加了一只猫
//            arrayList.add(new Cat("招财猫", 8));不是Dog类型会报错

            //遍历
            for (Dog dog : arrayList) {
                System.out.println(dog.getName() + ":" + dog.getAge());
            }
        }
    }

    /*
    请编写程序，在ArrayList 中，添加3个Dog对象
    Dog对象含有name 和 age, 并输出name 和 age (要求使用getXxx())
     */
    class Dog {
        private String name;
        private int age;

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
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
    }

    class Cat { //Cat类
        private String name;
        private int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
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

}
