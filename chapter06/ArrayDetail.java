public class ArrayDetail {

	public static void main(String[] args) {
		//1.数组是多个相同类型数据的组合，实现对这些数据的统一管理
		
		//int[] arr1 = {1, 2, 3, 60, "hello"};//String -> int
		double[] arr2 = {1.0, 2.3, 3.5, 60};//int -> double

		//2.数组中的元素可以是任何数据类型，包括基本类型和引用类型，但是不能混用
		String[] arr3 ={"beijing","楚雨荨"， "milan"};

		//3.数组创建后 如果没有复赋值 有默认值
		//int 0 short byte 0 long 0
		//float 0.0 double 0.0 char \u0000
		//boolean false String null
		//
		short[] arr4 = new short[3];
		System.out.println("====数组4====");
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);

		//4.使用数组的步骤 1-声明数组并开辟空间 2-给数组各个元素赋值 3-使用数组
		
		//5.数组的下标是从0开始的
		
		//6.数组的下标必须在指定范围内使用，否则报：下标越界异常，比如
		//int[] arr6 = new int[5]; 则有效下标为0-4
		//即数组的下标/索引 最小 0  最大数组长度-1	
		int[] arr6 = new int[5];
		System.out.println(arr6[5]);
										
		//7.数组属引用类型，数组型数据是对象 object																											
		}

	}
}