public class Homework07 {
	public static void main(String[] args) {
		
		/*
			���һ��Dog�࣬�����֣���ɫ���������ԣ�
			�����������show()��ʾ����Ϣ
			���������󣬽��в��ԣ���ʾ this.���ԣ�
		 */
		
		Dog dog1 = new Dog("����", "��ɫ", 24);
		dog1.showInfo();

		Dog dog2 = new Dog("С��", "��ɫ", 3);
		dog2.showInfo();
		
	}
}

class Dog {

	String name;
	String color;
	int age;

	public Dog(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public void showInfo() {
		System.out.println(name + "����Ϣ���£�");
		System.out.println("��ɫ�� " + color + "\t" +
							 "���䣺 " + age);
	}
}