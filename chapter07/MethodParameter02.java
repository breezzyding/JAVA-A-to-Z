public class MethodParameter02 {
	public static void main(String[] args) {
		
		/*
			��Ա�������λ���
		 */
		
		//����1
		B b = new B();
		int[] arr = {17, 35, 35, 30};
		b.test100(arr);

		System.out.println("====���ý�����ԭ�����Ƿ�ı�====");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		//������������Ͳ�ͬ��main�����е�����arrҲ���޸�
		
		//����2
		Person p = new Person();
		p.name = "kevin";
		p.age = 17;

		b.test200(p);
		System.out.println("\nmain��p.age��ֵΪ" + p.age);//25
														 //null �� ���ʲô��
														 //17

	}
}

class Person {
	String name;
	int age;
	double salay;
}

class B {

	//��дһ������test100�����Խ���һ�����飬�ڷ������޸����飬
	//����ԭ���������Ƿ�仯��
	public void test100(int[] arr) {

		System.out.println("====�޸�ǰ����������====");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		arr[1] = 7;//�޸�����

		System.out.println("====�޸ĺ����������====");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	//��дһ������test200�����Խ���һ��Person(age,salay)����
	//�ڷ������޸Ķ������ԣ�����ԭ���Ķ����Ƿ�仯��
	public void test200(Person p) {
		//p.age = 25;//�޸Ķ�������
		//˼��
		p = null;
	}
}