//��������

import java.util.Scanner;

public class ArrayReduce {
	public static void main(String[] args) {		
		
		/*
		ʵ�ֶ�̬�ĸ�����ɾ��Ԫ��Ч����ʵ�ֶ���������		
		�û����Ծ����Ƿ����������ÿ����������Ǹ�Ԫ��
		��ֻʣ�����һ��Ԫ�أ���ʾ����������
		 

		˼·����
		1.�����ʼ���� int[] arr = {1, 2, 3, 4, 5}//�±�0-4		
		2.����һ���µ����� int[] arr = new int[arr.length - 1];
		3.����arr���飬���ν�arrǰ���Ԫ�أ��������һ����������arrNew����
		4.��arrNew����arr		
		4.����һ��Scanner ���Խ����û�����
		5.��Ϊ�û�ʲôʱ���˳�����ȷ����ʹ��do-while + break
		6.�ж��Ƿ�ֻʣ��һ��Ԫ�أ���ʾ����������
		 */

		Scanner myScanner = new Scanner(System.in);
		int[] arr = {1, 2, 3,4, 5};

		do {
			if (arr.length == 1) {
				System.out.println("ֻʣ�����һ��Ԫ���ˣ�������������");
				break;
			}
			
			int[] arrNew = new int[arr.length - 1];
					
			//����arr,��ǰ���Ԫ�أ��������һ����������arrNew��Ӧ��Ԫ��
			for (int i = 0; i < arr.length - 1; i++) {
				arrNew[i] = arr[i];
			}	

			arr = arrNew;

			//����arr��ֵ
			System.out.println("====arr��Ԫ��====");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.print("\n");	

			System.out.println("�Ƿ��������Ԫ�أ�y/n");
			char answer = myScanner.next().charAt(0);
			if (answer == 'n') {
				break;
			}
		}while (true);
	}
}