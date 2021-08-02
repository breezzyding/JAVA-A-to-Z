import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
		
		//判断一个整数是否是水仙花数，所谓的水仙花数是指一个3位数，
		//其各个位上数字立方和等于其本身，例如153= 1^3+3^3+5^3
				
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int num = myScanner.nextInt();
		int hundred = num / 100;		
		int ten = (num % 100) / 10;
		int bit = num % 10;
		if (num == hundred * hundred * hundred + ten * ten * ten +
			bit * bit * bit ) {
			System.out.println(num + "是水仙花数。");
		} else {
			System.out.println(num + "不是水仙花数。");
		}
	}
}

//Homework05
// class Demo {
// 	public static void main(String[] args) {
// 		int m = 0, n = 3;
// 		if (m>0) {
// 			if(n > 2)
// 				System.out.println("OK1");
// 			else
// 				System.out.println("OK2");
// 		}
// 	}
// }
// 
// 没有任何输出。
