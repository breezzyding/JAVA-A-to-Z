//Ƕ�׷�֧

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		
		/*
		����
		�μӸ��ֱ�������������ɼ�����8.0���������������ʾ��̭��
		���Ҹ����Ա���ʾ�����������Ů���顣
		����ɼ����Ա𣬽����жϺ������Ϣ��
		
		��ʾ��double score��char gender��
		�����ַ���char gender = Scanner.next().chatAt(0);
		 
		˼·����
		1.����Scanner���󣬽����û�����
		2.���� �ɼ� ���浽 double score
		3.ʹ��if-else �ж�
		  ��������ɼ�����8.0���������������ʾ��̭
		4.������뵽 �������ڽ���char gender��ʹ��if-else�����Ϣ

		 */
		
		
		//����ʵ��
		Scanner myScanner = new Scanner(System.in);
		System.out.println("��ѡ������ɼ���");	
		double score = myScanner.nextDouble();
		if (score > 8.0) {			
			System.out.println("��ѡ�������Ա�");
			//charAt()���ַ���ת��Ϊchar���ͣ�������0��ʼ
			char gender = myScanner.next().charAt(0);
			if (gender == '��' || gender =='Ů') {
				if (gender == '��') {
					System.out.println("��ϲ�����ѽ�����������顣");
				}else {
					System.out.println("��ϲ�����ѽ������Ů���顣");
				}
			}else {
				System.out.println("���ã������������Ա���Ϣ��");
			}
			
		}else {
			System.out.println("���ź���������̭�ˡ�");
		}
	}
}	