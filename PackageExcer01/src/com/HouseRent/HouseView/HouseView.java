package com.HouseRent.HouseView;

import com.HouseRent.HouseService.HouseService;
import com.HouseRent.Utils.Utility;
import com.HouseRent.domain.House;

/*
 * 1.显示界面
 * 2.接收用户输入
 * 3.调用HouseService完成房屋信息的各种操作*/
public class HouseView {
    private boolean loop = true;//控制显示菜单
    private char key = ' ';//接收用户选择


    //初始化HouseService对象
    private HouseService houseService = new HouseService(10);//设置数组大小为10
    /* 编写房屋列表界面：listHouses()*/
    public void listHouses() {
        System.out.println("========房屋列表=======");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        //获取service数据,用House数组类型接收
        House[] houses = houseService.list();//得到所有房屋信息
        //遍历数据
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {//数组对象未填写的部分系统会默认为null
                return;//遇到null直接退出方法,方法里的return是直接推出方法
            }
            System.out.println(houses[i]);
        }
        System.out.println("~~~~~~~~房屋列表已到底~~~~~~~~");
    }

    /*编写添加房屋界面：addHouse() 接收输入，创建House对象，调用add方法*/
    public void addHouse() {
        System.out.println("========添加房屋=======");
        System.out.print("姓名：");
        String name = Utility.readString(5);
        System.out.println("电话：");
        String phone = Utility.readString(12);
        System.out.println("地址");
        String address = Utility.readString(16);
        System.out.println("月租：");
        int rent = Utility.readInt();
        System.out.println("状态：");
        String state = Utility.readString(3);
        //创建一个House对象,id是系统分配的用户不能输入，id按照自增长
        House newHouse = new House(0, name, phone, address, rent, state);//调用各项信息
        if(houseService.add(newHouse)){//把新的信息以house对象的方式传给add,返回的是boolean
            //界面层我们需要反馈是否添加数据到数组成功
            System.out.println("数据添加成功！");
        }else{
            System.out.println("数据添加失败~");
        }
    }

    /*编写删除界面：delHouse(),接收用户的id*/
    public void delHouse(){
        System.out.println("=======删除房屋信息=======");
        System.out.println("请选择待删除的房屋编号(-1为退出):");
        int delId = Utility.readInt();//接收输入的id
        if(delId == -1){
            System.out.println("已放弃删除房屋信息");
            return;//return退出方法
        }
        //这一段本身就含有System.out.println("确认是否删除(Y/N)"); 和循环判断的逻辑(必须输入Y/N)
        char choice = Utility.readConfirmSelection();
        if(choice == 'Y'){//确认删除房屋信息
            //调用删除房屋信息的操作方法
            if(houseService.del(delId)){
                System.out.println("删除房屋信息成功");
            }else{
                System.out.println("房屋编号不存在删除失败");
            }
        }else{
            System.out.println("已放弃删除房屋信息");
        }

    }

    /*编写退出界面：exit(),目标是退出是弹出是否确定退出提示*/
    public void exit(){
        System.out.println("是否真的退出：");
        char choice =  Utility.readConfirmSelection();
        if(choice == 'Y'){
            loop = false;
        }
    }
    /*编写房屋信息查找界面：searchHouse()*/
    public void searchHouse(){
        System.out.println("=======查找房屋信息=======");
        System.out.println("请输入你要查找的id");
        int seachId = Utility.readInt();//接收用户想要寻找的Id
        House house = houseService.searchId(seachId);
        if(house != null){
            System.out.println(house);
        }else{
            System.out.println("查找的id不存在");
        }

    }

    /*编写修改房屋信息界面：updateHouse()*/
    public void updateHouse(){
        System.out.println("======修改房屋信息=====");
        System.out.print("请选择待修改房屋的id：(-1表示退出)");
        int updateId = Utility.readInt();
        //若就受到的updateId为-1
        if (updateId == -1){
            System.out.println("已放弃修改房屋信息");
            return;
        }
        //根据输入的updateId 查找对象
        House house = houseService.searchId(updateId);//注意:返回的是来自service层中对象数组houses的数据
        if (house == null){
            System.out.println("修改的房屋信息编号不存在，退出");
            return;
        }
        System.out.println("姓名（"+house.getName()+"):");//获取原来的名字
        String name =Utility.readString(8,"");//如果用户直接回车表示不修改,默认为""
        if (!"".equals(name)){//若用户输入的不为回车，默认""
            house.setName(name);
        }

        System.out.println("电话("+house.getPhone()+"):");
        String phone = Utility.readString(12,"");
        if (!"".equals(phone)){
            house.setPhone(phone);
        }

        System.out.println("地址("+house.getAddress()+")");
        String address = Utility.readString(18,"");
        if (!"".equals(address)){
            house.setPhone(address);
        }

        System.out.println("租金("+house.getRent()+"):");
        //默认rent为-1
        int rent = Utility.readInt(-1);
        if (rent != -1){
            house.setRent(rent);
        }

        System.out.println("状态("+house.getState()+"):");
        String state = Utility.readString(3,"");
        if (!"".equals(state)){
            house.setState(state);
        }
        System.out.println("修改房屋信息完成");
    }


    //显示主菜单界面
    public void mainMenu() {
        do {
            System.out.println("========房屋出租系统菜单=======");
            System.out.println("\t\t\t1.新增房源");
            System.out.println("\t\t\t2.查找房屋");
            System.out.println("\t\t\t3.删除房屋信息");
            System.out.println("\t\t\t4.修改房屋信息");
            System.out.println("\t\t\t5.打开房屋列表");//显示房屋列表
            System.out.println("\t\t\t6.退    出");
            System.out.println("请输入你的选择1~6");
            key = Utility.readChar();//利用工具包读取字符
            switch (key) {
                case '1':
                    addHouse() ;
                    break;
                case '2':
                    searchHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouses();//直接调用当前类的方法
                    break;
                case '6':
                    exit();
                    break;
            }
        } while (loop);
    }
}
