

public class Homework08 {
	public static void main(String[] args) {
		
		//���1-1/2+1/3-1/4...1/100�ĺ�	

		//˼·����
		//1.ÿһ���� 1.0 / i (ע������һ����1.0)
		//2.�������� ���÷��� symbol = -1 ����ʱ���Ϸ���
		
		double sum = 0;
		
		for (int i = 1; i <= 100 ; i++ ) {
			//�ж�����������ż����Ȼ������ͬ�Ĵ���
			if( i % 2 != 0) {//��ĸ������
				sum += (1.0 / i);
			} else {
				sum -= (1.0 / i);
			}				
			
		}	
	System.out.println("1-1/2+1/3-1/4...1/100�ĺ�Ϊ" + sum); 
	}
}