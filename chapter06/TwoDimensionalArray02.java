//二维数组的初始化


public class TwoDimensionalArray02 {
	public static void main(String[] args) {
		
		//二维数组的使用
		//使用方式1：动态初始化
		int arr[][] = new int[2][3];

		//遍历arr数组
		for (int i =0; i < arr.length; i++) {
			for (int j =0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		System.out.println();//换行
		}

	}
}