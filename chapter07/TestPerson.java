public class TestPerson {
	public static void main(String[] args) {
		
		/*
			this�Ŀ��ð���
			����Person�࣬������name,age���ԣ����ṩcompareTo�ȽϷ����������ж�
			�Ƿ����һ������ȣ��ṩ������,���ֺ�������ȫһ��
			�ͷ���true�����򷵻�false
		 */
		
		Person p1 = new Person("xiaoDing", 17);
		Person p2 = new Person("xiaoDing", 17);
		
		System.out.println("p1��p2�ȽϵĽ��=" + p1.compareTo(p2));
	}
}

class Person {

	String name;
	int age;

	//������
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean compareTo(Person p) {
		// ���ڱȽ����ֺ����
		// if(this.name.equals(p.name) && this.age == p.age) {
		// 	retun true��
		// } else {
		// 	return false;
		// }
		return this.name.equals(p.name) && this.age == p.age;
	
	}

}