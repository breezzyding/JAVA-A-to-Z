/**
 * ��ʾ��ֵ�������ʹ��
 */
public class AssignOperator {

	//��дһ��main����
	public static void main(String[] args) {
		
		int n1 = 10;
		n1 += 4;//n1 = n1 + 4;
		System.out.println(n1);//14
		n1 /= 3;//n1 = n1 / 3;
		System.out.println(n1);//4


		//�ص�
		//1.����˳����������ȼ��㣬�ٸ�ֵ��
		//2.��ֵ����������ֻ���Ǳ��� �ұ߿����Ǳ��� ���ʽ ����ֵ
		//3.���ϸ�ֵ����������Եȼ�
		//4.���ϸ�ֵ��������������ת��
		byte b = 3;
		b += 2;// �ȼ� b = (byte)(b + 2)��
		b++;//�ȼ� b = (byte)(b + 1)��
	}
}