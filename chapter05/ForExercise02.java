/*
forѭ����ϰ��
 */
public class ForExercise02 {
	public static void main(String[] args) {
		
		//ϰ��2
		//���������ʽ�����
		/*
			0 + 5 = 5
			1 + 4 = 5
			2 + 3 = 5
			3 + 2 = 5
			4 + 1 = 5
		*/
		
		//˼·����
		//(1) ������������ int i = 0 int j = 5 ����֮�� sum = 5��
		//(2) i++ j-- 
		//(3) �� i <= sum ʱ ���� j == 0 ʱ����ѭ�� 
		//(4) ѭ������Ӧ����һ��������
		//(5) !!! ���Է��� j = sum - i 
		//(6) ��һ���򻯳���
		
		//����ʵ��
		int sum = 5;//����
		int start = 0;//�趨���

		//��������ڲ���
		for (int i = start, j = sum - i; i <= sum; i++ ) {
				System.out.println(i + " + " + (sum - i) + " = " + sum);
		}
	}
}	