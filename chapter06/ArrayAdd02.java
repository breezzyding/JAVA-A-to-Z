//�������

import java.util.Scanner;

public class ArrayAdd02 {
	public static void main(String[] args) {		
		
		/*
		ʵ�ֶ�̬�ĸ��������Ԫ��Ч����ʵ�ֶ���������
		1.ԭʼ����ʹ�þ�̬���� int[] arr = {1, 2, 3};
		2.����Ԫ��4 ֱ�ӷ����������� arr = {1, 2, 3, 4};
		3.�û�����ͨ�����·����������Ƿ������ӣ���ӳɹ����Ƿ������y/n
		 

		˼·����
		1.�����ʼ���� int[] arr = {1, 2, 3}//�±�0-2
		2.arr[3] = 4;//���� �ռ��Ѿ����̶��
		3.����һ���µ����� int[] arrNew = new int[arr.length + 1];
		4.����arr���飬���ν�arr��Ԫ�ؿ�����arrNew����
		5.��4����arrNew[arrNew.length - 1] = 4
		6.����һ��Scanner ���Խ����û�����
		7.��Ϊ�û�ʲôʱ���˳�����ȷ����ʹ��do-while + break
		 */

		Scanner myScanner = new Scanner(System.in);
		int[] arr = {1, 2, 3};

		do {
			System.out.println("�Ƿ�������Ԫ�أ�y/n");
			char answer = myScanner.next().charAt(0);
			if (answer == 'n') {
				break;
			}
			int[] arrNew = new int[arr.length + 1];
					
			//����arr1,��ÿ��Ԫ�ؿ�����arr2��Ӧ��Ԫ��
			for (int i = 0; i < arr.length; i++) {
				arrNew[i] = arr[i];
			}

			System.out.println("����Ҫ��ӵ�Ԫ����:");
			int numNew = myScanner.nextInt();
			arrNew[arrNew.length - 1] = numNew;

			arr = arrNew;

			//����arr��ֵ
			System.out.println("====arr��Ԫ��====");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.print("\n");	
		}while (true);
	}
}