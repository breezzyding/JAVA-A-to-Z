/*
����Ĵ�ӡ������
ʹ��forѭ���������İ���
���дһ�����򣬿��Խ���һ����������ʾ����(totalLevel)
��ӡ��������
 */

public class Stars {
	public static void main(String[] args) {
		
		// //ʵ�Ľ�����
		
		// /*
		// ��������
		
		// ʵ�Ľ����� totalLevel = 5 ���һ��*�ĸ��� 2*totalLevel - 1						

		//     *		��һ�� ����ո��� = totalLevel-���������*�� = 2*���� - 1
		//    ***		�ڶ��� ...
		//   *****		...
		//  *******
		// ********* 
 	// 	*/
 	
		
		// int totalLevel = 7;//��ʾ����
		// int n = 1;//��ǰ����

		// while (n <= totalLevel) {
		// 	for (int i = 1; i <= totalLevel - n; i++) {//����ո�
		// 		System.out.print(" ");
		// 	}
		// 	int star = 2 * n - 1;
		// 	for (int j = 1;j <= star;j++) {//�������
		// 		System.out.print("*");
		// 	}
		// 	System.out.print("\n");
		// 	n++;
		// }
		// System.out.print("\n");
		
		
		//����С��
		//���˶�
		//
		//
		//
		// //���Ľ�����
		// /*
		// ��������
		
		// ���Ľ����� totalLevel = 5������int n�����һ��*�ĸ��� 2*totalLevel - 1						

		//     *		��һ�� ����ո��� = totalLevel-n�����һ��*
		//    * *		�ڶ��� (�����һ��)��� totalLevel-n ���ո����һ��*;���2*(n-1)-1;�����һ��*
		//   *   *		������ �����һ���������һ������ǰ��㲻ͬ������ṹ��
		//  *     *		...
		// ********* 	����� ���һ�� ֱ����� 2 * n - 1 ��*
 	// 	*/
 	
 	// 	// int totalLevel = 5;//��ʾ����
		// // int n = 1;//��ǰ����
		// n = 1;//��ʼ������

		// //�����һ��
		// for (int i = 1; i <= totalLevel - n; i++) {//����ո�
		// 		System.out.print(" ");
		// 	}			
		// System.out.print("*");//�������
		// System.out.print("\n");


		// //�м��(����β����)�����
		// n = n + 1 ;//���ڶ����ˣ�����
		// while (n < totalLevel) {
		// 	//�����������ո�
		// 	for (int i = 1; i <= totalLevel - n; i++) {//i�����ظ�ʹ��Ŷ(��ѭ����)
		// 		System.out.print(" ");
		// 	}			
		// 	System.out.print("*");//��������������������

		// 	//����������ڿո�
		// 	//�м���� middle��
		// 	for (int i = 1;i <= (2 * (n - 1) - 1);i++) {
		// 		System.out.print(" ");
		// 	}

		// 	System.out.print("*");//��������������������
		// 	System.out.print("\n");//�ò������ϣ�������һ��
		// 	n++;//ѭ����������
		// }

		// //���һ������
		// for (int i = 1; i <= 2 * totalLevel - 1 ; i++) {
		// 		System.out.print("*");				
		// 	}
		// System.out.print("\n");
		// System.out.print("\n");

		


		//     *		��1�� �� 1��* ��ǰ�еĵ�һ��λ����*�����һ��λ��Ҳ��*
		//    * *		��2�� �� 2��* ��ǰ�еĵ�һ��λ����*�����һ��λ��Ҳ��*
		//   *   *		��3�� �� 2��* ...
		//  *     *		��4�� �� 2��*
		// *       * 	��5�� �� 2��* ȫ�����
		//  *     *		��6��
		//   *   *		��7��
		//    * *		��8��
		//     *		��9��

		int middleLevel = 5;//��ʾ�������м�ԳƲ�Ĳ���		

		//��ӡ�������ε��ϰ벿��
		for (int i = 1; i <= middleLevel ; i++) {//i��ʾ����

			//�����*֮ǰ����Ҫ��� ��Ӧ�ո� = �ܲ���-��ǰ��
			for (int k = 1; k <= middleLevel - i ; k++ ) {
				System.out.print(" ");				
			}

			//���ƴ�ӡÿ��*�ĸ���
			for (int j = 1;j <= 2 * i - 1 ;j++ ) {
				//��ǰ�еĵ�һ��λ����*�����һ��λ��Ҳ��*�����һ��ȫ�����
				if(j == 1 || j == 2 * i - 1 ) {//��ѽ
					System.out.print("*");
				}else {
					System.out.print(" ");
				}				
			}			
			System.out.print("\n");
		}

		//��ӡ�������ε��°벿��
		for (int i = 1; i <= middleLevel - 1 ; i++) {//i��ʾ����  

			//�����*֮ǰ����Ҫ��� ��Ӧ�ո� = ��ǰ��(i=1)
			for (int k = 1; k <= i ; k++ ) {//���i���ո�
				System.out.print(" ");				
			}

			//���ƴ�ӡÿ��*�ĸ���  �������ո�2 * (middleLevel - i) - 1			
			for (int j = 1;j <= 2 * (middleLevel - i) - 1  ;j++ ) {
				//��ǰ�еĵ�һ��λ����*�����һ��λ��Ҳ��*�����һ��ȫ�����
				if(j == 1 || j == 2 * (middleLevel - i) - 1 ) {//��ѽ
					System.out.print("*");
				}else {
					System.out.print(" ");
				}				
			}			
			System.out.print("\n");
		}		
	}
}	


