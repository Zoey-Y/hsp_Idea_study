package com.stuHsp.encap;

/*1.创建程序,在其中定义两个类：Account 和 AccountTest类体会Java的封装
 * 2.Account具有属性:姓名(2~4位)、余额(必须 > 20)、密码(必须是6位),
 * 如果不满足,则给出提示信息,并给出默认值(程序员字节觉定)
 * 3.通过setXxx的方法给Account 的属性赋值
 * 4.在AccountTest中测试          */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Laasadasd");
        System.out.println("姓名: " + account.getName());
        account.setPassword("1234561");
        System.out.println("密码: " + account.getPassword());
        account.setYuE(21);
        System.out.println("余额: " + account.getYuE());

        //汇总信息:
        System.out.println("汇总信息: ");
        System.out.println(account.info());
    }
}

class Account {
    private String name;
    private double YuE;
    private String password;

    public String getName() {
        return name;
    }

    //姓名(2~4位)
    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("姓名的输入有误,给予你的默认名为: ");
            this.name = "默认名儿";
        }

    }

    public double getYuE() {
        return YuE;
    }

    //余额(必须 > 20)
    public void setYuE(double yuE) {
        if (yuE > 20) {
            YuE = yuE;
        } else {
            System.out.println("余额不得小于20，为你设置默认余额为: ");
            this.YuE = 20;
        }

    }

    public String getPassword() {
        return password;
    }

    //密码(必须是6位)
    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("密码虚为六位数,为你提供默认密码为: ");
            this.password = "123456";
        }

    }

    public String info() {
        return "姓名: " + this.name + " 密码: " + this.password + " 余额: " + this.YuE;
    }
}
