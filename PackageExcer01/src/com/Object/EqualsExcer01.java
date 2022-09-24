package com.Object;

import com.Override.Excer01.Person;

/*判断两个Person对象的内容是否相等，
* 如果两个Person对象各个属性值都一样，则返回true，反之false*/
public class EqualsExcer01 {
    public static void main(String[] args) {
        //创建两个Person类，看看属性值一样时是怎样的
        Person person1 = new Person("Jasica", 22, '男');
        Person person2 = new Person("Jasica", 22, '男');
        System.out.println(person1.equals(person2));
        /*第一种情况：(没有在Person类中重写equals方法的情况)
         *   此时(用equals)默认比较的是两个对象的地址值,因此此时为不同地址，所以为false
         * 第二种情况:(在Person类中重写了一个equals方法的情况)
         * */

    }

    static class Person {
        private String name;
        private int age;
        private char gender;

        public Person(String name, int age, char gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public char getGender() {
            return gender;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }

        //重写一个Object 的equals方法使其能够比较对象的属性值
        public boolean equals(Object obj) {//因为重写函数名，参数都得一样
            //this是当前类Person1，Object是Person2
            if (this == obj) {//若俩对象相同， 则直接返回真
                return true;
            }
            //传参类型的判断
            if (obj instanceof Person) {//如果equals()方法传参进来的参数是Person才比较
                //向下转型(原因：为了获取传进来对象的属性值)
                Person p = (Person) obj;//让原本为Object父类对象转成Person子类对象以此获得传进来的对象属性值
                return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
            }
                return false;//没必要if..else
            }
        }
    }

