public class Homework04 {
	public static void main(String[] args) {
		
		/*
			��д��A03 ʵ������ĸ��ƹ���copyArr�����������
			����һ�������飬Ԫ�غ;�����һ��
		 */
		
		A03 a03 = new A03();
		
		int[] oldArr = {7, 17, 35};

		System.out.println("====oldArr����====");
		for (int i = 0; i < oldArr.length; i++) {
			System.out.print(oldArr[i] + "\t");
		}

		System.out.println();

		int[] newArr = a03.copyArr(oldArr);	

		System.out.println("====newArr����====");
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + "\t");
		}
		
		
	}
}

class A03 {

	public int[] copyArr(int[] oldArr) {
		
		int[] newArr = new int[oldArr.length];//���ٿռ�

		for (int i = 0; i < oldArr.length; i++) {//��������
			newArr[i] = oldArr[i];
		}		

		return newArr;

	}
}