public class MethodParameter02 {
	public static void main(String[] args) {
		
		/*
			��Ա�������λ���
		 */
		
		int a = 10;
		int b = 20;
		//��swap�����е�int a int b ����ͻ��
		AA aa = new AA();
		aa.swap(a,b);//����swap

		//������swap�����Ժ������a��b����main�����ﶨ���
		System.out.println("\n������swap������a��b��ֵ\na=" + a + "\tb=" + b);//a=10 b=20
		
	}
}

class AA {

	public void swap(int a, int b) {

		System.out.println("\na��b����ǰ��ֵ\na=" + a + "\tb=" + b);
		//�����a��b�Ļ���
		int temp = a;
		a = b;
		b = temp;
		System.out.println("\na��b�������ֵ\na=" + a + "\tb=" + b);
	}
}