public class Method02 {
	public static void main(String[] args) {
		
		//为什么需要成员方法
		
		//请遍历一个数组，输出数组的各个元素值
		int[][] map = {{0,0,1},{1,1,1},{1,1,3}};

		//遍历map数组
		//传统的解决方式就是直接遍历
		// for (int i = 0; i < map.length; i++) {
		// 	for (int j = 0; j < map[i].length; j++) {
		// 		System.out.print(map[i][j] + " ");				
		// 	}
		// 	System.out.println();
		// }


		//缺点：每一次输出需要重新使用上面代码块 导致代码冗余大
		
		//使用方法完成输出
		MyTools myTools = new MyTools();

		//使用方法
		myTools.printArr(map);		

		//再次打印
		myTools.printArr(map);
		
		//优点：	1.提高代码的复用性
		//		2.可以讲实现的细节封装起来，然后供其它用户来调用
		

	}
}

//把输出的功能，写到一个类的方法中，然后调用该方法即可
class MyTools {
	//方法，接受一个二维数组
	
	public void printArr(int[][] map) {
		System.out.println("========");
		//对传入的map数组进行
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");				
			}
			System.out.println();
		}
	}
} 


//成员方法的定义注意点
//
//1.形参列表：表示成员方法输入cal(int n),getSum(int num1 int num2)
//2.返回数据类型：表示成员方法输出 void表示没有返回值
//3.方法主体：表示为了实现某一切功能代码块
//4.return语句不是必须的
