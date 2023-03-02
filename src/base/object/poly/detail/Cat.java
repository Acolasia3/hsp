package base.object.poly.detail;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouth(){
        System.out.println("猫抓老鼠");
    }
}
