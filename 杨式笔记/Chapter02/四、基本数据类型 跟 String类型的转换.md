# 四、基本数据类型 跟 String类型的转换

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

# 1.基本类型 ——>String

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
		/*BasicType ——> String*/
		System.out.println("==============");
		String s = "30";
		//'.'点前面的是对应基本数据类型的包装类，'.'点后面是parse(解析)对应的基本类型
		//基本类型包首字母要大写.parse解析成的类型也要大写
		//括号里()里的是字符串
		int s1 = Integer.parseInt(s);//30
		double s2 = Double.parseDouble(s);//30.0
		float s3 = Float.parseFloat(s);//30.0
		long s4 = Long.parseLong(s);//30
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
~~~

