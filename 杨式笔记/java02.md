# 一、Chapter06 数组

## 一、数组的引出(代码文件:Chapter06\Array01)

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220611142931512.png" alt="image-20220611142931512" style="zoom:50%;" />。

## 二、数组介绍(代码文件:Chapter06\Array01)

* #### 数组可以存放<font color ='red'>多个</font>同一类型的数据

* #### 数组也是一种类型(引用数据类型),数组也是一种数据

* #### 数组写法:(数据类型 + 类型名[] )<==>(数据类型[] + 类型名)

## 三、数组的创建

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220611174333954.png" alt="image-20220611174333954" style="zoom:67%;" />。

* #### 系统自动分配内存空间：<font color="orage">类型名 + 数组名[] <==>数据类型[] + 数组名</font>.

* #### 人为分配内存: 数据类型 + 数组名[] = new 数据类型[大小]

* ###### eg: int a[] = new int[3];

## 四、例题: 创建数组 及 Scanner 之间的结合细节

* #### 具体代码文件:Character06\java02

* <img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220612002844207.png" alt="image-20220612002844207" style="zoom:200%;" />.

  

## 五、数组动态分配方式

~~~java
第一种动态分配方式:eg//事先不知道数据的时候用合适
    double a[] = new double[3];//直接分配空间
第二种动态分配方式:eg//事先不知道数据的时候用合适
    double a[];//先声明数组
    a = new double[3];//再分配空间
第三种静态初始化:eg//事先知道数据的情况适合用
    int a[] ={3,21,5,23};
//如果知道具体值和元素个数，用法就相当于
int a[] = new int[4];
a[0] = 3;
a[1] = 21;
a[2] = 5;
a[3] = 23;
	

~~~

## 六、数组学习细节Chapter06\ArrayDetail.java

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220613185335474.png" alt="image-20220613185335474" style="zoom:50%;" />.

## 七、数组赋值机制

![image-20220615164310857](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220615164310857.png)。

### 第一种赋值方式:值拷贝

* ![](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220615165008047.png).。
* ![image-20220615165531549](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220615165531549.png)。

### 第二种赋值方式:(地址拷贝\引用传递)传的是地址

* ##### 结果:

* ![image-20220615165614514](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220615165614514.png).

* #### 图理解:

* ![image-20220615172047679](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220615172047679.png).

### 第三种赋值方式:

* ![image-20220615174306807](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220615174306807.png).

* arr2开辟一个新的空间与arr1一样大(这叫开辟一个独立的数据空间)

* ![image-20220615174154856](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220615174154856.png).

* ![image-20220615180212747](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220615180212747.png)。

* #### 将arr1当中地址的元素拷贝到arr2中地址的元素,再改变arr2[0]=100的 代码 和 结构分析图:

* ![image-20220615181709065](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220615181709065.png)。

* ![image-20220615180844668](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220615180844668.png).

## 八、数组添加例题Chapter06\ArrayAdd01

![image-20220619162935752](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220619162935752.png)。

## 九、排序

## 一、内部排序

* #### <font color ="orang">指将需要处理的所有数据都加载到内部存储,包括(交换排序、选择排序、插入排序)</font>.

## 二、外部排序

* ##### <font color ="orang">数据量过大,数据无法全部加载到内部存储中,需要借助外部存储进行排序,(合并排序、直接合并排序)</font>.

## 十、二维数组内存运行图

![image-20220627184949193](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220627184949193.png)。

## 十一、二维数组的创建方式

* #### 二维数组的静态分配: 

* ~~~java
  int[][] arr = {{1,2,3,
                 {2,3,4},
                };//系统自动分配内存的写法,人为先写入数组的形式
  ~~~

* #### 二维数组的动态分配:

* ~~~java
  //第一种写法
  int[][] arr = new int[2][3];//先人为创建一个二维数组的大小,之后再来使用
  //第二种写法
  int[][] arr;//先声明
  arr = new int[2][3];
  //第三种写法,列数不确定时,也就是说若二维数组内的一维数组元素不确定时如何创建二维数组的空间
  int[][] arr =new int[3][];
  ~~~


## 十二、二维数组的细节

~~~java
//一维数组的声明方式
int[] x;
int x[];
//二维数组的声明方式
int[][] x;
int x[][];
int[] x[];
//二维数组实际上是由多个一维数组组成的
//它的各个一维数组的长度可以相同也可以不相同

int[][] map = {{1,2},{1,2,3}};
//map[0]:是一个含两个元素的一维数组
//map[1]:是一个含有三个元素的一维数组
~~~

![image-20220703163623222](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220703163623222.png)。



## 十三、典型例题

1. 下面定义正确的有B、D

   ~~~java
   A. String strs[] = {'a','b','c'};//char -> String不行
   B. String[] strs = {"a","b","c"};//ok
   C. String[] strs = new String{"a","b","c"};//要new的话就要加上[]
   D. String strs[] = new String[]{"a","b","c"};//这样才对
   E. String[] strs = new String[3]{"a","b","c"};//要new后面像D一样就可以,不用加3，要加3后面{}就不要了
   ~~~

   

# 二、类与对象

例题:![image-20220712185712063](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220712185712063.png)。



我的图解：

![](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220712185639905.png)。

## 一、方法的调用机制

* ~~~java
  //这一部分就是main栈部分
  public Static void main(String[] args){
      car c1 = new car;
      int resultSum = c1.cal01(3,2);
      System.out.print("sum = " + resultSum);
  }
  
  //这一部分就是临时栈部分
  class car{
      //方法
      public int cal01(int num1,int num2){
          int sum = num1 + num2;
          return sum;
      }
  }
  ~~~

  * 方法调用原理:
  * ![image-20220713165515832](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220713165515832.png).

* #### 总结：

* ![image-20220713170611140](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220713170611140.png)。

## 二、属性 与 方法

* 属性：（用于描述类的特征、性质等）

* ~~~java
  public class property{
  	public static void main(String[] args){
          //这里声明并new一个类
         person p1 = new person();
         //引用
          p1.name = "aliangzai";
          p1.age = 12;
      }
  }
  	//构造一个类
  	class person{
          //属性
          String name;
          int age;
  	}
  }
  
  ~~~

