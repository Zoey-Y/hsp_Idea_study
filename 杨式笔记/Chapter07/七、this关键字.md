# 七、this关键字

## 一、引出this的作用

~~~java
class Dog {
    //创建属性
    String name;
    int age;
    //搞一个构造器初始化属性
    public Dog(String pName,int pAge){
        name = pName;
        age = pAge;
    }
    /*
    	1.如果构造器的形参能够直接写成属性名就更方便了
    	2.但是由于变量的作用域原则不能写成:
            public Dog(String name,int age){
                name = name;
                age = age;
            }
         3.构造器里的name和age是局部变量，不是属性,因此最后属性的初始化依然是默认值.
    */
    
    /*由此为了简写则引出了this关键字来解决：
    	每个对象创建完之后就会在堆中默认产生一个this(此this指向的就是此堆的地址)*/
    //承接第2.
     public Dog(String name,int age){
                //this.name 就是当前对象的属性name(当前对 象就是你在Dog类里声明的那个逼)
         	    this.name = name;//name:还是局部变量,但此时this.name:当前对象的属性name
         		//this.age 就是当前对象属性age(当前对象 就是你在Dog类里声明的那个逼)
                this.age = age;//age:还是局部变量,但此时this.name:当前对象的属性age
            }
    
    public void info(){//成员方法,输出属性信息
    	System.out.println(name + "\t" + age + "\t");
    }    
}
~~~



## 二、this图形式

![image-20220808131344584](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220808131344584.png)。

* 打印this的地址是否与this对应的对象地址一样(方式)

  ~~~java
  public class this01{
  	public static void main(String[] args) {
  		/*打印this的地址是否与this对应的对象地址一样(方式)*/
  		//hashCode的地址是来自于虚拟机的地址,不与自己电脑的地址一致
  		Dog dog1 = new Dog(2);//利用构造器直接调用了构造器内的内容
  		System.out.println("dog1的hashCode: " + dog1.hashCode());
  		dog1.Info();
  	}
  }
  class Dog{
      int age;
      public Dog(int age){//构造方法(构造器内初始化属性)
          this.age = age;
          System.out.println("this.age的hashCode: " + this.hashCode());//打印构造器内的this虚拟地址
      }
       public void Info(){//普通方法Info有返回值的
          System.out.println("Info方法内的 this.hashCode: " + this.hashCode());
      }
  }
  ~~~

  

  ![image-20220808134811703](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220808134811703.png).


## 三、this细节

~~~java
public class thisDetail01{
	public static void main(String[] args) {
		/*
		this关键字的细节:
			1.this关键字可以用来访问本类 属性,方法,结构器
			2.this用于区分当前类的属性和局部变量
			3.访问成员方法的语法:this.方法名(参数列表)
			4.访问构造器语法:this(参数列表);
				注意:
					a.只能在构造器中使用(只能在构造器里调用另外的构造器),并且这个调用构造器语法只能放在第一位
				  	b.构造器名本身默认就是类名,因此可以不写这个方法名(写了就错)
			5.this不能在类定义的外部使用,只能在类定义的方法中使用 
		*/

	//细节3:的验证调用方法类,当同this调用方法时
		T t1 = new T();
		t1.f2();
		System.out.println("==================");



	//细节4的验证,构造器不用人为调用
		T t2 = new T();

	//this不能在类定义之外的地方使用
	/*比如我在主函数这里写this啥啥啥不行*/

	System.out.println("==================");
	//细节1的验证
	T t3 = new T();
	t3.t3();
	}
}

class T {
	//细节1:this 属性调用的方式
	//首先创建俩属性
	String name = "huazai";
	int num = 10;
	public void t3(){
		//原始的方法调用属性
		System.out.println("name = " + name + "\t" + "num = " + num);//这个name和num完全是因为就近原则才能调用到属性的name和num的 
		//若利用this掉用这俩对象,就肯定是调用属性的name 和 num
		System.out.println("this.name = " + this.name + "\t" + "this.num = " + this.num);
	}







