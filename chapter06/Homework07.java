public class Homework07 {
	public static void main(String[] args) {
		
		//��ϰð�����򷨣���С����
		//int[] nums = {35, 13, 30, 17, 7};		һ��5��Ԫ�أ�
		
		/*
			Round 1 				��1�� ���� 4 �ν��� (nums.length - 1)
			1st 13 35 30 17 07
			2rd	13 30 35 17 07
			3nd 13 30 17 35 07
			4th 13 30 17 07 35
			Round 2 				��2�� ���� 3 �ν��� (nums.length - 2)
			1st 13 30 17 07 35
			2rd	13 17 30 07 35
			3nd 13 17 07 30 07
			Round 3 				��3�� ���� 2 �ν��� (nums.length - 3)
			1st 13 17 07 30 35
			2rd	13 07 17 30 35
			Round 4 				��4�� ���� 1 �ν��� (nums.length - 4)
			1st 07 13 17 30 35
		
		 */

		//��������
		int[] nums = {35, 13, 30, 17, 7, 23, 11, 8};
		//��ʱ���
		int temp = nums[0];
		
		//��������  nums.length - 1
		for (int i = 0; i <nums.length - 1; i++) {
			
			//ÿһ�ֽ���,�������� nums.length - 4
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[j + 1]) {//�Ƚ���������
					//����
					temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;				
				}
			}

			//��ӡÿһ�ֵĽ��
			System.out.println("--------------- �� " + (i + 1) + " �� �� �� �� �� �� �� ---------------");
			for (int j = 0; j < nums.length ; j++) {
		 		System.out.print(nums[j] + "\t");
		 	}
		 System.out.println();
		}
	}
}