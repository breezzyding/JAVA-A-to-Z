public class OverLoad01 {

	public static void main(String[] args) {
		
		//java������ͬһ�����У����ͬ�������Ĵ��ڣ���Ҫ�� �β��б�һ�£�
		System.out.println(100);
		System.out.println("hello,world");
		System.out.println('h');
		System.out.println(1.1);
		System.out.println(true);

		MyCalculate mycalculate = new MyCalculate();

		System.out.println(mycalculate.calculate(3, 4));
		System.out.println(mycalculate.calculate(3, 4.0));
		System.out.println(mycalculate.calculate(3.0, 4));
		System.out.println(mycalculate.calculate(3, 4, 10));


	}
}

	//���صĺô�
	//
	//�������������鷳
	//�����˼������鷳

//�������Ű���
//ͬһ��������ʹ�ò�ͬ�β� ��ɷ���������
	
class MyCalculate {

	public int calculate(int n1, int n2) {
		int res = n1 + n2;
		return res;
	} 

	public double calculate(int n1, double n2) {
		double res = n1 + n2;
		return res;
	}

	public double calculate(double n1, int n2) {
		double res = n1 + n2;
		return res;
	}

	public int calculate(int n1, int n2, int n3) {
		int res = n1 + n2 + n3;
		return res;
	}

}

//ע�������ʹ��ϸ��
//
//1.������  		һ��Ҫһ��
//2.�β��б� 	���벻ͬ
//3.�������� 	��Ҫ��
//
//������ϰ��Ŀ
//
//1.�ж���
//��void show(int a, char b, double c) {} �������ص�����Щ��
//
//a) void show(int x, char y, double z) {}
//b) int show(int a, double c, char b) {}
//c) void show(int a, double c, char b) {}
//d) boolean show(int c, char b) {}
//e) void show(double c) {}
//f) double show(int x, char y, double z) {}
//g) void shows() {}
//
//��b c d e ��
