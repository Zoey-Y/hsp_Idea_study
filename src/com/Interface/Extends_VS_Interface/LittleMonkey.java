package com.Interface.Extends_VS_Interface;

public class LittleMonkey extends Monkey implements Fish{//小猴子继承了老猴子,虽然继承不了鱼的游泳技能但是跟鱼学游泳的技能
    public LittleMonkey(String name){//重写父类构造器
        super(name);
    }
    public void Swimming(){
        System.out.println(getName()+"跟鱼学会了游泳");
    }
}
