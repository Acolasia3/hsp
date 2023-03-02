package base.object.poly.demo;

public class Poly {
    public static void main(String[] args) {
        Master tom = new Master("tom");
        Dog dog = new Dog("旺财");
        Bone bone = new Bone("大棒骨");
        tom.feed(dog,bone);
        System.out.println("==========================");
        Cat cat = new Cat("小花猫");
        Fish fish = new Fish("黄花鱼");
        tom.feed(cat,fish);
        System.out.println("==========================");
        Pig pig = new Pig("小猪佩奇");
        Rice rice = new Rice("大米饭");
        tom.feed(pig,rice);
    }
}
