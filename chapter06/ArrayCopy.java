//���鿽��


public class ArrayCopy {
	public static void main(String[] args) {
		
		//ʵ�����鿽��
		//��int[] arr1 = {10, 20, 30};������ arr2����
		//Ҫ�����ݿռ��Ƕ�����
		
		
		int[] arr1 = {10, 20, 30};
		int[] arr2 = new int[arr1.length];
				
		//����arr1,��ÿ��Ԫ�ؿ�����arr2��Ӧ��Ԫ��
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		arr2[1] = 35;

		//����arr1��ֵ
		System.out.println("====arr1��Ԫ��====");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);//10��2��3
		}

		//����arr2��ֵ
		System.out.println("====arr2��Ԫ��====");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);//10��2��3
		}
	}
}