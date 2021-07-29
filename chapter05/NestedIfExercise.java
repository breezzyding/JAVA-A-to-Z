//嵌套分支

import java.util.Scanner;

public class NestedIfExercise {
	public static void main(String[] args) {
		
		/*
		需求
		出票系统:根据淡旺季的月份和年龄，打印票价
		
		4-10旺季：
			成人 18-60 ： 60
			儿童 < 18  ： 30
			老人 > 60  ： 20

		其他月份淡季：
			成人		： 40
			其他 	： 20

		 
		思路分析
		1.创建Scanner对象，接受用户输入
		2.接受 月份 保存到 int month
		3.使用if-else 判断 淡季还是旺季		  
		4.接收int age，使用if-else输出对应票价

		 */
		
		
		//代码实现
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入当前月份：");	
		double month = myScanner.nextInt();
		if (month >= 4 && month <= 10) {
			System.out.println("现在是旺季。");			
			System.out.println("请输入观光者年龄信息：");			
			int age = myScanner.nextInt();
			if (age >= 18 && age <= 60) {
				System.out.println("您好，您的票价为60元。");				
			} else if (age < 18) {
				System.out.println("小朋友你好！您的票价为30元。");
			} else {
				System.out.println("您好，您的票价为20元。");
			}
			
		}else {
			System.out.println("现在是淡季。");			
			System.out.println("请输入观光者年龄信息：");
			int age = myScanner.nextInt();
			if (age >= 18 && age <= 60) {
				System.out.println("您好，您的票价为40元。");				
			} else {
				System.out.println("您好，您的票价为20元。");
			}
			
		}
	}
}	