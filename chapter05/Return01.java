/*
��ʾreturn��ʹ��
 */

public class Return01 {
	public static void main(String[] args) {

		for (int i = 1;i <=5;i++) {

			if (i == 3) {
				System.out.println("��˹���� " + i);
				return;//continue;//break;////�Ƚ�����������
				//��return���ڷ���ʱ����ʾ�������������ʹ����main����ʾ�˳�����
				
			}
			System.out.println("Hello World!");
		}
		System.out.println("go on...");		
	}
}



