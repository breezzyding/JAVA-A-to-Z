//while循环的案例

public class WhileExercise {
	public static void main(String[] args) {
		
		//习题1
		//打印1-100之间所有能被3整除的数(while)		
		
		int i = 1;//循环变量初始化
		int end = 100;//优化：灵活控制
		while (i <= end) {//循环条件
			if (i % 3 == 0) {
				System.out.println("i = " + i);	
			}			
			i++;//循环变量迭代
		}
		

		System.out.println("\n=============");	

		//习题2
		//打印40-200之间所有的偶数(while)
		
		int j = 40;//
		int endNum = 200;//优化：灵活控制
		while (j <= endNum) {//循环条件
			System.out.println("j = " + j);						
			j = j + 2;//还需要判断偶数吗？
		}

	}
}


//说明
//1.while循环也有四要素
//2.只是四要素放的位置，不一样
