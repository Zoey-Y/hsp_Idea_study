package com.HomeWork.Home01;
/*编程题:
 * 1.编写应用程序EcmDef.java,接收命令行的两个参数(整数),计算两数相除
 * 2.计算两个数相除,要求使用方法cal(int n1,int n2)
 * 3.对数据格式不正确(NumberFormatException),
 *   缺少命令行参数(ArrayIndexOutOfBoundsException),
 *   除0进行异常处理(ArithmeticException)*/
public class HomeWork01 {
    public static void main(String[] args) {
        try {
            //先验证输入的参数个数是否为俩(ArrayIndexOutOfBoundsException)
            if (args.length != 2){
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            //先把接收的参数,转化成整数(NumberFormatException)
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            double res = cal(n1,n2);//该方法可能抛出(ArithmeticException)
            System.out.println("计算结果:" + res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("参数格式不正确,需要输入整数数..");
        } catch (ArithmeticException e){
            System.out.println("出现除0异常..");
        }

    }
    /*2.计算俩数相除*/
    public static double cal(int n1,int n2){
        return n1 / n2;//可能报错(ArithmeticException)
    }
}
