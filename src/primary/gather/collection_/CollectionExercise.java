package primary.gather.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class CollectionExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List obj = new ArrayList();

        obj.add(new Dog("jack", 18));
        obj.add(new Dog("tom", 20));
        obj.add(new Dog("smith", 22));
        System.out.println("====第一次遍历====");
        for (Object value :obj) {
            System.out.println("value="+value);
        }

        System.out.println("====第二次遍历====");
        Iterator iterator = obj.iterator();
        while(iterator.hasNext()){
            Object value = iterator.next();
            System.out.println("value="+value);
        }
    }
}

class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}