
import java.util.Scanner;

public class IfExercise01 {
	public static void main(String[] args) {
		
		//2.编写程序，声明2个double型变量并赋值。判断第一个数大于10.0，
		//	且第2个数小于20.0，打印两数之和。
		double num1 = 12.34;
		double num2 = 14.23;
		if (num1 > 10.0 && num2 < 20.0) {
			System.out.println("两数之和：" + (num1 + num2));
		}



		//3.定义两个变量int,判断二者的和，是否能被3又能被5整除，
		//	打印提示信息
		int a = 7;
		int b = 8;
		if ((a + b) % 3 == 0 && (a + b) % 5 == 0) {
			System.out.println("两者之和，既能被3整除又能被5整除。");
		}else {
			System.out.println("两者之和，不能同时被3和5整除。");
		}



		//4.判断一个年份是否是闰年，闰年的条件是符合下面二者之一：
		//	1)年份能被4整除，但不能被100整除；
		//	2)能被400整除；
		//	
		//	思路分析
		//1.引用Scanner	
		//2.定义int year 保存输入年份
		//3.条件编写
		//	1)year % 4 == 0 && year % 100 !=0
		//	2)year % 400 == 0
		//4.条件之间的关系？  是或 应当使用 || 连接
		//代码实现
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个年份：");
		int year = myScanner.nextInt();
		if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
			System.out.println(year + "是闰年。");
		}else {
			System.out.println(year + "不是闰年。");
		}
	}
}