	//细节4:访问构造器语法this.(参数列表)
	//此时有构造器重载
	public T(){//无参构造器
		//注意:访问构造器语法必须放在构造器位置的第一位(这与继承方面有关后面细说窝~)
		//访问T(String name,int age)构造器
		this("laolo",10);//this就代表类型名(或者说构造器名)T 了(所以不要写成this.T 否则会错的)
		System.out.println("这里来自T() 构造器");
	}
	public T(String name,int age){
		System.out.println("这里来在T(String name,int age) 构造器，输出的是:\n" + name + "\t" +age);//这里的name 和 age是传参进来的,不是属性
	}





	//细节3:访问同类中成员方法的例子
	public void f1() {
		System.out.println("成员方法f1()");
	}
	public void f2() {
		System.out.println("成员方法f2()");
		//访问成员方法的第一种方法
		f1();
		//第二种方法
		this.f1();
		//两种方法都能调用方法f1(),但两者区别,讲到继承时再细讲
	}
}
~~~

## 五、this关键字课堂练习

~~~java
public class TestCompare {
	public static void main(String[] args) {
		/*
		 要求:用到this关键字,制作一个person类,比较两个人的name,age是否相同
		 ,相同位true,不同位false,写一个compareTo方法来比较
		*/
		//传参给构造器进行初始化先
		person p1 = new person("老韩",18);
		person p2 = new person("老六",6);
		//打印方法就行
		System.out.println(p1.compareTo(p2));
	}
}
class person{
	//创建name 和 age 属性
	String name;
	int age;
	//构造器初始化属性
	public person (String name,int age){
		this.name = name;
		this.age  = age;
	}
	//写一个具有对比功能的方法
	public boolean compareTo(person p){//此处person p是传一个对象进来与之相比的
		return this.name.equals(p.name) && this.age == p.age;//传过去的就是Boolean值了
	}
}
~~~

### 作业1:



~~~java
public class thisHomework01{
	public static void main(String[] args) {
		/*
			要求:编写类A01,定义方法max,实现求某个double数组的最大值,返回值
		*/
		double[] arr = {1.2 ,34.5 ,23.5};
		A01 a = new A01();
		//此处可以接收返回的结果
		Double res = a.max(arr);
		if( res != null){
			System.out.println("最大值是: " + res);
		}else{
			System.out.println("输入的数组有误无法返回");
		}
		
	}
}
class A01 {
		public Double max(double[] arr){//此处的Double是一个包装类(返回了一个对象),所以我们可以返回double各种情况(包括返回null)
			if(arr != null && arr.length > 0){//数组必须要有长度才行
				double max = arr[0];
				//我这从第二个元素开始循环与第一个元素相比较就好啦
				for(int i = 1;i < arr.length;i++){
					max = max >  arr[i] ? max : arr[i];
				}
				return max;
			}else {
				return null;
			}			

	}
}
~~~

### 作业2:



~~~java
public class thisHomework02{
	public static void main(String[] args) {
		/*要求:
			编写类A02定义方法find,实现查找某字符串是否在数组中,
		    并返回索引,如果找不到,返回-1
		*/
		String[] str ={"侏罗纪","大白天","GGbox"};
		
		//查找字符串
		A02 a = new A02();
		int index = a.find("GGbox",str);
		if(index != -1){
			System.out.println("找到了这个字符串,返回值是: " + index);
		}else {
			System.out.println("这个字符串数组内没有找到这个字符串");
		}
		

	}
}
class A02{
	public int find(String word,String[] str){
		//遍历字符串数组,若找到了就返回i索引,没找到就跳出循环返回-1
		for(int i = 0;i < str.length;i++){
			if(word.equals(str[i])){
				return i;
			}			
		}
		return -1;
	}
}
~~~

### 作业3:



