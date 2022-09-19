# 一、Java运行流程：

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

   