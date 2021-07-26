/**
 * 演示算术运算符的使用
 */
public class ArithmeticOperator {

	//编写一个main方法
	public static void main(String[] args) {
		// /的使用
		System.out.println(10 / 4);//从数学来看是2.5,但java中是2
		System.out.println(10.0 / 4);//结果是2.5
		double d = 10 / 4;//java中是2，2 => 2.0 赋给double
		System.out.println(d);//2.0

		// %的使用 取余 取模
		// 在 % 的本质 看一个公式 a % b = a - a / b * b
		// -10 % 3 => -10 - (-10) / 3 * 3 = -10 + 9 = -1
		System.out.println(10 % 3);//1
		System.out.println(-10 % 3);//-1
		System.out.println(10 % -3);//1
		System.out.println(-10 % -3);//-1
		

		// ++的使用  自增
		int i = 10;
		//作为独立语句使用 下面两者意思相同
		i++;//等价于 i = i + 1;
		++i;//等价于 i = i + 1;
		System.out.println("i=" + i);//12

		/*
		作为表达式使用
		前++：++i先自增后赋值
		后++：i++先复制后自增
		 */
		int j = 8;
		// int k = ++j;//等价于 j = j + 1; k = j;
		// System.out.println("k=" + k + "j=" + j);//k = 9 j = 9
		int k = j++;//等价于k = j; j = j + 1; 
		System.out.println("k=" + k + "j=" + j);//k = 8 j = 9
	}
}