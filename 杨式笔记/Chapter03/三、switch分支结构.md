## 三、switch分支结构

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