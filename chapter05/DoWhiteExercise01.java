//��ʾdo-while��ʹ��

public class DoWhiteExercise01 {
	public static void main(String[] args) {
		
		//��ϰ3
		//ͳ��1-200֮���ܱ�5���������ܱ�3�����ĸ���		
		int i = 1;//ѭ��������ʼ��
		int count = 0;
		do {
			if (i % 5 == 0 && i % 3 != 0 ) {
				count++;
			}			
			i++;
		}while (i <= 200);		
		System.out.println("1-200֮���ܱ�5���������ܱ�3�����ĸ���Ϊ" + count);
	}
}