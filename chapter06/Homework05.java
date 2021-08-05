public class Homework05 {
	public static void main(String[] args) {
		
		//随机生成10个整数（1-100的范围）保存到数组，并倒序打印以及求平均值，
		//求最大值和最大值的下标，并查找里面是否有8
		
		
		int[] nums = new int[10];
		//(int)(Math.random() * 100) + 1 生成 1 - 100的随机数
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 100) + 1;
		}

		System.out.println("====arr的元素====");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
		}
		System.out.println();
		
		System.out.println("====arr的元素倒序列====");
		//倒序打印
		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.print(nums[i] + "\t");
		}
		System.out.println();
		
		//打印平均值
		//求出最大值和最小值的下标
		double sum = 0;
		int maxIndex = 0;
		int minIndex = 0;
		int max = nums[0];
		int min = nums[0];
		for (int i = 0; i < nums.length; i++) {
			//累合
			sum += nums[i];

			//求最大值的下标
			if (nums[i] > max) {
				max = nums[i];
				maxIndex = i;
			}

			//求最大值的下标
			if (min > nums[i]) {
				min = nums[i];
				minIndex = i;
			}
		}
		System.out.println("数组所有元素的平均值为" + (sum / nums.length));
		System.out.println("最大值的下标为" + maxIndex);
		System.out.println("最小值的下标为" + minIndex);



		//数组中是否存在8？
		boolean flag = true;		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 8) {
				System.out.println("随机生成了8哦！");
				flag = false;
				break;
			}			
		}
		if (flag == true) {
			System.out.println("抱歉，没有随机生成8。");
		}
		

		
	}
}