~~~java
public class thisHomework03{
	public static void main(String[] args) {
		/*
 			要求:(需要用到this的知识点的做法)
				编写类Book,定义方法updataPrice,实现更改某本书的价格
 				具体:如果价格 >= 150,则改为150,若价格 > 100 < 150,则更改为100
				否则不变.	
 		*/
 		//有构造器直接把初始化的东西写在这以后就不用一个个写了,也不用在类里面初始化显得乱糟糟的
 		Book book = new Book("javaBase",123);
 		//原来书本的价格
 		book.info();
 		//修改价格功能
 		book.updataPrice();
 		//改之后的情况
 		book.info();

	}
}
class Book {
	String name;//书名
	double price;//价格
	//构造器
	public Book(String name, double price){
		//初始化俩属性
		this.name = name;
		this.price = price;
	}
	//修改价格的功能,没被调用就自然不执行啦~
	public void updataPrice(){
        //如果方法中没有局部变量price，这里直接写price也可以(可以不用this.price)
        //因为就近原则嘛,有局部变量就得区分局部变量和属性
		if(this.price >= 150){
			price = 150;
		}else if(this.price > 100){//这里系统就直接默认小于150啦！
			price = 100;
		}//其余的情况不用改
	}

	public void info(){
		System.out.println("书名：" + this.name  + "价格：" + this.price);
	}
}




//不需要this的写法
// public class thisHomework03{
// 	public static void main(String[] args) {
// 		/*
// 			要求:
// 				编写类Book,定义方法updataPrice,实现更改某本书的价格
// 				具体:如果价格 >= 150,则改为150,若价格 > 100 < 150,则更改为100
// 				否则不变.	
// 		*/
// 		Book price = new Book();
// 		int finalPrice = price.updataPrice(142);
// 		System.out.println("最终价格是: " + finalPrice);
// 	}
// }
// class Book {
// 	public int updataPrice(int price){
// 		if(price >= 150){
// 			return 150;
// 		}else if(price > 100 && price < 150){
// 			return 100;
// 		}else {
// 			return price;
// 		}
// 	}
// }

~~~

### 作业4：



~~~java
import java.util.Scanner;
public class thisHomework04{
	public static void main(String[] args) {
		/*
		  要求:
			  编写类A04,实现数组的复制功能copyArr,
			  输入旧数组,返回一个新数组,元素和旧数组一样.
		*/
		Scanner input = new Scanner(System.in);
		System.out.println("输入一个旧数组");
		//这里我打算自己输入一个数组,那我这个输入的数组怎么赋值给arr呢？
		int[] arr = {2,3,46,23};
		A04 a = new A04();
		int[] newArr = a.copyArr(arr);
		System.out.println("新数组是: ");
		for(int i = 0;i < newArr.length;i++){
			System.out.print(newArr[i] + " ");
		}
		System.out.println();
	}
}
class A04{
	public int[] copyArr(int[] oldArr){
		int[] newArr = new int[oldArr.length];
		for(int i = 0;i < oldArr.length;i++){
			newArr[i] = oldArr[i];
		}
		return newArr;
	}
}
~~~

### 作业4(自我扩展)



~~~java
/*package com.orange.demo;*/

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test05 {

    public static void main(String[] args) {
		/*
		  要求:
			  编写类A04,实现数组的复制功能copyArr,
			  输入旧数组,返回一个新数组,元素和旧数组一样.
		*/
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个旧数组");
        //这里我打算自己输入一个数组,那我这个输入的数组怎么赋值给arr呢？

        //输入1,2,3,4,5
        String next = input.next();
        //第一种
        List<String> list = Arrays.asList(next);
        //第二种
        String[] arr = next.split(",");
        System.out.println(arr);

        //循环输入
        int index = 0;
        String arrString = "";
        int nextInt = input.nextInt();
        while (nextInt!=10000){
            arrString += nextInt+",";
            index++;
            nextInt = input.nextInt();
        }
        String substring = arrString.substring(arrString.lastIndexOf(","));
        System.out.println(substring);

//        int[] arr = input.nextInt[]();
        A04 a = new A04();
//        int[] newArr = a.copyArr(arr);
//        System.out.println("新数组: " + newArr);
    }
}

class A04 {
    public int[] copyArr(int[] oldArr) {
        int[] newArr = new int[oldArr.length];
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }
        return newArr;
    }
}

~~~

### 作业5:



