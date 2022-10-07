package com.SmallChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//化繁为简，先死后活
/*菜单运行结果：
 * -------------零钱通菜单-------------
 *           1 零钱通明细
 *           2 收益入账
 *           3 消费
 *           4 退   出
 * 请选择(1 - 4)：
 * -------------零钱通明细-------------
 * 收益入账：+100.0 2021-01-21  17:41  余额：100.0
 * 收益入账：+500.0 2021-01-21  17:41  余额：600.0
 * 真功夫：  -20.0  2021-01-21  17:41  余额：500.0
 * */
/* 1.先完成显示菜单,并可以选择菜单，给出对应显示
 * 2.完成零钱通明细----->简单的话就用String拼接
 * 3.完成收益入账
 * 4.完成消费
 * 5.退出
 * 零钱通改进：
 *      1.在收益入账 和 消费时，判断金额是否合理，并给出相应的提示
 *      2.将面向向的过程的代码修改成面向对象的方法，
 *      编写SmallChangeSysOOP.java类，并使用SmallChangeSysApp.java完成测试
 * */
public class SmallChangeReviewOOP {
    //属性
    public boolean loop = true;//判断是否循环的变量，要退出的话就改
    Scanner input = new Scanner(System.in);
    //选择菜单功能的变量
    public int num;

    //1.菜单明细模块：涵盖菜单明细内容，方便后来的内容拼接
    public String Details = "菜单明细";

    //2.收益入账模块 和 3.消费模块用到：收益 和 消费 金额： 用money变量
    public double money;

    //2.收益入账模块 和 3.消费模块用到：定义date方法要调用java.util.Date包,以后学
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm");//格式化日期
    //2.收益入账模块 和 3.消费模块用到：余额变量
    public double balance;
    //3.消费模块用到：支付记录变量
    public String note;

    //4.退出模块:用choice变量来 选择y/n
    public String choice;
    //显示菜单 和 菜单的操作功能
    public void Menu(){
        //制作菜单
        do{
            System.out.println("------------------零钱通菜单(OOP)--------------------");
            System.out.println(" 1.显示菜单明细");
            System.out.println(" 2.收益入账操作");
            System.out.println(" 3.消费操作记录");
            System.out.println(" 4.退  出");
            System.out.println("请输入你的选择 1~4：");
            num = input.nextInt();
            //判断你输入了什么
            switch(num) {
                case 1://菜单明细
                    this.Detail();
                    break;
                case 2://收益入账
                    this.income();
                    break;
                case 3://消费操作记录
                    this.pay();
                    break;
                case 4://退  出
                    this.exit();
                    break;
            }
        }while (loop);
        System.out.println("程序结束...");
    }
    //菜单明细
    public void Detail(){
        System.out.println(Details);
    }
    //2.收益入账
    public void income(){
        System.out.println("输入你入账的金额");
        money = input.nextDouble();
        //判断收益金额合理性
        if(money <= 0){
            System.out.println("收益金额不能小于等于0");
            return;//方法内return的作用是退出
        }
        date = new Date();//获取日期
        balance += money;
        Details += "\n收益入账：" + money + "\t" + sdf.format(date) + "\t" + balance;
    }
    //消费
    public void pay(){
        System.out.println("输入你花费的金额");
        money = input.nextInt();
        //判断消费金额合理性
        if(money <= 0 || money > balance){//直接判断不正确的情况比较直接
            System.out.println("输入的支出金额不能小于等于0,而且支出的的金额不能大于余额");
            return;//退出方法
        }
        //支付的原因
        System.out.println("支付记录");
        note = input.next();
        date = new Date();//获取日期
        balance -= money;
        Details += "\n消费金额：" + money + "\t" + sdf.format(date) + "\t" + balance;
    }
    //退出
    public void exit(){
        while (true){
            System.out.println("是否确认退出 y/n");
            choice = input.next();
            if (choice.equals("y") || choice.equals("n")){
                break;
            }
        }
        if (choice.equals("y")){
            loop = false;
        }
    }
}
