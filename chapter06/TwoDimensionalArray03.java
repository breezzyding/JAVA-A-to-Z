//��ά����ĳ�ʼ��


public class TwoDimensionalArray03 {
	public static void main(String[] args) {
		
		//ʹ�÷�ʽ3����̬��ʼ��----������ȷ��
		/*
			���󣺶�̬���������ά���飬�����
			1
			2	2
			3	3	3

			һ��������һά���飬ÿ��һά�����Ԫ���ǲ�һ����
		 */
		
		int[][] arr = new int[10][];//������ȷ��
		for (int i = 0; i < arr.length; i++) {//����arrÿһ��һά����
			//��ÿ��һά���鿪�ռ� new
			//���û�и�һά����new ��ôarr[i]����null
			arr[i] = new int[i+1];//

			//����һά���飬����һά�����ÿ��Ԫ����ֵ
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + 1;
				System.out.print(arr[i][j] + " ");
			}
		System.out.println();
		}

		

	}
}