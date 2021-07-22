public class CharDetail {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//必须用''
		//允许使用转义字符
		//char的本质是一个数，在输出的时候是unicode码对应的字符
		char c1 = 97;
		System.out.println(c1);//a

		char c2 = 'a';//输出'a'对应的数字
		System.out.println((int)c2);//97

		char c3 = '丁';//输出'a'对应的数字
		System.out.println((int)c3);//19969

		char c4 = 19969;//输出'a'对应的数字
		System.out.println(c4);//丁

		//char类型是可以进行运算的，相当于一个整数，因为它都对应有unicode的数字
		
		
		System.out.println('a' + 10);//107

		//课堂测试
		char c5 = 'b' + 1;
		System.out.println((int)c5);//99
		System.out.println(c5);//c  ASCLL码
	}
}

//字符类型本质探讨
//存储： 'a' ==>  码值97 ==> 二进制（110 0001）==> 存储
//读取： 二进制（110 0001）==> 97 ==> 'a' ==> 显示
//码表
//
//ASCLL 一个字节表示，共128个字符，实际上一个字节可以表示256个字符，只用128个
//
//unicode 固定大小的编码 使用两个字节表示字符，字母和汉字统一都是占用两个字节
//
//utf-8 大小可变的编码 字母使用1字节 汉字用3个字节
//
//gbk 可以表示汉字 而且范围广 字母使用1字节 汉字2个字节
//
//gbk2312 可以表示汉字 使用较少
//
//big5 可表示繁体 台湾 香港

