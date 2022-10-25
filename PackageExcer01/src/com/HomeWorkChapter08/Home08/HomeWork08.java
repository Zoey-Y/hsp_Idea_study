package com.HomeWorkChapter08.Home08;

public class HomeWork08 {
    public static void main(String[] args){
//        CheckingAccount checkingAccount = new CheckingAccount(1000);//假设原本有1000块余额
//        checkingAccount.deposit(10);//存储10块钱，1块钱手续费 1000+(10-1)= 1009
//        checkingAccount.withdraw(9);//取款9块钱，1块手续费 1009 - (9+1) = 999
//        System.out.println("余额为:"+checkingAccount.getBalance());

        //月初，计时器自动调用earnMonthlyInterest()
        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);//1300
        System.out.println("余额为："+savingAccount.getBalance());
        savingAccount.deposit(100);//1399
        System.out.println("算手续费后的余额："+savingAccount.getBalance());
        //余额初的重置和利息的结算
        savingAccount.earnMonthlyInterest();
        savingAccount.deposit(100);
        System.out.println("新的月份存款后的余额："+savingAccount.getBalance());//1399+100=1499 + (1499*0.01)
    }
}
