public class VarDetail {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//变量必须先声明，后使用，即有顺序
		int a = 50;//int
		System.out.println(a);//50
		//该区域的数据/值只能在同一类型范围内不断变化
		//a = "jack"; //错误
		a = 88;
		System.out.println(a);//88	

		//变量在同一个作用于不能重名
		// int a = 30;	//错误
	}
}

class Dog {
	public static void main(String[] args) {
		int a = 666;//对
	}
}


//数据类型
//整型 byte[字节][1] short[短整型][2] int[整型][4] long[长整型][8]
//浮点 float[4] double[8]
//字符型 char[2]
//布尔型 boolean[1]