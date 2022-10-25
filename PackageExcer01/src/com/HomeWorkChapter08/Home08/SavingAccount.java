package com.HomeWorkChapter08.Home08;
/*2.扩展前一个练习的BankAccount类，新类SavingAccount
 *   每个月都会有利息产生(earnMonthlyInterest方法被调用)
 *   并且有每月三次免手续费的存款或取款，
 *   在earnMonthlyInterest方法中重置交易计数*/
public class SavingAccount extends BankAccount{
    private int count = 3;//免手续费的次数
    private double rate = 0.01;//利息
    private int charge = 1;//手续费
    public SavingAccount(double initialBalance){
        super(initialBalance);
    }
    //存款
    @Override
    public void deposit(double amount) {
       if (count > 0){
           super.deposit(amount);
       }else{
           super.deposit(amount - charge);
       }
        count--;
    }

    //取款
    @Override
    public void withdraw(double amount) {
        if(count > 3){
            super.withdraw(amount);
        }else{
            super.withdraw(amount + charge);
        }
        count--;
    }

    public void earnMonthlyInterest(){//(1)每个月免利息的次数重置为3，(2)统计上个月的利息
        count = 3;
        super.deposit(getBalance()*rate);//利息 = 余额 * 利率
    }
}
