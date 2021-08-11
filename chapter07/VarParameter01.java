public class VarParameter01 {
	public static void main(String[] args) {
		
		/*
			java允许将同一个类中多个同名同功能但参数个数不同的方法
			封装成一个方法，就可以通过可变参数实现
		 */		

		MyMethod myMethod = new MyMethod();

		System.out.println(myMethod.sum(1, 5, 100));
		System.out.println(myMethod.sum(7, 17, 35));

	}
}

class MyMethod {
	//可以计算2（3，4，5...）个数的和
	//可以使用方法重载
	// public int sum(int n1, int n2) {//2个数的和
	// 	return n1 + n2;
	// }
	// public int sum(int n1, int n2, int n3) {//3个数的和
	// 	return n1 + n2 + n3;
	// }
	// public int sum(int n1, int n2, int n3, int n4) {//4个数的和
	// 	return n1 + n2 + n3 + n4;
	// }
	//.....
	//上面的三个方法名称相同，功能相同，参数个数不同  可使用可变参数优化
	//解读
	//1.int... 表示接受的可变参数，类型是int，即可以接受多个int(0-多)
	//2.使用可变参数时，可以当做数组来使用，即 nums 可以当做数组
	public int sum(int... nums) {
		// System.out.println("接收参数的个数=" + nums.length);
		
		//遍历nums求和即可
		int res = 0;
		for (int i=0; i < nums.length; i++) {
			res += nums[i];
		}
		return res;
	}
}