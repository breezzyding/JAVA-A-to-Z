public class Recursion01 {
	public static void main(String[] args) {
		
		T t1 = new T();
		t1.test(4);//n=2 n=3 n=4
					

					//�����������else�� �����ʲô��
					// n=2
		
		int res = t1.factorial(5);//120 ��׳� n!	
		System.out.println("res=" + res);	


	}
}

class T {
	//
	public void test(int n) {
		if (n > 2) {
			test(n - 1);
		}
		System.out.println("n=" + n);		
	}

	public int factorial(int n) {
		if (n == 1) {
			return 1;			
		}else {
		return factorial(n - 1) * n;
		}
	}
}

//�ݹ�ʹ�õ���Ҫ����
//1.ִ��һ������ʱ���ʹ���һ���µ��ܱ����Ķ����ռ䣨ջ�ռ䣩
//2.�����ľֲ������Ƕ����ģ������໥Ӱ�죬����n����
//3.���������ʹ�õ����������ͱ������������飬���󣩾ͻṲ����������͵�����
//4.�ݹ�������˳��ݹ�������ƽ�������������޵ݹ飬����StackOverflowError
//5.��һ������ִ����ϣ���������return���ͻ᷵�أ����ص���
//  �ͽ�������ظ�˭��ͬʱ������ִ����ϻ��߷���ʱ���÷���Ҳ��ִ�����
