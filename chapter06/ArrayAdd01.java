//�������

public class ArrayAdd01 {
	public static void main(String[] args) {		
		
		/*
		ʵ�ֶ�̬�ĸ��������Ԫ��Ч����ʵ�ֶ���������
		1.ԭʼ����ʹ�þ�̬���� int[] arr = {1, 2, 3};
		2.����Ԫ��4 ֱ�ӷ����������� arr = {1, 2, 3, 4};

		3.�û�����ͨ�����·����������Ƿ������ӣ���ӳɹ����Ƿ������y/n
		3�Ĺ����� ArrayAdd02��ʵ��

		˼·����
		1.�����ʼ���� int[] arr = {1, 2, 3}//�±�0-2
		2.arr[3] = 4;//���� �ռ��Ѿ����̶��
		3.����һ���µ����� int[] arr = new int[arr.length + 1];
		4.����arr���飬���ν�arr��Ԫ�ؿ�����arrNew����
		5.��4����arrNew[arrNew.length - 1] = 4
		 */

		int[] arr = {1, 2, 3};
		int[] arrNew = new int[arr.length + 1];
				
		//����arr,��ÿ��Ԫ�ؿ�����arrNew��Ӧ��Ԫ��
		for (int i = 0; i < arr.length; i++) {
			arrNew[i] = arr[i];
		}

		arrNew[arrNew.length - 1] = 4;

		arr = arrNew;

		//����arr��ֵ
		System.out.println("====arr��Ԫ��====");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}	
		
	}
}