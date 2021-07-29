/*
演示for的使用细节
 */

public class ForDetail {
	public static void main(String[] args) {

		/*
		1)循环条件是返回一个布尔值的表达式
		*/		 
		
		//2)for(;循环判断条件;)中的初始化和变量迭代可以写到其他地方，
		//  但是两边的分号不能省略
		int i = 1; //循环变量初始化
		for (; i <= 10 ;) {			
			System.out.println("你好，丁丁！ x" + i);	
			 i++;//变量迭代也可以写在循环体内	
		}
		System.out.println("i=" + i);//输出结果11 
									 //i的使用只能在循环体内部
		

		// //补充
		// int j = 1;
		// for (; ; ) {//表示一个无限循环，死循环
		// 	System.out.println("ok~" + (j++));
		// }


		// 3)循环初始值可以有多条初始化语句，但要求类型一样，并中间用逗号隔开，
		//   循环变量迭代也可以有多条变量迭代语句，中间用逗号隔开。
		// 4)使用内存分析法，老师分析输出下面代码输出什么
		int count = 3;
		for (int m = 0,n = 0; m < count ; m++,n += 2 ) {//变量不要重复使用哦~
			System.out.println("m=" + m + " n=" + n);  	//m=0 n=0
														//m=1 n=2
														//m=2 n=4
		}
	}
}



