/*
�����ʹ��
 */

import java.util.Scanner;


public class Array02 {
	public static void main(String[] args) {
		

		//ʹ�÷�ʽ1 ��̬��ʼ��
		//ѭ������5���ɼ������浽double���飬�����
	

		Scanner myScanner = new Scanner(System.in);
		//1.���������ٿռ�
		double[] scores = new double[5];//Ҳ����double scores[]
		//2.ѭ������
		for (int i = 0;i < scores.length;i++) {
			System.out.println("�������" + (i + 1) + "���ɼ�");
			scores[i] = myScanner.nextDouble();
		}

		//2.ѭ�����
		System.out.println("==�����Ԫ���������==");
		for (int i = 0;i < scores.length;i++) {
			System.out.println("��" + (i + 1) + "���ɼ�=" + scores[i]);
		


		//ʹ�÷�ʽ2 ��̬��ʼ��
		//������ �ٴ���
		
		double salary[];//�������飬��ʱ salary �� null
		salary = new double[5];//�����ڴ�ռ䣬���Դ������
		



		//ʹ�÷�ʽ3 ��̬��ʼ��
		//int a[] = {2, 5, 6, 7, 8, 56}
		//���������е����ݣ����ޣ�����ʹ�����ַ���
		//
		}
	}
}