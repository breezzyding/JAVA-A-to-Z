/**
 * ������ϰ2
 */
public class ArithmeticOperatorExercise02 {

	//��дһ��main����
	public static void main(String[] args) {
		
		// 1.����
		// ���绹��59��ż٣��ʣ���XX��������XX��
		
		// 2.˼·����
		// (1)ʹ��int���� days ���� ����
		// (2)һ��������7�� ������weeks��days / 7 �������leftdays�� days % 7
		// (3)���
		 
		// 3.�ߴ���
		int days = 59;
		int weeks = days / 7;
		int leftDays = days % 7;

		System.out.println(days + "�� ��" + weeks + "��������" +
			leftdays + "��");


		//����дҲ�����
		System.out.println("59��ϼ�Ϊ��" + 59/7 + "��������" + 59%7 + "��");//59��ϼ�Ϊ����8��������3��

		// 1.����
		// ����һ���������滪���¶ȣ������¶�ת�������¶ȵĹ�ʽΪ
		// 5/9*�������¶�-100��������������¶ȶ�Ӧ�������¶�
		 
		// 2.˼·����
		// (1)�ȶ���һ��double huaShi ������� �����¶�
		// (2)���ݸ����Ĺ�ʽ�����м��㼴��5/9*����ʽ�¶�-100��]
		// 	  ������ѧ��ʽ��java���Ե�����
		// (3)���õ��Ľ�����浽double sheShi
		 
		// 3.�ߴ���
		double huaShi = 234.6;
		double sheShi = 5 / 9 * (huaShi - 100);
		System.out.println("�����¶�" + huaShi +
			"��Ӧ�������¶�=" + sheShi);

		

		


	}
}