/*
�������ϰ
 */

public class ArrayExercise02 {
	public static void main(String[] args) {
		

		//�����һ������int[]�����ֵ{4, -1, 9, 10, 23}
		//���õ���Ӧ���±�
		
		//˼·����
		//1.����һ��int���� int nums[] = {4, -1, 9, 10, 23};
		//2.�ٶ�max = nums[0] �����ֵ��maxIndex=0
		//3.���±�1��ʼ���� �� max < nums[i] 
		//	�� max = nums[i] maxIndex = i
		//4.���������	
		
		int nums[] = {4, -1, 9, 10, 23, 330, -19, 112};
		int max = nums[0];
		int maxIndex = 0;

		//�����ҵ����ֵ
		for (int i = 1;i < nums.length; i++) {//���±�1��ʼ����
			if (max < nums[i]) {
				max = nums[i];
				maxIndex = i;				
			}
		}
		System.out.println("��������������" + max +
			"�����Ӧ���±���" + maxIndex);	
		
	}
}