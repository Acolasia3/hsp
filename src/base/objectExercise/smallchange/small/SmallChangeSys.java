package base.objectExercise.smallchange.small;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    //零钱通
    public static void main(String[] args) {
//      String key ="";
        boolean loop = true;
        //收益情况
        double money = 0;
        double balance = 0;
        //消费
        String note = "";
        Date date = null;//date是java.util.Date类型，表示日期

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm");//修改日期格式
        Scanner scanner = new Scanner(System.in);//调入scanner包
        //运用字符串拼接
        String detail = "---------------零钱通明细-----------------";
        do {
            System.out.println("\n\n===========零钱通菜单==========");
            System.out.println("\t\t\t1.零钱通明细");
            System.out.println("\t\t\t2.收益入账");
            System.out.println("\t\t\t3.消费金额");
            System.out.println("\t\t\t4.退     出");
            System.out.println("请选择1-4");
            int key = scanner.nextInt();//接受参数

            switch (key) {
                case 1:
                    System.out.println(detail);
                    break;

                case 2:
                    System.out.print("收益入账金额:");
                    money = scanner.nextDouble();
                    if (money <= 0) {
                        System.out.println("你的收益应该大于0");
                        break;
                    }
                    balance += money;
                    date = new Date();//得到当前的时间
                    detail += "\n收益入账  " + "+" + money + "\t" + sdf.format(date) + "\t余额:" + balance;
                    System.out.println(detail);
                    break;

                case 3:
                    System.out.println("消费金额:");
                    money = scanner.nextDouble();

                    if (money <= 0 || money > balance) {
                        System.out.println("输入消费金额有误，请重新输入");
                        break;
                        
                    }
                    System.out.println("消费说明:");
                    note = scanner.next();
                    balance -= money;
                    date = new Date();
                    detail += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t余额:" + balance;
                    break;

                case 4:
                    String choice = "";
                    while (true) {
                        System.out.println("你确定退出吗,请输入y/n");
                        choice = scanner.next();
//                        if ("y".equals(choice)) {
//                            loop = false;
//                            break;
//                        } else if ("n".equals(choice)) {
//                            break;
//                        }
                        //第二个方法更好,便于管理、维护
                        //因为只能选择y/n
                        if ("y".equals(choice) || "n".equals(choice)) {//y跳出整个循环，n跳出当前循环
                            break;
                        }
                        System.out.println("输入退出密码错误，只能输出y/n");
                    }
                    if ("y".equals(choice)) {
                        loop = false; //强制退出
                    }
                    break;
            }
        } while (loop);
        System.out.println("退出了零钱通");
    }
}

