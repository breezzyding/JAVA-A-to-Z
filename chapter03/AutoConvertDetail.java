//�Զ�����ת��
public class AutoConvertDetail{
	
	public static void main(String[] args) {
		
		//ϸ��1���ж������͵����ݻ������ʱ��
		//ϵͳ�����Զ�����������ת�����������������������ͣ�Ȼ���ٽ��м���
		//
		int n1 = 10;//ok char --> int
		//float d1 = n1 + 1.1;//���� n1 + 1.1 => ���������double
		double d1 = n1 + 1.1;//ok n1 + 1.1 => ���������double
		float d2 = n1 + 1.1F;//ok n1 + 1.1F => ���������float
		
		//ϸ��2�������ǰѾ��ȣ�����������������͸�ֵ�����ȣ�������С����������ʱ��
		//�ͻᱨ����֮�ͻ�����Զ�����ת��
		// 
		// int n2 = 1.1;//����  double --> int
		
		//ϸ��3��(byte,short)��char֮�䲻���໥�Զ�ת��
		//���Ѿ������ݸ�ֵ��byteʱ��(1)���жϸ����Ƿ���byte��Χ�ڣ�����ǾͿ���
		byte b1 = 10;//�� -128~127
		// int n2 = 1;//n2 ��int
		// byte b2 = n2;//����ԭ������Ǳ�����ֵ���ж�����
		//
		char c1 = b1;//����ԭ��byte,char֮�䲻���໥�Զ�ת��

		//ϸ��4��byte short char ��������֮����Լ��㣬�ڼ���ʱ����ת����int����
		byte b2 = 1;
		byte b3 = 2;
		short s1 = 1;
		// short s2 = b2 + s1;//����b2 + s1 => int
		int s2 = b2 + s1;//��
		//byte b4 = b2 + b3;//����b2 + b3 => int
		//
		
		//ϸ��5��boolean ������ת��
		boolean pass = true;
		int num100 = pass;//boolean ���������͵��Զ�ת��

		//ϸ��6���Զ�����ԭ�򣺱��ʽ������Զ���������Ϊ����������������
		//��һ����

		byte b4 = 1;
		short s3 = 100;
		int num200 = 1;
		double num300 = 1.1;

		double num500 = b4 + s3 + num200 + num300;//double
	}
}