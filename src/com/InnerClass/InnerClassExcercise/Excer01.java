package com.InnerClass.InnerClassExcercise;
/*匿名内部类最佳使用场景
* 1.当作实参直接传递,简洁高效*/
public class Excer01 {
    public static void main(String[] args) {
        //若只使用一次这个类,可以使用匿名内部类的方法,直接把这个匿名内部类当作f1的实参
        f1(new IL(){
            @Override
            public void Draw() {
                System.out.println("照片中增添了一幅名画(以匿名内部类的方式呈现)");
            }
        });
        f1(new Pictrue());//硬编码,传的参数是IL的徒弟自然可以
    }
    public static void f1(IL il) {
        il.Draw();//需要调用师傅里面的方法,在主方法就不用new了
    }
}

//接口
interface IL{
    public void Draw();//默认是 public static void
}

//传统写法:实例化一个类--->再在主函数new (俗称硬编码)
class Pictrue implements IL {
    @Override
    public void Draw() {
        System.out.println("照片中增添了一幅名画");
    }
}

