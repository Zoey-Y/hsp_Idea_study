package com.HomeWork.Home07;

public class Home07 {
    public static void main(String[] args) {
        //枚举值的switch使用
        Color black = Color.BLACK;
        black.show();//显示black有哪些参数
        /*switch()参数必须是:
        (byte,short,int,char,enum,String)*/
        switch (black){
            case BLACK:
                System.out.println("匹配到黑色");
                break;
            case RED:
                System.out.println("匹配到红色");
                break;
            case BLUE:
                System.out.println("匹配到蓝色");
                break;
            case GREEN:
                System.out.println("匹配到绿色");
                break;
            case YELLOW:
                System.out.println("匹配到黄色");
                break;
            default:
                System.out.println("匹配不到任何颜色");
                break;
        }
    }
}
