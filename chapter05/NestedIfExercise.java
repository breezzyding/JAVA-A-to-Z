//Ƕ�׷�֧

import java.util.Scanner;

public class NestedIfExercise {
	public static void main(String[] args) {
		
		/*
		����
		��Ʊϵͳ:���ݵ��������·ݺ����䣬��ӡƱ��
		
		4-10������
			���� 18-60 �� 60
			��ͯ < 18  �� 30
			���� > 60  �� 20

		�����·ݵ�����
			����		�� 40
			���� 	�� 20

		 
		˼·����
		1.����Scanner���󣬽����û�����
		2.���� �·� ���浽 int month
		3.ʹ��if-else �ж� ������������		  
		4.����int age��ʹ��if-else�����ӦƱ��

		 */
		
		
		//����ʵ��
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�����뵱ǰ�·ݣ�");	
		double month = myScanner.nextInt();
		if (month >= 4 && month <= 10) {
			System.out.println("������������");			
			System.out.println("������۹���������Ϣ��");			
			int age = myScanner.nextInt();
			if (age >= 18 && age <= 60) {
				System.out.println("���ã�����Ʊ��Ϊ60Ԫ��");				
			} else if (age < 18) {
				System.out.println("С������ã�����Ʊ��Ϊ30Ԫ��");
			} else {
				System.out.println("���ã�����Ʊ��Ϊ20Ԫ��");
			}
			
		}else {
			System.out.println("�����ǵ�����");			
			System.out.println("������۹���������Ϣ��");
			int age = myScanner.nextInt();
			if (age >= 18 && age <= 60) {
				System.out.println("���ã�����Ʊ��Ϊ40Ԫ��");				
			} else {
				System.out.println("���ã�����Ʊ��Ϊ20Ԫ��");
			}
			
		}
	}
}	