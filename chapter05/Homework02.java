import java.util.Scanner;

public class Homework06 {
	public static void main(String[] args) {
		
		//实现判断一个整数，属于哪个范围：大于0 小于0 等于0
		//
		//思路分析
		//1.创建Scanner对象
		//2.int num 存放一个整数
		//3.<0 >0 =0
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int num = myScanner.nextInt();
		if (num > 0 ) {
			System.out.println("大于0");
		} else if (num < 0 ) {
			System.out.println("小于0");
		} else {
			System.out.println("等于0");
		}
	}
}