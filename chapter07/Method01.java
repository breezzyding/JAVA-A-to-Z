//��Ա����

public class Method01 {
	public static void main(String[] args) {
		//����ʹ��
		//1.����д�ú������ȥ���ã��������
		//2.�ȴ�������Ȼ����÷�������
		Person p1 = new Person();
		p1.speak();//���÷���
		p1.cal01();//����cal01����
		p1.cal02(1000);//����cal02���� ͬʱ n = 1000

		int returnRes = p1.getSum(10,20);//����getSum���� ͬʱnum1 = 10 num2 = 20
		System.out.println("getSum�������ص�ֵ=" + returnRes);
	}
}


class Person {

	String name;
	int age;
	//��������Ա������
	//���speak��Ա���������������һ�����ˡ�
	//���
	//1.public��ʾ�����ǹ�����
	//2.void��ʾ����û�з���ֵ
	//3.speak() speak�Ƿ�������()�β��б�
	//4.{}������ ����д����Ҫִ�еĴ���
	//5.System.out.println("����һ������");��ʾ���ǵķ����������һ�仰
	public void speak() {
		System.out.println("����һ������");
	}

	//���cal01��Ա���������Լ���� 1+...+100�Ľ��
	public void cal01() {
		//ѭ����� 1+...+100 �ļ���
		int res = 0;
		for (int i = 1; i <= 1000; i++) {
			res += i;
		}
		System.out.println("cal01���� ������=" + res);
	}

	//���cal02��Ա�������÷������Խ���һ����n,���� 1+...+n �Ľ��
	//���
	//1.��int n���β��б���ʾ��ǰ��һ���β�n,���Խ����û�������
	public void cal02(int n) {
		//ѭ����� 1+...+n �ļ���
		int res = 0;
		for (int i = 1; i <= n; i++) {
			res += i;
		}
		System.out.println("cal02���� ������=" + res);
	}

	//���getSum��Ա���������Լ����������ĺ�
	//���
	//1.public��ʾ�����ǹ�����
	//2.int��ʾ����ִ�к󣬷���һ�� int ֵ
	//3.getSum������
	//4.��int num1�� int num2���β��б� 2���βΣ�
	// 	���Խ����û������������
	//5.return res;��ʾ�� res��ֵ ����
	public int getSum(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}

}


//�����ĵ��û���ԭ��
//
//1.������ִ�е�����ʱ���ͻῪ��һ�������Ŀռ䣨ջ�ռ䣩
//2.������ִ����ϣ�����ִ�е�return���ʱ���ͻ᷵��
//3.���ص����÷����ĵط�
//4.���غ󣬼���ִ�з�������Ĵ���
//5.��main������ջ��ִ����ϣ����������˳