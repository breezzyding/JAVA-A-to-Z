/*
chapter04 本章作业
 */

public class Homework{

	//编写一个main方法
	public static void main(String[] args) {

		//1.计算下列表达式的结果
		//10 / 3 = 
		//10 / 5 =
		//10 % 2 =
		//-10.5 % 3 =
		System.out.println(10 / 3);//3
		System.out.println(10 / 5);//2
		System.out.println(10 % 2);//0
		System.out.println(-10.5 % 3);//-1.5



		//2.试说出下面代码的结果
		//int i = 66;
		//System.out.println(++i+i);
		
		int i = 66;
		//1.先自加(66+1) => i = 67
		//2.输出 i + i = 134
		System.out.println(++i+i);//134



		//3.在Java中，以下赋值语句正确的是()	// C D
		
		//A)int num1 = (int)"18";			//错误 应该Integer.parseInt("18");
		//B)int num2 = 18.0;				//错误 double 给 int
		//C)double num3 = 3d;				//正确
		//D)double num4 = 8;				//正确
		//E)int i = 48;char ch = i + 1;		//错误 int 给 char
		//F)byte b = 19;short s = b + 2;	//错误 int 给 short	
		


		//4.试写出将String转换成double类型的语句，以及将
		//	char类型转换成String的语句，举例说明
		
		String str1 = "18.8";
		double d1 = Double.parseDouble(str1);
		System.out.println(d1);

		char ch1 = 'D';
		String str2 = ch1 + ""  //要记牢 如何转String
		System.out.println(ch1);
	}
}
