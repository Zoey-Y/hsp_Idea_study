package com.HouseRent;

import com.HouseRent.HouseView.HouseView;
import com.HouseRent.domain.House;

public class HouseRentApp {
    public static void main(String[] args) {
        /*创建HouseView对象,并显示主菜单，是整个程序的入口*/
        new HouseView().mainMenu();
        System.out.println("已退出系统--");
    }
}
