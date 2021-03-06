/*
多重for的嵌套使用演示
 */

public class MultiplyForExercise02 {
	public static void main(String[] args) {
		
		//需求：
		//1.输出乘法口诀表
		/*
		1 * 1 = 1
		2 * 1 = 2       2 * 2 = 4
		3 * 1 = 3       3 * 2 = 6       3 * 3 = 9
		4 * 1 = 4       4 * 2 = 8       4 * 3 = 12      4 * 4 = 16
		5 * 1 = 5       5 * 2 = 10      5 * 3 = 15      5 * 4 = 20      5 * 5 = 25
		6 * 1 = 6       6 * 2 = 12      6 * 3 = 18      6 * 4 = 24      6 * 5 = 30      6 * 6 = 36
		7 * 1 = 7       7 * 2 = 14      7 * 3 = 21      7 * 4 = 28      7 * 5 = 35      7 * 6 = 42      7 * 7 = 49
		8 * 1 = 8       8 * 2 = 16      8 * 3 = 24      8 * 4 = 32      8 * 5 = 40      8 * 6 = 48      8 * 7 = 56      8 * 8 = 64
		9 * 1 = 9       9 * 2 = 18      9 * 3 = 27      9 * 4 = 36      9 * 5 = 45      9 * 6 = 54      9 * 7 = 63      9 * 8 = 72      9 * 9 = 81
		 */
		
		//思路分析
		//1.外循环9次 int i = 1; i <= 9; i++
		//2.内循环j从1开始 j++ 直到 i == j(两者相等)
		//3.内循环里输出 相乘 的语句 注意格式！！
		//4.本题的难度有一半来自对格式的把控 
		//	用好 " " \t \n 等 来保证和案例输出一致
		
		
		//代码实现
		for (int i = 1; i <= 9; i++ ) {
			for (int j = 1;j <= i ;j++ ) {
				System.out.print(i + " * " + j + " = " + ( i * j ) + "\t");						
					}
				System.out.print("\n");		
				}
		
	}
}