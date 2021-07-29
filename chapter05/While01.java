//while循环的案例

public class While01 {
	public static void main(String[] args) {
		
		//输出10句 hello,Ding.
		
		int i = 1;//循环变量初始化
		while (i <= 10) {//循环条件
			System.out.println("hello,Ding. X" + i);//执行语句
			i++;//循环变量迭代
		}
		System.out.println("退出while,继续执行..." + i);
	}
}


//说明
//1.while循环也有四要素
//2.只是四要素放的位置，不一样
//
//