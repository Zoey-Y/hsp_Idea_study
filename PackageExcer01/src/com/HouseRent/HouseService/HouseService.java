package com.HouseRent.HouseService;

import com.HouseRent.domain.House;

/*HouseService.java [业务层]
//定义一个House[] 保存House对象
1.响应HouseView的调用
2.完成对房屋信息的具体操作(即增删改查;crud)*/
public class HouseService {
    private House[] houses;//声明House[]数组用于存放House对象

    private int houseNums = 1;//记录当前有多少个房屋信息，默认为1是因为已经初始化了一条房屋列表信息作为测试信息了
    private int idCounter = 1;//记录当前的id增长到哪个值了
    //构造器
    public HouseService(int size) {//数组长度HouseService传过来
        //new houses
        houses = new House[size];//当创建HouseService对象,指定数组大小
        //测试列表信息，在此创建一个House对象
        houses[0]= new House(1,"jack","112","南山区",2000,"未出租");
    }
    //返回houses数组
    public House[] list(){
        return houses;
    }

    //add方法，添加新对象,返回boolean
    public boolean add(House newHouse){//传House对象进来
        //判断是否可以继续添加(考虑了扩容问题)
        if(houseNums >= houses.length){
            House[] housesNew = new House[this.houses.length + 1];//若数组已满,则创建一个扩容数组
            housesNew[houseNums++] = newHouse;//把新数据放入扩容后的数组最后
            houses = housesNew;//再将新数组付给旧数组，旧的数组就会被销毁
            return true;
        }
        //将新数据存在数组中houseNums在此刚好为可存储空间的对应下表，存完再++，代表新增了一个房屋信息
        houses[houseNums++] = newHouse;
        //程序员需要设计一个id自增长
        newHouse.setId(++idCounter);//newHouse是新传进来的对象setId设置新的id
        return true;
    }

    //创建del()删除房屋id,所以要接收来自view层用户输入的delid
    public boolean del(int delId){
        //应当先找到要删除房屋信息的下标
        //注意：一定要搞清楚下表 和 房屋的编号不是一回事
        int index = -1;
        for (int i = 0; i < houseNums; i++){
            //要删除的房屋id == 数组下标为i的房屋id
            if (delId == houses[i].getId()){
                index = i;//此为真正要删除的下标，记录在index中(找到了删除目标index才会从-1变为i)
            }
        }
        //找完之后再判断index是否为-1
        if(index == -1){//若没有找到对应id则index还是-1
            return false;
        }
        //如果找到怎么删除？
        for (int i = index; i < houseNums - 1; i++){//看图
            houses[i] = houses[i + 1];
        }
        houses[--houseNums] = null;//把当前存在的数组信息的最后一个置空，
        /*写法2：
        * houses[houseNums - 1] = null;
        * ---->houseNums房屋信息数量,减一就是当前存在的数组信息的最后一个信息，
        * 由于中间有信息被删除,后面的信息向前填补空位，那么最后一个信息的位置就得设置为空
        * houseNum--;--->由于信息总数减少了所以要--
        *  干脆直接写成houses[--houseNums] = null;一步到位,减少后的信息数量就是要置为空的下标*/
        return true;
    }

    /*查找用户想找的id，searchId(int seachId)*/
    public House searchId(int seachId){//需要判断数据中是否有这个id

      for (int i = 0; i < houseNums; i++){
          if (seachId == houses[i].getId()){//要找的id能找到
             return houses[i];
          }
      }
       return null;
    }

}
