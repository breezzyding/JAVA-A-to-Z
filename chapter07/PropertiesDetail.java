public class PropertiesDetail {
	public static void main(String[] args) {

	//���� Person����
	//p1 �Ƕ��������������ã�
	//new Person() �����Ķ���ռ䣨���ݣ����������Ķ���
	Person p1 = new Person();

	//���������Ĭ��ֵ�������������;
	
	System.out.println("\n��ǰ����˵���Ϣ");
	System.out.println("age=" + p1.age + " name=" + p1.name +
		" salay=" + p1.salay + " isPass=" + p1.isPass);
	}//int-0 String-null sdouble-0.0 boolean-false
}

class Person {//
	//�ĸ�����
	int age;
	String name;
	double salay;
	boolean isPass;
}


//Java�ڴ�ṹ����
//1.ջ��һ���Ż����������ͣ��ֲ�������
//2.�ѣ���Ŷ��� (Cat cat�������)
//3.������:������(�����������ַ���) �������Ϣ
//4.ʾ��ͼ:[Cat (name,age,price)]
//
//Java������������̼򵥷���
// Person p = new Person;
// p.name = "jack";
// p.age = 10;
//1.�ȼ���Person����Ϣ�����Ժͷ�����Ϣ��ֻ�����һ�Σ�
//2.�� �� �з���ռ䣬����Ĭ�ϳ�ʼ����������
//3.�ѵ�ַ����p��p��ָ�����
//4.�����ƶ���ʼ��������p.name = "jack" p.age = 10
//
//
//��ϰ��
//
// Person a = new Person(); 	��������
// a.age = 10;					����age ��ֵ
// a.name = "С��";				����name ��ֵ
// Person b;					û�и��ռ�
// b = a;						����a�ĵ�ַ����b ��ָ��a��
// System.out.println(b.name);	�����С��
// b.age = 200;					a.b ��age ���� 200
// b = null;					����
// System.out.println(a.age);	200
// System.out.println(b.age);	�쳣���ƿ��ˣ�
// 
// 
// 