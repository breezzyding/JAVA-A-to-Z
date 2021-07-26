/**
 * 演示关系运算符的使用
 */
public class RelationalOperator {

	//编写一个main方法
	public static void main(String[] args) {
		
		int a = 9;//开发中，不可以使用a,b,a1,bc,n1,n2...
		int b = 8;//使用英语是最好的选择
		System.out.println(a > b);//T
		System.out.println(a >= b);//T
		System.out.println(a <= b);//F
		System.out.println(a < b);//F
		System.out.println(a == b);//F
		System.out.println(a != b);//T
		boolean flag = a > b;
		System.out.println("flag=" + flag);//flag=ture







	}
}