import java.util.Scanner;


public class BreakExercise {
	public static void main(String[] args) {		
		
		//��ϰ1
		//1.1-100���ڵ�����ͣ���� ���� ��һ�δ���20�ĵ�ǰ����for + break��
		
		//˼·����
		//1.ѭ��1-100����� sum
		//2.�� sum > 20ʱ����¼�µ�ǰ����Ȼ��break 

		int sum = 0;
		for (int i = 1; i <= 100 ; i++ ) {
			sum = sum + i;
			if (sum > 20) {
				System.out.println("��>20ʱ ��ǰ��i=" + i);
				break;				
			}
			//�����ѭ���ⲿ���������ô��
			//1.int i���
			//2.int n ѭ���� n = i;����ѭ��ǰ��i����n��
			//System.out.println("��>20ʱ ��ǰ��i=" + i);
		}
		
				
		
		//2.ʵ�ֵ�¼��֤�������λ��ᣬ����û���Ϊ�����𡱣�����Ϊ��666��
		//	��ʾ��½�ɹ���������ʾ���м��λ��ᣬ��ʹ��for+break���
			
		
		
		//˼·����
		//1.����Scanner��������û�����
		//2.���� String name �� key �����û���������
		//3.���ѭ��3�Σ������������ ��ǰ�˳� break
		//4.����һ����� int chance ��¼���м��ε�½����
		Scanner myScanner = new Scanner(System.in);

		String name = "";
		String key = "";
		int chance = 3;//��¼һ�Σ��ͼ���һ��
		for (int i = 1; i <= 3; i++ ) {
			System.out.println("�������û�����");
			name = myScanner.next();
			System.out.println("�������������룺");
			key = myScanner.next();
			chance--;
			//�Ƚ���������ֺ������Ƿ���ȷ
			//����˵���ַ��� �����ݱȽ� ʹ�õ� ���� equals
			//"����".equals(name)(���ְ취�����ԣ��Ƽ�ʹ�ô˷����ɱ����ָ��)
			//name.equals("����")
			if ("����".equals(name) && "666".equals(key)) {
				System.out.println("��½�ɹ���");
				break;
			}else {
				System.out.println("�û������������������" + chance +
					"�λ��ᡣ");
			}

			
		}
		


		
		
		
	}
}
