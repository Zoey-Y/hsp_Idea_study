package com.HomeWorkChapter08.Home09;
/*设计一个Point类,其x,y坐标可以通过构造器提供.
 * 提供一个子类LabeledPoint,其构造器接受一个标签值y,x坐标
 * 比如: new LabeledPoint("Black",1929,230.07),
 * 写出对应的构造器即可.*/
public class HomeWork09 {
    public static void main(String[] args){
        LabeledPoint labeledPoint = new LabeledPoint("Black",1929,230.07);
        System.out.println("构造器的名字和坐标："+"\""+labeledPoint.getName()+"\""+
                ","+labeledPoint.getX()+","+labeledPoint.getY());
    }
}
