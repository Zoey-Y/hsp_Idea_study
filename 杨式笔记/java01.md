# 一、Chapter01:Java运行流程：

![image-20220406170707349](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220406170707349.png)

* #### <font color="bulle">java的运行流程</font>：

1. #### 首先需要一个“.java”文件来编辑关于Java的内容(这个程序不能直接运行的)

   ##### (.java文件是编辑文件的文件) — (javac文件是编译文件的文件) —>  (.class是可执行文件)—(运行 java)—>JVM

2. #### 因此就有“.class”文件来负责运行

   #####   .class   —(运行 java)—>JVM

3. #### 要想运行之后呈现结果就需要“JVM”环境，jvm是包含在jdk中的。

* ## <font color="red">总的Java运行流程就是</font>：

  ##### <font color="blue">.java — (编译 javac) —>  .class   —(运行 java)—>JVM</font>

  ###### eg图：<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220406174306634.png" alt="image-20220406174306634" style="zoom: 80%;" />

* ##### <font color="burd">注意：当在编辑代码时对原来的代码进行改动时，必须再次输入(javac 啥啥.啥啥)重新更新(.class)可执行文件再输入(Java 啥啥)来执行改动后的文件</font>

* #### <font color="bulle">对比C语言</font>：

1. #### 以 “ .c ” 为原文件<font color="orange">编辑</font>代码

2. #### 以“.obj”为目标文件<font color="orange">编译</font>代码

3. #### 以“.exe”为执行文件<font color="orange">运行</font>代码

# 二、什么是JDK和JRE？

1. ## <font color="bulle">JDK</font>:（程序员需要利用的工具）

* ##### JDK：Java开发工具包（Java Development Kit）

* ##### JDK包含了：JRE + Java开发工具(java,   ,  javadoc  ,  javap等编译工具)



2. ## <font color="bulle">JRE</font>:（用户可以直接使用的工具，即已经开发好的工具）

* ##### JRE:Java运行环境 ( Java Runtime Environment )

* ##### JRE包含了：JVM + Java的核心类库

* ##### 补充:

* #### Java SE 是做电脑上运行的软件

* #### Java EE 是企业及开发,最多的应该是web开发。JavaEE可以将其当做成为一种代码规范，是用来进行企业级开发的

* #### Java ME 是做手机软件的。

# 三、配置path环境变量：

1. ## 当在cmd中执行javac和java时执行不了，如图：

   <img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220407163846903.png" alt="image-20220407163846903" style="zoom:67%;" />

2. ## 配置环境步骤：

   <img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220407164630718.png" alt="image-20220407164630718" style="zoom:67%;" />



#### <font color="orange">容易忽略且忘记的点</font>:

1. 在编辑完之后编译.java的方式

   ~~~cmd
   javac moumou.java
   ~~~

2. 执行.class 的方式:

   ~~~cmd
   java moumou//其后不需要加“.class”
   ~~~

   

# 四、Chapter02转义字符

~~~java
public class ChangeChar{
    public static void main(String[] args){
        System.out.println("转义字符的笔记只根据现在来说我比较难理解的\r跟\n放在\r\n一起的情况");
/*结果:跟义字符的笔记只根据现在来说我比较难理解的
      放在
      一起的情况
*/
    }//  \r:表示后面的字符开始回到该行的第一个字符开始取代，\n:换行
}
~~~

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220506144133747.png" alt="image-20220506144133747" style="zoom:67%;" />

# 五、Javadoc

## 一、什么是Javadoc：

* #### <font color="orange">Javadoc:就是已经被编写好的程序用javadoc工具所解析，最后生成一个可以以网页形式呈现的程序说明文档</font>.

## 二、如何新建一个javadoc：

1. #### <font color="blsw">前提是先编辑好一个.java程序</font>.

2. #### <font color="bluz">再在d盘某个文件中建立一个文件以便该程序放入在这个文件中</font>.

3. #### <font color="bluz">最后在cmd中以：（javadoc -d 文件夹名 -xx -yy 某程序名.java） 的格式创建Javadoc</font>.

   eg:

![image-20220506160627349](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220506160627349.png)

## 三、常见javadoc标签：

![image-20220506171713788](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220506171713788.png)

![image-20220506171753506](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220506171753506.png)

# 六、Java代码书写规范：

![image-20220506173105074](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220506173105074.png)

# 七、Dos（待补充）

