/*
chapter04 ������ҵ
 */

public class Homework{

	//��дһ��main����
	public static void main(String[] args) {

		//1.�������б��ʽ�Ľ��
		//10 / 3 = 
		//10 / 5 =
		//10 % 2 =
		//-10.5 % 3 =
		System.out.println(10 / 3);//3
		System.out.println(10 / 5);//2
		System.out.println(10 % 2);//0
		System.out.println(-10.5 % 3);//-1.5



		//2.��˵���������Ľ��
		//int i = 66;
		//System.out.println(++i+i);
		
		int i = 66;
		//1.���Լ�(66+1) => i = 67
		//2.��� i + i = 134
		System.out.println(++i+i);//134



		//3.��Java�У����¸�ֵ�����ȷ����()	// C D
		
		//A)int num1 = (int)"18";			//���� Ӧ��Integer.parseInt("18");
		//B)int num2 = 18.0;				//���� double �� int
		//C)double num3 = 3d;				//��ȷ
		//D)double num4 = 8;				//��ȷ
		//E)int i = 48;char ch = i + 1;		//���� int �� char
		//F)byte b = 19;short s = b + 2;	//���� int �� short	
		


		//4.��д����Stringת����double���͵���䣬�Լ���
		//	char����ת����String����䣬����˵��
		
		String str1 = "18.8";
		double d1 = Double.parseDouble(str1);
		System.out.println(d1);

		char ch1 = 'D';
		String str2 = ch1 + ""  //Ҫ���� ���תString
		System.out.println(ch1);
	}
}
