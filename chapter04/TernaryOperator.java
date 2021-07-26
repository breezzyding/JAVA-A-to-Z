/**
 * 演示三元运算符的使用
 */
public class TernaryOperator {

	//编写一个main方法
	public static void main(String[] args) {
		
		int a = 10;
		int b = 99;
		//解读
		//1.a > b false
		//2.返回b--，先返回b的值，然后b-1
		//3.返回的值为99
		int result = a > b ? a++ : b--;//99
		System.out.println("result=" + result);//99
		System.out.println("a=" + a);//10
		System.out.println("b=" + b);//98
		
	}
}