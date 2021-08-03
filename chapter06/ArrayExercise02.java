/*
数组的练习
 */

public class ArrayExercise02 {
	public static void main(String[] args) {
		

		//请求出一个数组int[]的最大值{4, -1, 9, 10, 23}
		//并得到对应的下标
		
		//思路分析
		//1.定义一个int数组 int nums[] = {4, -1, 9, 10, 23};
		//2.假定max = nums[0] 是最大值，maxIndex=0
		//3.从下表1开始遍历 若 max < nums[i] 
		//	则 max = nums[i] maxIndex = i
		//4.遍历后输出	
		
		int nums[] = {4, -1, 9, 10, 23, 330, -19, 112};
		int max = nums[0];
		int maxIndex = 0;

		//遍历找到最大值
		for (int i = 1;i < nums.length; i++) {//从下标1开始遍历
			if (max < nums[i]) {
				max = nums[i];
				maxIndex = i;				
			}
		}
		System.out.println("数组中最大的数是" + max +
			"，其对应的下标是" + maxIndex);	
		
	}
}