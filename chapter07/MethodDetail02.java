public class MethodDetail02 {
	public static void main(String[] args) {
		
		//�������η��������ǿ��� ����ʹ�õķ�Χ��
		//�����дĬ�Ϸ��ʣ������� public protected Ĭ�� private����������ڽ�
				
		//�������η�	
		
		A a = new A();
		a.sayOk();
		a.m1();


	}
}

class A {

	//ͬһ�����еķ������ã� ֱ�� ���ü���
	//
	public void print(int n) {
		System.out.println("println()���������� n=" + n);		
	}

	public void sayOk() {//sayOk����print
		print(10);
		System.out.println("����ִ��sayOk()");		
	}

	//�����еķ���A�����B�෽������Ҫͨ������������
	public void m1() {
		//����B����Ȼ���ڵ��÷�������
		System.out.println("m1()����������");
		B b = new B();
		b.hi();

		System.out.println("m1()��������ִ��");
	}
}

class B {

	public void hi() {
		System.out.println("B���е�hi()��ִ��");
	}

}


	
			
	


