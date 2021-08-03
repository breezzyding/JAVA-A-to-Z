//数组添加

public class ArrayAdd01 {
	public static void main(String[] args) {		
		
		/*
		实现动态的给数组添加元素效果，实现对数组扩容
		1.原始数组使用静态分配 int[] arr = {1, 2, 3};
		2.增加元素4 直接放在数组的最后 arr = {1, 2, 3, 4};

		3.用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？y/n
		3的功能在 ArrayAdd02中实现

		思路分析
		1.定义初始数组 int[] arr = {1, 2, 3}//下标0-2
		2.arr[3] = 4;//不行 空间已经被固定喔
		3.定义一个新的数组 int[] arr = new int[arr.length + 1];
		4.遍历arr数组，依次将arr的元素拷贝到arrNew数组
		5.将4赋给arrNew[arrNew.length - 1] = 4
		 */

		int[] arr = {1, 2, 3};
		int[] arrNew = new int[arr.length + 1];
				
		//遍历arr,把每个元素拷贝到arrNew对应的元素
		for (int i = 0; i < arr.length; i++) {
			arrNew[i] = arr[i];
		}

		arrNew[arrNew.length - 1] = 4;

		arr = arrNew;

		//看看arr的值
		System.out.println("====arr的元素====");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}	
		
	}
}