public class Homework07 {
	public static void main(String[] args) {
		
		//复习冒泡排序法（由小到大）
		//int[] nums = {35, 13, 30, 17, 7};		一共5个元素！
		
		/*
			Round 1 				第1轮 进行 4 次交换 (nums.length - 1)
			1st 13 35 30 17 07
			2rd	13 30 35 17 07
			3nd 13 30 17 35 07
			4th 13 30 17 07 35
			Round 2 				第2轮 进行 3 次交换 (nums.length - 2)
			1st 13 30 17 07 35
			2rd	13 17 30 07 35
			3nd 13 17 07 30 07
			Round 3 				第3轮 进行 2 次交换 (nums.length - 3)
			1st 13 17 07 30 35
			2rd	13 07 17 30 35
			Round 4 				第4轮 进行 1 次交换 (nums.length - 4)
			1st 07 13 17 30 35
		
		 */

		//定义数组
		int[] nums = {35, 13, 30, 17, 7, 23, 11, 8};
		//临时存放
		int temp = nums[0];
		
		//交换几轮  nums.length - 1
		for (int i = 0; i <nums.length - 1; i++) {
			
			//每一轮交换,交换几次 nums.length - 4
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[j + 1]) {//比较相邻两数
					//交换
					temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;				
				}
			}

			//打印每一轮的结果
			System.out.println("--------------- 第 " + (i + 1) + " 轮 交 换 后 的 结 果 ---------------");
			for (int j = 0; j < nums.length ; j++) {
		 		System.out.print(nums[j] + "\t");
		 	}
		 System.out.println();
		}
	}
}