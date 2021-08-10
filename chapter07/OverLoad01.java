public class OverLoad01 {

	public static void main(String[] args) {
		
		//java中允许同一个类中，多个同名方法的存在，但要求 形参列表不一致！
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

	//重载的好处
	//
	//减轻了起名的麻烦
	//减轻了记名的麻烦

//快速入门案例
//同一个方法名使用不同形参 完成方法的重载
	
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

//注意事项和使用细节
//
//1.方法名  		一定要一致
//2.形参列表 	必须不同
//3.返回类型 	无要求
//
//课堂练习题目
//
//1.判断题
//与void show(int a, char b, double c) {} 构成重载的有哪些？
//
//a) void show(int x, char y, double z) {}
//b) int show(int a, double c, char b) {}
//c) void show(int a, double c, char b) {}
//d) boolean show(int c, char b) {}
//e) void show(double c) {}
//f) double show(int x, char y, double z) {}
//g) void shows() {}
//
//答：b c d e √
