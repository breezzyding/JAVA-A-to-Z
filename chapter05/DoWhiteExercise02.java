//��ʾdo-while��ʹ��

import java.util.Scanner;

public class DoWhiteExercise02 {
	public static void main(String[] args) {
		
		//��ϰ4
		//�����������Ǯ�����Ϻ���һֱʹ�������ޣ�ֱ������˵��ǮΪֹ��
		//��ʾ	[System.out.println("�Ϻ��ʣ���Ǯ�� y/n");]
		//		do...while..
		//����Ϊ��
		//(1) ʹ��do-while��� 1-200
		//(2) ���� �ܱ�5���������ܱ�3�������� %
		//(3) ͳ�����������ĸ��� int count = 0;
		//
		//�������
		//(1) ��Χ��ֵ 1-200 �������������	
		//(2) �ܱ�5���������ܱ�3������				
		int i = 1;
		int count = 0;
		int end = 200;
		int divisor1 = 5;//����1
		int divisor2 = 3;//����2

		do {
			if (i % divisor1 == 0 && i % divisor2 != 0 ) {
				count++;
			}			
			i++;
		}while (i <= end);		
		System.out.println("1-200֮���ܱ�5���������ܱ�3�����ĸ���Ϊ" + count);

		System.out.println("\n=====================================\n");

		//��ϰ4
		//�����������Ǯ�����Ϻ���һֱʹ�������ޣ�ֱ������˵��ǮΪֹ��
		//��ʾ	[System.out.println("�Ϻ��ʣ���Ǯ�� y/n");]
		//		do...while..
		Scanner myScanner = new Scanner(System.in);
		char word;	
		do {
			System.out.println("�Ϻ�����������| | | | |\n");
			System.out.println("�Ϻ��ʣ���Ǯ�� y/n");
			word = myScanner.next().charAt(0);	
			System.out.println("������ " + word);		
		}while (word != 'y');	
		System.out.println("������Ǯ�ˡ�");
	}
}


//������ϰ
//����� ����Ķ���ѭ��ִ�в��裬��д�������
//
//˫��for Multiply ����
//
// for ( int i = 0; i < 2 ; i++ ) {
// 	for (int j = 0; j < 3 ; j++ ) {
// 		System.out.println("i=" + i + "j=" + j);
// 	}
// }
// 
// ���������£�

/*
	i=0j=0
	i=0j=1
	i=0j=2
	i=1j=0
	i=1j=1
	i=1j=2
 */ 

// 
// ��ʾ��MultiplyFor.java
// 