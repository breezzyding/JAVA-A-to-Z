public class VarParameterDetail {

	public static void main(String[] args) {
		
		//ϸ��1���ɱ������ʵ�ο���Ϊ0����������
		//ϸ��2���ɱ������ʵ�ο���Ϊ����
		int[] arr = {1, 2, 3};
		Test test = new Test();
		test.f1(arr);

		//ϸ��3���ɱ�����ı��ʾ�������		

	}
}

class Test {
	
	public void f1(int... nums) {
		System.out.println("���鳤��=" + nums.length);
	}

	//ϸ��4���ɱ�������Ժ���ͨ���͵Ĳ���һ������β��б�
	//		 �����뱣֤�ɱ���������
	public void f1(String str, double... nums) {
		
	}		 
			 
	//ϸ��5��һ���β��б���ֻ�ܳ���һ���ɱ����
	// public void f1(String... strs, double... nums) {
		//���벻ͨ��
	// }	 
}