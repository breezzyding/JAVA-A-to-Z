public class RecursionExercise01 {
	public static void main(String[] args) {
		
		
		Exercise exercise = new Exercise();

		//쳲�����
		int n = 9;
		int res = exercise.fibonacci(n);
		if (res != -1) {
			System.out.println("��n = " + n + "��Ӧ��쳲�����=" + res);
		} 
		
		
		//���ӳ�������
		int days = 1;
		int peachesNum= exercise.peaches(days);
		if (peachesNum != -1) {
				System.out.println("��"+ days + "��ʱ����" + peachesNum + "�����ӡ�");	
		}	
		

	}
}

class Exercise {
	//��ʹ�õݹ�ķ�ʽ���쳲�������1,1,2,3,5,8,13...����һ���������������ֵ�Ƕ��٣�
	//˼·����
	//1.��n=1 fibonacci 1
	//2.��n=2 fibonacci 1
	//3.��n >=3 fibonacci Ϊǰ������֮��
	//
	public int fibonacci(int n) {
		if(n >= 1) {
			if (n == 1 || n ==2) {
				return 1;
			} else {
				return fibonacci(n - 1) + fibonacci(n - 2);
			}
		} else{
			System.out.println("Ҫ�������n>=1������");
			return -1; 
		}
	}
		


	//���ӳ������⣺��һ�����ӣ����ӵ�һ��������е�һ�룬���ٶ����һ����
	//�Ժ�ÿ����Ӷ������е�һ�룬Ȼ���ٶ����һ����������ʮ��ʱ�������ʱ������û���أ���
	//����ֻ��1�������ˡ�����������ٸ����ӣ�
	public int peaches(int days) {
		if (days == 10) {
			return 1;			
		} else if (days >= 1 && days <= 9) {
			return (peaches(days + 1) + 1) * 2;
		} else {
			System.out.println("daysӦ����1-10��");
			return -1;
		}
	}
}

