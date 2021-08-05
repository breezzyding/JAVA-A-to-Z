//二维数组的初始化


public class TwoDimensionalArray03 {
	public static void main(String[] args) {
		
		//使用方式3：动态初始化----列数不确定
		/*
			需求：动态创建下面二维数组，并输出
			1
			2	2
			3	3	3

			一个有三个一维数组，每个一维数组的元素是不一样的
		 */
		
		int[][] arr = new int[10][];//列数不确定
		for (int i = 0; i < arr.length; i++) {//遍历arr每一个一维数组
			//给每个一维数组开空间 new
			//如果没有给一维数组new 那么arr[i]就是null
			arr[i] = new int[i+1];//

			//遍历一维数组，并给一维数组的每个元素数值
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + 1;
				System.out.print(arr[i][j] + " ");
			}
		System.out.println();
		}

		

	}
}