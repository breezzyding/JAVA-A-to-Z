/**
 * ��ʾ�߼��������ʹ��
 */
public class LogicOperator02 {

	//��дһ��main����
	public static void main(String[] args) {
		
		// ��·��||�� �� �߼���|�� ������ʾ 
		// ������ͬ��һ�����棬ͬ�ٲż�
		
		// ||    
		int age = 50;
		if(age > 20 || age < 30) {
			System.out.println("ok 1");
		}
		

		// |		
		if(age > 20 && age < 30) {
			System.out.println("ok 2");
		}

		//����
		//(1) ||��·�������һ������Ϊtrue
		//��ڶ������������жϣ����ս��Ϊture��Ч�ʸ�
		//
		int a = 4;
		int b = 9;
		if(a > 1 || ++b > 4) {
			System.out.println("ok 3");
		}
		System.out.println("a=" + a + " " + "b=" + b);//a=4 b=9

		// ����&�߼�����ԣ������һ������false�������������Ȼ���ж�
		if(a > 1 | ++b < 4) {
			System.out.println("ok 3");
		}
		System.out.println("a=" + a + " " + "b=" + b);//a=4 b=10

		//�ܽ᣺�ڿ���������һ��ʹ��&&��Ч�ʸ���
	}
}