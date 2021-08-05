
//再次独立练习

public class Test {
	public static void main(String[] args) {
		
		//使用二维数组打印一个10行杨辉三角
		/*
			1
			1 1
			1 2 1           i = 2
			1 3 3 1    		arr[3][1] = arr[2-1][0] + arr[2-1][1] = 
			1 4 6 4 1
			1 5 10 10 5 1

			思路分析
			第 i 层 就有 i 个数
			每行的第一个元素和最后一个元素都是 1			
			中间部分：arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
	
		 */
		
		int levelNum = 15;

		int[][] arr = new int[levelNum][];

		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = new int[i + 1];

			for (int j = 0 ; j < arr[i].length; j++) {
				if (j == 0 || j == arr[i].length -1) {
					arr[i][j] = 1;
				}else {
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0 ; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		System.out.println();
		}


	}
}