/*
����for��Ƕ��ʹ����ʾ
 */

import java.util.Scanner;

public class MultiplyForExercise01 {
	public static void main(String[] args) {
		
		//����
		//1.ͳ��3����ɼ������ÿ������5��ͬѧ������������ƽ����
		//	�����а༶��ƽ���֣�ѧ���Ķ�ɼ��Ӽ������룩
		//2.ͳ�Ƴ�3���༰��������ÿ������5��ͬѧ��
		
		//˼·����
		//1.����Scanner ����ͬѧ�ɼ�
		//2.����int i �� j �ֱ��ʾ�༶ �� ͬѧ  
		//3.double score ����ͬѧ�Ǽ���ĳɼ�
		//4.double averageScore �����i���ƽ����
		//4.double totalAverageScore �����ܵ�ƽ����
		
		//����ʵ��
		
		Scanner myScanner = new Scanner(System.in);

		int classNum = 3;//�༶��
		int studentNum = 5;//ѧ����
		int count = 0;//����ͳ�Ƽ�������
		double score;//���ڽ���ѧ���ɼ�
		double averageScore = 0.0;//����ͳ��ĳ���ƽ����
		double totalAverageScore = 0.0;//����ͳ���ܵ�ƽ����
		for ( int i = 0; i < classNum ; i++ ) {//��3���༶
			for (int j = 0; j < studentNum ; j++ ) {//ÿ����5��ͬѧ
				//������ʾ
				System.out.println("��" + (i + 1) + "���༶��" + 
					"��" + (j + 1) + "��ͬѧ��ã���������ĳɼ���");

				//����ͬѧ����
				score = myScanner.nextDouble();
				
				//��¼��������
				if (score >= 60) {
					count++;
				}

				//����ĳ�����ƽ����
				averageScore = averageScore + score;				
			}
			//����ð༶��ƽ����			
			System.out.println("��" + (i + 1) + "���༶��ƽ����Ϊ" + 
				(averageScore / 5.0));

			//��ÿ���༶��ƽ���ֱ�������ƽ������
			totalAverageScore = totalAverageScore + (averageScore / 5.0);

			//�༶ƽ�������㣡����
			averageScore = 0;
		}

		//������		
		System.out.println("���а༶��ƽ����Ϊ" + (totalAverageScore / 3.0));
		System.out.println("3���༶���������Ϊ" + count);
	}
}