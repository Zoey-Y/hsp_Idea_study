package com.HomeWorkChapter08.Home08;
 /*1.在上面类的基础上扩展 新类CheckingAccount
    对每次存款和取款都收取1美元的手续费*/
public class CheckingAccount extends BankAccount{
   double charge = 1;//手续费
   public CheckingAccount(double initialBalance) {//初始余额
     super(initialBalance);
    }
   //存款---------charge：1块钱手续费
    @Override
    public void deposit(double amount) {
     super.deposit(amount - charge);
    }
   //取款
    @Override
    public void withdraw(double amount ) {
     super.withdraw(amount + charge);//这里是取钱要取的不变要多取1块钱作为手续费
    }

   }
