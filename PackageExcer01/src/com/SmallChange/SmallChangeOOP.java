package com.SmallChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeOOP {
    //零钱通属性
    //1.一般菜单至少执行一次
    boolean loop = true;
    String choice;//选择数字的按钮
    Scanner input = new Scanner(System.in);
    //2.完成零钱通明细  2.1 可以把 收益入账 和 消费 保存到数组  2.2 可以使用对象  2.3 简单的话就用String拼接
    String Details = "-------------零钱通明细-------------";
    //3.完成收益入账,完成功能 驱动程序员增加新的功能
    double money = 0;
    double balance = 0;//余额
    Date date = null;//date是java.util.Date 类型，表示日期
    //用于日期格式化的对象,pattern(模板)为啥这样定义以后说窝~
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm");
    //4.消费
    //定义新变量，保存消费原因
    String note;
    //5.推出功能能
    String choice2;
    //零钱通显示菜单
    public void mainMenu(){
        do {
            System.out.println("-------------零钱通菜单(OOP)-------------");
            System.out.println("\t\t\t 1 零钱通明细");
            System.out.println("\t\t\t 2 收益入账");
            System.out.println("\t\t\t 3 消费");
            System.out.println("\t\t\t 4 退   出");
            System.out.println("请选择1 ~ 4");
            choice = input.next();
            //使用switch分支分别对choice进行判断 和 执行不同情况的功能
            switch(choice){
                case "1":
                    this.detail();
                    break;
                case "2":
                   this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("输入错误...");
                    break;
            }
        }while (loop);
        System.out.println("程序结束.....");
    }
    //零钱通明细
    public void detail(){
        System.out.println(Details);
    }
    //零钱通收益入账
    public void income(){
        System.out.print("输入收益入账金额");
        money = input.nextDouble();//输入入账的钱数
        //money校验---等等写
        //找出不正确的金额条件,然后给出提示，在方法中直接return，表示退出方法
        // break是用于switch，for中的，不能用在方法中

        if(money <= 0){//这里找出不正确的条件，相当于设置关卡
            System.out.println("收益入账金额不能小于等于0");
            return;
        }
        balance += money;
        //获取date值
        date = new Date();
        //将入账的结果 拼接到 零钱明细表单中
        Details += "\n收益入账：+" + money + "\t" +sdf.format(date) + "\t" + balance;
    }
    //零钱通消费
    public void pay(){
        System.out.print("消费金额");
        money = input.nextDouble();
        //money值的范围校验
        if(money <= 0 || money > balance){
            System.out.println("消费金额不能小于等于0，并且余额要足够花销哦");
            return;//在方法中用return表示退出方法
        }

        balance -= money;
        System.out.print("消费的说明");
        note = input.next();
        date = new Date();//获取时间
        Details += "\n " + note  + "：-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }
    //退出功能
    public void exit(){
        //用户输入4退出时,给出提示"你确定要退出吗？y/n"，必须输入正确的y/n
        //否则循环 提示 和 输入指令
        /*思路：
         *   1. 输入4之后,必定先执行一次 提示 和 输入指令
         *   2. 若输入的是在y/n之外的指令就会进入循环
         *   3. 但是老韩建议一段代码实现一个功能，这样后面好修改
         * */
                    /*这样写固然正确,但是功能杂糅在一起
                        杂糅的东西：
                            (循环提示和输入指令功能) 与 (确定y/n之后的跳出功能) 杂糅在了一起
                    do {
                        System.out.println("你确定要退出吗？y/n");
                        choice2 = input.next();
                        if(choice2.equals("y")){
                            loop = false;
                            break;
                        }else if(choice2.equals("n")){
                              loop = true;
                            break;
                        }
                    }while(true);
                    break;
                    */
        //模块1：先写选择y/n之外的话，循环提示和输入指令功能
        while (true){
            System.out.println("你确定要退出吗？y/n");
            choice2 = input.next();
            if(choice2.equals("y") || choice2.equals("n")){
                break;//选的是y/n则跳出 "循环提示和输入指令功能"
            }
        }
        //模块2：跳出之后，则得判断输入的是y还是n
        if(choice2.equals("y")){
            loop = false;
        }
    }
}


