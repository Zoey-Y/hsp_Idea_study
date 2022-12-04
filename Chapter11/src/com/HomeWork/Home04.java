package com.HomeWork;
/*内部类练习:*/
public class Home04 {
    public static void main(String[] args) {
        A a = new A();
        a.print("阿珍");
    }
}
class A{
    private String name = "啊强";
    public void print(String name){
        class B{
            private String name;
            public void show(String name){
                System.out.println(name + "\t爱上\t" + A.this.name);
            }
        }
        B b = new B();
        b.show(name);
    }

}