## 一、Dos基本原理



<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220506181144634.png" alt="image-20220506181144634" style="zoom:80%;" />

## 二、相对路径 & 绝对路径

![image-20220506182438605](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220506182438605.png)

## 三、Dos常用命令：

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220506183155980.png" alt="image-20220506183155980" style="zoom:67%;" />

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220506223743649.png" alt="image-20220506223743649" style="zoom: 67%;" />

# 八、Chapter03:变量

1. #### 变量：是程序的基本组成单位。

2. #### 变量相当于一个数据存储空间的表示，变量可以想象成一个房间的门牌号，通过门牌号我们可以找到房间，而通过变量名可以找到人（值）。

3. #### eg：类型 + 名称 = 值<——————————>  int a = 3;

## 一、Java程序加号的使用

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220509155501475.png" alt="image-20220509155501475" style="zoom:50%;" />

## 二、Java数据类型

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220509155926579.png" alt="image-20220509155926579" style="zoom: 67%;" />

## 三、浮点数

* #### 浮点数 = 符号位(可有小数点) + 指数位(e = 10) + 尾数位(不可有小数点)(尾数可能丢失,尾数表示次方)

* #### 小数都是近似值

## 四、浮点类型：

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220509224435816.png" alt="image-20220509224435816" style="zoom:67%;" />

## 一、浮点数的使用陷阱



<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220509231411271.png" alt="image-20220509231411271" style="zoom:67%;" />

# 九、Sublime的快捷键：

1. #### Tab：向右缩进

2. #### Shift + Tab：向左缩进

3. #### shift + Ctrl + D：快捷键复制

4. #### Ctrl+ shift + K ：整行删除

# 十、码的介绍

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220510172217131.png" alt="image-20220510172217131" style="zoom:67%;" />

# 十一、Boolean类型

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

# 十二、自动转换类型规则

1. #### 低精度可以自动转向高精度

2. #### <font  color="red">char ——> int ——> long ——> float ——> double</font>.

3. #### <font  color="red">byte ——> short ——> int ——> long ——> foat ——> double</font>.

4. #### <font  color="red">byte 、short、 char之间不发生自动转换</font>

## 一、只要byte、short、char进行运算,则会自动转换成int

~~~java
byte n1 = 1;
short n2 = 1;
//n1 + n2会自动将类型变成 int
//所以
short n3 = n1 + n2;//写法错误
//正确的应该是
int n3 = n1 + n2;//原因：byte、short、char之间不会相互转换，下一层会自动转换的是int类型，所以会自动转换成int类型比较合理


//同类型的运算也是一样eg：
byte b1 = 1;
byte b2 = 2;
byte b3 = b1 + b2;//依旧不行，因为b1 + b2 自动转换成了int类型了
~~~

## 二、boolean类型不参与自动转换

~~~java
Boolean j = true;
int b = j;//不成立，因为boolean不能自动转换类型（int）也一样
~~~

## 三、类型自动提升原则

1. #### <font color = "orange">表达式结果的类型自动提升为操作数中最大的类型</font>.

eg:

~~~java
byte B1 = 1;
short S3 = 100;
double a1 =1.1;
int a2 = 2;
a2 + a1 + S3 + B1//自动提升为这个表达式最大的类型，其最大的类型是a1的类型即double类型
~~~

# 十三、强制类型转换

* ## <font color = "blsq">强制类型转换是程序员有意为之的行为，是知道所转换类型的大小，强行将其转换成比它小的类型</font>.

~~~ java
//强制类型转换的例子
int n1 = (int)3.9;//3.9是double类型,double类型按道理是自动转换不了成大类型的，但是在(内的类型是程序员强行转换的类型)，转换有风险，用时需谨慎。
~~~

1. ## <font color = "bsla">强制类型转换只作用于最近的值</font>.

~~~java
/*eg:*/
int g =(int)9.2 + 3 + 2.6f;//此时强转的int类型只作用于9.2，所以编译会错误，因为有个2.6f没转
//正确写法：
int g =(int)(9.2 + 3 + 2.6f);//优先算的是后面的括号再强转
~~~

2. <img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220510223233944.png" alt="image-20220510223233944" style="zoom:67%;" />

# 十四、基本数据类型 跟 String类型的转换

## 一、基本数据类型转换成String型

1. ## <font color = "red">语法:String  s1 = 基本数据类型的变量名 + "";</font>.

