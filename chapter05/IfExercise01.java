
import java.util.Scanner;

public class IfExercise01 {
	public static void main(String[] args) {
		
		//2.��д��������2��double�ͱ�������ֵ���жϵ�һ��������10.0��
		//	�ҵ�2����С��20.0����ӡ����֮�͡�
		double num1 = 12.34;
		double num2 = 14.23;
		if (num1 > 10.0 && num2 < 20.0) {
			System.out.println("����֮�ͣ�" + (num1 + num2));
		}



		//3.������������int,�ж϶��ߵĺͣ��Ƿ��ܱ�3���ܱ�5������
		//	��ӡ��ʾ��Ϣ
		int a = 7;
		int b = 8;
		if ((a + b) % 3 == 0 && (a + b) % 5 == 0) {
			System.out.println("����֮�ͣ����ܱ�3�������ܱ�5������");
		}else {
			System.out.println("����֮�ͣ�����ͬʱ��3��5������");
		}



		//4.�ж�һ������Ƿ������꣬����������Ƿ����������֮һ��
		//	1)����ܱ�4�����������ܱ�100������
		//	2)�ܱ�400������
		//	
		//	˼·����
		//1.����Scanner	
		//2.����int year �����������
		//3.������д
		//	1)year % 4 == 0 && year % 100 !=0
		//	2)year % 400 == 0
		//4.����֮��Ĺ�ϵ��  �ǻ� Ӧ��ʹ�� || ����
		//����ʵ��
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ����ݣ�");
		int year = myScanner.nextInt();
		if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
			System.out.println(year + "�����ꡣ");
		}else {
			System.out.println(year + "�������ꡣ");
		}
	}
}
