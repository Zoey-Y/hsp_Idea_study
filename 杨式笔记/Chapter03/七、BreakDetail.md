# 七、BreakDetail

## 细节总体：

![image-20220606155520569](C:\Users\86199\AppData\Roaming\Typora\typora-user-images\image-20220606155520569.png)。

## 细节label用法：

~~~java
public class BreakDetail{
	public static void main(String[] args){
		/*
		break中标签法不建议使用:降低可读性
		以下为标签法演示:
		*/
					/*
					(1)
						label1:
						for(int j = 0 ;j < 4; j++){
							label2:
							for(int i = 0 ;i < 5;i++){
								if(i == 2){
								 	break;//break默认跳出的是最近的一个循环
								}
								System.out.println(i);
							}
						}
					*/

					/*
					(2)
						label1:
						for(int j = 0 ;j < 4; j++){
							label2:
							for(int i = 0 ;i < 5;i++){
								if(i == 2){
								 	break label1;//若break指定了某一标签则直接跳出该标签
								} 
								System.out.println(i);
							}
						}
					*/
	}
}
~~~



