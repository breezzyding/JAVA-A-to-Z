public class YangHui {
	public static void main(String[] args) {
		
		//ʹ�ö�ά�����ӡһ��10���������
		/*
			1
			1 1
			1 2 1           i = 2
			1 3 3 1    		arr[3][1] = arr[2-1][0] + arr[2-1][1] = 
			1 4 6 4 1
			1 5 10 10 5 1

			˼·����
			�� i �� ���� i ����
			ÿ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض��� 1			
			�м䲿�֣�arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
	
		 */
		

		int levelNum = 10;//����

		int[][] yangHui = new int[levelNum][];
		// arr[0][0] = 1;
		// arr[1][0] = 1;arr[1][1] = 1;

		for (int i = 0; i < yangHui.length; i++) {//����yangHui��ÿ��Ԫ��
			
			//����ǰ��Ŀռ�
			yangHui[i] = new int[i + 1];

			//����arr[i]:��ɲ������
			for (int j = 0; j < yangHui[i].length; j++) {
				//�ж��Ƿ�����β
				if (j == 0 || j == yangHui[i].length - 1) {
					yangHui[i][j] = 1;
				} else {//�м��Ԫ��
					yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
				}					
			}
				
		}
	

		for (int i = 0; i < yangHui.length; i++) {//ѭ���Ĳ���
			for (int j = 0; j < yangHui[i].length; j++) {
				System.out.print(yangHui[i][j] + " ");
			}
		System.out.println();	
		}		
	}
}