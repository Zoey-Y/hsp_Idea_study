package com.HomeWorkChapter08.Home09;
/*提供一个子类LabeledPoint,其构造器接受一个标签值y,x坐标
 * 比如: new LabeledPoint("Black",1929,230.07)*/
public class LabeledPoint extends Point{
    private String name;
    public LabeledPoint(String name,int x, double y ) {
        super(x, y);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
