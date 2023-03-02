package base.objectExercise.exercise;

public class Exercise05 {
    public static void main(String[] args) {
        //练习5.
        //方式一：收取1块钱手续费
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.deposit(10);//1010-1=1009
        checkingAccount.withdraw(9);//1009-9-1=999
        System.out.println(checkingAccount.getBalance());

        //方式二：前三次不收费，后面以收取1块钱手续费,月初将给予（余额*利率=利息）
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());//前三次不扣手续费
        savingsAccount.withdraw(100);
        System.out.println(savingsAccount.getBalance());

        savingsAccount.earnMonthlyInterest();//增加利息,重置免手续费为三次
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(100);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(100);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(100);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(100);
        System.out.println(savingsAccount.getBalance());
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

//检查帐户
class CheckingAccount extends BankAccount {
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    //存款
    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);
    }

    //取款
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
    }

}

//检查帐户2
class SavingsAccount extends BankAccount {
    private int count = 3;
    private double rate = 0.01;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    //每月前三次免存款或取款手续费
    @Override
    public void deposit(double amount) {
        if (count > 0) {
            super.deposit(amount);
            count--;
        } else {
            super.deposit(amount - 1);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            super.withdraw(amount);
            count--;
        } else {
            super.withdraw(amount + 1);
        }
    }

    //新月份刷新次数
    public void earnMonthlyInterest() {
        count = 3;
        super.deposit(getBalance() * rate);
    }
}