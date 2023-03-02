package primary.object.static_;

public class ChildGame {
    public static void main(String[] args) {
//        int count = 0;
        Child c1 = new Child("小明");
        c1.join();
        c1.count++;
        Child c2 = new Child("小红");
        c2.join();
        c2.count++;
        Child c3 = new Child("小强");
        c3.join();
        c3.count++;

        //类变量可以通过类名来访问
        System.out.println("总共有 " + Child.count + " 个小孩加入游戏");
    }
}

class Child {
    private String name;

    //定义一个类变量(静态变量)static静态
    //该变量最大特点就是会被Child类的所有的对象实例共享
    public static int count;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + " 加入了游戏");
    }
}