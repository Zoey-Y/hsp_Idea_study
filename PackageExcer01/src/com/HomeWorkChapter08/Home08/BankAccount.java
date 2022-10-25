package com.HomeWorkChapter08.Home08;
/*要求：
*   1.在上面类的基础上扩展 新类CheckingAccount
*   对每次存款和取款都收取1美元的手续费
*   2.扩展前一个练习的BankAccount类，新类SavingAccount
*   每个月都会有利息产生(earnMonthlyInterest方法被调用)
*   并且有每月三次免手续费的存款或取款，
*   在earnMonthlyInterest方法中重置交易计数*/
public class BankAccount {//父类
    private double balance;//零钱
    public  BankAccount(double initialBalance){//原来零钱的余额
        this.balance = initialBalance;
    }
    //存款
    public  void deposit(double amount){
        balance += amount;
    }
    //取款
    public void withdraw(double amount){
        balance -= amount;
    }

    public double getBalance() {//get方法来查看
        return balance;
    }

    public void setBalance(double balance) {//可以调用set方法修改
        this.balance = balance;
    }
}