2. eg:

   ~~~java
   public class StringBasicType_Interconversation01{
   	public static void main(String[] args){
   		/*BasicType——>String*/
   		//GrammarIs:String s = BasicTypeName +"";eg:
   		int i = 2;
   		float f =1.9f;
   		boolean b = false;
   		String si = i + "";		
   		String sf = f + "";		
   		String sb = b + "";		
   		System.out.println(si + sf  + sb);		
   	}
   }
   ~~~

## 二、String型转换成基本数据类型

1. #### <font color = "red">语法:通过基本数据类型的包装类调用parseXX方法即可</font>

2. #### <font color = "red">'.'点前面的是对应基本数据类型的包装类，'.'点后面是parse(解析)对应的基本类型</font>.

3. #### <font color = "red">基本类型包首字母要大写.parse解析成的类型也要大写</font>.

4. eg:

   ~~~java
   //'.'点前面的是对应基本数据类型的包装类，'.'点后面是parase(解析)对应的基本类型
   		// 基本类型包首字母要大写.parse解析成的类型也要大写
   		int s1 = Integer.parseInt(s);//30
   		double s2 = Double.parseDouble(s);//30.0
   		float s3 = Float.parseFloat(s);//30.0
   		long s4 = Long.parseLong(s);//30
   		System.out.println(s1);
   
   ~~~

5. ## <font color = "red">注意事项</font>:

   * ## <font color = "besd">String类型转换成基本数据结构，要确保要转换的String类型的值转换成对应的基本数据类型,比如：“123”这个需要转换成整形，而不能转换成其它类型</font>.

   * ## <font color = "dhsd">格式不正确会出现异常，程序终止</font>.

# 十五、Chapter04:运算符/进制

* ## <font color = "blue">运算符是一种特殊符号，用来表示数据的 运算、赋值、比较等</font>.

## 一、算数运算符(ArithmaticOperate)

1. <img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220513163230936.png" alt="image-20220513163230936" style="zoom:80%;" />

2. #### 对于：%  ,  \  ,  ++ 的重点笔记。Chapter04\ArithmaticOperate01 ——03

   ~~~java
   //对 ‘\’ 除的运用
   //java中整数相除,结果只得整数小数点之后不要
   		System.out.println(10 / 4);
   
   		//10.0是double型,结果:2.5
   		System.out.println(10.0/4);
   		
   		//10 / 4 = 2(取整嘛)，又因为double类型2——>2.0
   		double d = 10 / 4; 
   		System.out.println(d);
   
   //取 % 余的本质:公式:a % b = a - a / b * b
   		System.out.println(10 % 3);//1
   		System.out.println(-10 % 3);//-10 - (-10)/3 * 3 =-10 + 9 = -1
   		System.out.println(10 % -3);//10 - 10/(-3) * (-3) =10 - 9 = 1
   		System.out.println(-10 % -3);//(-10) - (-10) / (-3) * (-3) = (-10) + 9 =-1
   		//java中最小数可以取余运算
   		System.out.println(-10.1 % 3.2);//(-10.1) - (-10.1)/(3.2) * (3.2) = (-10.1)+9.6 =-0.4444..9
   
   /*若i单独使用++i,i++,效果都是:i = i + 1,eg:*/
   		int i = 1;
   		i++;//2
   		System.out.println(i);
   		++i;//3,又加一次
   		System.out.println(i);
   
   		/*若作为表达式使用:
   		++i 是++再赋值
   	    i++ 是先赋值再++
   		*/
   		int j =2;
   		//先2+1=3再把3赋值给k
   		int k = ++j;//k = 3，j = 3
   		System.out.println("k = " + k +" j = " + j);
   		int j2 = 2;
   		int k2 = j2++;
   		System.out.println("k2 = " + k2 + " j2 = " + j2);//k = 2,j2 =3
   ~~~

   

## 二、关系运算符(比较运算符)

1. 关系运算符：(比较运算符)

   <img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220515103217270.png" alt="image-20220515103217270" style="zoom:67%;" />，

2. #### 关系运算符细节：

   * ## <font color ="blue">关系运算符的结果都为boolean型,要么是ture,要么是false</font>.

   * ## <font color ="blue">关系运算符组成的表达式称为关系表达式.eg: a > b</font>.

   * ## <font color ="blue">不要把比较运算符"=="与"="弄混,"=="为等于,"="为赋值</font>.  



