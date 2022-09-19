# 八、Continue

## 一、语法：

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220606163540963.png" alt="image-20220606163540963" style="zoom:67%;" />。

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220606163601148.png" alt="image-20220606163601148" style="zoom:67%;" />。

<img src="C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220606163912112.png" alt="image-20220606163912112" style="zoom:67%;" />。

## Detail 01

~~~java
public class ContinueDetail{
	public static void main(String[] args) {
		label1:
		for(int j = 0 ;j < 4; j++){
					label2:
					for(int i = 0 ;i < 5;i++){
						if(i == 2){
	//这里跟break一样,只不过continue是向上跳转具体作用到哪一个标签就在continue后面注明,否则默认跳转至最近的循环
					 		continue;
						}
							System.out.println(i);
					}
		}
	}
}
~~~

