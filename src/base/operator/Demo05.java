package base.operator;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        //Scanner类 表示 简单文本扫描器，在java.util包
        //1.导入Scanner类所在包
        //2.创建Scanner 对象，new一个对象
        //myScanner就是Scanner类的对象
        Scanner myScanner = new Scanner(System.in);
        //3.接收用户输入，使用相关的方法
        System.out.println("请输入名字");
        String name = myScanner.next();
        System.out.println("请输入年龄");
        int age = myScanner.nextInt();
        System.out.println("名字=" + name + " 年龄=" + age);

    }
}