## 三、逻辑运算符

* #### <font color="dfsf">逻辑运算符:用于连接多个条件(关系表达式),最终结果是一个boolean值</font>.

1.<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220515112133818.png" alt="image-20220515112133818" style="zoom:67%;" />.

2.

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220515112345294.png" alt="image-20220515112345294" style="zoom:67%;" />.

3.案例:Chapter04\LogicOperator01

~~~java
public class LogicOperator01{
	public static void main(String[] args){
		/*&&的短路现象:两真则真,一假则假*/
		/*对于&则无短路现象,第一个为false，后面仍然判断*/
	int logic01 = 30;
	System.out.println(logic01 > 20 && logic01 <100);//两真则真
	System.out.println(logic01 > 40 && logic01 <100);//一假则假
	if( logic01 < 1 && ++logic01 <32 ){
		System.out.println("&&的短路效应,第一个为假,后面就不执行,所以++logic01不执行.");
	}
	System.out.println("logic01 = " + logic01);
	/*||的短路现象:一真则真,两假则假*/
    /*|则无短路现象，第一个为True，后面仍然判断*/
	int logic02 = 40;
	System.out.println(logic02 > 10 || logic02 < 10);//一真则真
	System.out.println(logic02 > 60 || logic02 < 10);//两假则假
	/*！:取反,真变假，假变真*/
	boolean logic03 = true;
	System.out.println(!logic03);

        /*！:取反*/
	boolean logic03 = true;
	System.out.println(!logic03);
	System.out.println( "！(10 > 3) = " + !(10 > 3));
	/* ^ ,两个Boolean结果相同为false,不同为true*/
	boolean b = (2 > 3)^(3 > 4);//F^F=F
	System.out.println("(2 > 3)^(3 > 4) = " + b);
	boolean b2 = (3 >2)^(3 > 4);//T^F=T
	System.out.println("(3 >2)^(3 > 4) = " + b2);
	}
}
~~~



## 四、赋值运算符

![image-20220516170800795](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220516170800795.png)。

1. ###### 在复合赋值运算时,会有一个类型的强制转换:

   ~~~java
   //eg:
   byte b = 2;
   b += 2; //等价于 b = (byte)(b + 2);
       //若此时把 b += 2;写成 b = b + 2;在错误.
   ~~~

   

## 五、三目运算符

1. #### 语法:<font color ="orane">条件表达式 ?  表达式1 : 表达式2</font>.

2. #### <font color ="ornse">条件表达式为 真 时 (取表达式1),若为假(取表达式2)</font>. 

3. ~~~java
   int 3 > 2 ? 1.1 : 2.4;//这样是不成立的因为表达式1 与 表达式2 都是double型,与int型不兼容
   ~~~

4. ~~~java
   /*用一条三目运算符求出三个值的最大值*/
   		int a = 11;
   		int b = 14;
   		int c = 16;
   		int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
   		/*(a > b ? a : b)是求出一个最大值的结果了，
   		  再把这个最大值的结果与另一个值比较得出最终的最大值*/
   		System.out.println(max);
   ~~~

## 

## 六、运算符的优先顺序

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220516232626433.png" alt="image-20220516232626433" style="zoom:67%;" />。

## 七、进制

### 一、进制——>代码文件:Chapter04\BinaryTest

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220517150129908.png" alt="image-20220517150129908" style="zoom:67%;" />。

## 二、<font color="red">进制转换</font>(重点)

### <font color="oran">一、三大进制转十进制</font>:

* #### <font color="orane">二进制转十进制</font>.

* <img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220517152619312.png" alt="image-20220517152619312" style="zoom:50%;" />。

* #### <font color="orane">八进制转十进制</font>.

* <img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220517153001210.png" alt="image-20220517153001210" style="zoom: 50%;" />.

* #### <font color="orane">十六进制转十进制</font>.

* <img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220517153559783.png" alt="image-20220517153559783" style="zoom:50%;" />.

### <font color="oran">二、十进制转三大进制</font>:

* ## <font color="orane">十进制转二进制</font>.

* <img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220519144501495.png" alt="image-20220519144501495" style="zoom:50%;" />。0B后面至少凑齐八位

* ## <font color="orane">十进制转八进制</font>.

* <img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220519144754067.png" alt="image-20220519144754067" style="zoom:50%;" />。

* ## <font color="orane">十进制转十六进制</font>:

