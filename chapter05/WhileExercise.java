//whileѭ���İ���

public class WhileExercise {
	public static void main(String[] args) {
		
		//ϰ��1
		//��ӡ1-100֮�������ܱ�3��������(while)		
		
		int i = 1;//ѭ��������ʼ��
		int end = 100;//�Ż���������
		while (i <= end) {//ѭ������
			if (i % 3 == 0) {
				System.out.println("i = " + i);	
			}			
			i++;//ѭ����������
		}
		

		System.out.println("\n=============");	

		//ϰ��2
		//��ӡ40-200֮�����е�ż��(while)
		
		int j = 40;//
		int endNum = 200;//�Ż���������
		while (j <= endNum) {//ѭ������
			System.out.println("j = " + j);						
			j = j + 2;//����Ҫ�ж�ż����
		}

	}
}


//˵��
//1.whileѭ��Ҳ����Ҫ��
//2.ֻ����Ҫ�طŵ�λ�ã���һ��
