public class FloatDetail {
	
	//��дһ��main����
	public static void main(String[] args) {
		
		//Java�ĸ����ͳ���������ֵ��Ĭ��Ϊdouble�ͣ�����float�ͳ������ӡ�f'��F��
		// float num1 = 1.1;//�Բ��ԣ�����
		float num2 = 1.1F;//�Ե�
		double num3 = 1.1;//��
		double num4 = 1.1f;//��

		//ʮ��������ʽ�� ��5.12  512.0f    .512��������С���㣩
		double num5 = .123;//�ȼ�0.123
		System.out.println(num5);

		//��ѧ��������ʽ�� 5.12e2 [5.12*10^2]  5.12E-2
		System.out.println(5.12e2);//512.0  //5.12��double,������ɺ���Ȼ��double
		System.out.println(5.12E-2);//0.0512
		
		//ͨ������£�Ӧ��ʹ��double�ͣ���Ϊ����float�͸���ȷ��
		//[����˵��]double num9 = 2.1234567851;float num10 = 2.1234567851F;
		double num9 = 2.1234567851;
		float num10 = 2.1234567851F;
		System.out.println(num9);//���ȸߣ�С�������ȫ������
		System.out.println(num10);
		//���飺�����֪�����ݵľ��ȣ��Ƽ�ʹ��double
		
		
		
		//������ʹ�����壺2.7 �� 8.1 / 3 �Ƚ�
		//����һ�δ���
		double num11 = 2.7;
		double num12 = 2.7; //8.1 / 3 //2.7
		System.out.println(num11);//2.7
		System.out.println(num12);//�ӽ�2.7��һ��С����������2.7
		//�õ�һ����Ҫ��ʹ�õ㣺�����Ƕ���������С������������ж�ʱ��ҪС��
		//Ӧ�������������Ĳ�ֵ�ľ���ֵ����ĳһ�����ȷ�Χ���ж�
		if( num11 == num12) {
			System.out.println(" num11 == num12 ���");
		}
		//��ȷ��д��
		if (Math.abs(num11 - num12) < 0.001) {
		 	System.out.println("��ֵ�ǳ�С�����ҵĹ涨���ȣ���Ϊ���...");
			
		}
		//����ͨ��java API
		System.out.println(Math.abs(num11 - num12));
	

		//ϸ�ڣ������ֱ�Ӳ�ѯ�õ���С������ֱ�Ӹ�ֵ���ǿ����ж����
	}


}