* <img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220519145127808.png" alt="image-20220519145127808" style="zoom:50%;" />.结果:0X14D



### <font color="oran">三、三大进制相互转换</font>:

* ## <font color="orane">二进制转八进制</font>:

* <img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220519145607971.png" alt="image-20220519145607971" style="zoom:50%;" />.

* ## <font color="orane">二进制转十六进制</font>:

* <img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220519150159037.png" alt="image-20220519150159037" style="zoom:50%;" />.

* ## <font color="orane">八进制转二进制</font>:

* <img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220519150522484.png" alt="image-20220519150522484" style="zoom:50%;" />。鼠标指的那里多余的0被省掉了

* ## <font color="orane">十六进制转二进制</font>:

* <img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220519150950105.png" alt="image-20220519150950105" style="zoom:50%;" />。

### 四、原码,反码,补码:

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220519153131215.png" alt="image-20220519153131215" style="zoom:50%;" />.

## 八、位运算符：

### 一、"&"  、"|"   、"^"   、"~";代码文件:Chapter04\PoistionOperator(重点)<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220519153627029.png" alt="image-20220519153627029" style="zoom:67%;" />。



### 二、">>"  、 "<<"  、">>>" (无符号右移)  代码文件:Chapter04\PoistionOperator02(重点)

* <img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220519183945953.png" alt="image-20220519183945953" style="zoom:50%;" />.

  

# 十六、标识符

## 一、什么是标识符？

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220516233459815.png" alt="image-20220516233459815" style="zoom:67%;" />。

## 二、专业的标识符命名规则:

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220517131309655.png" alt="image-20220517131309655" style="zoom:67%;" />.

## 三、关键字:

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220517132134545.png" alt="image-20220517132134545" style="zoom:67%;" />.

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220517132305861.png" alt="image-20220517132305861" style="zoom:67%;" />.

## 四、保留字

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220517132516166.png" alt="image-20220517132516166" style="zoom:67%;" />。

# 十七、键盘输入语句

## 一、Scanner介绍

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220517133026715.png" alt="image-20220517133026715" style="zoom:67%;" />。

1. 代码:Chapter04\ScannerExercise01

~~~java
import java.util.Scanner;//导入java.util包下的Scanner类 ————> Step:1
public class ScannerExercise01{
	public static void main(String[] args){
		/*从控制台接收用户信息,[姓名,年龄,薪水]*/

		//new表示创建一个对象,这里是创建一个Scanner对象————>Step:2
		Scanner input = new Scanner(System.in);//input来接收创建的新类
		System.out.print("请依次输入\n 姓名 >:");
		//当执行到next()方法时光标会等待用户输入
		String name = input.next();//next()函数是接收用户输入的字符串
		System.out.print(" 年龄 >:");
     
		int age = input.nextInt();//nextInt()接收函数的int类型
		System.out.print(" 薪水 >:");
		
        double salary = input.nextDouble();//nextDouble()接收函数的Double类型   
		System.out.println("姓名\t年龄\t薪水");
		
        char gender = input.next().charAt(0);//字符串的输入转换成字符的书写方式
        System.out.println(name + "\t" + age + "\t" + salary );
	}
}
~~~

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220525111512146.png" alt="image-20220525111512146" style="zoom:67%;" />。

# 十八、Chapter05分支控制

## 一、单分支 (代码文件名:Chapter05\if01)

~~~java
import java.util.Scanner;
public class if01{
	public static void main(String[] ags){
		/*
		要求：
		   编写一个 可以输入人的年龄，如果该同志的年龄大于18岁，
		   则输出"你的年龄大于18,要对自己的行为负责",若小于18则输出"好好学习天天向上"
  		思路：
  		1.定义一个Scanner对象,接收输入的年龄
  		2.判断输入的年龄如果大于18,就输输出"你的年龄大于18,要对自己的行为负责"
  		
  		3.最后打印结果  
		*/
		Scanner input = new Scanner(System.in);//创建一个Scanner类方法 赋给input
		System.out.println("please entry your age >:");
		int age = input.nextInt();
		if( age >= 18 ){//&&短路用法,一假则假
			System.out.println("你的年龄大于18,要对自己的行为负责");
		}
	

	}
}
~~~

## 二、双分支 (代码文件名:Chapter05\if01)

