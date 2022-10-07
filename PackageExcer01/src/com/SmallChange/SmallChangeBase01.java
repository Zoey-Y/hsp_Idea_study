package com.SmallChange;
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
/*1.先完成显示菜单,并可以选择菜单，给出对应显示
 * 2.完成零钱通明细
 *       2.1 可以把 收益入账 和 消费 保存到数组
 *       2.2 可以使用对象
 *       2.3 简单的话就用String拼接
 * 3.完成收益入账
 * 4.完成消费
 *弊端：此书写方式将功能都封装到一个方法内，以后迭代指能在这个方法内的某一些功能进行迭代，而且要一个个找非常麻烦
 *      所以用oop的方法能够很好的解决这一问题，并且只要调用方法 或者 类就可以让别人使用、修改、迭代该项目的某一些功能
 * 零钱通改进：
 *      1.在收益入账 和 消费时，判断金额是否合理，并给出相应的提示
 *      2.将面向向的过程的代码修改成面向对象的方法，
 *      编写SmallChangeSysOOP.java类，并使用SmallChangeSysApp.java完成测试
 * */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeBase01 {

    public static void main(String[] args){
        //1.是否显示菜单
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
        do {
            System.out.println("-------------零钱通菜单-------------");
            System.out.println("\t\t\t 1 零钱通明细");
            System.out.println("\t\t\t 2 收益入账");
            System.out.println("\t\t\t 3 消费");
            System.out.println("\t\t\t 4 退   出");
            System.out.println("请选择1 ~ 4");
             choice = input.next();
            //使用swith分支分别对choice进行判断 和 执行不同情况的功能
            switch(choice){
                case "1":
                    System.out.println(Details);
                    break;
                case "2":
                    System.out.print("输入收益入账金额");
                    money = input.nextDouble();//输入入账的钱数
                    //money校验---等等写
                        //找出不正确的金额条件,然后给出提示，直接break
                    if(money <= 0){//这里找出不正确的条件，相当于设置关卡
                        System.out.println("收益入账金额不能小于等于0");
                        break;
                    }
                    balance += money;
                    //获取date值
                    date = new Date();
                    //将入账的结果 拼接到 零钱明细表单中
                    Details += "\n收益入账：+" + money + "\t" +sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.print("消费金额");
                    money = input.nextDouble();
                    //money值的范围校验
                    if(money <= 0 || money > balance){
                        System.out.println("消费金额不能小于等于0，并且余额要足够花销哦");
                        break;
                    }
                    
                    balance -= money;
                    System.out.print("消费的说明");
                    note = input.next();
                    date = new Date();//获取时间
                    Details += "\n " + note  + "：-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
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
                        break;


                default:
                    System.out.println("输入错误...");
                    break;
            }
        }while (loop);
        System.out.println("程序结束.....");
    }
}