~~~java
public class thisHomework05{
	public static void main(String[] args) {
		/*
		  要求:
		  1.定义一个圆类Cricle,
		  2.定义属性:半径,
		  3.提供显示圆周长功能的方法
		  4.提供显示圆面积的方法
		*/
		//传参给构造器
		Cricle c = new Cricle(3.3);
		//显示周长
		System.out.println("周长: " + c.perimeter());
		//显示面积
		System.out.println("面积: " + c.area());
	}
}
class Cricle {
	double r;//半径
	//传入半径的值来在构造器里初始化
	public Cricle (double r){
		this.r = r;
	}

	//显示圆周长的方法
	public double perimeter(){
		 return 2 * Math.PI * this.r; 
	}
	//显示面积的方法
	public double area(){
		return Math.PI * Math.pow(r,2);
	}

}
~~~

### 作业6:

~~~java
public class thisHomework06{
	public static void main(String[] args) {
		/*
		  要求: 
		  	编写创建一个Calc计算类,在其中定义2个变量表示两个操作
		  	定义四个方法实现 求和、差、乘、商(要求除数为0的话,要提示)
		  	并创建两个对象,分别测试
		*/
		Calc c = new Calc(3 , 0);
		//和
		System.out.println("和: " + c.sum());
		//差
		System.out.println("差: " + c.dif());
		//乘
		System.out.println("乘: " + c.minus());
		//商
		Double div = c.divide();//用包装类也要用包装类这样来接收
		if(div != null){
			System.out.println("商: " + div);
		}else{
			System.out.println("除数不可以为零");
		}
		
	}
}
class Calc {
	double a1;
	double a2;
	public Calc(double a1,double a2){
		this.a1 = a1;
		this.a2 = a2;
	}
	//和
	public double sum(){
		return this.a1 + this.a2;
	}
	//差
	public double dif(){
		return a1 - a2;
	}
	//乘
	public double minus(){
		return a1 * a2;
	}
	//商
	public Double divide(){//写一个类包,可以返回null
		if(a2 != 0){
			return a1 / a2;
		}else {
			return null;
		}
		
	}
}
~~~

### 作业7:

~~~java
public class thisHomework07{
	public static void main(String[] args) {
		/*
		  要求:
		  	1.设计一个Dog类
		  	2.以名字、颜色、年龄为属性
		  	3.定义输出方法show()显示其信息
		  	4.最后创建对象进行测试
		*/
		Dog dog1 = new Dog("啊狼","五颜六色",2);
		dog1.show();
	}
}
//设计一个Dog类
class Dog {
	//以名字、颜色、年龄为属性
	String name;
	String color;
	int age;
	//构造器初始化属性
	public Dog(String name,String color,int age){
		this.name = name;
		this.color = color;
		this.age = age;
	}
	//定义输出方法show()显示其信息
	public void show(){
		System.out.println("Dog 的名字: " + this.name);
		System.out.println("Dog 的颜色: " + this.color);
		System.out.println("Dog 的年龄: " + this.age);
	}
}
~~~

### 作业8:

~~~java
public class thisHomework08{
	public static void main(String[] args) {
		/*
		题目:
			给定一个java程序如下:
	public static void main(String args[]){
					//1.匿名对象只能用一次
					//2.创建好匿名对象后就调用count1()
					new Test().count1();//这样都行？！nb！
					Test t1 = new Test();
					t1.count2();
					t1.count2();
	}		

			public class Test {
				int count = 9;
				public void count1() {
					count = 10;
					System.out.println("count1 = " + count);//10
				}
				public void count2(){
					System.out.println("count1 = "  + count++);//10
				}
			}
			运行后输出结果是啥？
			答:10
			   9
			   10
		*/
	}
}
~~~

### 作业9：

