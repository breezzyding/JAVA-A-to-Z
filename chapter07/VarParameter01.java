public class VarParameter01 {
	public static void main(String[] args) {
		
		/*
			java����ͬһ�����ж��ͬ��ͬ���ܵ�����������ͬ�ķ���
			��װ��һ���������Ϳ���ͨ���ɱ����ʵ��
		 */		

		MyMethod myMethod = new MyMethod();

		System.out.println(myMethod.sum(1, 5, 100));
		System.out.println(myMethod.sum(7, 17, 35));

	}
}

class MyMethod {
	//���Լ���2��3��4��5...�������ĺ�
	//����ʹ�÷�������
	// public int sum(int n1, int n2) {//2�����ĺ�
	// 	return n1 + n2;
	// }
	// public int sum(int n1, int n2, int n3) {//3�����ĺ�
	// 	return n1 + n2 + n3;
	// }
	// public int sum(int n1, int n2, int n3, int n4) {//4�����ĺ�
	// 	return n1 + n2 + n3 + n4;
	// }
	//.....
	//�������������������ͬ��������ͬ������������ͬ  ��ʹ�ÿɱ�����Ż�
	//���
	//1.int... ��ʾ���ܵĿɱ������������int�������Խ��ܶ��int(0-��)
	//2.ʹ�ÿɱ����ʱ�����Ե���������ʹ�ã��� nums ���Ե�������
	public int sum(int... nums) {
		// System.out.println("���ղ����ĸ���=" + nums.length);
		
		//����nums��ͼ���
		int res = 0;
		for (int i=0; i < nums.length; i++) {
			res += nums[i];
		}
		return res;
	}
}