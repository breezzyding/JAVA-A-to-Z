public class ArrayDetail {

	public static void main(String[] args) {
		//1.�����Ƕ����ͬ�������ݵ���ϣ�ʵ�ֶ���Щ���ݵ�ͳһ����
		
		//int[] arr1 = {1, 2, 3, 60, "hello"};//String -> int
		double[] arr2 = {1.0, 2.3, 3.5, 60};//int -> double

		//2.�����е�Ԫ�ؿ������κ��������ͣ������������ͺ��������ͣ����ǲ��ܻ���
		String[] arr3 ={"beijing","����ݡ"�� "milan"};

		//3.���鴴���� ���û�и���ֵ ��Ĭ��ֵ
		//int 0 short byte 0 long 0
		//float 0.0 double 0.0 char \u0000
		//boolean false String null
		//
		short[] arr4 = new short[3];
		System.out.println("====����4====");
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);

		//4.ʹ������Ĳ��� 1-�������鲢���ٿռ� 2-���������Ԫ�ظ�ֵ 3-ʹ������
		
		//5.������±��Ǵ�0��ʼ��
		
		//6.������±������ָ����Χ��ʹ�ã����򱨣��±�Խ���쳣������
		//int[] arr6 = new int[5]; ����Ч�±�Ϊ0-4
		//��������±�/���� ��С 0  ������鳤��-1	
		int[] arr6 = new int[5];
		System.out.println(arr6[5]);
										
		//7.�������������ͣ������������Ƕ��� object																											
		}

	}
}