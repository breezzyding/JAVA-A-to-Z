public class ConstructorExercise {
	public static void main(String[] args) {
		
		Person p1 = new Person();

		//name = null age = 18
		System.out.println("p1����Ϣ name=" + p1.name + " age=" + p1.age);
		
		Person p2 = new Person("Ding", 25);
		//name = Ding age = 25
		System.out.println("p2����Ϣ name=" + p2.name + " age=" + p2.age);
	}
}

class Person {
	String name;
	int age;

	//��һ���޲ι����������ù������������е�age���Գ�ʼֵ����18
	public Person() {
		age = 18;
	}

	//�ڶ�����pName �� pAge���������Ĺ�����
	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
}


//���󴴽������̷���
/*
	����
	class Person {//��
	int age = 90;
	String name;

	Person(String n, int a) {//������
		name = n;
		age = a;
		}
	}

	Person p = new Person("Сٻ"�� 20);

	���̷����������⣩
	1.����Person����Ϣ��Person.class��ֻ�����һ��
	2.�ڶ��з���ռ䣨��ַ��
	3.��ɶ����ʼ��
		1)Ĭ�ϳ�ʼ�� age=0 name=null
		2)��ʾ��ʼ�� age=90 name=null
		3)�������ĳ�ʼ�� age=20 name=Сٻ
	4.�����ڶ��еĵ�ַ���ظ�p���������������Ӧ�ã�
*/

