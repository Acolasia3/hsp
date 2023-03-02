package primary.object.single;

public class SingleTon01 {
    public static void main(String[] args) {
//        GirlFriend gf1 = new GirlFriend("小红");
//        GirlFriend gf2 = new GirlFriend("小白");

        //通过方法可以获取对象
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);

        GirlFriend instance2 = GirlFriend.getInstance();
        System.out.println(instance2);
    }
}

class GirlFriend{
    private String name;
    //类一旦加载对象就已经创建
    //在重量级项目中，这饿汉式将会造成资源的浪费

    //步骤【单例模式-饿汉式】
    //1.将构造器私有化
    //2.在类的内部直接创建对象
    //3.提供一个公共的static方法，返回gf对象
    private GirlFriend(String name){
        this.name =name;
    }
    private static GirlFriend gf = new GirlFriend("小红红");//为了方法可以直接调用所以写成static
    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
