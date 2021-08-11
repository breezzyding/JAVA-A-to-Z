public class VarParameterDetail {

	public static void main(String[] args) {
		
		//细节1：可变参数的实参可以为0或者任意多个
		//细节2：可变参数的实参可以为数组
		int[] arr = {1, 2, 3};
		Test test = new Test();
		test.f1(arr);

		//细节3：可变参数的本质就是数组		

	}
}

class Test {
	
	public void f1(int... nums) {
		System.out.println("数组长度=" + nums.length);
	}

	//细节4：可变参数可以和普通类型的参数一起放在形参列表
	//		 但必须保证可变参数在最后
	public void f1(String str, double... nums) {
		
	}		 
			 
	//细节5：一个形参列表中只能出现一个可变参数
	// public void f1(String... strs, double... nums) {
		//编译不通过
	// }	 
}