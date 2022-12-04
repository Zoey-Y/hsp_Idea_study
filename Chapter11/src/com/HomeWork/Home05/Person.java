package com.HomeWork.Home05;

public class Person {
    private String name;
    //声明一下交通工具的接口
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    /*要求一般情况下用Horse作为交通工具,大河时使用Boat作为交通工具*/
    //编程思想:可以把具体要求封装成具体方法
    public void common(){
        //到工厂里拿一辆马车(由于方法已经static所以给可以直接用)
        //若本来准备的(传的接口对象)不是马车,则进入循环,到工厂了拿
        if (!(vehicles instanceof Horse)){
            /*若没有交通工具 或 交通工具不是马车
                     ---->
            vehicles == null or  vehicles != Horse
            则进入循环将交通工具(vehicles)赋值成马车(Horse)*/
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();
    }
    public void passRiver(){
        //到工厂里拿一艘船(由于方法已经static所以给可以直接用)
        if (!(vehicles instanceof Boat)){
            //同理:
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }

    public void passFireMountain(){
        if (!(vehicles instanceof Plane)){
            vehicles = VehiclesFactory.getPlane();
        }
        vehicles.work();
    }
}
