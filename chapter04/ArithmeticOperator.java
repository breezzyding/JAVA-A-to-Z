/**
 * ��ʾ�����������ʹ��
 */
public class ArithmeticOperator {

	//��дһ��main����
	public static void main(String[] args) {
		// /��ʹ��
		System.out.println(10 / 4);//����ѧ������2.5,��java����2
		System.out.println(10.0 / 4);//�����2.5
		double d = 10 / 4;//java����2��2 => 2.0 ����double
		System.out.println(d);//2.0

		// %��ʹ�� ȡ�� ȡģ
		// �� % �ı��� ��һ����ʽ a % b = a - a / b * b
		// -10 % 3 => -10 - (-10) / 3 * 3 = -10 + 9 = -1
		System.out.println(10 % 3);//1
		System.out.println(-10 % 3);//-1
		System.out.println(10 % -3);//1
		System.out.println(-10 % -3);//-1
		

		// ++��ʹ��  ����
		int i = 10;
		//��Ϊ�������ʹ�� ����������˼��ͬ
		i++;//�ȼ��� i = i + 1;
		++i;//�ȼ��� i = i + 1;
		System.out.println("i=" + i);//12

		/*
		��Ϊ���ʽʹ��
		ǰ++��++i��������ֵ
		��++��i++�ȸ��ƺ�����
		 */
		int j = 8;
		// int k = ++j;//�ȼ��� j = j + 1; k = j;
		// System.out.println("k=" + k + "j=" + j);//k = 9 j = 9
		int k = j++;//�ȼ���k = j; j = j + 1; 
		System.out.println("k=" + k + "j=" + j);//k = 8 j = 9
	}
}