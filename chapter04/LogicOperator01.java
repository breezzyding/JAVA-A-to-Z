/**
 * ��ʾ�߼��������ʹ��
 */
public class LogicOperator01 {

	//��дһ��main����
	public static void main(String[] args) {
		
		// ��·�루&&�� �� �߼��루&�� ������ʾ 
		// ������ͬ��ͬ��Ϊ�棬һ�ټ��� 
		
		// &&    
		int age = 50;
		if(age > 20 && age < 90) {
			System.out.println("ok 1");
		}
		

		// &		
		if(age > 20 && age < 90) {
			System.out.println("ok 2");
		}

		//����
		int a = 4;
		int b = 9;
		// &&���ڶ�·�룺�����һ������false����ڶ������������жϣ����ս��Ϊflase
		// Ч�ʸ�
		if(a < 1 && ++b < 50) {
			System.out.println("ok 3");
		}
		System.out.println("a=" + a + " " + "b=" + b);//a=4 b=9

		// ����&�߼�����ԣ������һ������false�������������Ȼ���ж�
		if(a < 1 & ++b < 50) {
			System.out.println("ok 3");
		}
		System.out.println("a=" + a + " " + "b=" + b);//a=4 b=10

		//�ܽ᣺�ڿ���������һ��ʹ��&&��Ч�ʸ���
	}
}