* 方法:（行为等）

* ~~~java
  public class Method{
      public static void main(String[] args){
         person p2 = new person();
       double sum = p2.calculate(3,23.2);
           System.out.println("sum = " + sum);  
          
          //打印方法的两个结果
          int[] twoResult = p2.reTwo();
          System.out.println("两个结果分别是：" + twoResult[0] + "\t" + twoResult[1]);
      }
  }
  class person{
      //方法 由 访问修饰符 + 返回类型 +方法名(形参列表)+{方法体}构成
      public double calculate(int i, double j){
          double sum =i + j;
          return sum;
      }
      //返回两个及以上的数
      public int[] reTwo(){
          int[] twoArr = new int[2];
          twoArr[0] = 1 + 1;
          twoArr[1] = 1 - 1;
          return twoArr;
      }
  }
  ~~~

* 方法 的调用

* ~~~java
  public class MethodInvoke{
      public static void main(String[] args){
        person p3 = new person();
        int sum = p3.result(5);
          System.out.println("sum = " + sum);
      }
  }
  class person{
  	int sum = 1;
      //方法在同一个类中调用方法,可以直接调用需要的方法
      public int calculate(int i){
       	 sum += i;  
       	 return sum;  
      }
      public int result(int j){
          sum = calculate(j);
          return sum; 
      }
      
  }
  ~~~

* ~~~java
  public class MethodInvoke{
      public static void main(String[] args){
       //主函数里面分别实例化两个类
          //第一个
          willPrint a = new willPrint();
          a.A();
          //第二个
          nowPrint b = new nowPrint();
          b.B();
      }
  }
  //跨类调用方法
  class willPrint{
      public void A(){
          System.out.println("大GG");
      }  
  }
  class nowPrint{
      public void B(){
          //跨类调用willPrint类需要先创建一个来自willPrint的空间
          willPrint p1 = new willPrint();
          //第二步就是调用方法
          System.out.println("这是跨类调用的打印");
          p1.A();
      }
  }
  ~~~

* 总结:每个class的创建相当于在栈里开辟了一个新的空间,在主函数内被调用完之后,或者在另一个class被调用完之后这个空间会自动销毁,所以就可以解释为什么在主函数或者跨类调用方法或者属性时要创建一个new的原因了.

## 三、方法传参机制

* 基本数据类型，传递的是值(值拷贝)，形参的任何改变不影响实参。

* 引用数据类型，传递的是地址(传递的是值，只是这个值是地址)，可以通过形参影响实参

  

# 三、递归

## 一、方法递归的调用

* 介绍:递归就是方法自己调用自己，每次调用时传入不同的变量，递归有助于编程者解决复杂问题，同时可以让代码变得简洁。

  ## 二、递归桃子练习

  ~~~java
  public class RecursionTaoZi{
  	public static void main(String[] args) {
  		/*
  		题目:有一堆桃子,
  		猴子一天吃这堆桃子的一半多一个,
  		以后每天都这样.
  		当到第十天时,发现只有一个桃子了
  		求出最初有几个桃子
  
  		思路分析:
  			1.第十天时 为1个.
  			2.第九天时 为 第九天的数量 = (第十天的数量 + 1) * 2
  			//正推day10 = day9 / 2 - 1 ——>day10 = 1;   
  			//逆推:day9 = (day10 + 1) * 2;
  		*/
  		Taozi originalSum = new Taozi();
  		int sum = originalSum.Taozi(1);//这里1是因为从第一天开始进行判断
  				/*for循环的思想来举一反三:
  				  就是1传参到形参里就是从1开始循环一直到条件满足
  				  10天就可以找到第十天剩余一个桃子的已知条件
  				 */
  
  			if (sum != -1) {
  				System.out.println("最初时有" + sum + "个桃子");
  			}
  		
  	}
  }
  class Taozi{	
  	public int Taozi(int day){
  		if(day == 10){
  			 return 1;//已知第十天剩下的是1
  		} else if(day >= 1 && day <= 9){ 
  			return (Taozi(day + 1) + 1) * 2;
  		} else {
  			System.out.println("天数输入错误:");
  			return -1;
  		}
  		
  	}
  }
  ~~~

  
