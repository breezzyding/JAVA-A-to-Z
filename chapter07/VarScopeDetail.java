public class VarScopeDetail {
	public static void main(String[] args) {
		
		Person p = new Person();
		
		/*
			3.�����������ڽϳ��������Ŷ���Ĵ����������������Ŷ����������������
			  �ֲ��������������ڽ϶̣����������Ĵ�����ִ�ж������������Ŵ����Ľ���������
			  ����һ�η������ù�����
		 */
		
		p.say();//��ִ��say����ʱ��say�����ľֲ���������name���ᴴ������sayִ����Ϻ�
		//name�ֲ��������������������ԣ�ȫ�ֱ�������Ȼ����ʹ��


		/*
			4.������ķ�Χ��ͬ
		 */
		Test test = new Test();
		test.test();//��һ�ֿ�����ʶ������Եķ���

		test.test2(p);//�ڶ��ֿ�����ʶ������Եķ���

		/*
			5.���η���ͬ
		 */	



	}
}

class Person {

	//ϸ�ڣ����Կ��Լ����η���public protected private..��
	//     �ֲ��������ܼ����η�
	public String name = "Ding";

	public void say() {
		//1.���Ժ;ֲ�������������������ʱ��ѭ�ͽ�ԭ��
		String name = "king";
		// public String name = "king";	
		// �ֲ��������ܼ����η�	
		System.out.println("say() name=" + name);
	}

	public void hi() {
		//2.��ͬһ���������У�������ͬһ����Ա�����У������ֲ�����������������
		String address = "�ɶ�";	
		// String address = "����";	//���� �ظ��������
		String name = "breezy";	//��ȷ ��ͬ������
		System.out.println("say() name=" + name);
	}

}

class Test {

	//ȫ�ֱ���/���ԣ����Ա�����ʹ�ã���������ʹ�ã�ͨ��������ã�
	public void test() {
		Person person = new Person();
		System.out.println(person.name);//Ding
	}

	public void test2(Person p) {		
		System.out.println(p.name);//Ding
	}
}

