//��ʾdo-while��ʹ��

public class DoWhite01 {
	public static void main(String[] args) {
		
		//���10�� hello,Ding.
		int i = 1;//ѭ��������ʼ��
		do {
			//ѭ��ִ�����
			System.out.println("hello,Ding. X" + i);
			//ѭ����������
			i++;
		}while (i <= 10);
		
		System.out.println("�˳� do while ����ִ��..." + i);

		System.out.println("\n�����ǿ�����ϰ\n=============");

		//������ϰ
		//��ϰ1
		//��ӡ1-100
		int j = 1;//ѭ��������ʼ��
		int end = 100;//����ֵ
		do {
			//ѭ��ִ�����
			System.out.println(j);
			//ѭ����������
			j++;
		}while (j <= end);
		
		//��ϰ2
		//����1-100�ĺ� 
		int k = 1;//ѭ��������ʼ��
		int sum = 0;
		do {
			//ѭ��ִ�����
			sum = sum + k;
			//ѭ����������
			k++;
		}while (k <= end);
		System.out.println("1-100�ĺ�Ϊ" + sum);
	}
}