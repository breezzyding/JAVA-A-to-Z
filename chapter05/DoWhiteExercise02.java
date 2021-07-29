//演示do-while的使用

import java.util.Scanner;

public class DoWhiteExercise02 {
	public static void main(String[] args) {
		
		//练习4
		//如果李三不还钱，则老韩将一直使出五连鞭，直到李三说还钱为止。
		//提示	[System.out.println("老韩问：还钱吗？ y/n");]
		//		do...while..
		//化繁为简
		//(1) 使用do-while输出 1-200
		//(2) 过滤 能被5整除但不能被3整除的数 %
		//(3) 统计满足条件的个数 int count = 0;
		//
		//先死后活
		//(1) 范围的值 1-200 你可以做出变量	
		//(2) 能被5整除但不能被3整除的				
		int i = 1;
		int count = 0;
		int end = 200;
		int divisor1 = 5;//除数1
		int divisor2 = 3;//除数2

		do {
			if (i % divisor1 == 0 && i % divisor2 != 0 ) {
				count++;
			}			
			i++;
		}while (i <= end);		
		System.out.println("1-200之间能被5整除但不能被3整除的个数为" + count);

		System.out.println("\n=====================================\n");

		//练习4
		//如果李三不还钱，则老韩将一直使出五连鞭，直到李三说还钱为止。
		//提示	[System.out.println("老韩问：还钱吗？ y/n");]
		//		do...while..
		Scanner myScanner = new Scanner(System.in);
		char word;	
		do {
			System.out.println("老韩闪电五连鞭| | | | |\n");
			System.out.println("老韩问：还钱吗？ y/n");
			word = myScanner.next().charAt(0);	
			System.out.println("李三答： " + word);		
		}while (word != 'y');	
		System.out.println("李三还钱了。");
	}
}


//课堂练习
//请分析 下面的多重循环执行步骤，并写出输出。
//
//双层for Multiply 多重
//
// for ( int i = 0; i < 2 ; i++ ) {
// 	for (int j = 0; j < 3 ; j++ ) {
// 		System.out.println("i=" + i + "j=" + j);
// 	}
// }
// 
// 输出结果如下：

/*
	i=0j=0
	i=0j=1
	i=0j=2
	i=1j=0
	i=1j=1
	i=1j=2
 */ 

// 
// 演示见MultiplyFor.java
// 