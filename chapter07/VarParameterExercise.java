public class VarParameterExercise {
	public static void main(String[] args) {
		
		/*
			�������������ֱ�ʵ�ַ������������ſγɼ�(�ܷ�)
			�������������ſγɼ����ܷ֣��������������ſγ̣��ܷ֣�
			��װ��һ���ɱ�����ķ���
		 */
	
		DingMethod dingMethod = new DingMethod();

		dingMethod.showScore("Ding", 92.0, 91.0);
		dingMethod.showScore("Ding", 92.0, 91.0, 75.0);
		dingMethod.showScore("Ding", 92.0, 91.0, 75.0, 82.0, 81.0);

	}		
}


class DingMethod {

	public void showScore(String name, double... score) {
		
		double res = 0;
		for (int i = 0; i < score.length; i++) {
			res += score[i];
		}
		System.out.print(name + score.length +"�ſε��ܷ֣�");
		System.out.print(res);
		System.out.println();
	}
}


