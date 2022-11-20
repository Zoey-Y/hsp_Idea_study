package com.Interface.Extends_VS_Interface;

public class Monkey {//猴子父亲(父类)
        private String name;
        public Monkey(String name){
            setName(name);
        }

        public void climbing(){
            System.out.println(name + "天生会爬树");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
}
