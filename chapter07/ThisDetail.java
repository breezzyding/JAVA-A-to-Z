public class ThisDetail {
	public static void main(String[] args) {
		
		/*
			1.this�ؼ��ֿ����������ʱ�������ԣ�������������
			2.this�������ֵ�ǰ������Ժ;ֲ�����
			3.���ʳ�Ա�������﷨��this.�������������б�
			4.���ʹ������﷨�� this�������б�ע��ֻ���ڹ�������ʹ��
			5.this�������ඨ����ⲿʹ�ã�ֻ�����ඨ��ķ�����ʹ��
		 */
		

		// D d1 = new D();
		// d1.f2();

		D d2 = new D();
		d2.f3();
		
	}
}

class D {

	String name = "xiaoDing";
	int age = 25;

	/*
		���ʹ������﷨�� this�������б�
		ע��ֻ���ڹ�������ʹ�ã���ֻ���ڹ������з�������һ����������
	 	
	 	ע�⣺���ʹ������﷨�������this(�����б�)
	 		������õ�һ�����	
	 */
	
	public D() {
		//����ȥ���� D(String name, int age)
		this("jack", 100);//��������Ҫ���β��б��Ӧ
		System.out.println("D()������");			
	}

	public D(String name, int age) {
		System.out.println("D(String name, int age)������");
	}




	//ϸ�ڣ����ʳ�Ա�������﷨��this.�������������б�
	public void f1() {
		System.out.println("f1()����..");
	}

	public void f2() {
		System.out.println("f2()����..");
		//���ñ����f1
		//��һ�ַ�ʽ
		f1();
		//�ڶ��ַ�ʽ
		this.f1();
	}

	public void f3() {
		String name = "laoDing";
		int age = 75;
		//��ͳ��ʽ	�ͽ�ԭ��
		System.out.println("name=" + name + " age=" + age);
		//Ҳ��ͨ��this��������	this׼ȷָ������
		System.out.println("name=" + this.name + " age=" + this.age);
	}
}