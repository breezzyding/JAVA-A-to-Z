//演示do-while的使用

public class DoWhiteExercise01 {
	public static void main(String[] args) {
		
		//练习3
		//统计1-200之间能被5整除但不能被3整除的个数		
		int i = 1;//循环变量初始化
		int count = 0;
		do {
			if (i % 5 == 0 && i % 3 != 0 ) {
				count++;
			}			
			i++;
		}while (i <= 200);		
		System.out.println("1-200之间能被5整除但不能被3整除的个数为" + count);
	}
}