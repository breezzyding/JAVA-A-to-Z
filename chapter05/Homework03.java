import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		
		//实现判断一个年份是否是闰年？
		//1)年份能被4整除，但不能被100整除；
		//2)能被400整除；
		//		
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个年份");
		int month = myScanner.nextInt();
		if (month % 4 == 0 && month % 100 != 0 || month % 400 == 0) {
			System.out.println(month + "是闰年。");
		} else {
			System.out.println(month + "不是闰年。");
		}
	}
}