~~~java
public class thisHomework09{
	public static void main(String[] args) {
		/*
		  题目:
		  	1.定义Music类
		  	2.属性:音乐名、音乐时长
		  	3.播放play功能 
		  	4.返回本身属性信息的功能方法getInfo
		*/
		Music m = new Music("fasxc",3);
		m.play();
		m.getInfo();
	}
}
class Music {
	String name;
	int time;
	public Music(String name, int time){
		this.name = name;
		this.time = time;
	}
	//播放功能
	public void play(){
		System.out.println("播放音乐");//象征性播放
	}
	//返回本身属性
	public void getInfo(){
		System.out.println("歌名: " +  this.name + "  时长: " + this.time);
	}
}
~~~

### 作业10：

~~~java
public class thisHomework10{
	public static void main(String[] args) {
		/*
		题目:
			写出以下代码的运行结果:
			class Demo{
				int i = 100;
				public void m() {
					int j = i++;
					System.out.println("i = " + i);
					System.out.println("j = " + j);
				}
				class Test{
					public static void main(String[] args){
						Demo d1 = new Demo();
						Demo d2 = d1;
						d2.m();//101 100
						
						//d1.i和d2.i都是指向Demo的i属性,
						//又因为在m中i++ ——————>i = i + 1;上面执行了d2.m(),
						//因此i被改了嘛,所以下面要执行101
						System.out.println(d1.i);//101
						System.out.println(d2.i);//101
					}
				}
			}
			答:101 
			   100
			   101
			   101
		*/
	}
}
~~~

### 作业11:

~~~java
public class thisHomework11{
	public static void main(String[] args) {
		/*
			1.创建一个Employ类
			2.属性:名字、性别、年龄、职位、薪水 
			3.提供三个构造方法
			   a.(名字、性别、年龄、职位、薪水)
			   b.(名字、性别、年龄)
			   c.(职位、薪水)
			要求充分复用构造器
		*/
		// Employ employer01 = new Employ("jj",'男',22,"软件开发",10000);
		// //a
		// System.out.println("a方法: ");
		// employer01.a();
		// //b
		// System.out.println("b方法: ");
		// employer01.b();
		// //c
		// System.out.println("c方法: ");
		// employer01.c();
	}
}
class Employ {
	String name;
	char sex;
	int age;
	String position;
	int salary;
	//a.(名字、性别、年龄、职位、薪水)
	public Employ(String name,char sex,int age,String position,int salary){
		//调用构造器只能放在首位
		this(name, sex, age);
		this.position = position;
		this.salary = salary;
	}
	//b.(名字、性别、年龄)
	public Employ(String name,char sex,int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	//c.(职位、薪水)
	public Employ(String position,int salary){
		this.position = position;
		this.salary = salary;
	}
}
~~~

### 作业12：

~~~java
public class thisHomework12{
	public static void main(String[] args) {
		/*
		题目:
			1.定义Circle类,包含一个double型的radius属性代表圆的半径,findArea()方法返回圆的面积
			2.定义一个类PassObject,在类中定义一个方法printAreas(),该方法发定义如下:
			public void printAreas(Circle c,int times)
			3.在printAreas方法中打印输出1到times之间的每个整数半径值,以及对应的面积.
			例如:times为5,则输出半径1，2，3，4，5以及对应的面积.
			4.在main方法中调用printArea()方法,调用完毕后输出当前半径值 和 面积值.*/
			
			Circle c = new Circle();
			PassObject print = new PassObject();
			print.printAreas(c,5);//c:传一个对象，5就是每个半径的值的数量
	}
}
class Circle {
	double radius;
	//返回圆的面积
	public double findArea(){
		return Math.PI * Math.pow(radius,2);
	}
	//创建一个为了修改并初始化radius的方法(方便其它类调用从而改变radius的值)
	public void setRadius (double radius){
		this.radius = radius;
	}
}
class PassObject{
	public void printAreas(Circle c,int times){
		//在printAreas方法中打印输出1到times之间的每个整数半径值,以及对应的面积.
		System.out.println("radius" + "\t" + "Area");
		for(int i = 1;i <= times;i++){
			c.setRadius(i);//改变radius的值
			System.out.println((double)i + "\t" + c.findArea());//从而调用面积时改变面积的值
		}
		
	}
}
~~~



## 六、this总结

* 简单的说，哪个对象被调用，this就代表哪个对象
