package primary.string_.exercise;

import java.util.Scanner;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("请输入用户名");
            String name = scanner.next();
            name(name);

            System.out.println("请输入密码");
            String pwd = scanner.next();
            pwd(pwd);

            System.out.println("请输入邮箱号");
            String email = scanner.next();
            email(email);
            user(name, pwd, email);
            System.out.println("恭喜你注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void name (String name){
        if (name == null) {
            throw new RuntimeException("参数不能为空");
        }
    }

    static void pwd (String pwd){
        if (!(pwd != null)) {
            throw new RuntimeException("参数不能为空");
        }
    }

    static void email (String email){
        if (!(email != null)) {
            throw new RuntimeException("参数不能为空");
        }
    }
    public static void user(String name, String pwd, String email) {
        if (!(name != null && pwd != null && email != null)) {
            throw new RuntimeException("参数不能为空");
        }

        int userLength = name.length();
        if (!(userLength >= 2 && userLength <= 4)) {
            throw new RuntimeException("账户长度应在2-4之间");
        }
        if (!(pwd.length() == 6 && isDigital(pwd))) {
            throw new RuntimeException("密码长度为6，应全为数字");
        }
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("没有@或.或者@在.后面");
        }
    }

    public static boolean isDigital(String str) {
        //转为字符数组
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}