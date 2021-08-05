public class YangHui {
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
		

		int levelNum = 10;//层数

		int[][] yangHui = new int[levelNum][];
		// arr[0][0] = 1;
		// arr[1][0] = 1;arr[1][1] = 1;

		for (int i = 0; i < yangHui.length; i++) {//遍历yangHui的每个元素
			
			//开当前层的空间
			yangHui[i] = new int[i + 1];

			//遍历arr[i]:完成层的输入
			for (int j = 0; j < yangHui[i].length; j++) {
				//判断是否是首尾
				if (j == 0 || j == yangHui[i].length - 1) {
					yangHui[i][j] = 1;
				} else {//中间的元素
					yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
				}					
			}
				
		}
	

		for (int i = 0; i < yangHui.length; i++) {//循环的操作
			for (int j = 0; j < yangHui[i].length; j++) {
				System.out.print(yangHui[i][j] + " ");
			}
		System.out.println();	
		}		
	}
}