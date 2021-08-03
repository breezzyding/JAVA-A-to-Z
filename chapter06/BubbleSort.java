//冒泡排序法


public class BubbleSort {
	public static void main(String[] args) {
		
		//将五个无序：24 69 80 57 13
		//使用冒泡排序法将其排成一个从小到大的有序数列
		
		/*
			Round 1		 	
			1st 24 69 80 57 13    	//4次比较
			2rd 24 69 80 57 13
			3nd 24 69 57 80 13
			4th 24 69 57 13 80
			Round 2
			1st 24 69 57 13 80		//3次比较（最大的已被确定）
			2rd 24 57 69 13 80
			3nd 24 57 13 69 80
			Round 3
			1st 24 57 13 69 80		//发现规律				
			2rd 24 13 57 69 80
			Round 4
			1st 13 24 57 69 80
		 */
		


		//用于测试flag是否成功了
		//int[] sequence = {24, 69, 80, 99};
		
		
		
		int[] sequence = {24, 69, -80, 57, 13, -1, 35, 17, 30, 99};
		int temp = 0;//用于辅助交换
		boolean flag = true;

		for (int i = 0; i < sequence.length - 1; i++) {		
			
			for (int j =  0; j < sequence.length - 1- i; j++) {//(sequence.length - 1 - i)次比较
				if (sequence[j] > sequence[j + 1]) {
					temp = sequence[j];
					sequence[j] = sequence[j + 1];
					sequence[j + 1] = temp;
					flag = false;//如果有交换，就继续程序
				}
			}

			//输出每一轮的数列情况
			System.out.print("\n====第" + (i + 1) + "轮====   ");
			for (int j =  0; j < sequence.length; j++) {
				System.out.print(sequence[j] + "\t");
			}

			if (flag == true) {//没有交换，说明数列已经是顺序排列，跳出循环
				break;
			}

		}		
		
	}
}