public class MethodExercise01 {

	public static void main(String[] args) {
		
		AA aa = new AA();

		if(aa.isOdds(2)) {
			System.out.println("������");
		}else {
			System.out.println("��ż��");
		}

		aa.print(4, 4, '#');
	}
}

class AA {
	//1.��дAA,��һ���������ж�һ����������odd����ż��������boolean
		 
	public boolean isOdds(int num) {		
		// if (n % 2 != 0) {			
		// 	return true;			
		// } else {
		// 	return false;
		// }
		
		// return num % 2 != 0 ? true; false;
		// �
		return num % 2 != 0;
		}

	//2.�����У��У��ַ���ӡ��Ӧ�����������ַ������磺�У�4 �У�4 �ַ���#
	//	���ӡ��Ӧ��Ч�� 
	/*
		####
		####
		####
		####
	 */		
	//˼·
	//1.�����ķ������� void
	//2.���������� print
	//3.�������βΣ�int row, int col, char c��
	//4.�����壬ѭ��
	public void print(int row, int col, char c) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {//���ÿһ��
				System.out.print(c);
			}
			System.out.println();
		}
	}


}