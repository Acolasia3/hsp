package base.object.encap;

public class Encapsulation02 {
    public static void main(String[] args) {
        //练习
        Account account = new Account();
        account.setName("h");
        account.setBalance(10);
        account.setPwd("1234567");
        account.setName("tao");
        account.showInfo();
        System.out.println("=========直接调用和构造器调用=========");
        Account hsp = new Account("hsp", 10000, "123456");
        hsp.showInfo();
    }
}

class Account {
    private String name;
    private double balance;
    private String pwd;

    public Account() {

    }

    public Account(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字长度不对,应该在(2-6)字符,默认名字");
            this.name = "无名人";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("默认月薪过万");
            this.balance = 10000;
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("密码输入错误,请重新输入");
            this.pwd = "000000";
        }
    }

    public void showInfo() {
        System.out.println("账户:" + name + " 余额:" + balance + " 密码:" + pwd);
    }
}
