import java.util.Scanner;

public class Homework06 {
	public static void main(String[] args) {
		
		//ʵ���ж�һ�������������ĸ���Χ������0 С��0 ����0
		//
		//˼·����
		//1.����Scanner����
		//2.int num ���һ������
		//3.<0 >0 =0
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ������");
		int num = myScanner.nextInt();
		if (num > 0 ) {
			System.out.println("����0");
		} else if (num < 0 ) {
			System.out.println("С��0");
		} else {
			System.out.println("����0");
		}
	}
}