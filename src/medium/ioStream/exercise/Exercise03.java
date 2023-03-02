package medium.ioStream.exercise;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Exercise03 {
    public static void main(String[] args) throws IOException {
//        Properties properties = new Properties();
//        properties.load(new FileReader("src\\dog.properties"));
//        String name = properties.getProperty("name") + "";
//        int age = Integer.parseInt(properties.get("age") + "");
//        String color = properties.getProperty("color") + "";
//
//        Dog dog = new Dog(name, age, color);
//        System.out.println(dog);
//
//        String path = "e:\\qin.dat";
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
//        oos.writeObject(dog);
//        oos.close();
//        System.out.println("序列化成功");
//    }
//
//    @Test
//    public void m1() throws IOException, ClassNotFoundException {
//        String path = "e:\\qin.dat";
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
//        Dog dog = (Dog) ois.readObject();
//        System.out.println(dog);
//        ois.close();
//        System.out.println("反序列化成功");
//    }

        Properties properties = new Properties();
        properties.load(new FileReader("src\\dog.properties"));
        String name = properties.getProperty("name")+"";
        int age = Integer.parseInt(properties.get("age")+"");
        String color = properties.getProperty("color")+"";
        Dog dog = new Dog(name, age, color);
        System.out.println(dog);

        String path = "e:\\tao.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(dog);
        oos.close();

    }
    @Test
    public void m1() throws IOException, ClassNotFoundException {
        String path = "e:\\tao.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        Dog dog= (Dog)ois.readObject();
        ois.close();
        System.out.println("反序列化成功");
        System.out.println(dog);
    }
}

class Dog implements Serializable {
    String name;
    int age;
    String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
