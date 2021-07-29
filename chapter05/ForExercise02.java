/*
for循环练习题
 */
public class ForExercise02 {
	public static void main(String[] args) {
		
		//习题2
		//完成下面表达式的输出
		/*
			0 + 5 = 5
			1 + 4 = 5
			2 + 3 = 5
			3 + 2 = 5
			4 + 1 = 5
		*/
		
		//思路分析
		//(1) 定义两个变量 int i = 0 int j = 5 两者之和 sum = 5；
		//(2) i++ j-- 
		//(3) 当 i <= sum 时 或者 j == 0 时结束循环 
		//(4) 循环体内应该有一条输出语句
		//(5) !!! 可以发现 j = sum - i 
		//(6) 进一步简化程序
		
		//代码实现
		int sum = 5;//和数
		int start = 0;//设定起点

		//简洁且易于操作
		for (int i = start, j = sum - i; i <= sum; i++ ) {
				System.out.println(i + " + " + (sum - i) + " = " + sum);
		}
	}
}	