public class Object03 {
	public static void main(String[] args) {

		Person p1 = new Person();//��ʱ��������Ĭ��ֵ������
		p1.age = 10;
		p1.name = "С��";
		Person p2 = p1;//p1 ������ p2
		System.out.println(p2.age);
		//����p2.age�����Ƕ��٣��������ڴ�ͼ
		//10

	}
}

class Person {
	String name;
	int age;
}


//��δ�������
//
//1.�������ٴ���
//
//Cat cat;
//cat = new Cat();
//
//2.ֱ�Ӵ���
//
//Cat cat = new Cat();
//
//
//��η�������
//
//������.����