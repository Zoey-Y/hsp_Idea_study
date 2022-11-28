package com.InnerClass.AnonymousInnerClass;

public class AnonymousClass01 {
    public static void main(String[] args) {

        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 {//外部类
    private int n1 = 10;

    public void method() {
        /*基于接口的匿名内部类
         * 1.需求:使用接口IA,并创建对象
         * 2.传统方式,是一个类,实现该接口,并创建对象
         *
         * 3.若Tiger类只用一次,以后再也不用
         * * 可以使用匿名内部类简化开发*/
        //传统写法在方法内实例化对象,之后在主方法调用该类的方法
        /*Tiger tiger = new Tiger();
        tiger.cry();*/


        /*1.tiger的编译类型是: IA
        * 2.tiger的运行类型是: 匿名内部类(系统分配的名字是:XXXX --->Outer04$1)
        * 匿名内部类的底层:(用完一次就没了)
        *   class XXXX implements IA{
        *         @Override
                public void cry() {
                    System.out.println("匿名内部类在Method()中创建");
                }
        *   }
        * 3.jdk底层在创造匿名内部类 Outer04$1,
        * 马上就创建了Outer04$1实例,并且把地址返回给tiger
        * 4.匿名内部类只能使用一次,但new出来的对象是可以多次使用的*/
        System.out.println("-------------匿名内部类 之 接口的匿名--------------");
        //使用匿名内部类
        IA tiger = new IA(){
            @Override
            public void cry() {
                System.out.println("匿名内部类在Method()中创建");
            }
        };
        System.out.println("tiger的运行类型:"+tiger.getClass());
        //调用cry()
        tiger.cry();

        System.out.println("--------------匿名内部类 之 类的匿名--------------");
        /*new Father("jack"){} ------相当于(底层写法为)----> class Outer04$2 extends Father("jack"){}
        * 表现了创建对象的特征
        * 若是抽象类在实现匿名内部类时必须记得重写抽象方法*/
        Father father = new Father("jack"){//由于Father类构造器需要传承一个name
            //若想要重写一个test()也可以
            @Override
            public void test() {
                System.out.println("重写的Father类的test()");
            }
        };
        System.out.println("father的匿名内部类的名字:"+father.getClass());
        //调用test()
        father.test();

    }

    interface IA {//接口是不能被new的
        public void cry();//隐藏的public final static
    }

    //Tiger类实现IA接口
/*    class Tiger implements IA {
        @Override
        public void cry() {
            System.out.println("Tiger类实现了接口IA");
        }
    }*/

    class Father {
        public Father(String name) {
            System.out.println("构造器的名字"+name);
        }

        public void test() {
        }
    }
}
