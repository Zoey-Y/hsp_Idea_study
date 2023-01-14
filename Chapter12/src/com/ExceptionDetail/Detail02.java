package com.ExceptionDetail;

public class Detail02 {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            person = null;
            //Detail01再现:这里出错下面就不执行了
            System.out.println(person.getName());//NullPointer
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;//Arithmetic

        }/*Detail02:要求 子类异常写在前 , 父类异常在后面*/
        catch (NullPointerException e){/*Detail02:可以用不同的catch捕获不同的异常(但不方便)*/
            System.out.println(e.getMessage());
        }
        catch (Exception e) {//Exception是NullPointer和Arithmetic的父类所以可以直接囊括两种异常
            System.out.println(e.getMessage());
        }
    }
}

class Person {
    private String name ="psda";

    public String getName() {
        return name;
    }
}