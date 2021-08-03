//数组拷贝


public class ArrayCopy {
	public static void main(String[] args) {
		
		//实现数组拷贝
		//将int[] arr1 = {10, 20, 30};拷贝到 arr2数组
		//要求数据空间是独立的
		
		
		int[] arr1 = {10, 20, 30};
		int[] arr2 = new int[arr1.length];
				
		//遍历arr1,把每个元素拷贝到arr2对应的元素
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		arr2[1] = 35;

		//看看arr1的值
		System.out.println("====arr1的元素====");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);//10，2，3
		}

		//看看arr2的值
		System.out.println("====arr2的元素====");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);//10，2，3
		}
	}
}