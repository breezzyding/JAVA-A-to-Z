//switch��֧�ṹ ��ϰ

import java.util.Scanner;

public class SwitchExercise {
	public static void main(String[] args) {

		//ϰ��1
		//ʹ��switch��Сд���͵�char��תΪ��д���������룩
		//ֻת��a,b,c,d,e ���������"other"
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������Сд��ĸ��");
		char c1 = myScanner.next().charAt(0);
		switch(c1) {
			case 'a' :
				System.out.println('A');
				break;
			case 'b' :
				System.out.println('B');
				break;
			case 'c' :
				System.out.println('C');
				break;
			case 'd' :
				System.out.println('D');
				break;
			case 'e' :
				System.out.println('E');
				break;
			default:
				System.out.println("other");
		}

		System.out.println("\n");
		

		//ϰ��2
		//��ѧ���ɼ�����60�ֵģ����"�ϸ�"������60�ֵ�
		//���"���ϸ�"��(ע������ĳɼ����ܴ���100)����ʾ �ɼ�/60
		//˼·����
		//1.��������ʹ�÷�֧����ɡ�����Ҫ��ʹ��switch
		//2.����������Ҫһ��ת��,���˼·��
		//		����ɼ���[60,100] (int)(score / 60) = 1
		//		����ɼ���[0,60] (int)(score / 60) = 0
		//		
		//		
		//����ʵ��		

		System.out.println("������ѧ���ɼ���");
		double score = myScanner.nextDouble();
		if (score >= 0.0 && score <= 100.0) {
			int tag = (int)(score / 60);
		switch (tag) {
			case 0 :
				System.out.println("���ϸ�");
				break;
			case 1 :
				System.out.println("�ϸ�");
				break;
			} 
		}else {
			System.out.println("������ĳɼ��������������롣");
		}

		System.out.println("\n");


		//ϰ��3
		//��������ָ���·ݣ���ӡ���·������ļ��ڣ�3,4,5���� 6,7,8�ļ�
		//9,10,11�＾  12,1,2 ����
		//
		////˼·����
		//1.����Scanner���󣬽����û�����
		//2.int month ��������
		//3.ʹ��switch��ƥ�䣬ʹ�ô�͸����ɣ��Ƚϼ��
		
		System.out.println("�������·ݣ�");
		int month = myScanner.nextInt();
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("���Ǵ���");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�����ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�����＾");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("���Ƕ���");
				break;
			default :
				System.out.println("��������·ݲ���(1-12)");
		}
	}
}

//switch �� if �ıȽ�
//
//1.����жϵľ�����ֵ���࣬���ҷ���byte short int char enum
//	String��6�����ͣ���Ȼ������䶼����ʹ�ã�����ʹ��switch���	
//2.����������������жϣ��Խ��Ϊboolean�����жϣ�ʹ��if��
//	if�ķ�Χ����