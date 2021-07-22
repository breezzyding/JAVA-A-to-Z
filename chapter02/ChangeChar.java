//演示转义字符的使用
public class ChangeChar{
	
	//编写一个main方法
	public static void main(String[] args) {
		// \t :一个制表位，实现对齐的功能
		System.out.println("北京\t天津\t上海");
		// \n :换行符
		System.out.println("jack\nsmith\nmary");
		// \\ :一个\
		// 思考：两个\怎么写呢？
		System.out.println("C:\\\\Users\\\\Administrator\\\\cmd.exe");
		// \" :一个"
		System.out.println("老韩说：\"要好好学习java，有前途！\"");
		// \' :一个'
		System.out.println("老韩说：\"要好好学习java，有\'钱\'途！\"");
		// \r :一个回车
		// 解读
		// 1.输出 韩顺平教育
		// 2.\r表示回车----回车后并没有换行，将光标移动到最前面
		System.out.println("韩顺平教育\r北京");//北京平教育


		//课堂练习
		System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");

	}

}