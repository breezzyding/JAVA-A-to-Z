public class Constructor01 {
	public static void main(String[] args) {
		

		/*
			˵��
			1.�����������η�����Ĭ�ϣ�Ҳ������public protected private
			2.������û�з���ֵ
			3.�������������ֱ���һ��
			4.�����б�ͳ�Ա����һ���Ĺ���
			5.�������ĵ��� ��ϵͳ���
		 */
		
		//��newһ������ʱ��ֱ��ͨ��������ָ�����ֺ�����
		Person p1 = new Person("smith", 80);
		System.out.println("p1����Ϣ����:");
		System.out.println("p1����name=" + p1.name);
		System.out.println("p1����age=" + p1.age);

	}
}

//�ڴ���Person��Ķ���ʱ����ֱ��ָ�������������������
//
class Person {
	String name;
	int age;

	//������
	//1.û�з������� Ҳ����дvoid
	//2.�����������ֺ�����Ҫ��ͬ
	//3.String pName, int pAge �ǹ��������β��б� ����ͳ�Ա����һ��
	public Person (String pName, int pAge) {
		System.out.println("�������ѱ�����~~��ɶ������Եĳ�ʼ��");
		name = pName;
		age = pAge;
	}
}





/*
	�ܽ�
	
	������ constructor 
	�����һ�����ⷽ��
	����ɶ��¶���ĳ�ʼ��
	�ص㣺
	1)��������������ͬ
	2)û�з���ֵ
	3)�ڴ�������ʱ��ϵͳ���Զ��ĵ��ø���Ĺ�������ɶ�	����ĳ�ʼ��
 */