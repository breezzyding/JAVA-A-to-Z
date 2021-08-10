public class OverLoadExercise {
	public static void main(String[] args) {
		
		//题目1
		//编写程序，类Methods中定义三个重载方法并调用。方法名为m
		//三个方法分别接受一个int参数，两个int参数，一个字符串参数，
		//分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息
		//在主类main()方法中分别用参数区别调用三个方法。
		
		
		Methods myMethods = new Methods();

		myMethods.m(7);
		myMethods.m(5, 7);
		myMethods.m('K');


		//题目2
		//在Methods类，定义三个重载方法max()，第一个方法，返回两个int
		//值中最大的，第二个方法，返回两个double值中的最大值，第三个方法，
		//返回三个double值中的最大值，并分别调用三个方法
		
		System.out.println(myMethods.max(7, 35));
		System.out.println(myMethods.max(7.0, 35.0));
		System.out.println(myMethods.max(7.0, 35.0, 17.0));


		
		
	}
}


class Methods {

	public void m(int n) {
		int res = n * n;
		System.out.println("res=" + res);
	}

	public void m(int n1, int n2) {
		int res = n1 * n2;
		System.out.println("res=" + res);
	}

	public void m(char c) {
		System.out.println(c);
	}

	public int max(int n1, int n2) {
		int max = n1;
		if (n2 > n1) {
			max = n2;
		}
		return max;
	}

	public double max(double n1, double n2) {
		double max = n1;
		if (n2 > n1) {
			max = n2;
		}
		return max;
	}

	public double max(double n1, double n2, double n3) {
		double max = n1;
		if (n2 > n1 && n2 > n3) {
			max = n2;
		} else if (n3 > n1 && n3 > n1) {
			max = n3;
		}
		return max;
	}




}