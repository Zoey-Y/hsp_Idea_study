package com.Override;

public class Animal {
    public void Cry() {
        System.out.println("动物的哭声...");
    }

    public Object m1(){
        return null;
    }

    //第三部分
    public B m3(){
        String a;
        Integer b;
        int c;
        return null;
    }
    //第四部分
  /*  public String m4(){
        return null;
    }*/
    //但子类可以扩大父类的访问权限
    private String m4(){
        return  null;
    }
}
