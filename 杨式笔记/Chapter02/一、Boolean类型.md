# 一、Boolean类型

1. #### boolean：只存放true，false，不存放null

2. #### boolean不可以用 0 或 !0 来表示 真 或 假

3. ~~~java
   public class Boolean01{
    
       public static void main(String[] args){
           boolean pass = true;
           if(pass == true){
               System.out.println("you're pass the exam.");
               else{
                   System.out.println("keep trying.");
               }
           }
       }
   }
   ~~~

# 