~~~java
import java.util.Scanner;
public class if01{
	public static void main(String[] ags){
		/*
		要求：
		   编写一个 可以输入人的年龄，如果该同志的年龄大于18岁，
		   则输出"你的年龄大于18,要对自己的行为负责",若小于18则输出"好好学习天天向上"
  		思路：
  		1.定义一个Scanner对象,接收输入的年龄
  		2.判断输入的年龄如果大于18,就输输出"你的年龄大于18,要对自己的行为负责"
  		  如果小于18，则输出"好好学习天天向上"
  		3.最后打印结果  
		*/
		Scanner input = new Scanner(System.in);//创建一个Scanner类方法 赋给input
		System.out.println("please entry your age >:");
		int age = input.nextInt();
		if( age >= 18 ){//&&短路用法,一假则假
			System.out.println("你的年龄大于18,要对自己的行为负责");
		}else if(age < 18 ){
				System.out.println("好好学习天天向上");
		}
	

	}
}
~~~

## 三、多分支

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220524200439180.png" alt="image-20220524200439180" style="zoom:67%;" />。

## 四、嵌套(文件代码作业: Chapter05\IfNestification)

![image-20220525105444104](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220525105444104.png)。

## 五、switch分支结构

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220525220603385.png" alt="image-20220525220603385" style="zoom:67%;" />。

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220525221307432.png" alt="image-20220525221307432" style="zoom:67%;" />。

### <font color ="bdxs">switch的应用细节</font>:(文件代码:Chapter05\SwitchDetail)

1. #### <font color= "blue">(表达式的数据类型) 必须同 (case后的常量数据类型) 保持一致,或者是可以自动转化成可以相互比较的类型</font>.

eg:     char 可自动转成 int类型

2. #### <font color= "blue">switch(表达式)中的表达式的返回值必须是:(byte、short、int、char、enum【枚举】、String)</font>.

3. ## <font color= "blue">case子句中的值必须是常量(或者是常量表达式),不能是变量</font>.

   #### 常量与变量

   * #### 常量:不可变的

   * #### 变量:是可变的

   * #### <font color= "orae">char c  = 'a';//c 是可变的所以是变量,'a'是常量是不可变的,所以case后能跟'a',不能跟c </font>.

4. #### <font color= "blue">default可选写,不一定必须要,若不写default在所有情况不符合的时候啥也不输出</font>.



5. #### <font color= "blue">当遇到了break时则跳出switch语句，没有遇到在继续执行</font>.

# 十九、Switch & if 的比较

## 一、选择switch | if 的原则

1. #### <font color="blues">如果判断的具体数值不多,且符合 byte,char,short,int,enum(枚举法),String类型则建议用switch</font>.

2. #### <font color="blues">其它情况:比如 对某个区间的判断,对结果为boolean类型的判断, 就建议用if,  if 的使用范围更广泛</font>. 

# 二十、for循环

## 一、for循环语法：

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220530201519066.png" alt="image-20220530201519066" style="zoom:50%;" />。

#### for循环的流程图:

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220530202157792.png" alt="image-20220530202157792" style="zoom:67%;" />.

![image-20220530210431736](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220530210431736.png)。

# 二十一、while循环Chapter05\WhileExercise

1. #### while循环语法:

   <img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220602194919962.png" alt="image-20220602194919962" style="zoom:50%;" />.

   <img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220602195125917.png" alt="image-20220602195125917" style="zoom:50%;" />.

2. ##### do..while循环 Chapter05\Do_While01

   <img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220602214147507.png" alt="image-20220602214147507" style="zoom:50%;" />。

   <img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220602215825206.png" alt="image-20220602215825206" style="zoom: 67%;" />。

# 二十二、多重循环 Chapter05\ForExercise

1. <img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220603152625448.png" alt="image-20220603152625448" style="zoom: 50%;" />。

# 二十三、Break细节

![image-20220606155520569](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220606155520569.png)。

* #### 具体代码看Chapter05\BreakDetail

* <img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220606155848503.png" alt="image-20220606155848503" style="zoom:67%;" />.

# 二十四、Continue

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220606163540963.png" alt="image-20220606163540963" style="zoom:67%;" />。

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220606163601148.png" alt="image-20220606163601148" style="zoom:67%;" />。

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220606163912112.png" alt="image-20220606163912112" style="zoom:67%;" />。

* ### 代码:Chapter05\ContinueDetail

# 二十五、return跳转语句

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220606173610102.png" alt="image-20220606173610102" style="zoom:67%;" />。
