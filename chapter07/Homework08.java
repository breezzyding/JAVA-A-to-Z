public class Homework08 {
	public static void main(String[] args) {
		
		/*
			����������к��������Ƕ��٣�
		 */
		
				
	}
}

public class Test {//������

	int count = 9;//����

	public void count1() {//Test���Ա����
		count = 10;
		System.out.println("count1=" + count);//10
	}

	public void count2() {//Test���Ա����
		System.out.println("count1=" + count++);
	}

	//����Test���main�������κ�һ���࣬������main
	public static void main(String[] args) {

		//���
		//1.new Test() ������������������ʹ�ú󣬾Ͳ���ʹ��
		//2.new Test().count1() ��������������󣬾͵���count1()
		new Test().count1();//10
		Test t1 = new Test();
		t1.count2();//9   //t1�ڵ��ã�
		t1.count2();//10
	}
	
	
}