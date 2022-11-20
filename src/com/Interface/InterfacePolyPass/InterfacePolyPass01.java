package com.Interface.InterfacePolyPass;
/*演示多接口态传递现象*/
public class InterfacePolyPass01 {
    public static void main(String[] args) {
        /*1.IG接口 可以指向 Teacher类
        * 因为teacher类实现了IG接口,
        * 他俩有师徒关系 */
        IG ig = new Teacher();
        /*2.IH 不可以指向 Teacher类,他俩没有师徒关系*/
       /* IH ih = new Teacher();//错误写法*/

        /*3.这是IG继承了IH 而Teacher实现了IG接口,
            实际上相当于Teacher也实现了IH这个接口*/
        //这就是多态传递现象
        IH ih = new Teacher();
    }
}

interface IH{
    void ih();
}
interface IG extends IH{}//3.若IG 继承了 IH 那Teacher就与IH有关系啦！祖师爷啊(师傅的老爸叫什莫)！
class Teacher implements IG{
    //因为IG继承了IH，所以Teacher类要跟师公学技能
    //重写师公方法
    @Override
    public void ih() {
        System.out.println("师公技能...");
    }
}