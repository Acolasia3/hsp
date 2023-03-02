package base.objectExercise.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//该类是完成零钱通的各个功能的类
//使用OOP(面向对象编程)
//将各个功能对应一个方法
public class SmallChangeSysOOP {
    //属性
    String key = "";
    boolean loop = true;
    double money = 0;
    double balance = 0;
    String note = "";
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//修改日期格式
    Scanner scanner = new Scanner(System.in);//调入scanner包
    String detail = "---------------零钱通明细-----------------";

    //先完成显示菜单,并可以选择
    public void mainMenu() {
        do {
            System.out.println("\n\n===========零钱通菜单(OOP)==========");
            System.out.println("\t\t\t1.零钱通明细");
            System.out.println("\t\t\t2.收益入账");
            System.out.println("\t\t\t3.消费");
            System.out.println("\t\t\t4.退     出");
            System.out.println("请选择1-4");
            key = scanner.next();//接受参数
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
            }
        } while (loop);
        System.out.println("退出了零钱通");
    }

    public void detail() {
        System.out.println(detail);
    }

    public void income() {
        System.out.print("收益入账金额:");
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("你的收益应该大于0");
            return;//退出方法,不在执行后面的代码
        }
        balance += money;
        date = new Date();
        detail += "\n收益入账  " + "+" + money + "\t" + sdf.format(date) + "\t余额:" + balance;
        System.out.println(detail);
    }

    public void pay() {
        System.out.println("消费金额:");
        money = scanner.nextDouble();
        if (money <= 0 || money >= balance) {
            System.out.println("输入消费金额有误");
            return;
        }
        System.out.println("消费说明:");
        note = scanner.next();
        balance -= money;
        date = new Date();
        detail += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t余额:" + balance;
        System.out.println(detail);

    }

    public void exit() {
        String choice = "";
        while (true) {
            System.out.println("你确定退出吗,请输入y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
            System.out.println("输入退出密码错误，只能输出y/n");
        }
        if ("y".equals(choice)) {
            loop = false; //强制退出
        }
    }
}

