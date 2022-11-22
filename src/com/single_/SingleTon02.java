package com.single_;
/*懒汉式的单例模式*/
public class SingleTon02 {
    public static void main(String[] args) {
//   由于构造器私有化所以创建不了对象     Cat tyd = new Cat("tyd");
        Cat instance = Cat.getInstance();
        System.out.println(instance);
    }
}
//只能创建一个对象
//使用单例模式

class Cat{
    private String name;
    /*懒汉式步骤：
     * 1.仍然构造器私有化
     * 2.定义一个静态属性对象
     * 3.提供一个public的static方法，返回一个Cat对象
     * 4.懒汉式，只有在用户使用getInstance时，才返回pc对象
     * 下次再调用会再返回上次的pc对象,因为pc不再是null了,保证了单例性*/
   /* private static Cat pc = new Cat("pechi");不要再new了，这种是饿汉式*/
    //懒汉式：
    private static Cat pc;//(2) 此时默认为null
    private Cat(String name) {//(1)
        this.name = name;
    }
    public static Cat getInstance(){//(3)
        if (pc == null) {
            pc = new Cat("ppc");//构造器会被调用一次，后面进不来就不再调用了，之后会直接返回pc
        }
        return pc;
    }

    //pc被赋值得输出

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
