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