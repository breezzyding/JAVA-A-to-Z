public class OverLoadExercise {
	public static void main(String[] args) {
		
		//��Ŀ1
		//��д������Methods�ж����������ط��������á�������Ϊm
		//���������ֱ����һ��int����������int������һ���ַ���������
		//�ֱ�ִ��ƽ�����㲢����������˲�������������ַ�����Ϣ
		//������main()�����зֱ��ò��������������������
		
		
		Methods myMethods = new Methods();

		myMethods.m(7);
		myMethods.m(5, 7);
		myMethods.m('K');


		//��Ŀ2
		//��Methods�࣬�����������ط���max()����һ����������������int
		//ֵ�����ģ��ڶ�����������������doubleֵ�е����ֵ��������������
		//��������doubleֵ�е����ֵ�����ֱ������������
		
		System.out.println(myMethods.max(7, 35));
		System.out.println(myMethods.max(7.0, 35.0));
		System.out.println(myMethods.max(7.0, 35.0, 17.0));


		
		
	}
}


class Methods {

	public void m(int n) {
		int res = n * n;
		System.out.println("res=" + res);
	}

	public void m(int n1, int n2) {
		int res = n1 * n2;
		System.out.println("res=" + res);
	}

	public void m(char c) {
		System.out.println(c);
	}

	public int max(int n1, int n2) {
		int max = n1;
		if (n2 > n1) {
			max = n2;
		}
		return max;
	}

	public double max(double n1, double n2) {
		double max = n1;
		if (n2 > n1) {
			max = n2;
		}
		return max;
	}

	public double max(double n1, double n2, double n3) {
		double max = n1;
		if (n2 > n1 && n2 > n3) {
			max = n2;
		} else if (n3 > n1 && n3 > n1) {
			max = n3;
		}
		return max;
	}




}