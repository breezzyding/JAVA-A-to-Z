/**
 * ��ʾ��Ԫ�������ʹ��
 */
public class TernaryOperator {

	//��дһ��main����
	public static void main(String[] args) {
		
		int a = 10;
		int b = 99;
		//���
		//1.a > b false
		//2.����b--���ȷ���b��ֵ��Ȼ��b-1
		//3.���ص�ֵΪ99
		int result = a > b ? a++ : b--;//99
		System.out.println("result=" + result);//99
		System.out.println("a=" + a);//10
		System.out.println("b=" + b);//98
		
	}
}