package primary.exception_;

import java.util.Scanner;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Execrise {
    //练习：输入一个值，如果是整数执行，否则一直循环
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个值");
        int num = 0;
        String str = "";
        while(true){
            str = scanner.next();
            try {
                num = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入错误，请重新输入");
            }
        }
        System.out.println("值为"+num);
    }
}
