public class Homework05 {
	public static void main(String[] args) {
		
		//�������10��������1-100�ķ�Χ�����浽���飬�������ӡ�Լ���ƽ��ֵ��
		//�����ֵ�����ֵ���±꣬�����������Ƿ���8
		
		
		int[] nums = new int[10];
		//(int)(Math.random() * 100) + 1 ���� 1 - 100�������
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 100) + 1;
		}

		System.out.println("====arr��Ԫ��====");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
		}
		System.out.println();
		
		System.out.println("====arr��Ԫ�ص�����====");
		//�����ӡ
		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.print(nums[i] + "\t");
		}
		System.out.println();
		
		//��ӡƽ��ֵ
		//������ֵ����Сֵ���±�
		double sum = 0;
		int maxIndex = 0;
		int minIndex = 0;
		int max = nums[0];
		int min = nums[0];
		for (int i = 0; i < nums.length; i++) {
			//�ۺ�
			sum += nums[i];

			//�����ֵ���±�
			if (nums[i] > max) {
				max = nums[i];
				maxIndex = i;
			}

			//�����ֵ���±�
			if (min > nums[i]) {
				min = nums[i];
				minIndex = i;
			}
		}
		System.out.println("��������Ԫ�ص�ƽ��ֵΪ" + (sum / nums.length));
		System.out.println("���ֵ���±�Ϊ" + maxIndex);
		System.out.println("��Сֵ���±�Ϊ" + minIndex);



		//�������Ƿ����8��
		boolean flag = true;		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 8) {
				System.out.println("���������8Ŷ��");
				flag = false;
				break;
			}			
		}
		if (flag == true) {
			System.out.println("��Ǹ��û���������8��");
		}
		

		
	}
}