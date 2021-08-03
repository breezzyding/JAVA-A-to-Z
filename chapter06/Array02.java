/*
数组的使用
 */

import java.util.Scanner;


public class Array02 {
	public static void main(String[] args) {
		

		//使用方式1 动态初始化
		//循环输入5个成绩，保存到double数组，并输出
	

		Scanner myScanner = new Scanner(System.in);
		//1.声明并开辟空间
		double[] scores = new double[5];//也可以double scores[]
		//2.循环输入
		for (int i = 0;i < scores.length;i++) {
			System.out.println("请输入第" + (i + 1) + "个成绩");
			scores[i] = myScanner.nextDouble();
		}

		//2.循环输出
		System.out.println("==数组的元素情况如下==");
		for (int i = 0;i < scores.length;i++) {
			System.out.println("第" + (i + 1) + "个成绩=" + scores[i]);
		


		//使用方式2 动态初始化
		//先声明 再创建
		
		double salary[];//声明数组，这时 salary 是 null
		salary = new double[5];//分配内存空间，可以存放数据
		



		//使用方式3 静态初始化
		//int a[] = {2, 5, 6, 7, 8, 56}
		//掌握了所有的数据（有限）可以使用这种方法
		//
		}
	}
}