public class Homework04 {
	public static void main(String[] args) {
		
		//��֪�и����������,Ҫ�����һ��Ԫ��,�������˳����Ȼ������
		//����{10, 12, 45, 90} ���23��,����Ϊ{10, 12, 23, 45, 90}
		

		//˼·����
		//���� + ��λ
		//1.��ȷ�� �����Ӧ�ò��뵽�ĸ�����
		//2.Ȼ������
		
		
		//��������
		int[] nums = {10, 12, 45, 65, 90, 97};

		int insertNum = 66;

		int index = -1;//index����Ҫ�����λ��

		//�������� ������� insertNum <= arr[i],˵��i����Ҫ�����λ��
		//ʹ��index ����i index = i
		//������������û�з��� insertNum <= arr[i]
		//˵��index = nums.length ����ӵ�nums��ĩβ
		for (int i = 0; i < nums.length; i++) {
			if (insertNum <= nums[i]) {//�Ƚϴ�С
				index = i;//����
				break;//��Ϊ���������� ���Ҳ�������Ӱ����index�Ķ�λ
			}
		}

		//�ж�index ��ֵ
		if (index == -1) {//˵����û���ҵ�λ��
			index = nums.length;//��ӵ�ĩβ
		}

		//����
		//�ȴ���һ���µ����� ��Сnums.length + 1
		int[] numsNew = new int[nums.length + 1];
		//��nums��Ԫ�ؿ�����arrNew����������index λ��
		/*
		������
		int[] nums = {10, 12, 45, 90};
		numsNew = {                }
		���� ʹ��i
		i != index ��ô�ͷ���Ԫ�� ������index
		��󲹳���index 
		 */
		
		//i��ָ��������ģ�j��ָ�������
		for (int i = 0, j = 0; i < numsNew.length; i++) {
			
			if (i != index) {//˵�����԰�nums��Ԫ�ؿ�����numsNew
				numsNew[i] = nums[j];
				j++;//ÿ��һ�ο������ͺ���һλ�����ж�׼
			}else {//i���λ�þ���Ҫ�������
				numsNew[i] = insertNum;
			}			
		}
		
		//��numsָ��numsNew ԭ��������ͳ�Ϊ���� ������
		nums = numsNew;


		System.out.println("=======�����numsNew����=======");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
		}
	}
}