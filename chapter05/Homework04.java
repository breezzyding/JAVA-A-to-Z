import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
		
		//�ж�һ�������Ƿ���ˮ�ɻ�������ν��ˮ�ɻ�����ָһ��3λ����
		//�����λ�����������͵����䱾������153= 1^3+3^3+5^3
				
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ������");
		int num = myScanner.nextInt();
		int hundred = num / 100;		
		int ten = (num % 100) / 10;
		int bit = num % 10;
		if (num == hundred * hundred * hundred + ten * ten * ten +
			bit * bit * bit ) {
			System.out.println(num + "��ˮ�ɻ�����");
		} else {
			System.out.println(num + "����ˮ�ɻ�����");
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
// û���κ������
