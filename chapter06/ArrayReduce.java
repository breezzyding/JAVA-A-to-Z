//数组缩减

import java.util.Scanner;

public class ArrayReduce {
	public static void main(String[] args) {		
		
		/*
		实现动态的给数组删除元素效果，实现对数组缩减		
		用户可以决定是否继续缩减，每次缩减最后那个元素
		当只剩下最后一个元素，提示不能再缩减
		 

		思路分析
		1.定义初始数组 int[] arr = {1, 2, 3, 4, 5}//下标0-4		
		2.定义一个新的数组 int[] arr = new int[arr.length - 1];
		3.遍历arr数组，依次将arr前面的元素（除了最后一个）拷贝到arrNew数组
		4.把arrNew赋给arr		
		4.创建一个Scanner 可以接受用户输入
		5.因为用户什么时候退出，不确定，使用do-while + break
		6.判断是否只剩下一个元素，提示不能再缩减
		 */

		Scanner myScanner = new Scanner(System.in);
		int[] arr = {1, 2, 3,4, 5};

		do {
			if (arr.length == 1) {
				System.out.println("只剩下最后一个元素了，不能再缩减。");
				break;
			}
			
			int[] arrNew = new int[arr.length - 1];
					
			//遍历arr,把前面的元素（除了最后一个）拷贝到arrNew对应的元素
			for (int i = 0; i < arr.length - 1; i++) {
				arrNew[i] = arr[i];
			}	

			arr = arrNew;

			//看看arr的值
			System.out.println("====arr的元素====");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.print("\n");	

			System.out.println("是否继续缩减元素？y/n");
			char answer = myScanner.next().charAt(0);
			if (answer == 'n') {
				break;
			}
		}while (true);
	}
}