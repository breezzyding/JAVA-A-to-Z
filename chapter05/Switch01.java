
import java.util.Scanner;

public class Switch01 {
	public static void main(String[] args) {
		/*
		����
		���дһ�����򣬸ó�����Խ���һ���ַ������磺a,b,c,d,e,f,g
		a��ʾ����һ��b��ʾ���ڶ� ��
		�����û���������ʾ��Ӧ����Ϣ��Ҫ��ʹ��switch������

		˼·����
		1.����һ���ַ�������Scanner����
		2.ʹ��switch�����ƥ�䣬�������Ӧ��Ϣ

		����ʵ��

		 */
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ���ַ���a-g����");
		char c1 = myScanner.next().charAt(0);//
		//��java�У�ֻҪ����ֵ���أ�����һ�����ʽ
		switch(c1) {
			case 'a' :
				System.out.println("��������һ");
				break;
			case 'b' :
				System.out.println("�������ڶ�");
				break;
			case 'c' :
				System.out.println("����������");
				break;
			case 'd' :
				System.out.println("����������");
				break;
			case 'e' :
				System.out.println("����������");
				break;
			case 'f' :
				System.out.println("����������");
				break;
			case 'g' :
				System.out.println("����������");
				break;
			default:
				System.out.println("�������ַ�����ȷ��û��ƥ���");					
		}

		System.out.println("�˳���switch���������ִ�С�");
	}
}	



/*

���switch
1.switch �ؼ��� ��ʾ switch ��֧
2.���ʽ ��Ӧһ��ֵ
3.case����1�������ʽ��ֵ���ڳ���1����ִ������1
4.break����ʾ�Ƴ�switch
5.�����case����1ƥ�䣬��ִ������1�����û��ƥ��
  �ͼ���ƥ��case ����2
 6.���һ����û��ƥ���ϣ�ִ��default

 */

