//��֧����if��else

import java.util.Scanner;

public class If03 {
	public static void main(String[] args) {

		//������ʾ
		//��Ӽ������뱣��ͬ־��֥�����÷֣�
		//�����
		//1.���÷�Ϊ100��ʱ����� ���ü��ã�
		//2.���÷�Ϊ(80,90]��ʱ����� �������㣻
		//3.���÷�Ϊ(60,80]��ʱ����� ����һ�㣻
		//4.������������ ���ò�����
		
		Scanner myScanner = new Scanner(System.in);
		//�����û�����
		System.out.println("���������������֥�����÷�(1-100)��");
		//��˼�����������Ĳ�������������hello...
		//==> �������Ǻ������ʹ���쳣�������
		int score = myScanner.nextInt();
		//�ȶ���������÷֣�������һ����Χ����Ч�ж� 1-100��������ʾ�������
				
		
		if (score >= 1 && score <= 100) {
			//��������ʲ��ö��֧
			if (score == 100) {
				System.out.println("���ü���");
			}else if (score > 80 && score <= 90) {
				System.out.println("��������");
			}else if (score > 60 && score <= 80) {
				System.out.println("����һ��");
			}else {
				System.out.println("���ò�����");
			}

		}else {
			System.out.println("���÷���Ҫ��1-100������������ :) ");
		}
		
	}
}	



//�Ķ�������룬S1���������ʲô

// boolean b = ture;
// if(b == false) //��S2�����д��if(b=false)�ܱ���ͨ��������ܣ�����Ƕ��٣���
// 	System.out.println("a");
// else if (b) 	--------------------> S1���ж�Ϊ��
// 	System.out.println("b");--------> S1��ִ�� 
// else if (!b) --------------------> S2���ж�Ϊ��
// 	System.out.println("c");--------> S2��ִ�� 
// else
// 	System.out.println("d");
// 	
// 	S1����� b
// 	S2����� c
// 	
// 	
