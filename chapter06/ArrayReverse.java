//���鷴ת


public class ArrayReverse {
	public static void main(String[] args) {
		
		//ʵ������������Ԫ�صķ�ת
		//int[] arr1 = {11, 22, 33, 44, 55, 66}
		//----> {66, 55, 44, 33, 22, 11}			
		
		//1.��ʽ1��ͨ���ҹ��ɷ�ת
		int[] arr1 = {11, 22, 33, 44, 55, 66};	
		int temp = 0;
		int len = arr1.length;//��������ĳ���	
		//0-5 1-4 2-3 ���黥��
					
		//����arr1
		for (int i = 0; i <= len / 2; i++) {
			temp = arr1[len - 1 - i];
			arr1[len - 1 - i] = arr1[i];
			arr1[i] = temp;
		}		

		//����arr1��ֵ
		System.out.println("====arr1��Ԫ��====");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);//10��2��3
		}

		//��ʽ2��ʹ������ֵ����--->�Ӷ�ʹarr1�ָ�ԭ��
		//˼·����
		//1.�ȴ���һ���µ�����arr2 ��С��arr1.length
		//2.�������arr1����ÿ��Ԫ�ؿ�����arr2��Ԫ���У�˳�򿽱���
		//3.��������һ��ѭ������ j 0 -> 5
		
		int[] arr2 = new int[len];
		//�������
		for (int i = len - 1, j = 0; i >= 0 ; i--, j++) {
			arr2[j] = arr1[i];
		}	
			
		//4.��forѭ������ arr2���Ǹ�ԭ�������{11, 22, 33, 44, 55, 66};
		//5.��arr1ָ��arr2���ݿռ䣬��ʱarrԭ�������ݿռ��û�б�������
		//	�ᱻ��������������
		arr1 = arr2;

		//����arr1��ֵ
		System.out.println("====arr1��Ԫ��====");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);//10��2��3
		}


	}
}