//数组反转


public class ArrayReverse {
	public static void main(String[] args) {
		
		//实现数组内所有元素的反转
		//int[] arr1 = {11, 22, 33, 44, 55, 66}
		//----> {66, 55, 44, 33, 22, 11}			
		
		//1.方式1：通过找规律反转
		int[] arr1 = {11, 22, 33, 44, 55, 66};	
		int temp = 0;
		int len = arr1.length;//计算数组的长度	
		//0-5 1-4 2-3 三组互换
					
		//遍历arr1
		for (int i = 0; i <= len / 2; i++) {
			temp = arr1[len - 1 - i];
			arr1[len - 1 - i] = arr1[i];
			arr1[i] = temp;
		}		

		//看看arr1的值
		System.out.println("====arr1的元素====");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);//10，2，3
		}

		//方式2：使用逆序赋值方法--->从而使arr1恢复原样
		//思路分析
		//1.先创建一个新的数组arr2 大小与arr1.length
		//2.逆序遍历arr1，将每个元素拷贝到arr2的元素中（顺序拷贝）
		//3.建议增加一个循环变量 j 0 -> 5
		
		int[] arr2 = new int[len];
		//逆序遍历
		for (int i = len - 1, j = 0; i >= 0 ; i--, j++) {
			arr2[j] = arr1[i];
		}	
			
		//4.当for循环结束 arr2就是复原后的数组{11, 22, 33, 44, 55, 66};
		//5.让arr1指向arr2数据空间，此时arr原来的数据空间就没有变量引用
		//	会被当作垃圾，销毁
		arr1 = arr2;

		//看看arr1的值
		System.out.println("====arr1的元素====");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);//10，2，3
		}


	}
}