import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		
		//ʵ���ж�һ������Ƿ������ꣿ
		//1)����ܱ�4�����������ܱ�100������
		//2)�ܱ�400������
		//		
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ�����");
		int month = myScanner.nextInt();
		if (month % 4 == 0 && month % 100 != 0 || month % 400 == 0) {
			System.out.println(month + "�����ꡣ");
		} else {
			System.out.println(month + "�������ꡣ");
		}
	}
}