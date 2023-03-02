package primary.object.enum_anno.Exercise;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Exercise03 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.shout();
        Animal dog1 = new Dog();//编译类型为父类
        dog1.shout();
    }
}
abstract class Animal{
     abstract void shout();
}
class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("小狗汪汪叫");
    }
}