/*
���������
 */

public class Array01 {
	public static void main(String[] args) {
		/*
		���ǵ����طֱ���3kg 5kg 1kg 3.4kg 2kg 50kg
		��������ֻ�����������Ƕ��٣�ƽ�������Ƕ��٣�

		˼·����
		1.������������ double ��� �õ�������
		2.ƽ������ = ������ / 6
		3.������ͳʵ�ֵķ�ʽ����  6 -> 600 -> 566
		4.��������������
		 */
		

		// double hen1 = 3;
		// double hen2 = 5;
		// double hen3 = 1;
		// double hen4 = 3.4;
		// double hen5 = 2;
		// double hen6 = 50;

		// double totalWeight = hen1 + hen2 + hen3 + 
		// 	hen4 + hen5 + hen6;

		// double avgWeight = totalWeight / 6;
		// System.out.println("������=" + totalWeight + 
		// 	"ƽ������=" + avgWeight);



		//����
		//���Դ�Ŷ�� ͬһ���� ������	��
		//����Ҳ��һ���������ͣ����������͡�
		//�������ݣ��飨һ�飩����һ�����ݡ�
		
		//���磬���ǿ����������������������
		//
		//����һ������
		//�����
		//1.double[] ��ʾ��double���͵����� ������ hens
		//2.{3, 5, 1, 3.4, 2, 50}��ʾ�����ֵ/Ԫ�أ�
		//	���α�ʾ����ĵڼ���Ԫ��
		double[] hens = {3, 5, 1, 3.4, 2, 50};

		//��������õ����������Ԫ�صĺ� ʹ��for
		//���
		//1.���ǿ���ͨ�� hens[�±�] �����������Ԫ��
		//	�±��Ǵ�0��ʼ��ŵ� �����һ��Ԫ�ؾ���hens[0]
		//2.ͨ��for�Ϳ���ѭ���ķ��������Ԫ��/ֵ
		//3.ʹ��һ������ totalWeight������Ԫ���ۻ�	
		System.out.println("����ĳ���= " + hens.length);

		//������� ѭ������
		double totalWeight = 0;	
		for (int i = 0; i < hens.length; i++) {
			//System.out.println("��" + (i + 1) + "Ԫ�ص�ֵ=" + hens[i]);
			totalWeight += hens[i];
		}
		System.out.println("������=" + totalWeight + 
			"ƽ������=" + (totalWeight / hens.length));
	}
}