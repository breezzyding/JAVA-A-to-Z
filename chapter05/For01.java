
public class For01 {
	public static void main(String[] args) {
		// 打印10句 "你好，丁丁！"
		// 传统的方法
		// System.out.println("你好，丁丁！");
		// System.out.println("你好，丁丁！");
		// System.out.println("你好，丁丁！");
		// System.out.println("你好，丁丁！");
		// System.out.println("你好，丁丁！");
		// System.out.println("你好，丁丁！");
		// System.out.println("你好，丁丁！");
		// System.out.println("你好，丁丁！");
		// System.out.println("你好，丁丁！");
		// System.out.println("你好，丁丁！");

		/*
		说明
		1.for关键字， 表示循环控制
		2.for有四要素：循环变量初始化 循环条件 循环操作 循环变量迭代
		3.循环操作 这里可以有多条语句，也就是我们要循环执行的代码
		4.如果 循环操作（语句）只有一条语句，可以省略{}，建议不要省略
		 */
		
		//使用for循环控制
		for (int i = 1; i <= 10 ; i++ ) {			
			System.out.println("你好，丁丁！ x" + i);		
		}



	}
}	