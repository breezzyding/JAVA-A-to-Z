

public class Homework09 {
	public static void main(String[] args) {
		
		//���1+(1+2)+(1+2+3)+.....(1+2+3+4+..+100)�ĺ�	

		//˼·1����
		//1.ÿһ���� int former = former + i
		//2.int i ��1-100
		//2.int sum ���
		
		// int former = 0;
		// int sum = 0;

		// for (int i = 1; i <= 100 ; i++ ) {
			
		// 	former += i;	
		// 	sum += former;
		// }	
		// System.out.println("1+(1+2)+(1+2+3)+...+(1+2+3+4+...+100)�ĺ�Ϊ" + sum); 
	
		//˼·2����
		//1.һ����100�����
		//2.ÿһ���������������
		//3.����һ��˫��ѭ��
		//	i���Ա�ʾ�ڼ��ͬʱҲ�ǵ�ǰ������һ����
		//4.ʹ��sum �����ۺ�
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			for (int j = 1;j <= i; j++) {//�ڲ��1-i����ѭ��
				sum += j;
			}		
		// 
		}
	System.out.println("1+(1+2)+(1+2+3)+...+(1+2+3+4+...+100)�ĺ�Ϊ" + sum); 
	}
}