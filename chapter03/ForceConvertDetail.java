//�Զ�����ת��
public class ForceConvertDetail{
	
	public static void main(String[] args) {
		
		//��ʾǿ������ת��
		//ǿǿת����ֻ���������Ĳ�������Ч��������ʹ��С�����������ȼ�
		//int x = (int)10 * 3.5 + 6 * 1.5;//double --> int  �������
		int x =  (int)(10 * 3.5 + 6 * 1.5);// (int)44.0 --> 44
		System.out.println(x);
		
		//char���Ϳ��Ա���int�ĳ���ֵ�������ܱ���int�ı���ֵ����Ҫǿת
		char c1 = 100;//ok
		int m = 100;//ok
		//char c2 = m;//����
		char c3 = (char)m;//ok
		System.out.println(c3);//100��Ӧ���ַ���d�ַ�

		//byte short char�����ڽ��������ǻᱻ����int����

	}
}



//������������ת��--��ϰ��
//
//�ж��Ƿ��ܹ�ͨ������
//1.short s = 12;//ok
//	s = s - 9;//����  int --> short
//	
//2.byte b = 10;//ok
// 	b = b + 11;//���� int --> byte
// 	b = (byte)(b+11);//ok ǿת
// 	
//3.char c = 'a';//ok
//	int i = 16;//ok
//	float d = .314F;//ok
//	double result = c + i + d;//ok float --> double
//
//4.byte b = 16;//ok
//	short s = 14;//ok
//	short t = s + b; //����	int --> short