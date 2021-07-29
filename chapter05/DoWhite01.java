//演示do-while的使用

public class DoWhite01 {
	public static void main(String[] args) {
		
		//输出10句 hello,Ding.
		int i = 1;//循环变量初始化
		do {
			//循环执行语句
			System.out.println("hello,Ding. X" + i);
			//循环变量迭代
			i++;
		}while (i <= 10);
		
		System.out.println("退出 do while 继续执行..." + i);

		System.out.println("\n下面是课堂练习\n=============");

		//课堂练习
		//练习1
		//打印1-100
		int j = 1;//循环变量初始化
		int end = 100;//结束值
		do {
			//循环执行语句
			System.out.println(j);
			//循环变量迭代
			j++;
		}while (j <= end);
		
		//练习2
		//计算1-100的和 
		int k = 1;//循环变量初始化
		int sum = 0;
		do {
			//循环执行语句
			sum = sum + k;
			//循环变量迭代
			k++;
		}while (k <= end);
		System.out.println("1-100的合为" + sum);
	}
}