public class This01 {
	public static void main(String[] args) {
		
		Dog dog1 = new Dog("��׳", 3);
		System.out.println("dog1��hashcode=" + dog1.hashCode());
		//dog1������ info()����
		dog1.info();

		System.out.println("=====================");
		Dog dog2 = new Dog("���", 5);
		System.out.println("dog2��hashcode=" + dog2.hashCode());
		dog2.info();

	}
}

class Dog {//��

	public String name;//����
	public int age;//����

	// public Dog(String dName, int dAge) {//������
	// 	name = dName;
	// 	age = dAge;
	// }
	
	//������������βΣ��ܹ�ֱ��д�����������͸�����
	//���ǳ�����һ�����⣬���ݱ�����������ԭ��
	//��������name�Ǿֲ�����������������
	//��������age �Ǿֲ�����������������
	//==> ����this������������
	public Dog(String name, int age) {//������
		//this.name���ǵ�ǰ���������name
		this.name = name;
		//this.age ���ǵ�ǰ���������age
		this.age = age;
		System.out.println("this.hashCode=" + this.hashCode());
	}


	public void info() {//��Ա���������������Ϣ
		System.out.println("this.hashCode=" + this.hashCode());
		System.out.println(name + "\t" + age + "\t");
	}
}


//�򵥵�˵���ĸ�������ã�thisָ��ľ����ĸ�����